package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.stats.NullStatsLogger;
import static org.mockito.Mockito.*;

public class RandoopSetup {

    public static BufferedChannel createValidChannel() {
        try {
            ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;
            File tempFile = File.createTempFile("randoop-test", ".log");
            tempFile.deleteOnExit();
            RandomAccessFile raf = new RandomAccessFile(tempFile, "rw");
            FileChannel fc = raf.getChannel();
            return new BufferedChannel(allocator, fc, 64);
        } catch (Exception e) {
            return null;
        }
    }

    public static EntryMemTable createValidEntryMemTable() {
        try {
            ServerConfiguration conf = mock(ServerConfiguration.class);
            when(conf.getSkipListSizeLimit()).thenReturn(1024L * 1024L);

            CheckpointSource source = mock(CheckpointSource.class);
            CheckpointSource.Checkpoint cp = mock(CheckpointSource.Checkpoint.class);
            when(source.newCheckpoint()).thenReturn(cp);
            when(cp.compareTo(any())).thenReturn(-1);

            return new EntryMemTable(conf, source, new NullStatsLogger());
        } catch (Exception e) {
            return null;
        }
    }
}