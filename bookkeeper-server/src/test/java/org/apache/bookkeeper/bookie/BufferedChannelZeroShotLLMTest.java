package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.*;

public class BufferedChannelZeroShotLLMTest {

    private FileChannel fileChannel;
    private ByteBufAllocator allocator;
    private BufferedChannel channel;

    @Before
    public void setUp() throws Exception {
        fileChannel = mock(FileChannel.class);
        allocator = mock(ByteBufAllocator.class);

        when(fileChannel.position()).thenReturn(0L);

        when(allocator.directBuffer(anyInt()))
                .thenAnswer(invocation -> Unpooled.directBuffer(invocation.getArgument(0)));

        channel = new BufferedChannel(allocator, fileChannel, 8);
    }

    @After
    public void tearDown() throws Exception {
        channel.close();
    }

    @Test
    public void testWriteWithinCapacity() throws Exception {
        ByteBuf src = Unpooled.buffer();
        src.writeBytes(new byte[]{1, 2, 3, 4});

        channel.write(src);

        assertEquals("Position should advance by written bytes",
                4, channel.position());
        assertEquals("Bytes should remain in write buffer",
                4, channel.getNumOfBytesInWriteBuffer());

        verify(fileChannel, never()).write(any(ByteBuffer.class));
    }

    @Test
    public void testWriteTriggersFlushWhenBufferFull() throws Exception {
        ByteBuf src = Unpooled.buffer();
        src.writeBytes(new byte[]{1,2,3,4,5,6,7,8,9});

        when(fileChannel.write(any(ByteBuffer.class)))
                .thenAnswer(invocation -> {
                    ByteBuffer bb = invocation.getArgument(0);
                    int remaining = bb.remaining();
                    bb.position(bb.limit());
                    return remaining;
                });

        channel.write(src);

        assertEquals(9, channel.position());
        verify(fileChannel, atLeastOnce()).write(any(ByteBuffer.class));
    }

    @Test
    public void testFlushWritesBufferedData() throws Exception {
        ByteBuf src = Unpooled.buffer();
        src.writeBytes(new byte[]{10, 20, 30});

        when(fileChannel.write(any(ByteBuffer.class)))
                .thenAnswer(invocation -> {
                    ByteBuffer bb = invocation.getArgument(0);
                    int remaining = bb.remaining();
                    bb.position(bb.limit());
                    return remaining;
                });

        channel.write(src);
        channel.flush();

        assertEquals(0, channel.getNumOfBytesInWriteBuffer());
        verify(fileChannel, atLeastOnce()).write(any(ByteBuffer.class));
    }

    @Test
    public void testReadFromWriteBuffer() throws Exception {
        ByteBuf src = Unpooled.buffer();
        src.writeBytes(new byte[]{1, 2, 3, 4});
        channel.write(src);

        ByteBuf dest = Unpooled.buffer(4);
        int read = channel.read(dest, 0, 4);

        assertEquals(4, read);
        byte[] result = new byte[4];
        dest.readBytes(result);

        assertArrayEquals(new byte[]{1,2,3,4}, result);
        verify(fileChannel, never()).read(any(ByteBuffer.class), anyLong());
    }

    @Test
    public void testReadFromFileChannel() throws Exception {
        byte[] data = new byte[]{5, 6, 7, 8};

        AtomicLong filePositionCursor = new AtomicLong(0);

        doAnswer(invocation -> filePositionCursor.get()).when(fileChannel).position();

        doAnswer(invocation -> filePositionCursor.get()).when(fileChannel).size();

        doAnswer(invocation -> {
            ByteBuffer bb = invocation.getArgument(0);
            int written = bb.remaining();
            filePositionCursor.addAndGet(written);
            bb.position(bb.limit());
            return written;
        }).when(fileChannel).write(any(ByteBuffer.class));

        ByteBuf src = Unpooled.buffer();
        src.writeBytes(data);
        channel.write(src);
        channel.flush();

        doAnswer(invocation -> {
            ByteBuffer bb = invocation.getArgument(0);
            bb.put(data);
            return data.length;
        }).when(fileChannel).read(any(ByteBuffer.class), eq(0L));

        ByteBuf dest = Unpooled.buffer(4);
        int read = channel.read(dest, 0, 4);

        assertEquals("Should have read exactly 4 bytes", 4, read);

        byte[] result = new byte[4];
        dest.readBytes(result);
        assertArrayEquals("Data read from disk should match written data", data, result);
    }

    @Test
    public void testFlushAndForceWrite() throws Exception {
        ByteBuf src = Unpooled.buffer();
        src.writeBytes(new byte[]{1,2,3});

        when(fileChannel.write(any(ByteBuffer.class)))
                .thenAnswer(invocation -> {
                    ByteBuffer bb = invocation.getArgument(0);
                    int remaining = bb.remaining();
                    bb.position(bb.limit());
                    return remaining;
                });

        channel.write(src);
        channel.flushAndForceWrite(true);

        verify(fileChannel, atLeastOnce()).write(any(ByteBuffer.class));
        verify(fileChannel).force(true);
    }
}
