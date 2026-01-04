package org.apache.bookkeeper.bookie;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.stats.NullStatsLogger;
import org.apache.bookkeeper.stats.StatsLogger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import java.util.concurrent.TimeUnit;


public class EntryMemTableTest {

    private EntryMemTable memTable;
    private ServerConfiguration conf;
    private CheckpointSource checkpointSource;
    private CacheCallback cacheCallback;
    private SkipListFlusher flusher;
    private CheckpointSource.Checkpoint cp;

    @Before
    public void setUp() throws Exception {
        conf = mock(ServerConfiguration.class);
        checkpointSource = mock(CheckpointSource.class);
        cacheCallback = mock(CacheCallback.class);
        flusher = mock(SkipListFlusher.class);
        cp = mock(CheckpointSource.Checkpoint.class);

        when(conf.getSkipListSizeLimit()).thenReturn(1024 * 1024L);
        when(checkpointSource.newCheckpoint()).thenReturn(cp);
        when(cp.compareTo(any())).thenReturn(-1);

        memTable = new EntryMemTable(conf, checkpointSource, new NullStatsLogger());
    }

    @Test
    public void T01_testAddAndGet_Basic() throws Exception {
        long ledgerId = 1L;
        long entryId = 1L;
        byte[] data = "test-data".getBytes();
        ByteBuffer entry = ByteBuffer.wrap(data);

        memTable.addEntry(ledgerId, entryId, entry, cacheCallback);
        EntryKeyValue result = memTable.getEntry(ledgerId, entryId);

        assertNotNull(result);
        assertEquals(data.length, result.getLength());
    }

    @Test
    public void T02_testGet_CacheMiss() throws Exception {
        assertNull(memTable.getEntry(99L, 99L));
    }

    @Test
    public void T03_testFlush_ClearsData() throws Exception {
        CheckpointSource.Checkpoint snapshotCp = mock(CheckpointSource.Checkpoint.class);
        when(checkpointSource.newCheckpoint()).thenReturn(snapshotCp);

        memTable = new EntryMemTable(conf, checkpointSource, new NullStatsLogger());

        when(snapshotCp.compareTo(CheckpointSource.Checkpoint.MAX)).thenReturn(-1);

        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        memTable.snapshot();
        memTable.flush(flusher);

        assertNull("La memoria deve essere vuota dopo il flush", memTable.getEntry(1L, 1L));
    }

    @Test
    public void T04_testAdd_SizeLimitReached_Boundary() throws Exception {
        long limit = 10L;
        when(conf.getSkipListSizeLimit()).thenReturn(limit);
        memTable = new EntryMemTable(conf, checkpointSource, new NullStatsLogger());

        byte[] dataBorder = new byte[(int) limit];
        ByteBuffer entry1 = ByteBuffer.wrap(dataBorder);
        ByteBuffer entry2 = ByteBuffer.wrap(dataBorder);

        memTable.addEntry(1L, 1L, entry1, cacheCallback);

        memTable.addEntry(1L, 2L, entry2, cacheCallback);

        verify(cacheCallback, atLeastOnce()).onSizeLimitReached(any());
    }

    @Test
    public void T05_testAdd_ZeroLengthEntry() throws Exception {
        ByteBuffer empty = ByteBuffer.allocate(0);
        memTable.addEntry(5L, 5L, empty, cacheCallback);
        EntryKeyValue result = memTable.getEntry(5L, 5L);
        assertNotNull(result);
        assertEquals(0, result.getLength());
    }

    // test aggiuntivi (JaCoCo)

