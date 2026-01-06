package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        long long10 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        bufferedChannel11.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel20.unpersistedBytes;
        long long22 = bufferedChannel20.position();
        long long24 = bufferedChannel20.forceWrite(false);
        bufferedChannel20.position = 0L;
        long long27 = bufferedChannel20.size();
        bufferedChannel20.flushAndForceWrite(true);
        bufferedChannel20.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong33 = bufferedChannel32.unpersistedBytes;
        long long34 = bufferedChannel32.position();
        long long35 = bufferedChannel32.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf36 = bufferedChannel32.writeBuffer;
        bufferedChannel20.write(byteBuf36);
        int int40 = bufferedChannel11.read(byteBuf36, 10L, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = bufferedChannel0.read(byteBuf36, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(atomicLong33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        bufferedChannel6.clear();
        long long10 = bufferedChannel6.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel6.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong11;
        long long13 = bufferedChannel0.position();
        int int14 = bufferedChannel0.writeCapacity;
        int int15 = bufferedChannel0.writeCapacity;
        long long17 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        long long7 = bufferedChannel0.size();
        java.lang.Class<?> wildcardClass8 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        long long6 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.size();
        bufferedChannel11.flush();
        long long15 = bufferedChannel11.position;
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel11.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = bufferedChannel0.read(byteBuf16, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -35 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        bufferedChannel13.flushAndForceWrite(false);
        bufferedChannel13.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        bufferedChannel0.position = 'a';
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long30 = bufferedChannel0.forceWrite(false);
        long long31 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long5 = bufferedChannel0.position;
        int int6 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        bufferedChannel13.flushAndForceWrite(false);
        bufferedChannel13.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        bufferedChannel0.position = 'a';
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long30 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = 0L;
        long long17 = bufferedChannel10.size();
        bufferedChannel10.flushAndForceWrite(true);
        long long20 = bufferedChannel10.size();
        long long21 = bufferedChannel10.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf22 = bufferedChannel10.writeBuffer;
        int int25 = bufferedChannel0.read(byteBuf22, (long) (short) 0, (int) (short) 0);
        bufferedChannel0.flush();
        int int27 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.close();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.writeBufferStartPosition;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long9 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf10 = bufferedChannel0.writeBuffer;
        long long12 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        bufferedChannel0.position = (-1L);
        long long12 = bufferedChannel0.forceWrite(false);
        long long14 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long20 = bufferedChannel17.getFileChannelPosition();
        bufferedChannel17.flush();
        long long22 = bufferedChannel17.position();
        int int23 = bufferedChannel17.writeCapacity;
        long long24 = bufferedChannel17.unpersistedBytesBound;
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel17.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong25;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(atomicLong25);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = 0L;
        long long17 = bufferedChannel10.size();
        bufferedChannel10.flushAndForceWrite(true);
        long long20 = bufferedChannel10.size();
        long long21 = bufferedChannel10.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf22 = bufferedChannel10.writeBuffer;
        int int25 = bufferedChannel0.read(byteBuf22, (long) (short) 0, (int) (short) 0);
        long long26 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong28 = bufferedChannel27.unpersistedBytes;
        long long29 = bufferedChannel27.getFileChannelPosition();
        int int30 = bufferedChannel27.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong32 = bufferedChannel31.unpersistedBytes;
        long long33 = bufferedChannel31.position();
        long long34 = bufferedChannel31.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf35 = bufferedChannel31.writeBuffer;
        bufferedChannel27.write(byteBuf35);
        bufferedChannel0.write(byteBuf35);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong39 = bufferedChannel38.unpersistedBytes;
        long long40 = bufferedChannel38.position();
        long long42 = bufferedChannel38.forceWrite(false);
        bufferedChannel38.position = (-1);
        bufferedChannel38.flushAndForceWrite(false);
        bufferedChannel38.flush();
        bufferedChannel38.position = (byte) 10;
        bufferedChannel38.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong53 = bufferedChannel52.unpersistedBytes;
        long long54 = bufferedChannel52.position();
        long long56 = bufferedChannel52.forceWrite(false);
        bufferedChannel52.position = 0L;
        long long59 = bufferedChannel52.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong61 = bufferedChannel60.unpersistedBytes;
        long long62 = bufferedChannel60.position();
        long long64 = bufferedChannel60.forceWrite(false);
        long long65 = bufferedChannel60.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong67 = bufferedChannel66.unpersistedBytes;
        long long68 = bufferedChannel66.position();
        long long70 = bufferedChannel66.forceWrite(false);
        bufferedChannel66.position = 0L;
        bufferedChannel66.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel75 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong76 = bufferedChannel75.unpersistedBytes;
        long long77 = bufferedChannel75.position();
        long long79 = bufferedChannel75.forceWrite(false);
        bufferedChannel75.position = 0L;
        long long82 = bufferedChannel75.size();
        bufferedChannel75.flushAndForceWrite(true);
        bufferedChannel75.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel87 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong88 = bufferedChannel87.unpersistedBytes;
        long long89 = bufferedChannel87.position();
        long long90 = bufferedChannel87.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf91 = bufferedChannel87.writeBuffer;
        bufferedChannel75.write(byteBuf91);
        int int95 = bufferedChannel66.read(byteBuf91, 10L, 0);
        bufferedChannel60.write(byteBuf91);
        bufferedChannel52.write(byteBuf91);
        bufferedChannel38.write(byteBuf91);
        bufferedChannel0.write(byteBuf91);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(atomicLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(atomicLong32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(atomicLong39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel52);
        org.junit.Assert.assertNotNull(atomicLong53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(atomicLong61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel66);
        org.junit.Assert.assertNotNull(atomicLong67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel75);
        org.junit.Assert.assertNotNull(atomicLong76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel87);
        org.junit.Assert.assertNotNull(atomicLong88);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertNotNull(byteBuf91);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf8 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = 1L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel4.unpersistedBytes;
        long long6 = bufferedChannel4.position();
        long long7 = bufferedChannel4.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf8 = bufferedChannel4.writeBuffer;
        bufferedChannel0.write(byteBuf8);
        long long10 = bufferedChannel0.position;
        long long11 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        int int15 = bufferedChannel12.getNumOfBytesInWriteBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        int int19 = bufferedChannel0.read(byteBuf16, (-1L), 0);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long13 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flush();
        long long15 = bufferedChannel0.unpersistedBytesBound;
        long long16 = bufferedChannel0.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = (-1);
        bufferedChannel17.flushAndForceWrite(false);
        bufferedChannel17.flush();
        bufferedChannel17.clear();
        long long29 = bufferedChannel17.forceWrite(true);
        long long30 = bufferedChannel17.unpersistedBytesBound;
        long long31 = bufferedChannel17.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong33 = bufferedChannel32.unpersistedBytes;
        long long34 = bufferedChannel32.position();
        long long36 = bufferedChannel32.forceWrite(false);
        bufferedChannel32.position = 0L;
        long long39 = bufferedChannel32.getFileChannelPosition();
        long long40 = bufferedChannel32.size();
        long long42 = bufferedChannel32.forceWrite(false);
        int int43 = bufferedChannel32.getNumOfBytesInWriteBuffer();
        long long44 = bufferedChannel32.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf45 = bufferedChannel32.writeBuffer;
        bufferedChannel17.write(byteBuf45);
        int int49 = bufferedChannel0.read(byteBuf45, (long) (byte) 100, (-1));
        long long50 = bufferedChannel0.position;
        long long51 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(atomicLong33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = 0L;
        long long17 = bufferedChannel10.size();
        bufferedChannel10.flushAndForceWrite(true);
        long long20 = bufferedChannel10.size();
        long long21 = bufferedChannel10.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf22 = bufferedChannel10.writeBuffer;
        int int25 = bufferedChannel0.read(byteBuf22, (long) (short) 0, (int) (short) 0);
        long long26 = bufferedChannel0.position;
        int int27 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf8 = bufferedChannel0.writeBuffer;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        int int7 = bufferedChannel0.writeCapacity;
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
        long long11 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = 0L;
        long long17 = bufferedChannel10.size();
        bufferedChannel10.flushAndForceWrite(true);
        long long20 = bufferedChannel10.size();
        long long21 = bufferedChannel10.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf22 = bufferedChannel10.writeBuffer;
        int int25 = bufferedChannel0.read(byteBuf22, (long) (short) 0, (int) (short) 0);
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(atomicLong27);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWrite(true);
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.unpersistedBytes;
        long long6 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        long long10 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(false);
        long long10 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        bufferedChannel11.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel23.unpersistedBytes;
        long long25 = bufferedChannel23.position();
        long long26 = bufferedChannel23.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf27 = bufferedChannel23.writeBuffer;
        bufferedChannel11.write(byteBuf27);
        bufferedChannel0.write(byteBuf27);
        long long30 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(atomicLong24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        int int13 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = (-1);
        bufferedChannel14.flushAndForceWrite(false);
        long long23 = bufferedChannel14.getFileChannelPosition();
        int int24 = bufferedChannel14.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = bufferedChannel25.unpersistedBytes;
        long long27 = bufferedChannel25.position();
        long long29 = bufferedChannel25.forceWrite(false);
        bufferedChannel25.position = 0L;
        long long32 = bufferedChannel25.size();
        bufferedChannel25.flushAndForceWrite(true);
        long long35 = bufferedChannel25.size();
        long long36 = bufferedChannel25.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf37 = bufferedChannel25.writeBuffer;
        bufferedChannel14.write(byteBuf37);
        int int41 = bufferedChannel0.read(byteBuf37, (-1L), 0);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(atomicLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 64, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.close();
        int int12 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long13 = bufferedChannel0.position();
        long long14 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel8.unpersistedBytes;
        long long10 = bufferedChannel8.position();
        long long12 = bufferedChannel8.forceWrite(false);
        long long13 = bufferedChannel8.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = 0L;
        bufferedChannel14.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel23.unpersistedBytes;
        long long25 = bufferedChannel23.position();
        long long27 = bufferedChannel23.forceWrite(false);
        bufferedChannel23.position = 0L;
        long long30 = bufferedChannel23.size();
        bufferedChannel23.flushAndForceWrite(true);
        bufferedChannel23.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong36 = bufferedChannel35.unpersistedBytes;
        long long37 = bufferedChannel35.position();
        long long38 = bufferedChannel35.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf39 = bufferedChannel35.writeBuffer;
        bufferedChannel23.write(byteBuf39);
        int int43 = bufferedChannel14.read(byteBuf39, 10L, 0);
        bufferedChannel8.write(byteBuf39);
        bufferedChannel0.write(byteBuf39);
        long long46 = bufferedChannel0.unpersistedBytesBound;
        long long47 = bufferedChannel0.unpersistedBytesBound;
        long long48 = bufferedChannel0.getUnpersistedBytes();
        long long49 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(atomicLong24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(atomicLong36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        bufferedChannel13.flushAndForceWrite(false);
        bufferedChannel13.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        bufferedChannel0.position = 'a';
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long29 = bufferedChannel0.getUnpersistedBytes();
        int int30 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        long long11 = bufferedChannel0.forceWrite(false);
        long long12 = bufferedChannel0.position();
        long long13 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.unpersistedBytesBound;
        long long13 = bufferedChannel0.unpersistedBytesBound;
        long long14 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        int int13 = bufferedChannel0.writeCapacity;
        int int14 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = 0L;
        long long22 = bufferedChannel15.size();
        bufferedChannel15.flushAndForceWrite(true);
        long long25 = bufferedChannel15.size();
        bufferedChannel15.flushAndForceWriteIfRegularFlush(true);
        long long28 = bufferedChannel15.getUnpersistedBytes();
        bufferedChannel15.flush();
        long long30 = bufferedChannel15.unpersistedBytesBound;
        long long31 = bufferedChannel15.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong33 = bufferedChannel32.unpersistedBytes;
        long long34 = bufferedChannel32.position();
        long long36 = bufferedChannel32.forceWrite(false);
        bufferedChannel32.position = (-1);
        bufferedChannel32.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong42 = bufferedChannel41.unpersistedBytes;
        long long43 = bufferedChannel41.position();
        long long45 = bufferedChannel41.forceWrite(false);
        bufferedChannel41.position = (-1);
        bufferedChannel41.flushAndForceWrite(false);
        bufferedChannel41.flush();
        bufferedChannel41.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong53 = bufferedChannel41.unpersistedBytes;
        bufferedChannel32.writeBufferStartPosition = atomicLong53;
        io.netty.buffer.ByteBuf byteBuf55 = bufferedChannel32.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong57 = bufferedChannel56.unpersistedBytes;
        long long58 = bufferedChannel56.getFileChannelPosition();
        long long59 = bufferedChannel56.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong61 = bufferedChannel60.unpersistedBytes;
        long long62 = bufferedChannel60.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong64 = bufferedChannel63.unpersistedBytes;
        long long65 = bufferedChannel63.position();
        bufferedChannel63.clear();
        long long67 = bufferedChannel63.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong68 = bufferedChannel63.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf69 = bufferedChannel63.writeBuffer;
        int int72 = bufferedChannel60.read(byteBuf69, 0L, (int) (short) -1);
        int int75 = bufferedChannel56.read(byteBuf69, 0L, (int) (short) 0);
        bufferedChannel32.write(byteBuf69);
        bufferedChannel15.write(byteBuf69);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = bufferedChannel0.read(byteBuf69, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(atomicLong33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(atomicLong42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(atomicLong53);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(bufferedChannel56);
        org.junit.Assert.assertNotNull(atomicLong57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(atomicLong61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(atomicLong64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(atomicLong68);
        org.junit.Assert.assertNotNull(byteBuf69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        bufferedChannel6.clear();
        long long10 = bufferedChannel6.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel6.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong11;
        bufferedChannel0.clear();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        long long15 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        bufferedChannel13.flushAndForceWrite(false);
        bufferedChannel13.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        java.lang.Class<?> wildcardClass25 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.position = (short) 0;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long17 = bufferedChannel0.position;
        java.lang.Class<?> wildcardClass18 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.unpersistedBytesBound;
        long long13 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        long long18 = bufferedChannel16.position();
        long long20 = bufferedChannel16.forceWrite(false);
        bufferedChannel16.position = 0L;
        long long23 = bufferedChannel16.size();
        bufferedChannel16.flushAndForceWrite(true);
        bufferedChannel16.flushAndForceWrite(false);
        bufferedChannel16.position = 0;
        long long30 = bufferedChannel16.size();
        io.netty.buffer.ByteBuf byteBuf31 = bufferedChannel16.writeBuffer;
        bufferedChannel0.write(byteBuf31);
        java.util.concurrent.atomic.AtomicLong atomicLong33 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(atomicLong33);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

