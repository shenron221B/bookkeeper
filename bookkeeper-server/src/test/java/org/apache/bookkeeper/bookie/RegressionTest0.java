package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.bookkeeper.bookie.RandoopSetup randoopSetup0 = new org.apache.bookkeeper.bookie.RandoopSetup();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = bufferedChannel0.read(byteBuf2, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedChannel0.read(byteBuf5, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        java.lang.Class<?> wildcardClass10 = atomicLong8.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = bufferedChannel0.read(byteBuf9, (long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = bufferedChannel0.size();
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException; message: Attempting to access a file channel that has already been closed");
        } catch (org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedChannel0.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bufferedChannel0.read(byteBuf11, (long) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        java.lang.Class<?> wildcardClass13 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.unpersistedBytesBound;
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bufferedChannel0.read(byteBuf8, (long) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bufferedChannel0.read(byteBuf4, (long) (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        java.lang.Class<?> wildcardClass4 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        int int5 = bufferedChannel0.writeCapacity;
        java.lang.Class<?> wildcardClass6 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        bufferedChannel5.position = 0L;
        long long12 = bufferedChannel5.size();
        bufferedChannel5.flushAndForceWrite(true);
        bufferedChannel5.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long20 = bufferedChannel17.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf21 = bufferedChannel17.writeBuffer;
        bufferedChannel5.write(byteBuf21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bufferedChannel0.read(byteBuf21, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -97 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        long long19 = bufferedChannel12.size();
        bufferedChannel12.flushAndForceWrite(true);
        long long22 = bufferedChannel12.size();
        long long23 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf24 = bufferedChannel12.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = bufferedChannel0.read(byteBuf24, (long) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel3.unpersistedBytes;
        long long5 = bufferedChannel3.position();
        long long7 = bufferedChannel3.forceWrite(false);
        bufferedChannel3.position = 0L;
        long long10 = bufferedChannel3.size();
        bufferedChannel3.flushAndForceWrite(true);
        bufferedChannel3.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long18 = bufferedChannel15.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel15.writeBuffer;
        bufferedChannel3.write(byteBuf19);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedChannel0.read(byteBuf19, (long) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long14 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf15 = bufferedChannel11.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedChannel0.read(byteBuf15, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        long long8 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long12 = bufferedChannel9.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf13 = bufferedChannel9.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedChannel0.read(byteBuf13, (long) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=97)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = bufferedChannel2.unpersistedBytes;
        long long4 = bufferedChannel2.position();
        long long6 = bufferedChannel2.forceWrite(false);
        bufferedChannel2.position = 0L;
        long long9 = bufferedChannel2.size();
        bufferedChannel2.flushAndForceWrite(true);
        bufferedChannel2.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long17 = bufferedChannel14.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf18 = bufferedChannel14.writeBuffer;
        bufferedChannel2.write(byteBuf18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedChannel0.read(byteBuf18, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(atomicLong3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        long long18 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        java.lang.Class<?> wildcardClass14 = bufferedChannel0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.getFileChannelPosition();
        int int15 = bufferedChannel12.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        long long18 = bufferedChannel16.position();
        long long19 = bufferedChannel16.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf20 = bufferedChannel16.writeBuffer;
        bufferedChannel12.write(byteBuf20);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = bufferedChannel0.read(byteBuf20, (long) (short) 1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) -1;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        bufferedChannel0.flushAndForceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong1;
        long long3 = bufferedChannel0.position;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bufferedChannel0.getFileChannelPosition();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.atomic.AtomicLong.get()\" because \"this.writeBufferStartPosition\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
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
            int int42 = bufferedChannel0.read(byteBuf36, 0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        long long10 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long13 = bufferedChannel10.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf14 = bufferedChannel10.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bufferedChannel0.read(byteBuf14, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        int int9 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) 10;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel20.unpersistedBytes;
        long long22 = bufferedChannel20.getFileChannelPosition();
        int int23 = bufferedChannel20.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel24.unpersistedBytes;
        long long26 = bufferedChannel24.position();
        long long27 = bufferedChannel24.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf28 = bufferedChannel24.writeBuffer;
        bufferedChannel20.write(byteBuf28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = bufferedChannel0.read(byteBuf28, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        long long13 = bufferedChannel0.position;
        java.lang.Class<?> wildcardClass14 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.position = (byte) 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        long long18 = bufferedChannel13.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel19.unpersistedBytes;
        long long21 = bufferedChannel19.position();
        long long23 = bufferedChannel19.forceWrite(false);
        bufferedChannel19.position = 0L;
        bufferedChannel19.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel28.unpersistedBytes;
        long long30 = bufferedChannel28.position();
        long long32 = bufferedChannel28.forceWrite(false);
        bufferedChannel28.position = 0L;
        long long35 = bufferedChannel28.size();
        bufferedChannel28.flushAndForceWrite(true);
        bufferedChannel28.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel40.unpersistedBytes;
        long long42 = bufferedChannel40.position();
        long long43 = bufferedChannel40.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf44 = bufferedChannel40.writeBuffer;
        bufferedChannel28.write(byteBuf44);
        int int48 = bufferedChannel19.read(byteBuf44, 10L, 0);
        bufferedChannel13.write(byteBuf44);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = bufferedChannel0.read(byteBuf44, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        long long1 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        long long14 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        bufferedChannel15.clear();
        long long19 = bufferedChannel15.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel15.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf21 = bufferedChannel15.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedChannel0.read(byteBuf21, 0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.unpersistedBytes;
        long long6 = bufferedChannel0.size();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass13 = atomicLong12.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.size();
        int int10 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel19.unpersistedBytes;
        long long21 = bufferedChannel19.position();
        long long23 = bufferedChannel19.forceWrite(false);
        long long24 = bufferedChannel19.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = bufferedChannel25.unpersistedBytes;
        long long27 = bufferedChannel25.position();
        long long29 = bufferedChannel25.forceWrite(false);
        bufferedChannel25.position = 0L;
        bufferedChannel25.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = bufferedChannel34.unpersistedBytes;
        long long36 = bufferedChannel34.position();
        long long38 = bufferedChannel34.forceWrite(false);
        bufferedChannel34.position = 0L;
        long long41 = bufferedChannel34.size();
        bufferedChannel34.flushAndForceWrite(true);
        bufferedChannel34.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong47 = bufferedChannel46.unpersistedBytes;
        long long48 = bufferedChannel46.position();
        long long49 = bufferedChannel46.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf50 = bufferedChannel46.writeBuffer;
        bufferedChannel34.write(byteBuf50);
        int int54 = bufferedChannel25.read(byteBuf50, 10L, 0);
        bufferedChannel19.write(byteBuf50);
        bufferedChannel11.write(byteBuf50);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = bufferedChannel0.read(byteBuf50, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(atomicLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(atomicLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(atomicLong47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = (-1);
        bufferedChannel12.flushAndForceWrite(false);
        long long21 = bufferedChannel12.getFileChannelPosition();
        int int22 = bufferedChannel12.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel23.unpersistedBytes;
        long long25 = bufferedChannel23.position();
        long long27 = bufferedChannel23.forceWrite(false);
        bufferedChannel23.position = 0L;
        long long30 = bufferedChannel23.size();
        bufferedChannel23.flushAndForceWrite(true);
        long long33 = bufferedChannel23.size();
        long long34 = bufferedChannel23.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf35 = bufferedChannel23.writeBuffer;
        bufferedChannel12.write(byteBuf35);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = bufferedChannel0.read(byteBuf35, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(atomicLong24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteBuf35);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        long long21 = bufferedChannel11.size();
        long long22 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel11.writeBuffer;
        bufferedChannel0.write(byteBuf23);
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        java.lang.Class<?> wildcardClass27 = bufferedChannel0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        long long7 = bufferedChannel0.size();
        long long8 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass2 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.flushAndForceWrite(true);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = 0L;
        long long17 = bufferedChannel10.size();
        bufferedChannel10.flushAndForceWrite(true);
        bufferedChannel10.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel22.unpersistedBytes;
        long long24 = bufferedChannel22.position();
        long long25 = bufferedChannel22.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf26 = bufferedChannel22.writeBuffer;
        bufferedChannel10.write(byteBuf26);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = bufferedChannel0.read(byteBuf26, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.writeBufferStartPosition;
        long long11 = bufferedChannel0.size();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        long long13 = bufferedChannel0.position;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long15 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.close();
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
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = (-1);
        bufferedChannel11.flushAndForceWrite(false);
        long long20 = bufferedChannel11.getFileChannelPosition();
        int int21 = bufferedChannel11.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel22.unpersistedBytes;
        long long24 = bufferedChannel22.position();
        long long26 = bufferedChannel22.forceWrite(false);
        bufferedChannel22.position = 0L;
        long long29 = bufferedChannel22.size();
        bufferedChannel22.flushAndForceWrite(true);
        long long32 = bufferedChannel22.size();
        long long33 = bufferedChannel22.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf34 = bufferedChannel22.writeBuffer;
        bufferedChannel11.write(byteBuf34);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = bufferedChannel0.read(byteBuf34, (long) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = (-1);
        bufferedChannel11.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel20.unpersistedBytes;
        long long22 = bufferedChannel20.position();
        long long24 = bufferedChannel20.forceWrite(false);
        bufferedChannel20.position = (-1);
        bufferedChannel20.flushAndForceWrite(false);
        bufferedChannel20.flush();
        bufferedChannel20.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong32 = bufferedChannel20.unpersistedBytes;
        bufferedChannel11.writeBufferStartPosition = atomicLong32;
        io.netty.buffer.ByteBuf byteBuf34 = bufferedChannel11.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = bufferedChannel0.read(byteBuf34, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(atomicLong32);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        int int14 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWrite(true);
        long long12 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        java.lang.Class<?> wildcardClass9 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel3.unpersistedBytes;
        long long5 = bufferedChannel3.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        bufferedChannel6.clear();
        long long10 = bufferedChannel6.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel6.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel6.writeBuffer;
        int int15 = bufferedChannel3.read(byteBuf12, 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedChannel0.read(byteBuf12, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        int int10 = bufferedChannel0.writeCapacity;
        long long11 = bufferedChannel0.getUnpersistedBytes();
        long long12 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '#', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.getFileChannelPosition();
        long long9 = bufferedChannel6.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        bufferedChannel13.clear();
        long long17 = bufferedChannel13.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel13.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel13.writeBuffer;
        int int22 = bufferedChannel10.read(byteBuf19, 0L, (int) (short) -1);
        int int25 = bufferedChannel6.read(byteBuf19, 0L, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf26 = bufferedChannel6.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = bufferedChannel0.read(byteBuf26, (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.lang.Class<?> wildcardClass4 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        long long14 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long10 = bufferedChannel6.forceWrite(false);
        bufferedChannel6.position = (-1);
        bufferedChannel6.flushAndForceWrite(false);
        long long15 = bufferedChannel6.getFileChannelPosition();
        int int16 = bufferedChannel6.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = 0L;
        long long24 = bufferedChannel17.size();
        bufferedChannel17.flushAndForceWrite(true);
        long long27 = bufferedChannel17.size();
        long long28 = bufferedChannel17.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf29 = bufferedChannel17.writeBuffer;
        bufferedChannel6.write(byteBuf29);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = bufferedChannel0.read(byteBuf29, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong1;
        long long3 = bufferedChannel0.position;
        long long4 = bufferedChannel0.getUnpersistedBytes();
        long long5 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.writeBufferStartPosition;
        int int7 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = 100;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        long long13 = bufferedChannel0.position();
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        int int1 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        io.netty.buffer.ByteBuf byteBuf2 = bufferedChannel0.writeBuffer;
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        java.lang.Class<?> wildcardClass5 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        long long14 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = 0L;
        bufferedChannel15.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel24.unpersistedBytes;
        long long26 = bufferedChannel24.position();
        long long28 = bufferedChannel24.forceWrite(false);
        bufferedChannel24.position = 0L;
        long long31 = bufferedChannel24.size();
        bufferedChannel24.flushAndForceWrite(true);
        bufferedChannel24.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong37 = bufferedChannel36.unpersistedBytes;
        long long38 = bufferedChannel36.position();
        long long39 = bufferedChannel36.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf40 = bufferedChannel36.writeBuffer;
        bufferedChannel24.write(byteBuf40);
        int int44 = bufferedChannel15.read(byteBuf40, 10L, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = bufferedChannel0.read(byteBuf40, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(atomicLong37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long6 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 64, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        bufferedChannel5.position = 0L;
        long long12 = bufferedChannel5.size();
        bufferedChannel5.flushAndForceWrite(true);
        long long15 = bufferedChannel5.size();
        long long16 = bufferedChannel5.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf17 = bufferedChannel5.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = bufferedChannel0.read(byteBuf17, (long) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = 0L;
        long long22 = bufferedChannel15.size();
        bufferedChannel15.flushAndForceWrite(true);
        long long25 = bufferedChannel15.size();
        long long26 = bufferedChannel15.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf27 = bufferedChannel15.writeBuffer;
        long long28 = bufferedChannel15.position;
        io.netty.buffer.ByteBuf byteBuf29 = bufferedChannel15.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = bufferedChannel0.read(byteBuf29, 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        bufferedChannel0.position = 1L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.position();
        long long13 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel8.unpersistedBytes;
        long long10 = bufferedChannel8.position();
        long long12 = bufferedChannel8.forceWrite(false);
        bufferedChannel8.position = (-1);
        bufferedChannel8.flushAndForceWrite(false);
        bufferedChannel8.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong19 = bufferedChannel18.unpersistedBytes;
        long long20 = bufferedChannel18.position();
        long long22 = bufferedChannel18.forceWrite(false);
        bufferedChannel18.position = 0L;
        long long25 = bufferedChannel18.size();
        bufferedChannel18.flushAndForceWrite(true);
        long long28 = bufferedChannel18.size();
        long long29 = bufferedChannel18.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf30 = bufferedChannel18.writeBuffer;
        int int33 = bufferedChannel8.read(byteBuf30, (long) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = bufferedChannel0.read(byteBuf30, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(atomicLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        bufferedChannel5.position = 0L;
        long long12 = bufferedChannel5.size();
        bufferedChannel5.flushAndForceWrite(true);
        bufferedChannel5.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long20 = bufferedChannel17.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf21 = bufferedChannel17.writeBuffer;
        bufferedChannel5.write(byteBuf21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = bufferedChannel0.read(byteBuf21, (long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -35 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        bufferedChannel0.position = (-1L);
        long long11 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
        io.netty.buffer.ByteBuf byteBuf25 = bufferedChannel0.writeBuffer;
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
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = (byte) 10;
        long long12 = bufferedChannel0.position;
        bufferedChannel0.flush();
        bufferedChannel0.position = 0L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        bufferedChannel0.flushAndForceWrite(false);
        long long16 = bufferedChannel0.forceWrite(false);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        int int8 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(atomicLong27);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        int int14 = bufferedChannel0.writeCapacity;
        java.lang.Class<?> wildcardClass15 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        long long18 = bufferedChannel16.position();
        long long20 = bufferedChannel16.forceWrite(false);
        bufferedChannel16.position = (-1);
        bufferedChannel16.flushAndForceWrite(false);
        long long25 = bufferedChannel16.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = bufferedChannel16.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong28 = bufferedChannel27.unpersistedBytes;
        long long29 = bufferedChannel27.position();
        long long31 = bufferedChannel27.forceWrite(false);
        bufferedChannel27.position = 0L;
        bufferedChannel27.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong37 = bufferedChannel36.unpersistedBytes;
        long long38 = bufferedChannel36.position();
        long long40 = bufferedChannel36.forceWrite(false);
        bufferedChannel36.position = 0L;
        long long43 = bufferedChannel36.size();
        bufferedChannel36.flushAndForceWrite(true);
        bufferedChannel36.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong49 = bufferedChannel48.unpersistedBytes;
        long long50 = bufferedChannel48.position();
        long long51 = bufferedChannel48.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf52 = bufferedChannel48.writeBuffer;
        bufferedChannel36.write(byteBuf52);
        int int56 = bufferedChannel27.read(byteBuf52, 10L, 0);
        bufferedChannel16.write(byteBuf52);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = bufferedChannel0.read(byteBuf52, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(atomicLong26);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(atomicLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(atomicLong37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(atomicLong49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        int int14 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
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
        bufferedChannel0.flushAndForceWrite(false);
        io.netty.buffer.ByteBuf byteBuf32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = bufferedChannel0.read(byteBuf32, (long) (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.writableBytes()\" because \"dest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
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
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = (-1);
        bufferedChannel15.flushAndForceWrite(false);
        bufferedChannel15.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel15.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong25;
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertNotNull(atomicLong27);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.position();
        io.netty.buffer.ByteBuf byteBuf13 = bufferedChannel0.writeBuffer;
        long long14 = bufferedChannel0.position();
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        long long20 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel0.unpersistedBytes;
        long long23 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong1;
        java.util.concurrent.atomic.AtomicLong atomicLong3 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNull(atomicLong3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        long long15 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.forceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        long long19 = bufferedChannel12.size();
        bufferedChannel12.flushAndForceWrite(true);
        bufferedChannel12.flushAndForceWrite(false);
        long long24 = bufferedChannel12.unpersistedBytesBound;
        bufferedChannel12.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel26.unpersistedBytes;
        long long28 = bufferedChannel26.position();
        long long30 = bufferedChannel26.forceWrite(false);
        bufferedChannel26.position = 0L;
        long long33 = bufferedChannel26.size();
        bufferedChannel26.flushAndForceWrite(true);
        long long36 = bufferedChannel26.size();
        bufferedChannel26.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel26.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong42 = bufferedChannel41.unpersistedBytes;
        long long43 = bufferedChannel41.position();
        long long45 = bufferedChannel41.forceWrite(false);
        bufferedChannel41.position = (-1);
        bufferedChannel41.flushAndForceWrite(false);
        bufferedChannel41.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong51 = bufferedChannel41.writeBufferStartPosition;
        bufferedChannel26.writeBufferStartPosition = atomicLong51;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong54 = bufferedChannel53.unpersistedBytes;
        long long55 = bufferedChannel53.getFileChannelPosition();
        long long56 = bufferedChannel53.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong58 = bufferedChannel57.unpersistedBytes;
        long long59 = bufferedChannel57.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong61 = bufferedChannel60.unpersistedBytes;
        long long62 = bufferedChannel60.position();
        bufferedChannel60.clear();
        long long64 = bufferedChannel60.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong65 = bufferedChannel60.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf66 = bufferedChannel60.writeBuffer;
        int int69 = bufferedChannel57.read(byteBuf66, 0L, (int) (short) -1);
        int int72 = bufferedChannel53.read(byteBuf66, 0L, (int) (short) 0);
        bufferedChannel26.write(byteBuf66);
        bufferedChannel12.write(byteBuf66);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = bufferedChannel0.read(byteBuf66, (long) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(atomicLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(atomicLong42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(atomicLong51);
        org.junit.Assert.assertNotNull(bufferedChannel53);
        org.junit.Assert.assertNotNull(atomicLong54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel57);
        org.junit.Assert.assertNotNull(atomicLong58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(atomicLong61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(atomicLong65);
        org.junit.Assert.assertNotNull(byteBuf66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        long long7 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        long long19 = bufferedChannel12.size();
        bufferedChannel12.flushAndForceWrite(true);
        bufferedChannel12.flushAndForceWrite(false);
        long long24 = bufferedChannel12.unpersistedBytesBound;
        long long25 = bufferedChannel12.unpersistedBytesBound;
        bufferedChannel12.flush();
        bufferedChannel12.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel28.unpersistedBytes;
        long long30 = bufferedChannel28.position();
        long long32 = bufferedChannel28.forceWrite(false);
        bufferedChannel28.position = 0L;
        long long35 = bufferedChannel28.size();
        bufferedChannel28.flushAndForceWrite(true);
        bufferedChannel28.flushAndForceWrite(false);
        bufferedChannel28.position = 0;
        long long42 = bufferedChannel28.size();
        io.netty.buffer.ByteBuf byteBuf43 = bufferedChannel28.writeBuffer;
        bufferedChannel12.write(byteBuf43);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = bufferedChannel0.read(byteBuf43, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteBuf43);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long6 = bufferedChannel0.forceWrite(true);
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long8 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.writeBufferStartPosition;
        java.lang.Class<?> wildcardClass12 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        bufferedChannel9.clear();
        long long13 = bufferedChannel9.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel9.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf15 = bufferedChannel9.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = bufferedChannel0.read(byteBuf15, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        int int13 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(atomicLong14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.close();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.close();
        java.lang.Class<?> wildcardClass9 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        long long10 = bufferedChannel5.position();
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
        bufferedChannel5.write(byteBuf36);
        int int44 = bufferedChannel0.read(byteBuf36, (-1L), (-1));
        int int45 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel13.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong20;
        long long22 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long6 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        bufferedChannel0.clear();
        long long13 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        long long20 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass23 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.size();
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.size();
        long long5 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel20.unpersistedBytes;
        long long22 = bufferedChannel20.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel20.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        int int48 = bufferedChannel0.getNumOfBytesInWriteBuffer();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        int int6 = bufferedChannel0.writeCapacity;
        long long7 = bufferedChannel0.unpersistedBytesBound;
        long long8 = bufferedChannel0.position;
        int int9 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long15 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        long long18 = bufferedChannel16.position();
        long long20 = bufferedChannel16.forceWrite(false);
        bufferedChannel16.position = (-1);
        bufferedChannel16.flushAndForceWrite(false);
        long long25 = bufferedChannel16.getFileChannelPosition();
        int int26 = bufferedChannel16.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong28 = bufferedChannel27.unpersistedBytes;
        long long29 = bufferedChannel27.position();
        long long31 = bufferedChannel27.forceWrite(false);
        bufferedChannel27.position = 0L;
        long long34 = bufferedChannel27.size();
        bufferedChannel27.flushAndForceWrite(true);
        long long37 = bufferedChannel27.size();
        long long38 = bufferedChannel27.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf39 = bufferedChannel27.writeBuffer;
        bufferedChannel16.write(byteBuf39);
        bufferedChannel0.write(byteBuf39);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(atomicLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(atomicLong42);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        int int5 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long10 = bufferedChannel6.forceWrite(false);
        long long11 = bufferedChannel6.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        bufferedChannel12.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel21.unpersistedBytes;
        long long23 = bufferedChannel21.position();
        long long25 = bufferedChannel21.forceWrite(false);
        bufferedChannel21.position = 0L;
        long long28 = bufferedChannel21.size();
        bufferedChannel21.flushAndForceWrite(true);
        bufferedChannel21.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong34 = bufferedChannel33.unpersistedBytes;
        long long35 = bufferedChannel33.position();
        long long36 = bufferedChannel33.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf37 = bufferedChannel33.writeBuffer;
        bufferedChannel21.write(byteBuf37);
        int int41 = bufferedChannel12.read(byteBuf37, 10L, 0);
        bufferedChannel6.write(byteBuf37);
        bufferedChannel0.write(byteBuf37);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(atomicLong34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        long long20 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel0.unpersistedBytes;
        long long23 = bufferedChannel0.unpersistedBytesBound;
        long long24 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        int int6 = bufferedChannel0.writeCapacity;
        long long7 = bufferedChannel0.unpersistedBytesBound;
        long long8 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        long long16 = bufferedChannel9.size();
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.position = 0;
        long long23 = bufferedChannel9.size();
        io.netty.buffer.ByteBuf byteBuf24 = bufferedChannel9.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = bufferedChannel0.read(byteBuf24, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        bufferedChannel17.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel26.unpersistedBytes;
        long long28 = bufferedChannel26.position();
        long long30 = bufferedChannel26.forceWrite(false);
        bufferedChannel26.position = (-1);
        bufferedChannel26.flushAndForceWrite(false);
        bufferedChannel26.flush();
        bufferedChannel26.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong38 = bufferedChannel26.unpersistedBytes;
        bufferedChannel17.writeBufferStartPosition = atomicLong38;
        io.netty.buffer.ByteBuf byteBuf40 = bufferedChannel17.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong42 = bufferedChannel41.unpersistedBytes;
        long long43 = bufferedChannel41.getFileChannelPosition();
        long long44 = bufferedChannel41.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong46 = bufferedChannel45.unpersistedBytes;
        long long47 = bufferedChannel45.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong49 = bufferedChannel48.unpersistedBytes;
        long long50 = bufferedChannel48.position();
        bufferedChannel48.clear();
        long long52 = bufferedChannel48.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong53 = bufferedChannel48.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf54 = bufferedChannel48.writeBuffer;
        int int57 = bufferedChannel45.read(byteBuf54, 0L, (int) (short) -1);
        int int60 = bufferedChannel41.read(byteBuf54, 0L, (int) (short) 0);
        bufferedChannel17.write(byteBuf54);
        bufferedChannel0.write(byteBuf54);
        bufferedChannel0.flushAndForceWrite(false);
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
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(atomicLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(atomicLong42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel45);
        org.junit.Assert.assertNotNull(atomicLong46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(atomicLong49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(atomicLong53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.position = (byte) 100;
        io.netty.buffer.ByteBuf byteBuf13 = bufferedChannel0.writeBuffer;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        bufferedChannel0.position = 10L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long9 = bufferedChannel6.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf10 = bufferedChannel6.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        long long16 = bufferedChannel11.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = 0L;
        bufferedChannel17.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel26.unpersistedBytes;
        long long28 = bufferedChannel26.position();
        long long30 = bufferedChannel26.forceWrite(false);
        bufferedChannel26.position = 0L;
        long long33 = bufferedChannel26.size();
        bufferedChannel26.flushAndForceWrite(true);
        bufferedChannel26.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong39 = bufferedChannel38.unpersistedBytes;
        long long40 = bufferedChannel38.position();
        long long41 = bufferedChannel38.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf42 = bufferedChannel38.writeBuffer;
        bufferedChannel26.write(byteBuf42);
        int int46 = bufferedChannel17.read(byteBuf42, 10L, 0);
        bufferedChannel11.write(byteBuf42);
        int int50 = bufferedChannel6.read(byteBuf42, (-1L), (-1));
        bufferedChannel0.write(byteBuf42);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(atomicLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(atomicLong39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        long long3 = bufferedChannel0.unpersistedBytesBound;
        int int4 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
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
        bufferedChannel0.write(byteBuf36);
        long long42 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        int int5 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        int int1 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long2 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
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
        bufferedChannel0.flushAndForceWrite(false);
        long long32 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong34 = bufferedChannel33.unpersistedBytes;
        long long35 = bufferedChannel33.position();
        long long37 = bufferedChannel33.forceWrite(false);
        bufferedChannel33.position = 0L;
        bufferedChannel33.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong43 = bufferedChannel42.unpersistedBytes;
        long long44 = bufferedChannel42.position();
        long long46 = bufferedChannel42.forceWrite(false);
        bufferedChannel42.position = 0L;
        long long49 = bufferedChannel42.size();
        bufferedChannel42.flushAndForceWrite(true);
        bufferedChannel42.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong55 = bufferedChannel54.unpersistedBytes;
        long long56 = bufferedChannel54.position();
        long long57 = bufferedChannel54.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf58 = bufferedChannel54.writeBuffer;
        bufferedChannel42.write(byteBuf58);
        int int62 = bufferedChannel33.read(byteBuf58, 10L, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = bufferedChannel0.read(byteBuf58, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(atomicLong34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(atomicLong43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel54);
        org.junit.Assert.assertNotNull(atomicLong55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        int int10 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass12 = atomicLong11.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        long long7 = bufferedChannel0.size();
        long long8 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long15 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long6 = bufferedChannel0.forceWrite(true);
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        int int8 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(false);
        java.lang.Class<?> wildcardClass15 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.position = (byte) 0;
        int int13 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.unpersistedBytesBound;
        long long13 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        long long16 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWrite(true);
        long long12 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.unpersistedBytesBound;
        io.netty.buffer.ByteBuf byteBuf11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        java.lang.Class<?> wildcardClass15 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long13 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long5 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long10 = bufferedChannel6.forceWrite(false);
        bufferedChannel6.position = 0L;
        long long13 = bufferedChannel6.getFileChannelPosition();
        long long14 = bufferedChannel6.size();
        long long16 = bufferedChannel6.forceWrite(false);
        int int17 = bufferedChannel6.getNumOfBytesInWriteBuffer();
        long long18 = bufferedChannel6.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel6.writeBuffer;
        bufferedChannel0.write(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        long long16 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        int int50 = bufferedChannel0.getNumOfBytesInWriteBuffer();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        int int8 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel10.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(atomicLong17);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = (byte) 10;
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = 0L;
        long long21 = bufferedChannel14.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel22.unpersistedBytes;
        long long24 = bufferedChannel22.position();
        long long26 = bufferedChannel22.forceWrite(false);
        long long27 = bufferedChannel22.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel28.unpersistedBytes;
        long long30 = bufferedChannel28.position();
        long long32 = bufferedChannel28.forceWrite(false);
        bufferedChannel28.position = 0L;
        bufferedChannel28.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong38 = bufferedChannel37.unpersistedBytes;
        long long39 = bufferedChannel37.position();
        long long41 = bufferedChannel37.forceWrite(false);
        bufferedChannel37.position = 0L;
        long long44 = bufferedChannel37.size();
        bufferedChannel37.flushAndForceWrite(true);
        bufferedChannel37.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong50 = bufferedChannel49.unpersistedBytes;
        long long51 = bufferedChannel49.position();
        long long52 = bufferedChannel49.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf53 = bufferedChannel49.writeBuffer;
        bufferedChannel37.write(byteBuf53);
        int int57 = bufferedChannel28.read(byteBuf53, 10L, 0);
        bufferedChannel22.write(byteBuf53);
        bufferedChannel14.write(byteBuf53);
        bufferedChannel0.write(byteBuf53);
        io.netty.buffer.ByteBuf byteBuf61 = bufferedChannel0.writeBuffer;
        java.lang.Class<?> wildcardClass62 = byteBuf61.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel49);
        org.junit.Assert.assertNotNull(atomicLong50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        int int7 = bufferedChannel0.writeCapacity;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        long long10 = bufferedChannel0.position();
        long long12 = bufferedChannel0.forceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
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
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong51 = bufferedChannel50.unpersistedBytes;
        long long52 = bufferedChannel50.getFileChannelPosition();
        long long53 = bufferedChannel50.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong55 = bufferedChannel54.unpersistedBytes;
        long long56 = bufferedChannel54.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong58 = bufferedChannel57.unpersistedBytes;
        long long59 = bufferedChannel57.position();
        bufferedChannel57.clear();
        long long61 = bufferedChannel57.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong62 = bufferedChannel57.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf63 = bufferedChannel57.writeBuffer;
        int int66 = bufferedChannel54.read(byteBuf63, 0L, (int) (short) -1);
        int int69 = bufferedChannel50.read(byteBuf63, 0L, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf70 = bufferedChannel50.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int72 = bufferedChannel0.read(byteBuf70, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bufferedChannel50);
        org.junit.Assert.assertNotNull(atomicLong51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel54);
        org.junit.Assert.assertNotNull(atomicLong55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel57);
        org.junit.Assert.assertNotNull(atomicLong58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(atomicLong62);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(byteBuf70);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        long long7 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        bufferedChannel8.position = (-1);
        bufferedChannel8.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = (-1);
        bufferedChannel17.flushAndForceWrite(false);
        bufferedChannel17.flush();
        bufferedChannel17.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel17.unpersistedBytes;
        bufferedChannel8.writeBufferStartPosition = atomicLong29;
        io.netty.buffer.ByteBuf byteBuf31 = bufferedChannel8.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = bufferedChannel0.read(byteBuf31, (long) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        int int1 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(atomicLong2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long8 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        int int9 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long16 = bufferedChannel13.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(atomicLong17);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flush();
        java.lang.Class<?> wildcardClass4 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        long long14 = bufferedChannel0.getFileChannelPosition();
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        bufferedChannel0.clear();
        long long13 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.close();
        long long4 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.position = '#';
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
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        long long7 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        long long9 = bufferedChannel7.position();
        long long10 = bufferedChannel7.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf11 = bufferedChannel7.writeBuffer;
        bufferedChannel0.write(byteBuf11);
        java.lang.Class<?> wildcardClass13 = byteBuf11.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        bufferedChannel0.position = 64;
        int int13 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedChannel0.size();
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException; message: Attempting to access a file channel that has already been closed");
        } catch (org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        long long3 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel4.unpersistedBytes;
        long long6 = bufferedChannel4.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        long long9 = bufferedChannel7.position();
        bufferedChannel7.clear();
        long long11 = bufferedChannel7.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel7.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf13 = bufferedChannel7.writeBuffer;
        int int16 = bufferedChannel4.read(byteBuf13, 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = bufferedChannel0.read(byteBuf13, (long) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        long long17 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        long long8 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.position = (short) 100;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        long long20 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        int int10 = bufferedChannel0.writeCapacity;
        long long11 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.position = (short) -1;
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) 10;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = 0L;
        long long24 = bufferedChannel17.size();
        bufferedChannel17.flushAndForceWrite(true);
        bufferedChannel17.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong30 = bufferedChannel29.unpersistedBytes;
        long long31 = bufferedChannel29.position();
        long long32 = bufferedChannel29.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf33 = bufferedChannel29.writeBuffer;
        bufferedChannel17.write(byteBuf33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = bufferedChannel0.read(byteBuf33, 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(atomicLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.position = (short) 0;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong12;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        int int7 = bufferedChannel0.writeCapacity;
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        long long12 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        bufferedChannel13.flushAndForceWrite(false);
        long long22 = bufferedChannel13.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel13.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        int int25 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        long long25 = bufferedChannel0.unpersistedBytesBound;
        long long26 = bufferedChannel0.size();
        java.lang.Class<?> wildcardClass27 = bufferedChannel0.getClass();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        bufferedChannel5.position = 0L;
        bufferedChannel5.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = 0L;
        long long21 = bufferedChannel14.size();
        bufferedChannel14.flushAndForceWrite(true);
        bufferedChannel14.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel26.unpersistedBytes;
        long long28 = bufferedChannel26.position();
        long long29 = bufferedChannel26.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf30 = bufferedChannel26.writeBuffer;
        bufferedChannel14.write(byteBuf30);
        int int34 = bufferedChannel5.read(byteBuf30, 10L, 0);
        bufferedChannel0.write(byteBuf30);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong37 = bufferedChannel36.unpersistedBytes;
        long long38 = bufferedChannel36.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong39 = bufferedChannel36.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong39;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(atomicLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(atomicLong37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(atomicLong39);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flush();
        long long12 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(true);
        long long13 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.close();
        long long12 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        int int10 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass12 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.size();
        bufferedChannel0.position = 'a';
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long10 = bufferedChannel6.forceWrite(false);
        bufferedChannel6.position = 0L;
        long long13 = bufferedChannel6.getFileChannelPosition();
        long long14 = bufferedChannel6.size();
        long long16 = bufferedChannel6.forceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = 0L;
        long long24 = bufferedChannel17.size();
        bufferedChannel17.flushAndForceWrite(true);
        bufferedChannel17.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong30 = bufferedChannel29.unpersistedBytes;
        long long31 = bufferedChannel29.position();
        long long32 = bufferedChannel29.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf33 = bufferedChannel29.writeBuffer;
        bufferedChannel17.write(byteBuf33);
        bufferedChannel6.write(byteBuf33);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = bufferedChannel0.read(byteBuf33, (long) 64, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -64 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(atomicLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long10 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.position = (byte) 0;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = 0L;
        bufferedChannel13.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong22;
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertNotNull(atomicLong24);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        long long8 = bufferedChannel0.getFileChannelPosition();
        long long10 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.position = 0;
        int int14 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        int int6 = bufferedChannel0.writeCapacity;
        long long7 = bufferedChannel0.unpersistedBytesBound;
        long long8 = bufferedChannel0.position;
        long long9 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.clear();
        bufferedChannel0.flushAndForceWrite(true);
        long long4 = bufferedChannel0.unpersistedBytesBound;
        long long5 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(atomicLong15);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
            bufferedChannel0.flushAndForceWrite(false);
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        long long11 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) 10;
        int int15 = bufferedChannel0.writeCapacity;
        int int16 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        int int7 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel8.unpersistedBytes;
        long long10 = bufferedChannel8.position();
        long long12 = bufferedChannel8.forceWrite(false);
        bufferedChannel8.position = (-1);
        bufferedChannel8.flushAndForceWrite(false);
        long long17 = bufferedChannel8.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel8.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel19.unpersistedBytes;
        long long21 = bufferedChannel19.position();
        long long23 = bufferedChannel19.forceWrite(false);
        bufferedChannel19.position = 0L;
        bufferedChannel19.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel28.unpersistedBytes;
        long long30 = bufferedChannel28.position();
        long long32 = bufferedChannel28.forceWrite(false);
        bufferedChannel28.position = 0L;
        long long35 = bufferedChannel28.size();
        bufferedChannel28.flushAndForceWrite(true);
        bufferedChannel28.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel40.unpersistedBytes;
        long long42 = bufferedChannel40.position();
        long long43 = bufferedChannel40.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf44 = bufferedChannel40.writeBuffer;
        bufferedChannel28.write(byteBuf44);
        int int48 = bufferedChannel19.read(byteBuf44, 10L, 0);
        bufferedChannel8.write(byteBuf44);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = bufferedChannel0.read(byteBuf44, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.clear();
        bufferedChannel0.flushAndForceWrite(true);
        long long4 = bufferedChannel0.unpersistedBytesBound;
        long long6 = bufferedChannel0.forceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long13 = bufferedChannel0.forceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf15 = bufferedChannel0.writeBuffer;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.size();
        bufferedChannel0.position = 10L;
        long long7 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        long long8 = bufferedChannel0.size();
        long long9 = bufferedChannel0.size();
        long long10 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        int int10 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.position = (byte) -1;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long9 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = (-1);
        bufferedChannel10.flushAndForceWrite(false);
        long long19 = bufferedChannel10.getFileChannelPosition();
        bufferedChannel10.clear();
        long long21 = bufferedChannel10.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel22.unpersistedBytes;
        long long24 = bufferedChannel22.position();
        long long26 = bufferedChannel22.forceWrite(false);
        bufferedChannel22.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel22.unpersistedBytes;
        bufferedChannel22.flushAndForceWrite(false);
        long long32 = bufferedChannel22.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong34 = bufferedChannel33.unpersistedBytes;
        long long35 = bufferedChannel33.position();
        long long37 = bufferedChannel33.forceWrite(false);
        bufferedChannel33.position = 0L;
        long long40 = bufferedChannel33.size();
        bufferedChannel33.flushAndForceWrite(true);
        bufferedChannel33.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong46 = bufferedChannel45.unpersistedBytes;
        long long47 = bufferedChannel45.position();
        long long48 = bufferedChannel45.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf49 = bufferedChannel45.writeBuffer;
        bufferedChannel33.write(byteBuf49);
        bufferedChannel22.write(byteBuf49);
        bufferedChannel10.write(byteBuf49);
        bufferedChannel0.write(byteBuf49);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(atomicLong34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel45);
        org.junit.Assert.assertNotNull(atomicLong46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteBuf49);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        bufferedChannel0.position = (-1);
        long long5 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        long long3 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        long long5 = bufferedChannel0.unpersistedBytesBound;
        int int6 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(false);
        long long10 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        bufferedChannel0.position = '#';
        long long16 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        long long13 = bufferedChannel0.position;
        io.netty.buffer.ByteBuf byteBuf14 = bufferedChannel0.writeBuffer;
        io.netty.buffer.ByteBuf byteBuf15 = bufferedChannel0.writeBuffer;
        long long16 = bufferedChannel0.getFileChannelPosition();
        long long17 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.close();
        long long13 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long9 = bufferedChannel0.getFileChannelPosition();
        long long10 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long12 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.clear();
        bufferedChannel0.close();
        long long16 = bufferedChannel0.unpersistedBytesBound;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        long long3 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        long long5 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long10 = bufferedChannel6.forceWrite(false);
        bufferedChannel6.position = 0L;
        long long13 = bufferedChannel6.size();
        bufferedChannel6.flushAndForceWrite(true);
        long long16 = bufferedChannel6.size();
        long long17 = bufferedChannel6.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf18 = bufferedChannel6.writeBuffer;
        bufferedChannel0.write(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(atomicLong4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        long long15 = bufferedChannel0.forceWrite(false);
        int int16 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        long long14 = bufferedChannel0.unpersistedBytesBound;
        java.lang.Class<?> wildcardClass15 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) 10;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        bufferedChannel0.clear();
        long long19 = bufferedChannel0.forceWrite(true);
        io.netty.buffer.ByteBuf byteBuf20 = bufferedChannel0.writeBuffer;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flushAndForceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long5 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        bufferedChannel0.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.writeBufferStartPosition;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel10.unpersistedBytes;
        long long12 = bufferedChannel10.position();
        long long14 = bufferedChannel10.forceWrite(false);
        bufferedChannel10.position = 0L;
        bufferedChannel10.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong19 = bufferedChannel10.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong19;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(atomicLong19);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(true);
        long long18 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
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
        bufferedChannel0.write(byteBuf36);
        long long42 = bufferedChannel0.getUnpersistedBytes();
        long long43 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        int int1 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        long long16 = bufferedChannel9.size();
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel21.unpersistedBytes;
        long long23 = bufferedChannel21.position();
        long long24 = bufferedChannel21.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf25 = bufferedChannel21.writeBuffer;
        bufferedChannel9.write(byteBuf25);
        int int29 = bufferedChannel0.read(byteBuf25, 10L, 0);
        java.lang.Class<?> wildcardClass30 = byteBuf25.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(false);
        long long10 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.unpersistedBytesBound;
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long13 = bufferedChannel0.forceWrite(false);
        long long15 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) 10;
        int int15 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        long long13 = bufferedChannel0.size();
        long long14 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        long long10 = bufferedChannel5.position();
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
        bufferedChannel5.write(byteBuf36);
        int int44 = bufferedChannel0.read(byteBuf36, (-1L), (-1));
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong48 = bufferedChannel47.unpersistedBytes;
        long long49 = bufferedChannel47.getFileChannelPosition();
        long long50 = bufferedChannel47.position;
        bufferedChannel47.flush();
        long long52 = bufferedChannel47.getFileChannelPosition();
        long long53 = bufferedChannel47.getUnpersistedBytes();
        bufferedChannel47.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong56 = bufferedChannel47.unpersistedBytes;
        long long57 = bufferedChannel47.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong58 = bufferedChannel47.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong58;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel47);
        org.junit.Assert.assertNotNull(atomicLong48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(atomicLong56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(atomicLong58);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.close();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong12;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bufferedChannel0.getFileChannelPosition();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.atomic.AtomicLong.get()\" because \"this.writeBufferStartPosition\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        long long21 = bufferedChannel11.size();
        long long22 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel11.writeBuffer;
        bufferedChannel0.write(byteBuf23);
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel0.writeBufferStartPosition;
        long long26 = bufferedChannel0.size();
        int int27 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long29 = bufferedChannel0.forceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.position = 35L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.writeBufferStartPosition;
        int int12 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.unpersistedBytesBound;
        long long10 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass6 = atomicLong5.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long5 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel9.unpersistedBytes;
        bufferedChannel9.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong19 = bufferedChannel18.unpersistedBytes;
        long long20 = bufferedChannel18.position();
        bufferedChannel18.clear();
        long long22 = bufferedChannel18.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel18.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel24.unpersistedBytes;
        long long26 = bufferedChannel24.position();
        bufferedChannel24.clear();
        long long28 = bufferedChannel24.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel24.unpersistedBytes;
        bufferedChannel18.writeBufferStartPosition = atomicLong29;
        bufferedChannel9.writeBufferStartPosition = atomicLong29;
        bufferedChannel9.position = '#';
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = bufferedChannel34.unpersistedBytes;
        long long36 = bufferedChannel34.position();
        long long38 = bufferedChannel34.forceWrite(false);
        bufferedChannel34.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel34.unpersistedBytes;
        bufferedChannel34.clear();
        long long43 = bufferedChannel34.getUnpersistedBytes();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = bufferedChannel44.unpersistedBytes;
        long long46 = bufferedChannel44.position();
        long long48 = bufferedChannel44.forceWrite(false);
        bufferedChannel44.position = 0L;
        long long51 = bufferedChannel44.size();
        bufferedChannel44.flushAndForceWrite(true);
        bufferedChannel44.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong57 = bufferedChannel56.unpersistedBytes;
        long long58 = bufferedChannel56.position();
        long long59 = bufferedChannel56.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf60 = bufferedChannel56.writeBuffer;
        bufferedChannel44.write(byteBuf60);
        bufferedChannel34.write(byteBuf60);
        int int65 = bufferedChannel9.read(byteBuf60, 0L, (-1));
        int int68 = bufferedChannel0.read(byteBuf60, (long) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass69 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(atomicLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(atomicLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(atomicLong45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel56);
        org.junit.Assert.assertNotNull(atomicLong57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = (-1);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flush();
        bufferedChannel9.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel9.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong21;
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel0.writeBuffer;
        long long24 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        int int5 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel6.unpersistedBytes;
        long long8 = bufferedChannel6.position();
        long long10 = bufferedChannel6.forceWrite(false);
        bufferedChannel6.position = 0L;
        long long13 = bufferedChannel6.size();
        bufferedChannel6.flushAndForceWrite(true);
        long long16 = bufferedChannel6.size();
        long long17 = bufferedChannel6.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf18 = bufferedChannel6.writeBuffer;
        long long19 = bufferedChannel6.position;
        io.netty.buffer.ByteBuf byteBuf20 = bufferedChannel6.writeBuffer;
        io.netty.buffer.ByteBuf byteBuf21 = bufferedChannel6.writeBuffer;
        long long22 = bufferedChannel6.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel6.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.unpersistedBytes;
        long long14 = bufferedChannel0.forceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel3.unpersistedBytes;
        long long5 = bufferedChannel3.position();
        long long7 = bufferedChannel3.forceWrite(false);
        bufferedChannel3.position = 0L;
        long long10 = bufferedChannel3.size();
        bufferedChannel3.flushAndForceWrite(true);
        bufferedChannel3.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long18 = bufferedChannel15.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel15.writeBuffer;
        bufferedChannel3.write(byteBuf19);
        bufferedChannel3.position = 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel23.unpersistedBytes;
        long long25 = bufferedChannel23.position();
        long long27 = bufferedChannel23.forceWrite(false);
        bufferedChannel23.position = (-1);
        bufferedChannel23.flushAndForceWrite(false);
        bufferedChannel23.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong34 = bufferedChannel33.unpersistedBytes;
        long long35 = bufferedChannel33.position();
        long long37 = bufferedChannel33.forceWrite(false);
        bufferedChannel33.position = 0L;
        long long40 = bufferedChannel33.size();
        bufferedChannel33.flushAndForceWrite(true);
        long long43 = bufferedChannel33.size();
        long long44 = bufferedChannel33.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf45 = bufferedChannel33.writeBuffer;
        int int48 = bufferedChannel23.read(byteBuf45, (long) (short) 0, (int) (short) 0);
        bufferedChannel3.write(byteBuf45);
        bufferedChannel0.write(byteBuf45);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(atomicLong24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(atomicLong34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        long long3 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        int int3 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel4.unpersistedBytes;
        long long6 = bufferedChannel4.position();
        long long8 = bufferedChannel4.forceWrite(false);
        bufferedChannel4.position = 0L;
        long long11 = bufferedChannel4.size();
        bufferedChannel4.flushAndForceWrite(true);
        long long14 = bufferedChannel4.size();
        long long15 = bufferedChannel4.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        long long18 = bufferedChannel16.position();
        long long20 = bufferedChannel16.forceWrite(false);
        bufferedChannel16.position = 0L;
        long long23 = bufferedChannel16.getFileChannelPosition();
        long long24 = bufferedChannel16.size();
        long long26 = bufferedChannel16.forceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong28 = bufferedChannel27.unpersistedBytes;
        long long29 = bufferedChannel27.position();
        long long31 = bufferedChannel27.forceWrite(false);
        bufferedChannel27.position = 0L;
        long long34 = bufferedChannel27.size();
        bufferedChannel27.flushAndForceWrite(true);
        bufferedChannel27.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong40 = bufferedChannel39.unpersistedBytes;
        long long41 = bufferedChannel39.position();
        long long42 = bufferedChannel39.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf43 = bufferedChannel39.writeBuffer;
        bufferedChannel27.write(byteBuf43);
        bufferedChannel16.write(byteBuf43);
        bufferedChannel4.write(byteBuf43);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = bufferedChannel0.read(byteBuf43, (long) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(atomicLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel39);
        org.junit.Assert.assertNotNull(atomicLong40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteBuf43);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        int int11 = bufferedChannel0.writeCapacity;
        long long12 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        long long18 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        long long8 = bufferedChannel0.size();
        long long9 = bufferedChannel0.position();
        long long10 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        bufferedChannel5.position = (-1);
        bufferedChannel5.flushAndForceWrite(false);
        long long14 = bufferedChannel5.getFileChannelPosition();
        int int15 = bufferedChannel5.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        long long18 = bufferedChannel16.position();
        long long20 = bufferedChannel16.forceWrite(false);
        bufferedChannel16.position = 0L;
        long long23 = bufferedChannel16.size();
        bufferedChannel16.flushAndForceWrite(true);
        long long26 = bufferedChannel16.size();
        long long27 = bufferedChannel16.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf28 = bufferedChannel16.writeBuffer;
        bufferedChannel5.write(byteBuf28);
        bufferedChannel0.write(byteBuf28);
        java.util.concurrent.atomic.AtomicLong atomicLong31 = bufferedChannel0.writeBufferStartPosition;
        int int32 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(atomicLong31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        int int9 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        bufferedChannel0.position = 35L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        long long8 = bufferedChannel0.size();
        long long9 = bufferedChannel0.size();
        long long11 = bufferedChannel0.forceWrite(true);
        long long12 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '#', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long12 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.clear();
        long long15 = bufferedChannel0.unpersistedBytesBound;
        long long16 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        bufferedChannel17.close();
        bufferedChannel17.close();
        io.netty.buffer.ByteBuf byteBuf21 = bufferedChannel17.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = bufferedChannel0.read(byteBuf21, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        long long15 = bufferedChannel0.forceWrite(false);
        int int16 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
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
        bufferedChannel0.flushAndForceWrite(false);
        int int32 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        long long5 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel9.unpersistedBytes;
        bufferedChannel9.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong19 = bufferedChannel18.unpersistedBytes;
        long long20 = bufferedChannel18.position();
        bufferedChannel18.clear();
        long long22 = bufferedChannel18.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel18.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel24.unpersistedBytes;
        long long26 = bufferedChannel24.position();
        bufferedChannel24.clear();
        long long28 = bufferedChannel24.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel24.unpersistedBytes;
        bufferedChannel18.writeBufferStartPosition = atomicLong29;
        bufferedChannel9.writeBufferStartPosition = atomicLong29;
        bufferedChannel9.position = '#';
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = bufferedChannel34.unpersistedBytes;
        long long36 = bufferedChannel34.position();
        long long38 = bufferedChannel34.forceWrite(false);
        bufferedChannel34.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel34.unpersistedBytes;
        bufferedChannel34.clear();
        long long43 = bufferedChannel34.getUnpersistedBytes();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = bufferedChannel44.unpersistedBytes;
        long long46 = bufferedChannel44.position();
        long long48 = bufferedChannel44.forceWrite(false);
        bufferedChannel44.position = 0L;
        long long51 = bufferedChannel44.size();
        bufferedChannel44.flushAndForceWrite(true);
        bufferedChannel44.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong57 = bufferedChannel56.unpersistedBytes;
        long long58 = bufferedChannel56.position();
        long long59 = bufferedChannel56.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf60 = bufferedChannel56.writeBuffer;
        bufferedChannel44.write(byteBuf60);
        bufferedChannel34.write(byteBuf60);
        int int65 = bufferedChannel9.read(byteBuf60, 0L, (-1));
        int int68 = bufferedChannel0.read(byteBuf60, (long) (byte) 0, (int) (short) -1);
        long long69 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(atomicLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(atomicLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(atomicLong45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel56);
        org.junit.Assert.assertNotNull(atomicLong57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel11.unpersistedBytes;
        bufferedChannel11.flushAndForceWrite(false);
        long long21 = bufferedChannel11.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel22.unpersistedBytes;
        long long24 = bufferedChannel22.position();
        long long26 = bufferedChannel22.forceWrite(false);
        bufferedChannel22.position = 0L;
        long long29 = bufferedChannel22.size();
        bufferedChannel22.flushAndForceWrite(true);
        bufferedChannel22.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = bufferedChannel34.unpersistedBytes;
        long long36 = bufferedChannel34.position();
        long long37 = bufferedChannel34.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf38 = bufferedChannel34.writeBuffer;
        bufferedChannel22.write(byteBuf38);
        bufferedChannel11.write(byteBuf38);
        bufferedChannel0.write(byteBuf38);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(atomicLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong47 = bufferedChannel46.unpersistedBytes;
        long long48 = bufferedChannel46.position();
        long long50 = bufferedChannel46.forceWrite(false);
        bufferedChannel46.position = 0L;
        long long53 = bufferedChannel46.size();
        bufferedChannel46.flushAndForceWrite(true);
        long long56 = bufferedChannel46.size();
        long long57 = bufferedChannel46.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf58 = bufferedChannel46.writeBuffer;
        bufferedChannel46.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong61 = bufferedChannel60.unpersistedBytes;
        long long62 = bufferedChannel60.getFileChannelPosition();
        long long63 = bufferedChannel60.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong65 = bufferedChannel64.unpersistedBytes;
        long long66 = bufferedChannel64.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong68 = bufferedChannel67.unpersistedBytes;
        long long69 = bufferedChannel67.position();
        bufferedChannel67.clear();
        long long71 = bufferedChannel67.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong72 = bufferedChannel67.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf73 = bufferedChannel67.writeBuffer;
        int int76 = bufferedChannel64.read(byteBuf73, 0L, (int) (short) -1);
        int int79 = bufferedChannel60.read(byteBuf73, 0L, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf80 = bufferedChannel60.writeBuffer;
        bufferedChannel46.write(byteBuf80);
        bufferedChannel0.write(byteBuf80);
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
        org.junit.Assert.assertNotNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(atomicLong47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(atomicLong61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel64);
        org.junit.Assert.assertNotNull(atomicLong65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel67);
        org.junit.Assert.assertNotNull(atomicLong68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(atomicLong72);
        org.junit.Assert.assertNotNull(byteBuf73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteBuf80);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
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
        bufferedChannel0.flushAndForceWrite(false);
        io.netty.buffer.ByteBuf byteBuf32 = bufferedChannel0.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong34 = bufferedChannel33.unpersistedBytes;
        long long35 = bufferedChannel33.position();
        long long37 = bufferedChannel33.forceWrite(false);
        bufferedChannel33.position = 0L;
        long long40 = bufferedChannel33.size();
        bufferedChannel33.flushAndForceWrite(true);
        bufferedChannel33.flushAndForceWrite(false);
        long long45 = bufferedChannel33.unpersistedBytesBound;
        long long46 = bufferedChannel33.unpersistedBytesBound;
        bufferedChannel33.flush();
        bufferedChannel33.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong50 = bufferedChannel49.unpersistedBytes;
        long long51 = bufferedChannel49.position();
        long long53 = bufferedChannel49.forceWrite(false);
        bufferedChannel49.position = 0L;
        long long56 = bufferedChannel49.size();
        bufferedChannel49.flushAndForceWrite(true);
        bufferedChannel49.flushAndForceWrite(false);
        bufferedChannel49.position = 0;
        long long63 = bufferedChannel49.size();
        io.netty.buffer.ByteBuf byteBuf64 = bufferedChannel49.writeBuffer;
        bufferedChannel33.write(byteBuf64);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = bufferedChannel0.read(byteBuf64, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
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
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(atomicLong34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel49);
        org.junit.Assert.assertNotNull(atomicLong50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteBuf64);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long11 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        long long19 = bufferedChannel12.size();
        bufferedChannel12.flushAndForceWrite(true);
        bufferedChannel12.flushAndForceWrite(false);
        bufferedChannel12.position = 0;
        long long26 = bufferedChannel12.size();
        io.netty.buffer.ByteBuf byteBuf27 = bufferedChannel12.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = bufferedChannel0.read(byteBuf27, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        long long21 = bufferedChannel11.size();
        long long22 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel11.writeBuffer;
        bufferedChannel0.write(byteBuf23);
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel0.writeBufferStartPosition;
        long long26 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = (byte) 10;
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = 0L;
        long long21 = bufferedChannel14.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel22.unpersistedBytes;
        long long24 = bufferedChannel22.position();
        long long26 = bufferedChannel22.forceWrite(false);
        long long27 = bufferedChannel22.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel28.unpersistedBytes;
        long long30 = bufferedChannel28.position();
        long long32 = bufferedChannel28.forceWrite(false);
        bufferedChannel28.position = 0L;
        bufferedChannel28.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong38 = bufferedChannel37.unpersistedBytes;
        long long39 = bufferedChannel37.position();
        long long41 = bufferedChannel37.forceWrite(false);
        bufferedChannel37.position = 0L;
        long long44 = bufferedChannel37.size();
        bufferedChannel37.flushAndForceWrite(true);
        bufferedChannel37.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong50 = bufferedChannel49.unpersistedBytes;
        long long51 = bufferedChannel49.position();
        long long52 = bufferedChannel49.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf53 = bufferedChannel49.writeBuffer;
        bufferedChannel37.write(byteBuf53);
        int int57 = bufferedChannel28.read(byteBuf53, 10L, 0);
        bufferedChannel22.write(byteBuf53);
        bufferedChannel14.write(byteBuf53);
        bufferedChannel0.write(byteBuf53);
        int int61 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel49);
        org.junit.Assert.assertNotNull(atomicLong50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong1;
        long long3 = bufferedChannel0.position;
        long long4 = bufferedChannel0.getUnpersistedBytes();
        long long5 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.position = (byte) 0;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(atomicLong6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        long long20 = bufferedChannel15.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel21.unpersistedBytes;
        long long23 = bufferedChannel21.position();
        long long25 = bufferedChannel21.forceWrite(false);
        bufferedChannel21.position = 0L;
        bufferedChannel21.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong31 = bufferedChannel30.unpersistedBytes;
        long long32 = bufferedChannel30.position();
        long long34 = bufferedChannel30.forceWrite(false);
        bufferedChannel30.position = 0L;
        long long37 = bufferedChannel30.size();
        bufferedChannel30.flushAndForceWrite(true);
        bufferedChannel30.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong43 = bufferedChannel42.unpersistedBytes;
        long long44 = bufferedChannel42.position();
        long long45 = bufferedChannel42.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf46 = bufferedChannel42.writeBuffer;
        bufferedChannel30.write(byteBuf46);
        int int50 = bufferedChannel21.read(byteBuf46, 10L, 0);
        bufferedChannel15.write(byteBuf46);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = bufferedChannel0.read(byteBuf46, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -52 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(atomicLong31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(atomicLong43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.position = 0;
        long long14 = bufferedChannel0.size();
        long long16 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.flushAndForceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        bufferedChannel0.close();
        bufferedChannel0.position = (byte) 0;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf6 = bufferedChannel0.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        long long9 = bufferedChannel7.getFileChannelPosition();
        bufferedChannel7.flush();
        bufferedChannel7.flushAndForceWriteIfRegularFlush(false);
        io.netty.buffer.ByteBuf byteBuf13 = bufferedChannel7.writeBuffer;
        bufferedChannel0.write(byteBuf13);
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(atomicLong15);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        long long12 = bufferedChannel0.position;
        bufferedChannel0.clear();
        bufferedChannel0.clear();
        java.lang.Class<?> wildcardClass15 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel0.unpersistedBytes;
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
        org.junit.Assert.assertNotNull(atomicLong25);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        io.netty.buffer.ByteBuf byteBuf9 = bufferedChannel0.writeBuffer;
        long long10 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        bufferedChannel0.flushAndForceWrite(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        int int32 = bufferedChannel31.getNumOfBytesInWriteBuffer();
        io.netty.buffer.ByteBuf byteBuf33 = bufferedChannel31.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = bufferedChannel0.read(byteBuf33, 0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long7 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long12 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.clear();
        bufferedChannel0.close();
        long long16 = bufferedChannel0.unpersistedBytesBound;
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(atomicLong17);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        bufferedChannel0.flushAndForceWrite(true);
        long long32 = bufferedChannel0.forceWrite(false);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong49 = bufferedChannel48.unpersistedBytes;
        long long50 = bufferedChannel48.position();
        long long52 = bufferedChannel48.forceWrite(false);
        long long53 = bufferedChannel48.position();
        java.util.concurrent.atomic.AtomicLong atomicLong54 = bufferedChannel48.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong54;
        long long56 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
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
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(atomicLong49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(atomicLong54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = 0L;
        long long21 = bufferedChannel14.getFileChannelPosition();
        long long22 = bufferedChannel14.size();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel14.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        java.lang.Class<?> wildcardClass25 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass14 = atomicLong13.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long9 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf10 = bufferedChannel0.writeBuffer;
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
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
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel0.writeBufferStartPosition;
        long long5 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        long long5 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        long long5 = bufferedChannel0.position();
        long long6 = bufferedChannel0.position();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.flushAndForceWrite(false);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.flush();
        bufferedChannel0.position = 0L;
        java.lang.Class<?> wildcardClass11 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long12 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = 0L;
        long long22 = bufferedChannel15.size();
        bufferedChannel15.flushAndForceWrite(true);
        long long25 = bufferedChannel15.size();
        int int26 = bufferedChannel15.getNumOfBytesInWriteBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = bufferedChannel15.writeBuffer;
        bufferedChannel0.write(byteBuf27);
        long long29 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        long long5 = bufferedChannel0.position;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        long long9 = bufferedChannel7.position();
        long long11 = bufferedChannel7.forceWrite(false);
        bufferedChannel7.position = 0L;
        long long14 = bufferedChannel7.size();
        bufferedChannel7.flushAndForceWrite(true);
        long long17 = bufferedChannel7.size();
        long long18 = bufferedChannel7.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel7.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = bufferedChannel0.read(byteBuf19, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        long long12 = bufferedChannel0.position;
        bufferedChannel0.clear();
        bufferedChannel0.clear();
        bufferedChannel0.position = 100;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.position = (byte) 0;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = 0L;
        bufferedChannel13.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong22;
        java.lang.Class<?> wildcardClass24 = atomicLong22.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        java.lang.Class<?> wildcardClass3 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.size();
        bufferedChannel0.position = 35L;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long10 = bufferedChannel0.forceWrite(false);
        java.lang.Class<?> wildcardClass11 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.size();
        bufferedChannel0.flush();
        long long4 = bufferedChannel0.position;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        bufferedChannel0.clear();
        bufferedChannel0.flushAndForceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.clear();
        bufferedChannel0.flushAndForceWrite(true);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel4.unpersistedBytes;
        long long6 = bufferedChannel4.position();
        long long8 = bufferedChannel4.forceWrite(false);
        bufferedChannel4.position = 0L;
        bufferedChannel4.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = 0L;
        long long20 = bufferedChannel13.size();
        bufferedChannel13.flushAndForceWrite(true);
        bufferedChannel13.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = bufferedChannel25.unpersistedBytes;
        long long27 = bufferedChannel25.position();
        long long28 = bufferedChannel25.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf29 = bufferedChannel25.writeBuffer;
        bufferedChannel13.write(byteBuf29);
        int int33 = bufferedChannel4.read(byteBuf29, 10L, 0);
        bufferedChannel0.write(byteBuf29);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong36 = bufferedChannel35.unpersistedBytes;
        long long37 = bufferedChannel35.getFileChannelPosition();
        long long38 = bufferedChannel35.position;
        bufferedChannel35.flush();
        long long40 = bufferedChannel35.getFileChannelPosition();
        long long41 = bufferedChannel35.getUnpersistedBytes();
        bufferedChannel35.flushAndForceWriteIfRegularFlush(false);
        io.netty.buffer.ByteBuf byteBuf44 = bufferedChannel35.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = bufferedChannel0.read(byteBuf44, (long) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(atomicLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(atomicLong36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteBuf44);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWrite(false);
        long long10 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel5.unpersistedBytes;
        long long7 = bufferedChannel5.position();
        long long9 = bufferedChannel5.forceWrite(false);
        bufferedChannel5.position = 0L;
        long long12 = bufferedChannel5.size();
        bufferedChannel5.flushAndForceWrite(true);
        long long15 = bufferedChannel5.size();
        long long16 = bufferedChannel5.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf17 = bufferedChannel5.writeBuffer;
        long long18 = bufferedChannel5.position;
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel5.writeBuffer;
        io.netty.buffer.ByteBuf byteBuf20 = bufferedChannel5.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedChannel0.read(byteBuf20, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -97 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        long long12 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.flush();
        long long14 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long12 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.position = 64;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.clear();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flush();
        int int9 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        long long4 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel8.unpersistedBytes;
        long long10 = bufferedChannel8.position();
        long long12 = bufferedChannel8.forceWrite(false);
        bufferedChannel8.position = (-1);
        bufferedChannel8.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = (-1);
        bufferedChannel17.flushAndForceWrite(false);
        bufferedChannel17.flush();
        bufferedChannel17.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong29 = bufferedChannel17.unpersistedBytes;
        bufferedChannel8.writeBufferStartPosition = atomicLong29;
        io.netty.buffer.ByteBuf byteBuf31 = bufferedChannel8.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong33 = bufferedChannel32.unpersistedBytes;
        long long34 = bufferedChannel32.getFileChannelPosition();
        long long35 = bufferedChannel32.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong37 = bufferedChannel36.unpersistedBytes;
        long long38 = bufferedChannel36.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong40 = bufferedChannel39.unpersistedBytes;
        long long41 = bufferedChannel39.position();
        bufferedChannel39.clear();
        long long43 = bufferedChannel39.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong44 = bufferedChannel39.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf45 = bufferedChannel39.writeBuffer;
        int int48 = bufferedChannel36.read(byteBuf45, 0L, (int) (short) -1);
        int int51 = bufferedChannel32.read(byteBuf45, 0L, (int) (short) 0);
        bufferedChannel8.write(byteBuf45);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = bufferedChannel0.read(byteBuf45, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(atomicLong29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(atomicLong33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(atomicLong37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel39);
        org.junit.Assert.assertNotNull(atomicLong40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(atomicLong44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.close();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.writeBufferStartPosition;
        long long10 = bufferedChannel0.getFileChannelPosition();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.flushAndForceWrite(false);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        long long19 = bufferedChannel12.getFileChannelPosition();
        long long20 = bufferedChannel12.size();
        long long22 = bufferedChannel12.forceWrite(false);
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
        bufferedChannel12.write(byteBuf39);
        bufferedChannel0.write(byteBuf39);
        long long43 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        long long21 = bufferedChannel11.size();
        long long22 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel11.writeBuffer;
        bufferedChannel0.write(byteBuf23);
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel0.writeBufferStartPosition;
        long long26 = bufferedChannel0.size();
        java.lang.Class<?> wildcardClass27 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        bufferedChannel0.position = (-1L);
        long long12 = bufferedChannel0.forceWrite(false);
        long long13 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        int int13 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long14 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong49 = bufferedChannel48.unpersistedBytes;
        long long50 = bufferedChannel48.position();
        long long52 = bufferedChannel48.forceWrite(false);
        long long53 = bufferedChannel48.position();
        java.util.concurrent.atomic.AtomicLong atomicLong54 = bufferedChannel48.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong54;
        long long56 = bufferedChannel0.size();
        java.util.concurrent.atomic.AtomicLong atomicLong57 = bufferedChannel0.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong59 = bufferedChannel58.unpersistedBytes;
        long long60 = bufferedChannel58.position();
        long long62 = bufferedChannel58.forceWrite(false);
        bufferedChannel58.position = (-1);
        bufferedChannel58.flushAndForceWrite(false);
        long long67 = bufferedChannel58.getFileChannelPosition();
        int int68 = bufferedChannel58.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel69 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong70 = bufferedChannel69.unpersistedBytes;
        long long71 = bufferedChannel69.position();
        long long73 = bufferedChannel69.forceWrite(false);
        bufferedChannel69.position = 0L;
        long long76 = bufferedChannel69.size();
        bufferedChannel69.flushAndForceWrite(true);
        long long79 = bufferedChannel69.size();
        long long80 = bufferedChannel69.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf81 = bufferedChannel69.writeBuffer;
        bufferedChannel58.write(byteBuf81);
        java.util.concurrent.atomic.AtomicLong atomicLong83 = bufferedChannel58.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong83;
        long long85 = bufferedChannel0.getFileChannelPosition();
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
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(atomicLong49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(atomicLong54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(atomicLong57);
        org.junit.Assert.assertNotNull(bufferedChannel58);
        org.junit.Assert.assertNotNull(atomicLong59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 64 + "'", int68 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel69);
        org.junit.Assert.assertNotNull(atomicLong70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(byteBuf81);
        org.junit.Assert.assertNotNull(atomicLong83);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong49 = bufferedChannel48.unpersistedBytes;
        long long50 = bufferedChannel48.position();
        long long52 = bufferedChannel48.forceWrite(false);
        long long53 = bufferedChannel48.position();
        java.util.concurrent.atomic.AtomicLong atomicLong54 = bufferedChannel48.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong54;
        long long56 = bufferedChannel0.size();
        bufferedChannel0.position = 'a';
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
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(atomicLong49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(atomicLong54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        long long10 = bufferedChannel0.position;
        long long11 = bufferedChannel0.size();
        int int12 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf8 = bufferedChannel0.writeBuffer;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(atomicLong9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.flush();
        bufferedChannel0.flush();
        int int22 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.close();
        long long8 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long11 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.position = (short) 1;
        long long14 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long12 = bufferedChannel0.getFileChannelPosition();
        long long13 = bufferedChannel0.position();
        java.lang.Class<?> wildcardClass14 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel20.unpersistedBytes;
        long long22 = bufferedChannel20.getFileChannelPosition();
        bufferedChannel20.flush();
        bufferedChannel20.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong26 = bufferedChannel20.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong26;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong26);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.position();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = (-1);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flush();
        bufferedChannel9.clear();
        int int20 = bufferedChannel9.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel9.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel9.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong22;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertNotNull(atomicLong22);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        long long9 = bufferedChannel0.position();
        int int10 = bufferedChannel0.writeCapacity;
        long long11 = bufferedChannel0.position();
        int int12 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = (-1);
        bufferedChannel15.flushAndForceWrite(false);
        bufferedChannel15.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel15.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong25;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong28 = bufferedChannel27.unpersistedBytes;
        long long29 = bufferedChannel27.getFileChannelPosition();
        long long30 = bufferedChannel27.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong32 = bufferedChannel31.unpersistedBytes;
        long long33 = bufferedChannel31.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = bufferedChannel34.unpersistedBytes;
        long long36 = bufferedChannel34.position();
        bufferedChannel34.clear();
        long long38 = bufferedChannel34.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong39 = bufferedChannel34.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf40 = bufferedChannel34.writeBuffer;
        int int43 = bufferedChannel31.read(byteBuf40, 0L, (int) (short) -1);
        int int46 = bufferedChannel27.read(byteBuf40, 0L, (int) (short) 0);
        bufferedChannel0.write(byteBuf40);
        long long48 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(atomicLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(atomicLong32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(atomicLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(atomicLong39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        bufferedChannel0.clear();
        long long13 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(atomicLong13);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        long long12 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = (-1);
        bufferedChannel13.flushAndForceWrite(false);
        long long22 = bufferedChannel13.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = bufferedChannel13.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong23;
        bufferedChannel0.position = 0L;
        long long27 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long16 = bufferedChannel0.position();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        long long14 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = 0L;
        long long22 = bufferedChannel15.getFileChannelPosition();
        long long23 = bufferedChannel15.size();
        long long25 = bufferedChannel15.forceWrite(false);
        int int26 = bufferedChannel15.getNumOfBytesInWriteBuffer();
        long long27 = bufferedChannel15.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf28 = bufferedChannel15.writeBuffer;
        bufferedChannel0.write(byteBuf28);
        java.util.concurrent.atomic.AtomicLong atomicLong30 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong30;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bufferedChannel0.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.atomic.AtomicLong.get()\" because \"this.writeBufferStartPosition\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        long long8 = bufferedChannel0.size();
        long long10 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong19 = bufferedChannel12.unpersistedBytes;
        bufferedChannel12.clear();
        long long21 = bufferedChannel12.getUnpersistedBytes();
        bufferedChannel12.position = (short) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel24.unpersistedBytes;
        long long26 = bufferedChannel24.position();
        long long28 = bufferedChannel24.forceWrite(false);
        bufferedChannel24.position = (-1);
        bufferedChannel24.flushAndForceWrite(false);
        bufferedChannel24.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = bufferedChannel34.unpersistedBytes;
        long long36 = bufferedChannel34.position();
        long long38 = bufferedChannel34.forceWrite(false);
        bufferedChannel34.position = 0L;
        long long41 = bufferedChannel34.size();
        bufferedChannel34.flushAndForceWrite(true);
        long long44 = bufferedChannel34.size();
        long long45 = bufferedChannel34.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf46 = bufferedChannel34.writeBuffer;
        int int49 = bufferedChannel24.read(byteBuf46, (long) (short) 0, (int) (short) 0);
        long long50 = bufferedChannel24.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong52 = bufferedChannel51.unpersistedBytes;
        long long53 = bufferedChannel51.getFileChannelPosition();
        int int54 = bufferedChannel51.getNumOfBytesInWriteBuffer();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong56 = bufferedChannel55.unpersistedBytes;
        long long57 = bufferedChannel55.position();
        long long58 = bufferedChannel55.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf59 = bufferedChannel55.writeBuffer;
        bufferedChannel51.write(byteBuf59);
        bufferedChannel24.write(byteBuf59);
        bufferedChannel12.write(byteBuf59);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = bufferedChannel0.read(byteBuf59, (long) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(atomicLong19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(atomicLong35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(atomicLong52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(bufferedChannel55);
        org.junit.Assert.assertNotNull(atomicLong56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(byteBuf59);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong8;
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        int int11 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.position = 0;
        long long14 = bufferedChannel0.size();
        long long16 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.close();
        int int18 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        bufferedChannel9.clear();
        long long13 = bufferedChannel9.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel9.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        bufferedChannel15.clear();
        long long19 = bufferedChannel15.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel15.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong20;
        bufferedChannel0.writeBufferStartPosition = atomicLong20;
        bufferedChannel0.position = '#';
        long long25 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position;
        long long3 = bufferedChannel0.unpersistedBytesBound;
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(atomicLong4);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
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
        bufferedChannel11.position = 1;
        long long31 = bufferedChannel11.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong32 = bufferedChannel11.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong32;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(atomicLong32);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        long long21 = bufferedChannel11.size();
        long long22 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel11.writeBuffer;
        bufferedChannel0.write(byteBuf23);
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel0.writeBufferStartPosition;
        long long26 = bufferedChannel0.size();
        bufferedChannel0.clear();
        long long28 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        long long16 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.position = (byte) 10;
        bufferedChannel0.close();
        int int13 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long9 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.size();
        bufferedChannel0.clear();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        long long8 = bufferedChannel0.size();
        long long9 = bufferedChannel0.position();
        long long10 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel11.unpersistedBytes;
        bufferedChannel11.clear();
        long long20 = bufferedChannel11.getUnpersistedBytes();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel21.unpersistedBytes;
        long long23 = bufferedChannel21.position();
        long long25 = bufferedChannel21.forceWrite(false);
        bufferedChannel21.position = 0L;
        long long28 = bufferedChannel21.size();
        bufferedChannel21.flushAndForceWrite(true);
        bufferedChannel21.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong34 = bufferedChannel33.unpersistedBytes;
        long long35 = bufferedChannel33.position();
        long long36 = bufferedChannel33.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf37 = bufferedChannel33.writeBuffer;
        bufferedChannel21.write(byteBuf37);
        bufferedChannel11.write(byteBuf37);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = bufferedChannel0.read(byteBuf37, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(atomicLong34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteBuf37);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        long long23 = bufferedChannel11.position();
        io.netty.buffer.ByteBuf byteBuf24 = bufferedChannel11.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = bufferedChannel0.read(byteBuf24, 0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        int int14 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.flushAndForceWrite(false);
        long long17 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong18);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        int int10 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        long long12 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.flush();
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.position = (-1);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertNotNull(atomicLong22);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = bufferedChannel0.unpersistedBytes;
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel23.unpersistedBytes;
        long long25 = bufferedChannel23.position();
        long long27 = bufferedChannel23.forceWrite(false);
        bufferedChannel23.position = 0L;
        long long30 = bufferedChannel23.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong32 = bufferedChannel31.unpersistedBytes;
        long long33 = bufferedChannel31.position();
        long long35 = bufferedChannel31.forceWrite(false);
        long long36 = bufferedChannel31.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong38 = bufferedChannel37.unpersistedBytes;
        long long39 = bufferedChannel37.position();
        long long41 = bufferedChannel37.forceWrite(false);
        bufferedChannel37.position = 0L;
        bufferedChannel37.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong47 = bufferedChannel46.unpersistedBytes;
        long long48 = bufferedChannel46.position();
        long long50 = bufferedChannel46.forceWrite(false);
        bufferedChannel46.position = 0L;
        long long53 = bufferedChannel46.size();
        bufferedChannel46.flushAndForceWrite(true);
        bufferedChannel46.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong59 = bufferedChannel58.unpersistedBytes;
        long long60 = bufferedChannel58.position();
        long long61 = bufferedChannel58.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf62 = bufferedChannel58.writeBuffer;
        bufferedChannel46.write(byteBuf62);
        int int66 = bufferedChannel37.read(byteBuf62, 10L, 0);
        bufferedChannel31.write(byteBuf62);
        bufferedChannel23.write(byteBuf62);
        bufferedChannel10.write(byteBuf62);
        bufferedChannel0.write(byteBuf62);
        long long71 = bufferedChannel0.getFileChannelPosition();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(atomicLong9);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(atomicLong11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(atomicLong24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(atomicLong32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(atomicLong47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel58);
        org.junit.Assert.assertNotNull(atomicLong59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        long long14 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        long long19 = bufferedChannel15.forceWrite(false);
        bufferedChannel15.position = 0L;
        long long22 = bufferedChannel15.getFileChannelPosition();
        long long23 = bufferedChannel15.size();
        long long25 = bufferedChannel15.forceWrite(false);
        int int26 = bufferedChannel15.getNumOfBytesInWriteBuffer();
        long long27 = bufferedChannel15.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf28 = bufferedChannel15.writeBuffer;
        bufferedChannel0.write(byteBuf28);
        bufferedChannel0.position = 0;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        long long15 = bufferedChannel0.unpersistedBytesBound;
        long long16 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        io.netty.buffer.ByteBuf byteBuf6 = bufferedChannel0.writeBuffer;
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(atomicLong7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        bufferedChannel17.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel26.unpersistedBytes;
        long long28 = bufferedChannel26.position();
        long long30 = bufferedChannel26.forceWrite(false);
        bufferedChannel26.position = (-1);
        bufferedChannel26.flushAndForceWrite(false);
        bufferedChannel26.flush();
        bufferedChannel26.position = (byte) 10;
        java.util.concurrent.atomic.AtomicLong atomicLong38 = bufferedChannel26.unpersistedBytes;
        bufferedChannel17.writeBufferStartPosition = atomicLong38;
        io.netty.buffer.ByteBuf byteBuf40 = bufferedChannel17.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong42 = bufferedChannel41.unpersistedBytes;
        long long43 = bufferedChannel41.getFileChannelPosition();
        long long44 = bufferedChannel41.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong46 = bufferedChannel45.unpersistedBytes;
        long long47 = bufferedChannel45.size();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong49 = bufferedChannel48.unpersistedBytes;
        long long50 = bufferedChannel48.position();
        bufferedChannel48.clear();
        long long52 = bufferedChannel48.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong53 = bufferedChannel48.unpersistedBytes;
        io.netty.buffer.ByteBuf byteBuf54 = bufferedChannel48.writeBuffer;
        int int57 = bufferedChannel45.read(byteBuf54, 0L, (int) (short) -1);
        int int60 = bufferedChannel41.read(byteBuf54, 0L, (int) (short) 0);
        bufferedChannel17.write(byteBuf54);
        bufferedChannel0.write(byteBuf54);
        int int63 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long64 = bufferedChannel0.position();
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
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(atomicLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(atomicLong42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel45);
        org.junit.Assert.assertNotNull(atomicLong46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(atomicLong49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(atomicLong53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        long long5 = bufferedChannel0.position();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(atomicLong8);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel0.writeBufferStartPosition;
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
        org.junit.Assert.assertNotNull(atomicLong15);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        long long3 = bufferedChannel0.position;
        bufferedChannel0.flush();
        long long5 = bufferedChannel0.getFileChannelPosition();
        long long6 = bufferedChannel0.unpersistedBytesBound;
        int int7 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        bufferedChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.flushAndForceWrite(true);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel0.writeBufferStartPosition;
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(atomicLong5);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel0.unpersistedBytes;
        int int11 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        bufferedChannel0.position = (byte) 1;
        int int3 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = bufferedChannel4.unpersistedBytes;
        long long6 = bufferedChannel4.position();
        long long8 = bufferedChannel4.forceWrite(false);
        bufferedChannel4.position = (-1);
        bufferedChannel4.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel20.unpersistedBytes;
        bufferedChannel13.writeBufferStartPosition = atomicLong21;
        bufferedChannel4.writeBufferStartPosition = atomicLong21;
        bufferedChannel0.writeBufferStartPosition = atomicLong21;
        int int25 = bufferedChannel0.writeCapacity;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(atomicLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        long long13 = bufferedChannel0.position;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel14.unpersistedBytes;
        bufferedChannel0.writeBufferStartPosition = atomicLong21;
        long long23 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long16 = bufferedChannel12.forceWrite(false);
        bufferedChannel12.position = 0L;
        long long19 = bufferedChannel12.getFileChannelPosition();
        long long20 = bufferedChannel12.size();
        long long22 = bufferedChannel12.forceWrite(false);
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
        bufferedChannel12.write(byteBuf39);
        bufferedChannel0.write(byteBuf39);
        long long44 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel0.flush();
        io.netty.buffer.ByteBuf byteBuf10 = bufferedChannel0.writeBuffer;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(atomicLong6);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        bufferedChannel0.flush();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
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
        long long26 = bufferedChannel0.unpersistedBytesBound;
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        long long9 = bufferedChannel0.getUnpersistedBytes();
        bufferedChannel0.position = (short) 1;
        long long12 = bufferedChannel0.position;
        int int13 = bufferedChannel0.writeCapacity;
        java.lang.Class<?> wildcardClass14 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        bufferedChannel0.position = (byte) 0;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel13.unpersistedBytes;
        long long15 = bufferedChannel13.position();
        long long17 = bufferedChannel13.forceWrite(false);
        bufferedChannel13.position = 0L;
        bufferedChannel13.flushAndForceWrite(false);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel13.writeBufferStartPosition;
        bufferedChannel0.writeBufferStartPosition = atomicLong22;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = bufferedChannel25.unpersistedBytes;
        long long27 = bufferedChannel25.getFileChannelPosition();
        long long28 = bufferedChannel25.position;
        bufferedChannel25.flush();
        long long30 = bufferedChannel25.getFileChannelPosition();
        long long31 = bufferedChannel25.getUnpersistedBytes();
        bufferedChannel25.flushAndForceWriteIfRegularFlush(false);
        io.netty.buffer.ByteBuf byteBuf34 = bufferedChannel25.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = bufferedChannel0.read(byteBuf34, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(atomicLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        bufferedChannel0.position = (byte) 10;
        long long15 = bufferedChannel0.unpersistedBytesBound;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = 0L;
        long long24 = bufferedChannel17.size();
        bufferedChannel17.flushAndForceWrite(true);
        long long27 = bufferedChannel17.size();
        long long28 = bufferedChannel17.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong30 = bufferedChannel29.unpersistedBytes;
        long long31 = bufferedChannel29.position();
        long long33 = bufferedChannel29.forceWrite(false);
        bufferedChannel29.position = 0L;
        long long36 = bufferedChannel29.getFileChannelPosition();
        long long37 = bufferedChannel29.size();
        long long39 = bufferedChannel29.forceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel40.unpersistedBytes;
        long long42 = bufferedChannel40.position();
        long long44 = bufferedChannel40.forceWrite(false);
        bufferedChannel40.position = 0L;
        long long47 = bufferedChannel40.size();
        bufferedChannel40.flushAndForceWrite(true);
        bufferedChannel40.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong53 = bufferedChannel52.unpersistedBytes;
        long long54 = bufferedChannel52.position();
        long long55 = bufferedChannel52.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf56 = bufferedChannel52.writeBuffer;
        bufferedChannel40.write(byteBuf56);
        bufferedChannel29.write(byteBuf56);
        bufferedChannel17.write(byteBuf56);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = bufferedChannel0.read(byteBuf56, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -32 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(atomicLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel52);
        org.junit.Assert.assertNotNull(atomicLong53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(byteBuf56);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        bufferedChannel9.clear();
        long long13 = bufferedChannel9.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = bufferedChannel9.unpersistedBytes;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel15.unpersistedBytes;
        long long17 = bufferedChannel15.position();
        bufferedChannel15.clear();
        long long19 = bufferedChannel15.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = bufferedChannel15.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong20;
        bufferedChannel0.writeBufferStartPosition = atomicLong20;
        bufferedChannel0.position = '#';
        long long25 = bufferedChannel0.size();
        long long26 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(atomicLong14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(atomicLong16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(atomicLong20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.flush();
        long long7 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.position = 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel16.unpersistedBytes;
        bufferedChannel9.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.writeBufferStartPosition = atomicLong17;
        bufferedChannel0.flush();
        bufferedChannel0.flush();
        java.util.concurrent.atomic.AtomicLong atomicLong22 = bufferedChannel0.writeBufferStartPosition;
        long long23 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(atomicLong17);
        org.junit.Assert.assertNotNull(atomicLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        long long20 = bufferedChannel0.getUnpersistedBytes();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.flushAndForceWriteIfRegularFlush(false);
        java.util.concurrent.atomic.AtomicLong atomicLong24 = bufferedChannel0.writeBufferStartPosition;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(atomicLong21);
        org.junit.Assert.assertNotNull(atomicLong24);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        int int10 = bufferedChannel0.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel11.unpersistedBytes;
        long long13 = bufferedChannel11.position();
        long long15 = bufferedChannel11.forceWrite(false);
        bufferedChannel11.position = 0L;
        long long18 = bufferedChannel11.size();
        bufferedChannel11.flushAndForceWrite(true);
        long long21 = bufferedChannel11.size();
        long long22 = bufferedChannel11.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf23 = bufferedChannel11.writeBuffer;
        bufferedChannel0.write(byteBuf23);
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel0.writeBufferStartPosition;
        io.netty.buffer.ByteBuf byteBuf26 = bufferedChannel0.writeBuffer;
        long long27 = bufferedChannel0.unpersistedBytesBound;
        long long28 = bufferedChannel0.position;
        java.util.concurrent.atomic.AtomicLong atomicLong29 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong29;
        bufferedChannel0.position = (short) 0;
        long long33 = bufferedChannel0.size();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = bufferedChannel0.unpersistedBytes;
        long long13 = bufferedChannel0.position();
        bufferedChannel0.flushAndForceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        long long10 = bufferedChannel0.size();
        long long11 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf12 = bufferedChannel0.writeBuffer;
        long long13 = bufferedChannel0.position;
        io.netty.buffer.ByteBuf byteBuf14 = bufferedChannel0.writeBuffer;
        io.netty.buffer.ByteBuf byteBuf15 = bufferedChannel0.writeBuffer;
        long long16 = bufferedChannel0.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = bufferedChannel17.unpersistedBytes;
        long long19 = bufferedChannel17.position();
        long long21 = bufferedChannel17.forceWrite(false);
        bufferedChannel17.position = (-1);
        bufferedChannel17.flushAndForceWrite(false);
        long long26 = bufferedChannel17.getFileChannelPosition();
        int int27 = bufferedChannel17.writeCapacity;
        int int28 = bufferedChannel17.getNumOfBytesInWriteBuffer();
        io.netty.buffer.ByteBuf byteBuf29 = bufferedChannel17.writeBuffer;
        int int32 = bufferedChannel0.read(byteBuf29, (long) (short) 10, (-1));
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = null;
        bufferedChannel0.writeBufferStartPosition = atomicLong1;
        long long3 = bufferedChannel0.position;
        long long4 = bufferedChannel0.getUnpersistedBytes();
        long long5 = bufferedChannel0.getUnpersistedBytes();
        io.netty.buffer.ByteBuf byteBuf6 = bufferedChannel0.writeBuffer;
        java.util.concurrent.atomic.AtomicLong atomicLong7 = bufferedChannel0.unpersistedBytes;
        java.lang.Class<?> wildcardClass8 = bufferedChannel0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        long long27 = bufferedChannel0.forceWrite(false);
        long long28 = bufferedChannel0.size();
        bufferedChannel0.position = 1L;
        bufferedChannel0.flush();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        bufferedChannel0.clear();
        long long4 = bufferedChannel0.size();
        bufferedChannel0.position = 10L;
        long long7 = bufferedChannel0.getUnpersistedBytes();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf4 = bufferedChannel0.writeBuffer;
        long long5 = bufferedChannel0.position;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.size();
        bufferedChannel0.flushAndForceWrite(true);
        bufferedChannel0.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel12.unpersistedBytes;
        long long14 = bufferedChannel12.position();
        long long15 = bufferedChannel12.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf16 = bufferedChannel12.writeBuffer;
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.position = 1;
        long long20 = bufferedChannel0.getUnpersistedBytes();
        io.netty.buffer.ByteBuf byteBuf21 = bufferedChannel0.writeBuffer;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = 0L;
        long long7 = bufferedChannel0.getFileChannelPosition();
        int int8 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long9 = bufferedChannel0.unpersistedBytesBound;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        java.util.concurrent.atomic.AtomicLong atomicLong17 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(atomicLong17);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long3 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.clear();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(atomicLong4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        bufferedChannel0.close();
        int int3 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long4 = bufferedChannel0.getFileChannelPosition();
        long long5 = bufferedChannel0.position();
        long long6 = bufferedChannel0.position();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong8 = bufferedChannel7.unpersistedBytes;
        long long9 = bufferedChannel7.position();
        long long11 = bufferedChannel7.forceWrite(false);
        bufferedChannel7.position = 0L;
        long long14 = bufferedChannel7.size();
        bufferedChannel7.flushAndForceWrite(true);
        long long17 = bufferedChannel7.size();
        long long18 = bufferedChannel7.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf19 = bufferedChannel7.writeBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedChannel0.read(byteBuf19, (long) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(atomicLong8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        int int11 = bufferedChannel0.writeCapacity;
        int int12 = bufferedChannel0.getNumOfBytesInWriteBuffer();
        long long14 = bufferedChannel0.forceWrite(true);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        long long9 = bufferedChannel0.getFileChannelPosition();
        bufferedChannel0.clear();
        long long11 = bufferedChannel0.getFileChannelPosition();
        long long12 = bufferedChannel0.getFileChannelPosition();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = bufferedChannel0.writeBufferStartPosition;
        bufferedChannel0.clear();
        bufferedChannel0.close();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = bufferedChannel0.unpersistedBytes;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNotNull(atomicLong16);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        long long5 = bufferedChannel0.position();
        long long7 = bufferedChannel0.forceWrite(true);
        bufferedChannel0.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = bufferedChannel9.unpersistedBytes;
        long long11 = bufferedChannel9.position();
        long long13 = bufferedChannel9.forceWrite(false);
        bufferedChannel9.position = (-1);
        bufferedChannel9.flushAndForceWrite(false);
        long long18 = bufferedChannel9.getFileChannelPosition();
        bufferedChannel9.clear();
        long long20 = bufferedChannel9.getFileChannelPosition();
        long long21 = bufferedChannel9.getFileChannelPosition();
        bufferedChannel9.position = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = bufferedChannel24.unpersistedBytes;
        long long26 = bufferedChannel24.position();
        long long27 = bufferedChannel24.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf28 = bufferedChannel24.writeBuffer;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong30 = bufferedChannel29.unpersistedBytes;
        long long31 = bufferedChannel29.position();
        long long33 = bufferedChannel29.forceWrite(false);
        bufferedChannel29.position = (-1);
        bufferedChannel29.flushAndForceWrite(false);
        long long38 = bufferedChannel29.getFileChannelPosition();
        int int39 = bufferedChannel29.writeCapacity;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel40.unpersistedBytes;
        long long42 = bufferedChannel40.position();
        long long44 = bufferedChannel40.forceWrite(false);
        bufferedChannel40.position = 0L;
        long long47 = bufferedChannel40.size();
        bufferedChannel40.flushAndForceWrite(true);
        long long50 = bufferedChannel40.size();
        long long51 = bufferedChannel40.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf52 = bufferedChannel40.writeBuffer;
        bufferedChannel29.write(byteBuf52);
        bufferedChannel24.write(byteBuf52);
        java.util.concurrent.atomic.AtomicLong atomicLong55 = bufferedChannel24.writeBufferStartPosition;
        bufferedChannel9.writeBufferStartPosition = atomicLong55;
        bufferedChannel0.writeBufferStartPosition = atomicLong55;
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(atomicLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(atomicLong25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(atomicLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(atomicLong55);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWriteIfRegularFlush(true);
        long long9 = bufferedChannel0.getFileChannelPosition();
        long long11 = bufferedChannel0.forceWrite(false);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        bufferedChannel0.position = '#';
        long long16 = bufferedChannel0.getFileChannelPosition();
        long long17 = bufferedChannel0.position();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = bufferedChannel0.unpersistedBytes;
        long long2 = bufferedChannel0.position();
        long long4 = bufferedChannel0.forceWrite(false);
        bufferedChannel0.position = (-1);
        bufferedChannel0.flushAndForceWrite(false);
        bufferedChannel0.flush();
        bufferedChannel0.clear();
        long long12 = bufferedChannel0.forceWrite(true);
        long long13 = bufferedChannel0.unpersistedBytesBound;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = bufferedChannel14.unpersistedBytes;
        long long16 = bufferedChannel14.position();
        long long18 = bufferedChannel14.forceWrite(false);
        bufferedChannel14.position = (-1);
        bufferedChannel14.flushAndForceWriteIfRegularFlush(true);
        long long23 = bufferedChannel14.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf24 = bufferedChannel14.writeBuffer;
        bufferedChannel0.write(byteBuf24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong27 = bufferedChannel26.unpersistedBytes;
        long long28 = bufferedChannel26.position();
        long long30 = bufferedChannel26.forceWrite(false);
        bufferedChannel26.position = (-1);
        bufferedChannel26.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong36 = bufferedChannel35.unpersistedBytes;
        long long37 = bufferedChannel35.position;
        long long38 = bufferedChannel35.unpersistedBytesBound;
        bufferedChannel35.clear();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong41 = bufferedChannel40.unpersistedBytes;
        long long42 = bufferedChannel40.position();
        long long44 = bufferedChannel40.forceWrite(false);
        bufferedChannel40.position = (-1);
        java.util.concurrent.atomic.AtomicLong atomicLong47 = bufferedChannel40.unpersistedBytes;
        bufferedChannel40.flushAndForceWrite(false);
        long long50 = bufferedChannel40.getFileChannelPosition();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong52 = bufferedChannel51.unpersistedBytes;
        long long53 = bufferedChannel51.position();
        long long55 = bufferedChannel51.forceWrite(false);
        bufferedChannel51.position = 0L;
        long long58 = bufferedChannel51.size();
        bufferedChannel51.flushAndForceWrite(true);
        bufferedChannel51.flushAndForceWrite(false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        java.util.concurrent.atomic.AtomicLong atomicLong64 = bufferedChannel63.unpersistedBytes;
        long long65 = bufferedChannel63.position();
        long long66 = bufferedChannel63.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf67 = bufferedChannel63.writeBuffer;
        bufferedChannel51.write(byteBuf67);
        bufferedChannel40.write(byteBuf67);
        int int72 = bufferedChannel35.read(byteBuf67, (long) 'a', (int) (byte) 0);
        int int75 = bufferedChannel26.read(byteBuf67, 100L, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = bufferedChannel0.read(byteBuf67, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(atomicLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(atomicLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(atomicLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(atomicLong36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(atomicLong41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(atomicLong47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(atomicLong52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(atomicLong64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(byteBuf67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }
}

