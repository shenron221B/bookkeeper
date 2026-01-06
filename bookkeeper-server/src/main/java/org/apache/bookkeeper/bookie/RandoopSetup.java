package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class RandoopSetup {

    /**
     * Metodo Factory che Randoop userà per ottenere un'istanza valida.
     */
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
}