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

}