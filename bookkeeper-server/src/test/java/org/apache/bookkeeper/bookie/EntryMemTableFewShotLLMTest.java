package org.apache.bookkeeper.bookie;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.stats.NullStatsLogger;
import org.apache.bookkeeper.stats.OpStatsLogger;
import org.apache.bookkeeper.stats.StatsLogger;
import org.junit.Before;
import org.junit.Test;

public class EntryMemTableFewShotLLMTest {

    private EntryMemTable memTable;
    private ServerConfiguration conf;
    private CheckpointSource checkpointSource;
    private CacheCallback cacheCallback;
    private SkipListFlusher flusher;
    private CheckpointSource.Checkpoint checkpoint;

    @Before
    public void setup() throws Exception {
        conf = mock(ServerConfiguration.class);
        checkpointSource = mock(CheckpointSource.class);
        cacheCallback = mock(CacheCallback.class);
        flusher = mock(SkipListFlusher.class);
        checkpoint = mock(CheckpointSource.Checkpoint.class);

        when(conf.getSkipListSizeLimit()).thenReturn(1024L);
        when(checkpointSource.newCheckpoint()).thenReturn(checkpoint);
        when(checkpoint.compareTo(any())).thenReturn(-1);

        memTable = new EntryMemTable(conf, checkpointSource, new NullStatsLogger());
    }

    /* ---------------------------------------------------
     * addEntry tests
     * --------------------------------------------------- */

    @Test
    public void T01_addEntry_BasicSuccess() throws Exception {
        byte[] data = new byte[16];
        long size = memTable.addEntry(1L, 1L, ByteBuffer.wrap(data), cacheCallback);

        assertEquals(16, size);
        EntryKeyValue kv = memTable.getEntry(1L, 1L);
        assertNotNull(kv);
        assertEquals(16, kv.getLength());
    }

    @Test
    public void T02_addEntry_DuplicateEntry_DoesNotLeakSemaphorePermits() throws Exception {
        Semaphore sem = new Semaphore(100);
        setField(memTable, "skipListSemaphore", sem);

        ByteBuffer buf = ByteBuffer.wrap(new byte[10]);

        memTable.addEntry(1L, 1L, buf.duplicate(), cacheCallback);
        int permitsAfterFirst = sem.availablePermits();

        memTable.addEntry(1L, 1L, buf.duplicate(), cacheCallback);
        int permitsAfterDuplicate = sem.availablePermits();

        assertEquals(
                "Duplicate add must not leak semaphore permits",
                permitsAfterFirst,
                permitsAfterDuplicate
        );
    }

