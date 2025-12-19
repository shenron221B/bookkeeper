package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class BufferedChannelTest {

    private BufferedChannel bufferedChannel;
    private FileChannel fileChannelMock;
    private UnpooledByteBufAllocator allocator;

    @Before
    public void setUp() throws Exception {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        fileChannelMock = mock(FileChannel.class);

        when(fileChannelMock.position()).thenReturn(0L);

        when(fileChannelMock.read(any(ByteBuffer.class), anyLong())).thenReturn(0);
        when(fileChannelMock.write(any(ByteBuffer.class))).thenAnswer(new Answer<Integer>() {
            @Override
            public Integer answer(InvocationOnMock invocation) {
                ByteBuffer buffer = invocation.getArgument(0);
                int bytesToWrite = buffer.remaining();
                buffer.position(buffer.limit());
                return bytesToWrite;
            }
        });

        bufferedChannel = new BufferedChannel(allocator, fileChannelMock, 100, 0L);
    }

    // test di lettura (read)

    @Test(expected = NullPointerException.class)
    public void T01_testRead_NullDestination() throws IOException {
        bufferedChannel.read(null, 0L, 10);
    }

    @Test(expected = IOException.class)
    public void T02_testRead_NegativePosition() throws IOException {
        ByteBuf dest = Unpooled.buffer(10);
        bufferedChannel.read(dest, -1L, 10);
    }

    @Test
    public void T03_testRead_NegativeLength() throws IOException {
        ByteBuf dest = Unpooled.buffer(10);
        int bytesRead = bufferedChannel.read(dest, 0L, -1);
        Assert.assertEquals("Con lunghezza negativa non dovrebbe leggere nulla", 0, bytesRead);
    }

    @Test
    public void T04_testRead_DestinationCapacityInsufficient() throws IOException {
        ByteBuf dest = Unpooled.buffer(9);
        try {
            bufferedChannel.read(dest, 0L, 10);
            Assert.fail("Doveva fallire per capacità insufficiente");
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            // successo
        } catch (Exception e) {
            Assert.fail("Eccezione inattesa: " + e.getClass().getName());
        }
    }

    @Test
    public void T05_testRead_FromDisk() throws IOException {
        int length = 5;
        ByteBuf dest = Unpooled.buffer(length);
        long positionToRead = 0L;

        when(fileChannelMock.position()).thenReturn(100L);
        BufferedChannel diskChannel = new BufferedChannel(allocator, fileChannelMock, 100, 0L);

        when(fileChannelMock.read(any(ByteBuffer.class), eq(positionToRead)))
                .thenAnswer(invocation -> {
                    ByteBuffer javaBuffer = invocation.getArgument(0);
                    int space = javaBuffer.remaining();
                    for (int i = 0; i < length && i < space; i++) {
                        javaBuffer.put((byte) 'A');
                    }
                    return length;
                });

        int bytesRead = diskChannel.read(dest, positionToRead, length);

        Assert.assertEquals(5, bytesRead);
        Assert.assertEquals(5, dest.readableBytes());
        verify(fileChannelMock, atLeastOnce()).read(any(ByteBuffer.class), eq(positionToRead));
    }

    @Test
    public void T06_testRead_FromWriteBuffer() throws IOException {
        ByteBuf dataToWrite = Unpooled.buffer(10);
        dataToWrite.writeBytes("HelloWorld".getBytes());
        bufferedChannel.write(dataToWrite);

        ByteBuf dest = Unpooled.buffer(10);
        int bytesRead = bufferedChannel.read(dest, 0L, 10);

        Assert.assertEquals(10, bytesRead);
        byte[] actualBytes = new byte[10];
        dest.readBytes(actualBytes);
        Assert.assertArrayEquals("HelloWorld".getBytes(), actualBytes);
        verify(fileChannelMock, never()).read(any(ByteBuffer.class), anyLong());
    }

    @Test
    public void T07_testRead_Overlap_DiskAndBuffer() throws IOException {
        ByteBuf dataInBuffer = Unpooled.buffer(50);
        for (int i = 0; i < 50; i++) {
            dataInBuffer.writeByte((byte) 'B');
        }

        when(fileChannelMock.position()).thenReturn(100L);

        BufferedChannel overlapChannel = new BufferedChannel(allocator, fileChannelMock, 100, 0L);

        overlapChannel.write(dataInBuffer);

        long readPos = 95L;
        int totalLen = 10;

        when(fileChannelMock.read(any(java.nio.ByteBuffer.class), eq(readPos)))
                .thenAnswer(invocation -> {
                    java.nio.ByteBuffer buf = invocation.getArgument(0);
                    for (int i = 0; i < 5; i++) buf.put((byte) 'D');
                    return 5;
                });

        ByteBuf dest = Unpooled.buffer(totalLen);
        int read = overlapChannel.read(dest, readPos, totalLen);

        Assert.assertEquals("Deve leggere 10 byte totali", 10, read);

        byte[] content = new byte[10];
        dest.readBytes(content);

        for (int i = 0; i < 5; i++) Assert.assertEquals((byte) 'D', content[i]);
        for (int i = 5; i < 10; i++) Assert.assertEquals((byte) 'B', content[i]);
    }

    // test di scrittura (write)

    @Test
    public void T08_testWrite_WithinCapacity() throws IOException {
        ByteBuf data = Unpooled.buffer(50);
        data.writeBytes(new byte[50]);

        bufferedChannel.write(data);

        verify(fileChannelMock, never()).write(any(ByteBuffer.class));
        Assert.assertEquals("Buffer interno deve avere 50 byte", 50, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    @Test
    public void T09_testWrite_ExceedingCapacity_TriggersFlush() throws IOException {
        ByteBuf data = Unpooled.buffer(150);
        for (int i = 0; i < 150; i++) {
            data.writeByte(1);
        }

        bufferedChannel.write(data);

        verify(fileChannelMock, atLeastOnce()).write(any(ByteBuffer.class));

        Assert.assertEquals("Buffer interno deve avere i restanti 50 byte", 50, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

}