    @Test
    public void T06_testFlush_IOException_Coverage() throws Exception {
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        memTable.snapshot();

        doThrow(new IOException("Disk Failure")).when(flusher).process(anyLong(), anyLong(), any());

        try {
            memTable.flush(flusher);
            fail("Doveva lanciare IOException");
        } catch (IOException e) {
        }
        memTable.addEntry(2L, 2L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        verify(cacheCallback, atLeastOnce()).onSizeLimitReached(any());
    }

    @Test
    public void T07_testAdd_Throttling_Coverage() throws Exception {
        java.util.concurrent.Semaphore mockSem = mock(java.util.concurrent.Semaphore.class);
        setField(memTable, "skipListSemaphore", mockSem);

        when(mockSem.tryAcquire(anyInt())).thenReturn(false);

        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        verify(mockSem).acquireUninterruptibly(anyInt());
    }

    @Test
    public void T08_testAdd_InternalFailure_Coverage() throws Exception {
        SkipListArena mockAlloc = mock(SkipListArena.class);
        setField(memTable, "allocator", mockAlloc);

        when(mockAlloc.allocateBytes(anyInt())).thenThrow(new RuntimeException("Allocation Boom"));

        try {
            memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
            fail("Doveva lanciare RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Allocation Boom", e.getMessage());
        }
    }

    @Test
    public void T09_testGet_InternalFailure_Coverage() throws Exception {
        EntryMemTable.EntrySkipList mockMap = mock(EntryMemTable.EntrySkipList.class);
        setField(memTable, "kvmap", mockMap);

        when(mockMap.get(any())).thenThrow(new RuntimeException("Map Boom"));

        try {
            memTable.getEntry(1L, 1L);
            fail("Doveva lanciare RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Map Boom", e.getMessage());
        }
    }

    private void setField(Object target, String fieldName, Object value) throws Exception {
        java.lang.reflect.Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    // test per mutation testing

    @Test
    public void T10_testStats_And_AddEntryReturnValue() throws Exception {
        StatsLogger mockStatsLogger = mock(StatsLogger.class);

        org.apache.bookkeeper.stats.OpStatsLogger universalOpLogger = mock(org.apache.bookkeeper.stats.OpStatsLogger.class);
        org.apache.bookkeeper.stats.Counter universalCounter = mock(org.apache.bookkeeper.stats.Counter.class);

        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(universalOpLogger);
        when(mockStatsLogger.getCounter(anyString())).thenReturn(universalCounter);

        EntryMemTable localMemTable = new EntryMemTable(conf, checkpointSource, mockStatsLogger);

        byte[] data = new byte[10];
        long size = localMemTable.addEntry(1L, 1L, ByteBuffer.wrap(data), cacheCallback);

        assertTrue("AddEntry deve ritornare una dimensione positiva", size > 0);

        verify(universalOpLogger, atLeastOnce()).registerSuccessfulEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));

        verify(universalOpLogger, never()).registerFailedEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));

        reset(universalOpLogger);
        localMemTable.getEntry(1L, 1L);

        verify(universalOpLogger, atLeastOnce()).registerSuccessfulEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));

        java.util.concurrent.Semaphore mockSem = mock(java.util.concurrent.Semaphore.class);
        setField(localMemTable, "skipListSemaphore", mockSem);
        when(mockSem.tryAcquire(anyInt())).thenReturn(false);

        localMemTable.addEntry(2L, 2L, ByteBuffer.wrap(data), cacheCallback);

        verify(universalCounter, atLeastOnce()).inc();
        verify(universalOpLogger, atLeastOnce()).registerSuccessfulEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));
    }

    @Test
    public void T11_testFlush_Failure_Affects_AddEntry() throws Exception {
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        memTable.snapshot();

        doThrow(new IOException("Flush Failed")).when(flusher).process(anyLong(), anyLong(), any());

        try {
            memTable.flush(flusher);
        } catch (IOException e) {
        }

        reset(cacheCallback);
        memTable.addEntry(2L, 2L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        verify(cacheCallback, times(1)).onSizeLimitReached(any());
    }

    @Test
    public void T12_testFlush_Success_Restores_AddEntry() throws Exception {
        T11_testFlush_Failure_Affects_AddEntry();

        memTable.addEntry(3L, 3L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        memTable.snapshot();
        doNothing().when(flusher).process(anyLong(), anyLong(), any());

        memTable.flush(flusher);

        reset(cacheCallback);
        memTable.addEntry(4L, 4L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        verify(cacheCallback, never()).onSizeLimitReached(any());
    }

    @Test
    public void T13_testAdd_SizeLimit_ExactBoundary() throws Exception {
        long limit = 100L;
        when(conf.getSkipListSizeLimit()).thenReturn(limit);
        memTable = new EntryMemTable(conf, checkpointSource, new NullStatsLogger());

        java.util.concurrent.Semaphore openSemaphore = new java.util.concurrent.Semaphore(1000);
        setField(memTable, "skipListSemaphore", openSemaphore);

        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        java.lang.reflect.Field sizeField = EntryMemTable.class.getDeclaredField("size");
        sizeField.setAccessible(true);
        java.util.concurrent.atomic.AtomicLong sizeAtom = (java.util.concurrent.atomic.AtomicLong) sizeField.get(memTable);
        sizeAtom.set(limit);

        reset(cacheCallback);

        memTable.addEntry(1L, 2L, ByteBuffer.wrap(new byte[10]), cacheCallback);

        verify(cacheCallback, times(1)).onSizeLimitReached(any());
    }

    @Test
    public void T14_testAdd_DuplicateEntry_ReleasesSemaphore() throws Exception {
        java.util.concurrent.Semaphore realSemaphore = new java.util.concurrent.Semaphore(20);
        setField(memTable, "skipListSemaphore", realSemaphore);

        ByteBuffer entry = ByteBuffer.wrap(new byte[10]);

        memTable.addEntry(1L, 1L, entry.duplicate(), cacheCallback);
        assertEquals(10, realSemaphore.availablePermits());

        memTable.addEntry(1L, 1L, entry.duplicate(), cacheCallback);
        assertEquals("Permessi devono essere restituiti", 10, realSemaphore.availablePermits());
    }

    @Test
    public void T15_testFlush_ReturnsCorrectSize() throws Exception {
        byte[] data = new byte[100];
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(data), cacheCallback);
        memTable.snapshot();

        long flushed = memTable.flush(flusher);

        assertTrue("Flush deve ritornare la dimensione dei dati flushati", flushed > 0);
    }

    @Test
    public void T16_testFailureStats_AreRecorded() throws Exception {
        StatsLogger mockStatsLogger = mock(StatsLogger.class);
        org.apache.bookkeeper.stats.OpStatsLogger putStats = mock(org.apache.bookkeeper.stats.OpStatsLogger.class);
        org.apache.bookkeeper.stats.Counter anyCounter = mock(org.apache.bookkeeper.stats.Counter.class);

        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(putStats);
        when(mockStatsLogger.getCounter(anyString())).thenReturn(anyCounter);

        SkipListArena mockAlloc = mock(SkipListArena.class);
        when(mockAlloc.allocateBytes(anyInt())).thenThrow(new RuntimeException("Boom"));

        EntryMemTable failTable = new EntryMemTable(conf, checkpointSource, mockStatsLogger);
        setField(failTable, "allocator", mockAlloc);

        try {
            failTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
            fail("Doveva lanciare RuntimeException");
        } catch (RuntimeException e) {
            // Expected
        }

        Class<?> timeUnitClass = Class.forName("java.util.concurrent.TimeUnit");
        verify(putStats, times(1)).registerFailedEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));
    }

    @Test
    public void T17_testThrottlingStats_Explicit() throws Exception {
        StatsLogger mockStatsLogger = mock(StatsLogger.class);
        org.apache.bookkeeper.stats.OpStatsLogger throttleStats = mock(org.apache.bookkeeper.stats.OpStatsLogger.class);
        org.apache.bookkeeper.stats.Counter throttleCounter = mock(org.apache.bookkeeper.stats.Counter.class);

        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(throttleStats);
        when(mockStatsLogger.getCounter(anyString())).thenReturn(throttleCounter);

        memTable = new EntryMemTable(conf, checkpointSource, mockStatsLogger);

        java.util.concurrent.Semaphore mockSem = mock(java.util.concurrent.Semaphore.class);
        setField(memTable, "skipListSemaphore", mockSem);
        when(mockSem.tryAcquire(anyInt())).thenReturn(false);

        byte[] data = new byte[10];
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(data), cacheCallback);

        Class<?> timeUnitClass = Class.forName("java.util.concurrent.TimeUnit");

        verify(throttleStats, atLeastOnce()).registerSuccessfulEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));
    }

    @Test(timeout = 1000)
    public void T18_testGetEntry_UnlocksReadLock() throws Exception {
        memTable.addEntry(1L, 1L, ByteBuffer.wrap(new byte[10]), cacheCallback);
        memTable.getEntry(1L, 1L);
        java.lang.reflect.Field lockField = EntryMemTable.class.getDeclaredField("lock");
        lockField.setAccessible(true);
        java.util.concurrent.locks.ReentrantReadWriteLock lock =
                (java.util.concurrent.locks.ReentrantReadWriteLock) lockField.get(memTable);

        assertEquals("ReadLock count deve essere 0 dopo getEntry", 0, lock.getReadHoldCount());
    }

    @Test
    public void T19_testGetEntry_FailureStats() throws Exception {
        StatsLogger mockStatsLogger = mock(StatsLogger.class);
        org.apache.bookkeeper.stats.OpStatsLogger getStats = mock(org.apache.bookkeeper.stats.OpStatsLogger.class);
        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(getStats);

        memTable = new EntryMemTable(conf, checkpointSource, mockStatsLogger);

        EntryMemTable.EntrySkipList mockMap = mock(EntryMemTable.EntrySkipList.class);
        setField(memTable, "kvmap", mockMap);
        when(mockMap.get(any())).thenThrow(new RuntimeException("Map Error"));

        try {
            memTable.getEntry(1L, 1L);
        } catch (RuntimeException e) {
        }

        Class<?> timeUnitClass = Class.forName("java.util.concurrent.TimeUnit");
        verify(getStats, times(1)).registerFailedEvent(anyLong(), any(java.util.concurrent.TimeUnit.class));
    }

}