    @Test
    public void T03_addEntry_SizeLimitReached_TriggersCallback() throws Exception {
        when(conf.getSkipListSizeLimit()).thenReturn(5L);
        memTable = new EntryMemTable(conf, checkpointSource, new NullStatsLogger());

        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[5]), cacheCallback);
        memTable.addEntry(1L, 2L, ByteBuffer.wrap(new byte[5]), cacheCallback);

        verify(cacheCallback, atLeastOnce()).onSizeLimitReached(any());
    }

    @Test
    public void T04_addEntry_ThrottlingPathCovered() throws Exception {
        Semaphore mockSem = mock(Semaphore.class);
        setField(memTable, "skipListSemaphore", mockSem);

        when(mockSem.tryAcquire(anyInt())).thenReturn(false);

        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        verify(mockSem).acquireUninterruptibly(anyInt());
    }

    @Test
    public void T05_addEntry_AllocatorFailure_RecordsFailureStats() throws Exception {
        StatsLogger statsLogger = mock(StatsLogger.class);
        OpStatsLogger putStats = mock(OpStatsLogger.class);

        when(statsLogger.getOpStatsLogger(anyString())).thenReturn(putStats);
        when(statsLogger.getCounter(anyString())).thenReturn(mock(org.apache.bookkeeper.stats.Counter.class));

        EntryMemTable table = new EntryMemTable(conf, checkpointSource, statsLogger);

        SkipListArena arena = mock(SkipListArena.class);
        when(arena.allocateBytes(anyInt())).thenThrow(new RuntimeException("AllocFail"));
        setField(table, "allocator", arena);

        try {
            table.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
            fail("Expected RuntimeException");
        } catch (RuntimeException expected) {
        }

        verify(putStats).registerFailedEvent(anyLong(), any(TimeUnit.class));
    }

    /* ---------------------------------------------------
     * getEntry tests
     * --------------------------------------------------- */

    @Test
    public void T06_getEntry_FoundInKvMap() throws Exception {
        memTable.addEntry(2L, 1L, ByteBuffer.wrap(new byte[20]), cacheCallback);
        EntryKeyValue kv = memTable.getEntry(2L, 1L);

        assertNotNull(kv);
        assertEquals(20, kv.getLength());
    }

    @Test
    public void T07_getEntry_CacheMiss_ReturnsNull() throws Exception {
        assertNull(memTable.getEntry(99L, 99L));
    }

    @Test
    public void T08_getEntry_InternalFailure_RecordsStats() throws Exception {
        StatsLogger statsLogger = mock(StatsLogger.class);
        OpStatsLogger getStats = mock(OpStatsLogger.class);

        when(statsLogger.getOpStatsLogger(anyString())).thenReturn(getStats);

        memTable = new EntryMemTable(conf, checkpointSource, statsLogger);

        EntryMemTable.EntrySkipList mockMap = mock(EntryMemTable.EntrySkipList.class);
        setField(memTable, "kvmap", mockMap);
        when(mockMap.get(any())).thenThrow(new RuntimeException("MapError"));

        try {
            memTable.getEntry(1L, 1L);
            fail("Expected RuntimeException");
        } catch (RuntimeException expected) {
        }

        verify(getStats).registerFailedEvent(anyLong(), any(TimeUnit.class));
    }

    @Test(timeout = 1000)
    public void T09_getEntry_ReleasesReadLock() throws Exception {
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[5]), cacheCallback);
        memTable.getEntry(1L, 1L);

        ReentrantReadWriteLock lock =
                (ReentrantReadWriteLock) getField(memTable, "lock");

        assertEquals(0, lock.getReadHoldCount());
    }

    /* ---------------------------------------------------
     * flush tests
     * --------------------------------------------------- */

    @Test
    public void T10_flush_ClearsSnapshotAndReturnsSize() throws Exception {
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[50]), cacheCallback);
        memTable.snapshot();

        long flushed = memTable.flush(flusher);

        assertTrue(flushed > 0);
        assertNull(memTable.getEntry(1L, 1L));
    }

    @Test
    public void T11_flush_IOException_SetsFailureFlag() throws Exception {
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        memTable.snapshot();

        doThrow(new IOException("DiskFail")).when(flusher).process(anyLong(), anyLong(), any());

        try {
            memTable.flush(flusher);
            fail("Expected IOException");
        } catch (IOException expected) {
        }

        memTable.addEntry(2L, 2L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        verify(cacheCallback, atLeastOnce()).onSizeLimitReached(any());
    }

    @Test
    public void T12_flush_Success_ResetsFailureFlag() throws Exception {
        T11_flush_IOException_SetsFailureFlag();

        reset(cacheCallback);
        doNothing().when(flusher).process(anyLong(), anyLong(), any());

        memTable.snapshot();
        memTable.flush(flusher);

        memTable.addEntry(3L, 3L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        verify(cacheCallback, never()).onSizeLimitReached(any());
    }

    /* ---------------------------------------------------
     * Utility reflection helpers
     * --------------------------------------------------- */

    private void setField(Object target, String name, Object value) throws Exception {
        java.lang.reflect.Field f = target.getClass().getDeclaredField(name);
        f.setAccessible(true);
        f.set(target, value);
    }

    private Object getField(Object target, String name) throws Exception {
        java.lang.reflect.Field f = target.getClass().getDeclaredField(name);
        f.setAccessible(true);
        return f.get(target);
    }
}
