package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.stats.NullStatsLogger;

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
            ServerConfiguration conf = new ServerConfiguration();
            conf.setSkipListSizeLimit(10 * 1024 * 1024); // 10MB

            CheckpointSource source = new CheckpointSource() {
                @Override
                public Checkpoint newCheckpoint() {
                    return new Checkpoint() {
                        @Override
                        public int compareTo(Checkpoint o) {
                            return 0;
                        }
                    };
                }

                @Override
                public void checkpointComplete(Checkpoint checkpoint, boolean compact) throws IOException {

                }
            };

            return new EntryMemTable(conf, source, new NullStatsLogger());
        } catch (Throwable e) {
            System.err.println("CRITICAL ERROR IN RANDOOP SETUP:");
            e.printStackTrace();
            return null;
        }
    }
}