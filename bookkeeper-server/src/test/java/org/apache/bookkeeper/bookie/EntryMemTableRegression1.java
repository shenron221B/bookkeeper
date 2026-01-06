package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EntryMemTableRegression1 {

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
            System.out.format("%n%s%n", "EntryMemTableRegression1.test501");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong2 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = entryMemTable0.conf;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher4 = null;
        long long5 = entryMemTable0.flush(skipListFlusher4);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher6 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint7 = null;
        long long8 = entryMemTable0.flushSnapshot(skipListFlusher6, checkpoint7);
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(ofLong2);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test502");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats4 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource5 = entryMemTable0.checkpointSource;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock6 = entryMemTable0.lock;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats7 = entryMemTable0.memTableStats;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats4);
        org.junit.Assert.assertNotNull(checkpointSource5);
        org.junit.Assert.assertNotNull(reentrantReadWriteLock6);
        org.junit.Assert.assertNotNull(entryMemTableStats7);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test503");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = entryMemTable0.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = entryMemTable0.snapshot();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = entryMemTable0.size;
        boolean boolean5 = entryMemTable0.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList6 = entryMemTable0.kvmap;
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry8 = entrySkipList6.higherEntry(entryKey7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(checkpoint3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(entrySkipList6);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test504");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = entryMemTable0.conf;
        boolean boolean5 = entryMemTable0.isEmpty();
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats6 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats7 = entryMemTable0.memTableStats;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(entryMemTableStats6);
        org.junit.Assert.assertNotNull(entryMemTableStats7);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test505");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong2 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = entryMemTable0.conf;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher4 = null;
        long long5 = entryMemTable0.flush(skipListFlusher4);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher6 = null;
        long long7 = entryMemTable0.flush(skipListFlusher6);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = entryMemTable0.conf;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(ofLong2);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test506");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        java.util.PrimitiveIterator.OfLong ofLong5 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource6 = entryMemTable0.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue8 = entryMemTable0.getLastEntry((long) 10);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint10 = entryMemTable0.snapshot(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue13 = entryMemTable0.getEntry(1L, 1L);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = entryMemTable0.conf;
        long long15 = entryMemTable0.skipListSizeLimit;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(checkpointSource6);
        org.junit.Assert.assertNull(entryKeyValue8);
        org.junit.Assert.assertNull(checkpoint10);
        org.junit.Assert.assertNull(entryKeyValue13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10485760L + "'", long15 == 10485760L);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test507");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "1) test507(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable9.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource15 = entryMemTable9.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue16 = entrySkipList4.get((java.lang.Object) entryMemTable9);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher17 = null;
        long long18 = entryMemTable9.flush(skipListFlusher17);
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = entryMemTable9.kvmap;
        boolean boolean20 = entryMemTable9.isEmpty();
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(checkpointSource15);
        org.junit.Assert.assertNull(entryKeyValue16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(entrySkipList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test508");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        boolean boolean10 = entrySkipList5.containsKey((java.lang.Object) false);
        boolean boolean11 = entrySkipList5.isEmpty();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry13 = entrySkipList5.lowerEntry(entryKey12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test509");
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList0 = org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList.EMPTY_VALUE;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue2 = entrySkipList0.get((java.lang.Object) false);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        int int4 = entrySkipList0.compareTo(checkpoint3);
        org.junit.Assert.assertNotNull(entrySkipList0);
        org.junit.Assert.assertNull(entryKeyValue2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test510");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = entryMemTable0.conf;
        boolean boolean5 = entryMemTable0.isEmpty();
        entryMemTable0.dump();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint7 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList8 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint7);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue10 = entrySkipList8.get((java.lang.Object) 1L);
        boolean boolean11 = entrySkipList8.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable12.getListOfEntriesOfLedger(100L);
        boolean boolean15 = entrySkipList8.equals((java.lang.Object) entryMemTable12);
        entryMemTable12.close();
        long long17 = entryMemTable12.skipListSizeLimit;
        java.util.concurrent.atomic.AtomicLong atomicLong18 = entryMemTable12.size;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = entryMemTable12.kvmap;
// flaky "2) test510(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList19);
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(entryKeyValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryMemTable12);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10485760L + "'", long17 == 10485760L);
        org.junit.Assert.assertNotNull(atomicLong18);
        org.junit.Assert.assertNotNull(entrySkipList19);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test511");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats4 = entryMemTable0.memTableStats;
        boolean boolean5 = entryMemTable0.isSizeLimitReached();
        entryMemTable0.close();
        java.util.PrimitiveIterator.OfLong ofLong8 = entryMemTable0.getListOfEntriesOfLedger((long) (short) 10);
        java.util.concurrent.Semaphore semaphore9 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint10 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList11 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint10);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue13 = entrySkipList11.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint14 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList15 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint14);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue17 = entrySkipList15.get((java.lang.Object) 1L);
        entrySkipList11.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList15);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher20 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint21 = null;
        long long22 = entryMemTable19.flushSnapshot(skipListFlusher20, checkpoint21);
        java.util.PrimitiveIterator.OfLong ofLong24 = entryMemTable19.getListOfEntriesOfLedger(100L);
        boolean boolean25 = entrySkipList11.containsKey((java.lang.Object) ofLong24);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore27 = entryMemTable26.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats28 = entryMemTable26.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = entryMemTable26.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint30 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList31 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint30);
        boolean boolean33 = entrySkipList31.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet34 = entrySkipList31.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry35 = entrySkipList31.pollLastEntry();
        entryMemTable26.kvmap = entrySkipList31;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher38 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint39 = null;
        long long40 = entryMemTable37.flushSnapshot(skipListFlusher38, checkpoint39);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats41 = entryMemTable37.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource42 = entryMemTable37.checkpointSource;
        boolean boolean43 = entrySkipList11.remove((java.lang.Object) entryMemTable26, (java.lang.Object) entryMemTable37);
        entryMemTable0.kvmap = entrySkipList11;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats45 = entryMemTable0.memTableStats;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(semaphore9);
        org.junit.Assert.assertNull(entryKeyValue13);
        org.junit.Assert.assertNull(entryKeyValue17);
        org.junit.Assert.assertNotNull(entryMemTable19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(entryMemTable26);
        org.junit.Assert.assertNotNull(semaphore27);
        org.junit.Assert.assertNotNull(entryMemTableStats28);
        org.junit.Assert.assertNull(checkpoint29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(entryKeySet34);
        org.junit.Assert.assertNull(entryKeyEntry35);
        org.junit.Assert.assertNotNull(entryMemTable37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats41);
        org.junit.Assert.assertNotNull(checkpointSource42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(entryMemTableStats45);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test512");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable9.getListOfEntriesOfLedger(100L);
        boolean boolean15 = entrySkipList1.containsKey((java.lang.Object) ofLong14);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore17 = entryMemTable16.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats18 = entryMemTable16.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint19 = entryMemTable16.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint20 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList21 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint20);
        boolean boolean23 = entrySkipList21.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet24 = entrySkipList21.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry25 = entrySkipList21.pollLastEntry();
        entryMemTable16.kvmap = entrySkipList21;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher28 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        long long30 = entryMemTable27.flushSnapshot(skipListFlusher28, checkpoint29);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats31 = entryMemTable27.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource32 = entryMemTable27.checkpointSource;
        boolean boolean33 = entrySkipList1.remove((java.lang.Object) entryMemTable16, (java.lang.Object) entryMemTable27);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource34 = entryMemTable16.checkpointSource;
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(entryMemTable16);
        org.junit.Assert.assertNotNull(semaphore17);
        org.junit.Assert.assertNotNull(entryMemTableStats18);
        org.junit.Assert.assertNull(checkpoint19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(entryKeySet24);
        org.junit.Assert.assertNull(entryKeyEntry25);
        org.junit.Assert.assertNotNull(entryMemTable27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats31);
        org.junit.Assert.assertNotNull(checkpointSource32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(checkpointSource34);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test513");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = entryMemTable0.conf;
        boolean boolean5 = entryMemTable0.isEmpty();
        entryMemTable0.dump();
        boolean boolean7 = entryMemTable0.isEmpty();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint8 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList9 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint8);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue11 = entrySkipList9.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint12 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList13 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint12);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue15 = entrySkipList13.get((java.lang.Object) 1L);
        entrySkipList9.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList13);
        boolean boolean18 = entrySkipList13.containsKey((java.lang.Object) false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue20 = entrySkipList13.remove((java.lang.Object) bufferedChannel19);
        entryMemTable0.kvmap = entrySkipList13;
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap22 = entrySkipList13.clone();
        int int23 = entryKeyMap22.size();
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(entryKeyValue11);
        org.junit.Assert.assertNull(entryKeyValue15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNull(entryKeyValue20);
        org.junit.Assert.assertNotNull(entryKeyMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test514");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = entryMemTable0.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = entryMemTable0.kvmap;
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.EntryKey entryKey7 = entrySkipList5.lowerKey(entryKey6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(entrySkipList5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test515");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        boolean boolean3 = entrySkipList1.containsValue((java.lang.Object) (byte) -1);
        boolean boolean5 = entrySkipList1.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap6 = entrySkipList1.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry7 = entrySkipList1.lastEntry();
        boolean boolean9 = entrySkipList1.equals((java.lang.Object) 10L);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore11 = entryMemTable10.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = entryMemTable10.size;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue13 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue14 = entrySkipList1.getOrDefault((java.lang.Object) atomicLong12, entryKeyValue13);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore16 = entryMemTable15.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats17 = entryMemTable15.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        boolean boolean22 = entrySkipList19.isEmpty();
// flaky "3) test515(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable15.clearSnapshot(entrySkipList19);
        boolean boolean24 = entrySkipList1.containsKey((java.lang.Object) entrySkipList19);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint25 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList26 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint25);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entrySkipList26.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList30 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint29);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue32 = entrySkipList30.get((java.lang.Object) 1L);
        entrySkipList26.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList30);
        boolean boolean34 = entrySkipList26.isEmpty();
        entrySkipList19.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList26);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore37 = entryMemTable36.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong38 = entryMemTable36.size;
        entryMemTable36.close();
        boolean boolean40 = entryMemTable36.isSizeLimitReached();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint41 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList42 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint41);
        entryMemTable36.kvmap = entrySkipList42;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource44 = entryMemTable36.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue45 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue46 = entrySkipList19.getOrDefault((java.lang.Object) checkpointSource44, entryKeyValue45);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry47 = entrySkipList19.firstEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.EntryKey entryKey49 = entrySkipList19.lowerKey(entryKey48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKeyMap6);
        org.junit.Assert.assertNull(entryKeyEntry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(entryMemTable10);
        org.junit.Assert.assertNotNull(semaphore11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNull(entryKeyValue14);
        org.junit.Assert.assertNotNull(entryMemTable15);
        org.junit.Assert.assertNotNull(semaphore16);
        org.junit.Assert.assertNotNull(entryMemTableStats17);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNull(entryKeyValue32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(entryMemTable36);
        org.junit.Assert.assertNotNull(semaphore37);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(checkpointSource44);
        org.junit.Assert.assertNull(entryKeyValue46);
        org.junit.Assert.assertNull(entryKeyEntry47);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test516");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        boolean boolean10 = entrySkipList5.containsKey((java.lang.Object) false);
        boolean boolean11 = entrySkipList5.isEmpty();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint12 = entrySkipList5.cp;
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet13 = entrySkipList5.keySet();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue16 = entrySkipList5.putIfAbsent(entryKey14, entryKeyValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(checkpoint12);
        org.junit.Assert.assertNotNull(entryKeySet13);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test517");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        boolean boolean3 = entrySkipList1.containsValue((java.lang.Object) (byte) -1);
        boolean boolean5 = entrySkipList1.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap6 = entrySkipList1.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry7 = entrySkipList1.lastEntry();
        boolean boolean9 = entrySkipList1.equals((java.lang.Object) 10L);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore11 = entryMemTable10.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = entryMemTable10.size;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue13 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue14 = entrySkipList1.getOrDefault((java.lang.Object) atomicLong12, entryKeyValue13);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore16 = entryMemTable15.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats17 = entryMemTable15.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        boolean boolean22 = entrySkipList19.isEmpty();
// flaky "4) test517(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable15.clearSnapshot(entrySkipList19);
        boolean boolean24 = entrySkipList1.containsKey((java.lang.Object) entrySkipList19);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint25 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList26 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint25);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entrySkipList26.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList30 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint29);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue32 = entrySkipList30.get((java.lang.Object) 1L);
        entrySkipList26.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList30);
        boolean boolean34 = entrySkipList26.isEmpty();
        entrySkipList19.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList26);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore37 = entryMemTable36.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong38 = entryMemTable36.size;
        entryMemTable36.close();
        boolean boolean40 = entryMemTable36.isSizeLimitReached();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint41 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList42 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint41);
        entryMemTable36.kvmap = entrySkipList42;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource44 = entryMemTable36.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue45 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue46 = entrySkipList19.getOrDefault((java.lang.Object) checkpointSource44, entryKeyValue45);
        org.apache.bookkeeper.bookie.EntryKey entryKey47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ConcurrentNavigableMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap49 = entrySkipList19.headMap(entryKey47, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKeyMap6);
        org.junit.Assert.assertNull(entryKeyEntry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(entryMemTable10);
        org.junit.Assert.assertNotNull(semaphore11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNull(entryKeyValue14);
        org.junit.Assert.assertNotNull(entryMemTable15);
        org.junit.Assert.assertNotNull(semaphore16);
        org.junit.Assert.assertNotNull(entryMemTableStats17);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNull(entryKeyValue32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(entryMemTable36);
        org.junit.Assert.assertNotNull(semaphore37);
        org.junit.Assert.assertNotNull(atomicLong38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(checkpointSource44);
        org.junit.Assert.assertNull(entryKeyValue46);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test518");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        boolean boolean13 = entrySkipList10.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong16 = entryMemTable14.getListOfEntriesOfLedger(100L);
        boolean boolean17 = entrySkipList10.equals((java.lang.Object) entryMemTable14);
        entryMemTable14.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList5.remove((java.lang.Object) entryMemTable14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = entryMemTable14.conf;
        boolean boolean21 = entryMemTable14.isSizeLimitReached();
        long long22 = entryMemTable14.skipListSizeLimit;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList23 = entryMemTable14.kvmap;
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ConcurrentNavigableMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap25 = entrySkipList23.tailMap(entryKey24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10485760L + "'", long22 == 10485760L);
        org.junit.Assert.assertNotNull(entrySkipList23);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test519");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "5) test519(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable9.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource15 = entryMemTable9.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue16 = entrySkipList4.get((java.lang.Object) entryMemTable9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue18 = entryMemTable9.getLastEntry(0L);
        boolean boolean19 = entryMemTable9.isSizeLimitReached();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint20 = entryMemTable9.snapshot();
        java.util.PrimitiveIterator.OfLong ofLong22 = entryMemTable9.getListOfEntriesOfLedger((long) 1);
        java.util.PrimitiveIterator.OfLong ofLong24 = entryMemTable9.getListOfEntriesOfLedger((long) '4');
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint25 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList26 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint25);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entrySkipList26.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList30 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint29);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue32 = entrySkipList30.get((java.lang.Object) 1L);
        entrySkipList26.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList30);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint34 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList35 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint34);
        boolean boolean37 = entrySkipList35.containsValue((java.lang.Object) (byte) -1);
        boolean boolean39 = entrySkipList35.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap40 = entrySkipList35.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry41 = entrySkipList35.lastEntry();
        boolean boolean43 = entrySkipList35.equals((java.lang.Object) 10L);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore45 = entryMemTable44.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong46 = entryMemTable44.size;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue47 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue48 = entrySkipList35.getOrDefault((java.lang.Object) atomicLong46, entryKeyValue47);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore50 = entryMemTable49.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats51 = entryMemTable49.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint52 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList53 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint52);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue55 = entrySkipList53.get((java.lang.Object) 1L);
        boolean boolean56 = entrySkipList53.isEmpty();
// flaky "1) test519(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable49.clearSnapshot(entrySkipList53);
        boolean boolean58 = entrySkipList35.containsKey((java.lang.Object) entrySkipList53);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint59 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList60 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint59);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue62 = entrySkipList60.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint63 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList64 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint63);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue66 = entrySkipList64.get((java.lang.Object) 1L);
        entrySkipList60.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList64);
        boolean boolean68 = entrySkipList60.isEmpty();
        entrySkipList53.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList60);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry70 = entrySkipList53.pollLastEntry();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint71 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList72 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint71);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue74 = entrySkipList72.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint75 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList76 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint75);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue78 = entrySkipList76.get((java.lang.Object) 1L);
        entrySkipList72.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList76);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue81 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue82 = entrySkipList72.getOrDefault((java.lang.Object) (short) 1, entryKeyValue81);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry83 = entrySkipList72.lastEntry();
        java.util.Comparator<? super org.apache.bookkeeper.bookie.EntryKey> wildcardComparator84 = entrySkipList72.comparator();
        boolean boolean85 = entrySkipList72.isEmpty();
        boolean boolean86 = entrySkipList30.remove((java.lang.Object) entrySkipList53, (java.lang.Object) entrySkipList72);
        java.util.Collection<org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyValueCollection87 = entrySkipList30.values();
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap88 = entrySkipList30.clone();
// flaky "1) test519(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable9.clearSnapshot(entrySkipList30);
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(checkpointSource15);
        org.junit.Assert.assertNull(entryKeyValue16);
        org.junit.Assert.assertNull(entryKeyValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(checkpoint20);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNull(entryKeyValue32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(entryKeyMap40);
        org.junit.Assert.assertNull(entryKeyEntry41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(entryMemTable44);
        org.junit.Assert.assertNotNull(semaphore45);
        org.junit.Assert.assertNotNull(atomicLong46);
        org.junit.Assert.assertNull(entryKeyValue48);
        org.junit.Assert.assertNotNull(entryMemTable49);
        org.junit.Assert.assertNotNull(semaphore50);
        org.junit.Assert.assertNotNull(entryMemTableStats51);
        org.junit.Assert.assertNull(entryKeyValue55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(entryKeyValue62);
        org.junit.Assert.assertNull(entryKeyValue66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(entryKeyEntry70);
        org.junit.Assert.assertNull(entryKeyValue74);
        org.junit.Assert.assertNull(entryKeyValue78);
        org.junit.Assert.assertNull(entryKeyValue82);
        org.junit.Assert.assertNull(entryKeyEntry83);
        org.junit.Assert.assertNotNull(wildcardComparator84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(entryKeyValueCollection87);
        org.junit.Assert.assertNotNull(entryKeyMap88);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test520");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "6) test520(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = entryMemTable9.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList14 = entryMemTable9.kvmap;
        entryMemTable0.kvmap = entrySkipList14;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena16 = entryMemTable0.allocator;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena17 = entryMemTable0.allocator;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry22 = entrySkipList19.lastEntry();
        entryMemTable0.snapshot = entrySkipList19;
        java.util.Collection<org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyValueCollection24 = entrySkipList19.values();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore26 = entryMemTable25.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats27 = entryMemTable25.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint28 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList29 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint28);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue31 = entrySkipList29.get((java.lang.Object) 1L);
        boolean boolean32 = entrySkipList29.isEmpty();
// flaky "2) test520(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable25.clearSnapshot(entrySkipList29);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher35 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint36 = null;
        long long37 = entryMemTable34.flushSnapshot(skipListFlusher35, checkpoint36);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration38 = entryMemTable34.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList39 = entryMemTable34.kvmap;
        entryMemTable25.kvmap = entrySkipList39;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena41 = entryMemTable25.allocator;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena42 = entryMemTable25.allocator;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint43 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList44 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint43);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue46 = entrySkipList44.get((java.lang.Object) 1L);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry47 = entrySkipList44.lastEntry();
        entryMemTable25.snapshot = entrySkipList44;
        boolean boolean49 = entrySkipList19.equals((java.lang.Object) entryMemTable25);
        java.util.PrimitiveIterator.OfLong ofLong51 = entryMemTable25.getListOfEntriesOfLedger((long) (byte) 1);
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNotNull(entrySkipList14);
        org.junit.Assert.assertNotNull(skipListArena16);
        org.junit.Assert.assertNotNull(skipListArena17);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertNull(entryKeyEntry22);
        org.junit.Assert.assertNotNull(entryKeyValueCollection24);
        org.junit.Assert.assertNotNull(entryMemTable25);
        org.junit.Assert.assertNotNull(semaphore26);
        org.junit.Assert.assertNotNull(entryMemTableStats27);
        org.junit.Assert.assertNull(entryKeyValue31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(entryMemTable34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration38);
        org.junit.Assert.assertNotNull(entrySkipList39);
        org.junit.Assert.assertNotNull(skipListArena41);
        org.junit.Assert.assertNotNull(skipListArena42);
        org.junit.Assert.assertNull(entryKeyValue46);
        org.junit.Assert.assertNull(entryKeyEntry47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ofLong51);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test521");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable9.getListOfEntriesOfLedger(100L);
        boolean boolean15 = entrySkipList1.containsKey((java.lang.Object) ofLong14);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore17 = entryMemTable16.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats18 = entryMemTable16.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint19 = entryMemTable16.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint20 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList21 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint20);
        boolean boolean23 = entrySkipList21.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet24 = entrySkipList21.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry25 = entrySkipList21.pollLastEntry();
        entryMemTable16.kvmap = entrySkipList21;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher28 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        long long30 = entryMemTable27.flushSnapshot(skipListFlusher28, checkpoint29);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats31 = entryMemTable27.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource32 = entryMemTable27.checkpointSource;
        boolean boolean33 = entrySkipList1.remove((java.lang.Object) entryMemTable16, (java.lang.Object) entryMemTable27);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint34 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList35 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint34);
        boolean boolean37 = entrySkipList35.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet38 = entrySkipList35.navigableKeySet();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong41 = entryMemTable39.getListOfEntriesOfLedger(100L);
        boolean boolean42 = entrySkipList35.equals((java.lang.Object) entryMemTable39);
        entryMemTable27.snapshot = entrySkipList35;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint44 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList45 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint44);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue47 = entrySkipList45.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint48 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList49 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint48);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue51 = entrySkipList49.get((java.lang.Object) 1L);
        entrySkipList45.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList49);
        boolean boolean54 = entrySkipList49.containsKey((java.lang.Object) false);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet55 = entrySkipList49.navigableKeySet();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint56 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList57 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint56);
        boolean boolean59 = entrySkipList57.containsValue((java.lang.Object) (byte) -1);
        boolean boolean61 = entrySkipList57.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap62 = entrySkipList57.clone();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue63 = entrySkipList49.get((java.lang.Object) entryKeyMap62);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry64 = entrySkipList49.lastEntry();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue65 = entrySkipList35.get((java.lang.Object) entrySkipList49);
        java.util.Set<java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>> entryKeyEntrySet66 = entrySkipList49.entrySet();
        org.apache.bookkeeper.bookie.EntryKey entryKey67 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue68 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue69 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = entrySkipList49.replace(entryKey67, entryKeyValue68, entryKeyValue69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(entryMemTable16);
        org.junit.Assert.assertNotNull(semaphore17);
        org.junit.Assert.assertNotNull(entryMemTableStats18);
        org.junit.Assert.assertNull(checkpoint19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(entryKeySet24);
        org.junit.Assert.assertNull(entryKeyEntry25);
        org.junit.Assert.assertNotNull(entryMemTable27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats31);
        org.junit.Assert.assertNotNull(checkpointSource32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(entryKeySet38);
        org.junit.Assert.assertNotNull(entryMemTable39);
        org.junit.Assert.assertNotNull(ofLong41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(entryKeyValue47);
        org.junit.Assert.assertNull(entryKeyValue51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(entryKeySet55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(entryKeyMap62);
        org.junit.Assert.assertNull(entryKeyValue63);
        org.junit.Assert.assertNull(entryKeyEntry64);
        org.junit.Assert.assertNull(entryKeyValue65);
        org.junit.Assert.assertNotNull(entryKeyEntrySet66);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test522");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet9 = entrySkipList1.keySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry10 = entrySkipList1.pollFirstEntry();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue13 = entrySkipList1.getOrDefault((java.lang.Object) (short) 0, entryKeyValue12);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher15 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint16 = null;
        long long17 = entryMemTable14.flushSnapshot(skipListFlusher15, checkpoint16);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats18 = entryMemTable14.memTableStats;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = entryMemTable14.snapshot;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1.0d);
        java.util.Comparator<? super org.apache.bookkeeper.bookie.EntryKey> wildcardComparator22 = entrySkipList19.comparator();
        boolean boolean23 = entrySkipList1.containsKey((java.lang.Object) entrySkipList19);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNotNull(entryKeySet9);
        org.junit.Assert.assertNull(entryKeyEntry10);
        org.junit.Assert.assertNull(entryKeyValue13);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats18);
        org.junit.Assert.assertNotNull(entrySkipList19);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertNotNull(wildcardComparator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test523");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats4 = entryMemTable0.memTableStats;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock5 = entryMemTable0.lock;
        entryMemTable0.dump();
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats4);
        org.junit.Assert.assertNotNull(reentrantReadWriteLock5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test524");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList2 = entryMemTable0.snapshot;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entrySkipList2);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test525");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        boolean boolean13 = entrySkipList10.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong16 = entryMemTable14.getListOfEntriesOfLedger(100L);
        boolean boolean17 = entrySkipList10.equals((java.lang.Object) entryMemTable14);
        entryMemTable14.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList5.remove((java.lang.Object) entryMemTable14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = entryMemTable14.conf;
        java.util.PrimitiveIterator.OfLong ofLong22 = entryMemTable14.getListOfEntriesOfLedger((long) 1);
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList23 = entryMemTable14.snapshot;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher25 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint26 = null;
        long long27 = entryMemTable24.flushSnapshot(skipListFlusher25, checkpoint26);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = entryMemTable24.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList29 = entryMemTable24.kvmap;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint30 = null;
        int int31 = entrySkipList29.compareTo(checkpoint30);
        entryMemTable14.kvmap = entrySkipList29;
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry33 = entrySkipList29.pollFirstEntry();
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertNotNull(entrySkipList23);
        org.junit.Assert.assertNotNull(entryMemTable24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration28);
        org.junit.Assert.assertNotNull(entrySkipList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(entryKeyEntry33);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test526");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        boolean boolean13 = entrySkipList10.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong16 = entryMemTable14.getListOfEntriesOfLedger(100L);
        boolean boolean17 = entrySkipList10.equals((java.lang.Object) entryMemTable14);
        entryMemTable14.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList5.remove((java.lang.Object) entryMemTable14);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher21 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint22 = null;
        long long23 = entryMemTable20.flushSnapshot(skipListFlusher21, checkpoint22);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats24 = entryMemTable20.memTableStats;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList25 = entryMemTable20.snapshot;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore27 = entryMemTable26.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats28 = entryMemTable26.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList30 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint29);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue32 = entrySkipList30.get((java.lang.Object) 1L);
        boolean boolean33 = entrySkipList30.isEmpty();
// flaky "7) test526(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable26.clearSnapshot(entrySkipList30);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher36 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint37 = null;
        long long38 = entryMemTable35.flushSnapshot(skipListFlusher36, checkpoint37);
        java.util.PrimitiveIterator.OfLong ofLong40 = entryMemTable35.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource41 = entryMemTable35.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue42 = entrySkipList30.get((java.lang.Object) entryMemTable35);
        entryMemTable35.close();
        java.util.concurrent.Semaphore semaphore44 = entryMemTable35.skipListSemaphore;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue45 = entrySkipList25.remove((java.lang.Object) entryMemTable35);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue46 = entrySkipList5.get((java.lang.Object) entryMemTable35);
        boolean boolean47 = entryMemTable35.isEmpty();
        boolean boolean48 = entryMemTable35.isEmpty();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher49 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint50 = null;
        long long51 = entryMemTable35.flush(skipListFlusher49, checkpoint50);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertNotNull(entryMemTable20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats24);
        org.junit.Assert.assertNotNull(entrySkipList25);
        org.junit.Assert.assertNotNull(entryMemTable26);
        org.junit.Assert.assertNotNull(semaphore27);
        org.junit.Assert.assertNotNull(entryMemTableStats28);
        org.junit.Assert.assertNull(entryKeyValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(entryMemTable35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertNotNull(checkpointSource41);
        org.junit.Assert.assertNull(entryKeyValue42);
        org.junit.Assert.assertNotNull(semaphore44);
        org.junit.Assert.assertNull(entryKeyValue45);
        org.junit.Assert.assertNull(entryKeyValue46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test527");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        boolean boolean3 = entrySkipList1.containsValue((java.lang.Object) (byte) -1);
        boolean boolean5 = entrySkipList1.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap6 = entrySkipList1.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry7 = entrySkipList1.lastEntry();
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet8 = entrySkipList1.keySet();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint13 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList14 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint13);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue16 = entrySkipList14.get((java.lang.Object) 1L);
        entrySkipList10.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList14);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        boolean boolean22 = entrySkipList19.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong25 = entryMemTable23.getListOfEntriesOfLedger(100L);
        boolean boolean26 = entrySkipList19.equals((java.lang.Object) entryMemTable23);
        entryMemTable23.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entrySkipList14.remove((java.lang.Object) entryMemTable23);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher30 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint31 = null;
        long long32 = entryMemTable29.flushSnapshot(skipListFlusher30, checkpoint31);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats33 = entryMemTable29.memTableStats;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList34 = entryMemTable29.snapshot;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore36 = entryMemTable35.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats37 = entryMemTable35.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint38 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList39 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint38);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue41 = entrySkipList39.get((java.lang.Object) 1L);
        boolean boolean42 = entrySkipList39.isEmpty();
// flaky "8) test527(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable35.clearSnapshot(entrySkipList39);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher45 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint46 = null;
        long long47 = entryMemTable44.flushSnapshot(skipListFlusher45, checkpoint46);
        java.util.PrimitiveIterator.OfLong ofLong49 = entryMemTable44.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource50 = entryMemTable44.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue51 = entrySkipList39.get((java.lang.Object) entryMemTable44);
        entryMemTable44.close();
        java.util.concurrent.Semaphore semaphore53 = entryMemTable44.skipListSemaphore;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue54 = entrySkipList34.remove((java.lang.Object) entryMemTable44);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue55 = entrySkipList14.get((java.lang.Object) entryMemTable44);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore57 = entryMemTable56.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong58 = entryMemTable56.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint59 = entryMemTable56.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint60 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList61 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint60);
        entryMemTable56.snapshot = entrySkipList61;
        boolean boolean63 = entrySkipList1.remove((java.lang.Object) entryMemTable44, (java.lang.Object) entrySkipList61);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap64 = entrySkipList1.clone();
        java.util.Comparator<? super org.apache.bookkeeper.bookie.EntryKey> wildcardComparator65 = entryKeyMap64.comparator();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry66 = entryKeyMap64.firstEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKeyMap6);
        org.junit.Assert.assertNull(entryKeyEntry7);
        org.junit.Assert.assertNotNull(entryKeySet8);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertNull(entryKeyValue16);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(entryMemTable23);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNotNull(entryMemTable29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats33);
        org.junit.Assert.assertNotNull(entrySkipList34);
        org.junit.Assert.assertNotNull(entryMemTable35);
        org.junit.Assert.assertNotNull(semaphore36);
        org.junit.Assert.assertNotNull(entryMemTableStats37);
        org.junit.Assert.assertNull(entryKeyValue41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(entryMemTable44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(ofLong49);
        org.junit.Assert.assertNotNull(checkpointSource50);
        org.junit.Assert.assertNull(entryKeyValue51);
        org.junit.Assert.assertNotNull(semaphore53);
        org.junit.Assert.assertNull(entryKeyValue54);
        org.junit.Assert.assertNull(entryKeyValue55);
        org.junit.Assert.assertNotNull(entryMemTable56);
        org.junit.Assert.assertNotNull(semaphore57);
        org.junit.Assert.assertNotNull(atomicLong58);
        org.junit.Assert.assertNull(checkpoint59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(entryKeyMap64);
        org.junit.Assert.assertNotNull(wildcardComparator65);
        org.junit.Assert.assertNull(entryKeyEntry66);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test528");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        boolean boolean10 = entrySkipList5.containsKey((java.lang.Object) false);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet11 = entrySkipList5.navigableKeySet();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint12 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList13 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint12);
        boolean boolean15 = entrySkipList13.containsValue((java.lang.Object) (byte) -1);
        boolean boolean17 = entrySkipList13.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap18 = entrySkipList13.clone();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList5.get((java.lang.Object) entryKeyMap18);
        java.util.Collection<org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyValueCollection20 = entryKeyMap18.values();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.EntryKey entryKey21 = entryKeyMap18.firstKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(entryKeySet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(entryKeyMap18);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertNotNull(entryKeyValueCollection20);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test529");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap4 = entrySkipList1.clone();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = null;
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ConcurrentNavigableMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap9 = entrySkipList1.subMap(entryKey5, false, entryKey7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNotNull(entryKeyMap4);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test530");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = entryMemTable0.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        boolean boolean7 = entrySkipList5.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet8 = entrySkipList5.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry9 = entrySkipList5.pollLastEntry();
        entryMemTable0.kvmap = entrySkipList5;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore12 = entryMemTable11.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong13 = entryMemTable11.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint14 = entryMemTable11.snapshot();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = entryMemTable11.conf;
        java.util.PrimitiveIterator.OfLong ofLong17 = entryMemTable11.getListOfEntriesOfLedger((long) 1);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue20 = entryMemTable11.getEntry((long) (byte) 10, (long) (-1));
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore22 = entryMemTable21.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong23 = entryMemTable21.size;
        entryMemTable21.close();
        boolean boolean25 = entryMemTable21.isSizeLimitReached();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entryMemTable21.getEntry(0L, (long) 100);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList30 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint29);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue32 = entrySkipList30.get((java.lang.Object) 1L);
        boolean boolean33 = entrySkipList30.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong36 = entryMemTable34.getListOfEntriesOfLedger(100L);
        boolean boolean37 = entrySkipList30.equals((java.lang.Object) entryMemTable34);
        boolean boolean38 = entryMemTable34.isSizeLimitReached();
        org.apache.bookkeeper.bookie.SkipListArena skipListArena39 = entryMemTable34.allocator;
        entryMemTable21.allocator = skipListArena39;
        entryMemTable11.allocator = skipListArena39;
        entryMemTable0.allocator = skipListArena39;
        entryMemTable0.close();
        boolean boolean44 = entryMemTable0.isEmpty();
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(checkpoint3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(entryKeySet8);
        org.junit.Assert.assertNull(entryKeyEntry9);
        org.junit.Assert.assertNotNull(entryMemTable11);
        org.junit.Assert.assertNotNull(semaphore12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNull(checkpoint14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertNull(entryKeyValue20);
        org.junit.Assert.assertNotNull(entryMemTable21);
        org.junit.Assert.assertNotNull(semaphore22);
        org.junit.Assert.assertNotNull(atomicLong23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNull(entryKeyValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(entryMemTable34);
        org.junit.Assert.assertNotNull(ofLong36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(skipListArena39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test531");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        boolean boolean4 = entrySkipList1.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong7 = entryMemTable5.getListOfEntriesOfLedger(100L);
        boolean boolean8 = entrySkipList1.equals((java.lang.Object) entryMemTable5);
        java.lang.String str9 = entrySkipList1.toString();
        java.util.concurrent.ConcurrentNavigableMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap10 = entrySkipList1.descendingMap();
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(entryMemTable5);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNotNull(entryKeyMap10);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test532");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "9) test532(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable9.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource15 = entryMemTable9.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue16 = entrySkipList4.get((java.lang.Object) entryMemTable9);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher17 = null;
        long long18 = entryMemTable9.flush(skipListFlusher17);
        java.util.concurrent.atomic.AtomicLong atomicLong19 = entryMemTable9.size;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(checkpointSource15);
        org.junit.Assert.assertNull(entryKeyValue16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(atomicLong19);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test533");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        boolean boolean3 = entrySkipList1.containsValue((java.lang.Object) (byte) -1);
        boolean boolean5 = entrySkipList1.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap6 = entrySkipList1.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry7 = entrySkipList1.lastEntry();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint8 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList9 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint8);
        boolean boolean11 = entrySkipList9.containsValue((java.lang.Object) (byte) -1);
        boolean boolean13 = entrySkipList9.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap14 = entrySkipList9.clone();
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList9);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint16 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList17 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint16);
        boolean boolean19 = entrySkipList17.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet20 = entrySkipList17.navigableKeySet();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong23 = entryMemTable21.getListOfEntriesOfLedger(100L);
        boolean boolean24 = entrySkipList17.equals((java.lang.Object) entryMemTable21);
        boolean boolean25 = entrySkipList17.isEmpty();
        boolean boolean26 = entrySkipList9.containsValue((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKeyMap6);
        org.junit.Assert.assertNull(entryKeyEntry7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(entryKeyMap14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(entryKeySet20);
        org.junit.Assert.assertNotNull(entryMemTable21);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test534");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        boolean boolean4 = entrySkipList1.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong7 = entryMemTable5.getListOfEntriesOfLedger(100L);
        boolean boolean8 = entrySkipList1.equals((java.lang.Object) entryMemTable5);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats9 = entryMemTable5.memTableStats;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable5.flushSnapshot(skipListFlusher10, checkpoint11);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue14 = entryMemTable5.getLastEntry((long) 10);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(entryMemTable5);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryMemTableStats9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(entryKeyValue14);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test535");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = entryMemTable0.size;
        entryMemTable0.close();
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource4 = entryMemTable0.checkpointSource;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint5 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList6 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint5);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet7 = entrySkipList6.keySet();
// flaky "10) test535(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList6);
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock9 = entryMemTable0.lock;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(checkpointSource4);
        org.junit.Assert.assertNotNull(entryKeySet7);
        org.junit.Assert.assertNotNull(reentrantReadWriteLock9);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test536");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats4 = entryMemTable0.memTableStats;
        boolean boolean5 = entryMemTable0.isSizeLimitReached();
        entryMemTable0.dump();
        entryMemTable0.close();
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test537");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = entryMemTable0.size;
        entryMemTable0.close();
        org.apache.bookkeeper.bookie.SkipListArena skipListArena4 = entryMemTable0.allocator;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNotNull(skipListArena4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test538");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        boolean boolean3 = entrySkipList1.containsValue((java.lang.Object) (byte) -1);
        boolean boolean5 = entrySkipList1.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap6 = entrySkipList1.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry7 = entrySkipList1.lastEntry();
        boolean boolean9 = entrySkipList1.equals((java.lang.Object) 10L);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore11 = entryMemTable10.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = entryMemTable10.size;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue13 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue14 = entrySkipList1.getOrDefault((java.lang.Object) atomicLong12, entryKeyValue13);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore16 = entryMemTable15.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats17 = entryMemTable15.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        boolean boolean22 = entrySkipList19.isEmpty();
// flaky "11) test538(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable15.clearSnapshot(entrySkipList19);
        boolean boolean24 = entrySkipList1.containsKey((java.lang.Object) entrySkipList19);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint25 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList26 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint25);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entrySkipList26.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint29 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList30 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint29);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue32 = entrySkipList30.get((java.lang.Object) 1L);
        entrySkipList26.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList30);
        boolean boolean34 = entrySkipList26.isEmpty();
        entrySkipList19.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList26);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore37 = entryMemTable36.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats38 = entryMemTable36.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint39 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList40 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint39);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue42 = entrySkipList40.get((java.lang.Object) 1L);
        boolean boolean43 = entrySkipList40.isEmpty();
// flaky "3) test538(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable36.clearSnapshot(entrySkipList40);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher46 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint47 = null;
        long long48 = entryMemTable45.flushSnapshot(skipListFlusher46, checkpoint47);
        java.util.PrimitiveIterator.OfLong ofLong50 = entryMemTable45.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource51 = entryMemTable45.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue52 = entrySkipList40.get((java.lang.Object) entryMemTable45);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet53 = entrySkipList40.navigableKeySet();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue54 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue55 = entrySkipList26.getOrDefault((java.lang.Object) entrySkipList40, entryKeyValue54);
        org.apache.bookkeeper.bookie.EntryKey entryKey56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry57 = entrySkipList26.floorEntry(entryKey56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKeyMap6);
        org.junit.Assert.assertNull(entryKeyEntry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(entryMemTable10);
        org.junit.Assert.assertNotNull(semaphore11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNull(entryKeyValue14);
        org.junit.Assert.assertNotNull(entryMemTable15);
        org.junit.Assert.assertNotNull(semaphore16);
        org.junit.Assert.assertNotNull(entryMemTableStats17);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNull(entryKeyValue32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(entryMemTable36);
        org.junit.Assert.assertNotNull(semaphore37);
        org.junit.Assert.assertNotNull(entryMemTableStats38);
        org.junit.Assert.assertNull(entryKeyValue42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(entryMemTable45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(ofLong50);
        org.junit.Assert.assertNotNull(checkpointSource51);
        org.junit.Assert.assertNull(entryKeyValue52);
        org.junit.Assert.assertNotNull(entryKeySet53);
        org.junit.Assert.assertNull(entryKeyValue55);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test539");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet9 = entrySkipList1.keySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry10 = entrySkipList1.pollFirstEntry();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore12 = entryMemTable11.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong13 = entryMemTable11.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint14 = entryMemTable11.snapshot();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher15 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint16 = null;
        long long17 = entryMemTable11.flush(skipListFlusher15, checkpoint16);
        boolean boolean18 = entrySkipList1.containsKey((java.lang.Object) entryMemTable11);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNotNull(entryKeySet9);
        org.junit.Assert.assertNull(entryKeyEntry10);
        org.junit.Assert.assertNotNull(entryMemTable11);
        org.junit.Assert.assertNotNull(semaphore12);
        org.junit.Assert.assertNotNull(atomicLong13);
        org.junit.Assert.assertNull(checkpoint14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test540");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        boolean boolean3 = entrySkipList1.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet4 = entrySkipList1.navigableKeySet();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint5 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList6 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint5);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue8 = entrySkipList6.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        entrySkipList6.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList10);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher15 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint16 = null;
        long long17 = entryMemTable14.flushSnapshot(skipListFlusher15, checkpoint16);
        java.util.PrimitiveIterator.OfLong ofLong19 = entryMemTable14.getListOfEntriesOfLedger(100L);
        boolean boolean20 = entrySkipList6.containsKey((java.lang.Object) ofLong19);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore22 = entryMemTable21.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats23 = entryMemTable21.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint24 = entryMemTable21.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint25 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList26 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint25);
        boolean boolean28 = entrySkipList26.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet29 = entrySkipList26.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry30 = entrySkipList26.pollLastEntry();
        entryMemTable21.kvmap = entrySkipList26;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher33 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint34 = null;
        long long35 = entryMemTable32.flushSnapshot(skipListFlusher33, checkpoint34);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats36 = entryMemTable32.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource37 = entryMemTable32.checkpointSource;
        boolean boolean38 = entrySkipList6.remove((java.lang.Object) entryMemTable21, (java.lang.Object) entryMemTable32);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore41 = entryMemTable40.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong42 = entryMemTable40.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint43 = entryMemTable40.snapshot();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher44 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint45 = null;
        long long46 = entryMemTable40.flush(skipListFlusher44, checkpoint45);
        boolean boolean47 = entrySkipList6.remove((java.lang.Object) 100, (java.lang.Object) checkpoint45);
        int int48 = entrySkipList6.size();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore50 = entryMemTable49.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats51 = entryMemTable49.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint52 = entryMemTable49.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint53 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList54 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint53);
        boolean boolean56 = entrySkipList54.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet57 = entrySkipList54.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry58 = entrySkipList54.pollLastEntry();
        entryMemTable49.kvmap = entrySkipList54;
        boolean boolean60 = entrySkipList1.remove((java.lang.Object) entrySkipList6, (java.lang.Object) entryMemTable49);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint61 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList62 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint61);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue64 = entrySkipList62.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint65 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList66 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint65);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue68 = entrySkipList66.get((java.lang.Object) 1L);
        entrySkipList62.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList66);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint70 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList71 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint70);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue73 = entrySkipList71.get((java.lang.Object) 1L);
        boolean boolean74 = entrySkipList71.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable75 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong77 = entryMemTable75.getListOfEntriesOfLedger(100L);
        boolean boolean78 = entrySkipList71.equals((java.lang.Object) entryMemTable75);
        entryMemTable75.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue80 = entrySkipList66.remove((java.lang.Object) entryMemTable75);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration81 = entryMemTable75.conf;
        java.util.PrimitiveIterator.OfLong ofLong83 = entryMemTable75.getListOfEntriesOfLedger((long) 1);
        java.util.concurrent.atomic.AtomicLong atomicLong84 = entryMemTable75.size;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList85 = entryMemTable75.snapshot;
        entrySkipList85.clear();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue87 = entrySkipList1.remove((java.lang.Object) entrySkipList85);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(entryKeySet4);
        org.junit.Assert.assertNull(entryKeyValue8);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(entryMemTable21);
        org.junit.Assert.assertNotNull(semaphore22);
        org.junit.Assert.assertNotNull(entryMemTableStats23);
        org.junit.Assert.assertNull(checkpoint24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(entryKeySet29);
        org.junit.Assert.assertNull(entryKeyEntry30);
        org.junit.Assert.assertNotNull(entryMemTable32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats36);
        org.junit.Assert.assertNotNull(checkpointSource37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(entryMemTable40);
        org.junit.Assert.assertNotNull(semaphore41);
        org.junit.Assert.assertNotNull(atomicLong42);
        org.junit.Assert.assertNull(checkpoint43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(entryMemTable49);
        org.junit.Assert.assertNotNull(semaphore50);
        org.junit.Assert.assertNotNull(entryMemTableStats51);
        org.junit.Assert.assertNull(checkpoint52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(entryKeySet57);
        org.junit.Assert.assertNull(entryKeyEntry58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(entryKeyValue64);
        org.junit.Assert.assertNull(entryKeyValue68);
        org.junit.Assert.assertNull(entryKeyValue73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(entryMemTable75);
        org.junit.Assert.assertNotNull(ofLong77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(entryKeyValue80);
        org.junit.Assert.assertNotNull(serverConfiguration81);
        org.junit.Assert.assertNotNull(ofLong83);
        org.junit.Assert.assertNotNull(atomicLong84);
        org.junit.Assert.assertNotNull(entrySkipList85);
        org.junit.Assert.assertNull(entryKeyValue87);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test541");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "12) test541(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        java.util.Comparator<? super org.apache.bookkeeper.bookie.EntryKey> wildcardComparator9 = entrySkipList4.comparator();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry10 = entrySkipList4.pollLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ConcurrentNavigableMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap12 = entrySkipList4.tailMap(entryKey11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardComparator9);
        org.junit.Assert.assertNull(entryKeyEntry10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test542");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "13) test542(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        java.util.PrimitiveIterator.OfLong ofLong14 = entryMemTable9.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource15 = entryMemTable9.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue16 = entrySkipList4.get((java.lang.Object) entryMemTable9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue18 = entryMemTable9.getLastEntry(0L);
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock19 = entryMemTable9.lock;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint20 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList21 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint20);
        boolean boolean23 = entrySkipList21.containsValue((java.lang.Object) (byte) -1);
        boolean boolean25 = entrySkipList21.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap26 = entrySkipList21.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry27 = entrySkipList21.lastEntry();
        boolean boolean29 = entrySkipList21.equals((java.lang.Object) 10L);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore31 = entryMemTable30.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong32 = entryMemTable30.size;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue33 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue34 = entrySkipList21.getOrDefault((java.lang.Object) atomicLong32, entryKeyValue33);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore36 = entryMemTable35.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats37 = entryMemTable35.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint38 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList39 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint38);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue41 = entrySkipList39.get((java.lang.Object) 1L);
        boolean boolean42 = entrySkipList39.isEmpty();
// flaky "4) test542(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable35.clearSnapshot(entrySkipList39);
        boolean boolean44 = entrySkipList21.containsKey((java.lang.Object) entrySkipList39);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint45 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList46 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint45);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue48 = entrySkipList46.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint49 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList50 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint49);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue52 = entrySkipList50.get((java.lang.Object) 1L);
        entrySkipList46.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList50);
        boolean boolean54 = entrySkipList46.isEmpty();
        entrySkipList39.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList46);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore57 = entryMemTable56.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong58 = entryMemTable56.size;
        entryMemTable56.close();
        boolean boolean60 = entryMemTable56.isSizeLimitReached();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint61 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList62 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint61);
        entryMemTable56.kvmap = entrySkipList62;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource64 = entryMemTable56.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue65 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue66 = entrySkipList39.getOrDefault((java.lang.Object) checkpointSource64, entryKeyValue65);
        entryMemTable9.snapshot = entrySkipList39;
        java.util.Comparator<? super org.apache.bookkeeper.bookie.EntryKey> wildcardComparator68 = entrySkipList39.comparator();
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(checkpointSource15);
        org.junit.Assert.assertNull(entryKeyValue16);
        org.junit.Assert.assertNull(entryKeyValue18);
        org.junit.Assert.assertNotNull(reentrantReadWriteLock19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(entryKeyMap26);
        org.junit.Assert.assertNull(entryKeyEntry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(entryMemTable30);
        org.junit.Assert.assertNotNull(semaphore31);
        org.junit.Assert.assertNotNull(atomicLong32);
        org.junit.Assert.assertNull(entryKeyValue34);
        org.junit.Assert.assertNotNull(entryMemTable35);
        org.junit.Assert.assertNotNull(semaphore36);
        org.junit.Assert.assertNotNull(entryMemTableStats37);
        org.junit.Assert.assertNull(entryKeyValue41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(entryKeyValue48);
        org.junit.Assert.assertNull(entryKeyValue52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(entryMemTable56);
        org.junit.Assert.assertNotNull(semaphore57);
        org.junit.Assert.assertNotNull(atomicLong58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(checkpointSource64);
        org.junit.Assert.assertNull(entryKeyValue66);
        org.junit.Assert.assertNotNull(wildcardComparator68);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test543");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong2 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = entryMemTable0.conf;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher4 = null;
        long long5 = entryMemTable0.flush(skipListFlusher4);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher6 = null;
        long long7 = entryMemTable0.flush(skipListFlusher6);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue10 = entryMemTable0.getEntry((long) 0, (long) '#');
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(ofLong2);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(entryKeyValue10);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test544");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        java.util.PrimitiveIterator.OfLong ofLong5 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource6 = entryMemTable0.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue8 = entryMemTable0.getLastEntry((long) 10);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint10 = entryMemTable0.snapshot(checkpoint9);
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList11 = entryMemTable0.snapshot;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint12 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList13 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint12);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue15 = entrySkipList13.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint16 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList17 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint16);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList17.get((java.lang.Object) 1L);
        entrySkipList13.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList17);
        boolean boolean22 = entrySkipList17.containsKey((java.lang.Object) false);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidChannel();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue24 = entrySkipList17.remove((java.lang.Object) bufferedChannel23);
        entryMemTable0.kvmap = entrySkipList17;
        org.apache.bookkeeper.bookie.EntryKey entryKey26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ConcurrentNavigableMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap27 = entrySkipList17.tailMap(entryKey26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(checkpointSource6);
        org.junit.Assert.assertNull(entryKeyValue8);
        org.junit.Assert.assertNull(checkpoint10);
        org.junit.Assert.assertNotNull(entrySkipList11);
        org.junit.Assert.assertNull(entryKeyValue15);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNull(entryKeyValue24);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test545");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        boolean boolean13 = entrySkipList10.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong16 = entryMemTable14.getListOfEntriesOfLedger(100L);
        boolean boolean17 = entrySkipList10.equals((java.lang.Object) entryMemTable14);
        entryMemTable14.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList5.remove((java.lang.Object) entryMemTable14);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats20 = entryMemTable14.memTableStats;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher21 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint22 = null;
        long long23 = entryMemTable14.flush(skipListFlusher21, checkpoint22);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertNotNull(entryMemTableStats20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test546");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher1 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint2 = null;
        long long3 = entryMemTable0.flushSnapshot(skipListFlusher1, checkpoint2);
        java.util.PrimitiveIterator.OfLong ofLong5 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource6 = entryMemTable0.checkpointSource;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue8 = entryMemTable0.getLastEntry((long) 10);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint10 = entryMemTable0.snapshot(checkpoint9);
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList11 = entryMemTable0.snapshot;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint12 = null;
        int int13 = entrySkipList11.compareTo(checkpoint12);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint14 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList15 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint14);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue17 = entrySkipList15.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        entrySkipList15.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList19);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint23 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList24 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint23);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue26 = entrySkipList24.get((java.lang.Object) 1L);
        boolean boolean27 = entrySkipList24.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong30 = entryMemTable28.getListOfEntriesOfLedger(100L);
        boolean boolean31 = entrySkipList24.equals((java.lang.Object) entryMemTable28);
        entryMemTable28.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue33 = entrySkipList19.remove((java.lang.Object) entryMemTable28);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration34 = entryMemTable28.conf;
        java.util.PrimitiveIterator.OfLong ofLong36 = entryMemTable28.getListOfEntriesOfLedger((long) 1);
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList37 = entryMemTable28.snapshot;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher39 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint40 = null;
        long long41 = entryMemTable38.flushSnapshot(skipListFlusher39, checkpoint40);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration42 = entryMemTable38.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList43 = entryMemTable38.kvmap;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint44 = null;
        int int45 = entrySkipList43.compareTo(checkpoint44);
        entryMemTable28.kvmap = entrySkipList43;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher47 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint48 = null;
        long long49 = entryMemTable28.flush(skipListFlusher47, checkpoint48);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher50 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint51 = null;
        long long52 = entryMemTable28.flushSnapshot(skipListFlusher50, checkpoint51);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint53 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList54 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint53);
        boolean boolean56 = entrySkipList54.containsValue((java.lang.Object) (byte) -1);
        boolean boolean58 = entrySkipList54.equals((java.lang.Object) 100.0f);
        java.util.concurrent.ConcurrentSkipListMap<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyMap59 = entrySkipList54.clone();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry60 = entrySkipList54.lastEntry();
        boolean boolean62 = entrySkipList54.equals((java.lang.Object) 10L);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore64 = entryMemTable63.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong65 = entryMemTable63.size;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue66 = null;
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue67 = entrySkipList54.getOrDefault((java.lang.Object) atomicLong65, entryKeyValue66);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable68 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore69 = entryMemTable68.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats70 = entryMemTable68.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint71 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList72 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint71);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue74 = entrySkipList72.get((java.lang.Object) 1L);
        boolean boolean75 = entrySkipList72.isEmpty();
// flaky "14) test546(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable68.clearSnapshot(entrySkipList72);
        boolean boolean77 = entrySkipList54.containsKey((java.lang.Object) entrySkipList72);
        entryMemTable28.snapshot = entrySkipList54;
        boolean boolean79 = entrySkipList11.containsValue((java.lang.Object) entrySkipList54);
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(checkpointSource6);
        org.junit.Assert.assertNull(entryKeyValue8);
        org.junit.Assert.assertNull(checkpoint10);
        org.junit.Assert.assertNotNull(entrySkipList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(entryKeyValue17);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertNull(entryKeyValue26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(entryMemTable28);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(entryKeyValue33);
        org.junit.Assert.assertNotNull(serverConfiguration34);
        org.junit.Assert.assertNotNull(ofLong36);
        org.junit.Assert.assertNotNull(entrySkipList37);
        org.junit.Assert.assertNotNull(entryMemTable38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration42);
        org.junit.Assert.assertNotNull(entrySkipList43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(entryKeyMap59);
        org.junit.Assert.assertNull(entryKeyEntry60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(entryMemTable63);
        org.junit.Assert.assertNotNull(semaphore64);
        org.junit.Assert.assertNotNull(atomicLong65);
        org.junit.Assert.assertNull(entryKeyValue67);
        org.junit.Assert.assertNotNull(entryMemTable68);
        org.junit.Assert.assertNotNull(semaphore69);
        org.junit.Assert.assertNotNull(entryMemTableStats70);
        org.junit.Assert.assertNull(entryKeyValue74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test547");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry9 = entrySkipList5.pollLastEntry();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore11 = entryMemTable10.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong12 = entryMemTable10.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint13 = entryMemTable10.snapshot();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher14 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint15 = null;
        long long16 = entryMemTable10.flush(skipListFlusher14, checkpoint15);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint17 = entryMemTable10.snapshot();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher18 = null;
        long long19 = entryMemTable10.flush(skipListFlusher18);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore21 = entryMemTable20.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats22 = entryMemTable20.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint23 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList24 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint23);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue26 = entrySkipList24.get((java.lang.Object) 1L);
        boolean boolean27 = entrySkipList24.isEmpty();
// flaky "15) test547(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable20.clearSnapshot(entrySkipList24);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher30 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint31 = null;
        long long32 = entryMemTable29.flushSnapshot(skipListFlusher30, checkpoint31);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = entryMemTable29.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList34 = entryMemTable29.kvmap;
        entryMemTable20.kvmap = entrySkipList34;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena36 = entryMemTable20.allocator;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena37 = entryMemTable20.allocator;
        entryMemTable10.allocator = skipListArena37;
        boolean boolean39 = entrySkipList5.containsKey((java.lang.Object) entryMemTable10);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry40 = entrySkipList5.lastEntry();
        boolean boolean42 = entrySkipList5.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNull(entryKeyEntry9);
        org.junit.Assert.assertNotNull(entryMemTable10);
        org.junit.Assert.assertNotNull(semaphore11);
        org.junit.Assert.assertNotNull(atomicLong12);
        org.junit.Assert.assertNull(checkpoint13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(checkpoint17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(entryMemTable20);
        org.junit.Assert.assertNotNull(semaphore21);
        org.junit.Assert.assertNotNull(entryMemTableStats22);
        org.junit.Assert.assertNull(entryKeyValue26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(entryMemTable29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertNotNull(entrySkipList34);
        org.junit.Assert.assertNotNull(skipListArena36);
        org.junit.Assert.assertNotNull(skipListArena37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(entryKeyEntry40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test548");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        boolean boolean10 = entrySkipList5.containsKey((java.lang.Object) false);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher12 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint13 = null;
        long long14 = entryMemTable11.flushSnapshot(skipListFlusher12, checkpoint13);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats15 = entryMemTable11.memTableStats;
        boolean boolean16 = entryMemTable11.isSizeLimitReached();
        entryMemTable11.close();
        java.util.PrimitiveIterator.OfLong ofLong19 = entryMemTable11.getListOfEntriesOfLedger((long) (short) 10);
        java.util.concurrent.Semaphore semaphore20 = entryMemTable11.skipListSemaphore;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint21 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList22 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint21);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue24 = entrySkipList22.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint25 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList26 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint25);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue28 = entrySkipList26.get((java.lang.Object) 1L);
        entrySkipList22.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList26);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher31 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint32 = null;
        long long33 = entryMemTable30.flushSnapshot(skipListFlusher31, checkpoint32);
        java.util.PrimitiveIterator.OfLong ofLong35 = entryMemTable30.getListOfEntriesOfLedger(100L);
        boolean boolean36 = entrySkipList22.containsKey((java.lang.Object) ofLong35);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore38 = entryMemTable37.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats39 = entryMemTable37.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint40 = entryMemTable37.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint41 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList42 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint41);
        boolean boolean44 = entrySkipList42.containsValue((java.lang.Object) (byte) -1);
        java.util.NavigableSet<org.apache.bookkeeper.bookie.EntryKey> entryKeySet45 = entrySkipList42.navigableKeySet();
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry46 = entrySkipList42.pollLastEntry();
        entryMemTable37.kvmap = entrySkipList42;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher49 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint50 = null;
        long long51 = entryMemTable48.flushSnapshot(skipListFlusher49, checkpoint50);
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats52 = entryMemTable48.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource53 = entryMemTable48.checkpointSource;
        boolean boolean54 = entrySkipList22.remove((java.lang.Object) entryMemTable37, (java.lang.Object) entryMemTable48);
        entryMemTable11.kvmap = entrySkipList22;
        boolean boolean56 = entrySkipList5.containsValue((java.lang.Object) entryMemTable11);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue58 = entryMemTable11.getLastEntry((long) (byte) 1);
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(entryMemTable11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertNotNull(semaphore20);
        org.junit.Assert.assertNull(entryKeyValue24);
        org.junit.Assert.assertNull(entryKeyValue28);
        org.junit.Assert.assertNotNull(entryMemTable30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(entryMemTable37);
        org.junit.Assert.assertNotNull(semaphore38);
        org.junit.Assert.assertNotNull(entryMemTableStats39);
        org.junit.Assert.assertNull(checkpoint40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(entryKeySet45);
        org.junit.Assert.assertNull(entryKeyEntry46);
        org.junit.Assert.assertNotNull(entryMemTable48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(entryMemTableStats52);
        org.junit.Assert.assertNotNull(checkpointSource53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(entryKeyValue58);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test549");
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint0 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList1 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint0);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue3 = entrySkipList1.get((java.lang.Object) 1L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint4 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList5 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint4);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue7 = entrySkipList5.get((java.lang.Object) 1L);
        entrySkipList1.putAll((java.util.Map<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue>) entrySkipList5);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue12 = entrySkipList10.get((java.lang.Object) 1L);
        boolean boolean13 = entrySkipList10.isEmpty();
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong16 = entryMemTable14.getListOfEntriesOfLedger(100L);
        boolean boolean17 = entrySkipList10.equals((java.lang.Object) entryMemTable14);
        entryMemTable14.close();
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue19 = entrySkipList5.remove((java.lang.Object) entryMemTable14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = entryMemTable14.conf;
        java.util.PrimitiveIterator.OfLong ofLong22 = entryMemTable14.getListOfEntriesOfLedger((long) 1);
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList23 = entryMemTable14.snapshot;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher25 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint26 = null;
        long long27 = entryMemTable24.flushSnapshot(skipListFlusher25, checkpoint26);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = entryMemTable24.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList29 = entryMemTable24.kvmap;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint30 = null;
        int int31 = entrySkipList29.compareTo(checkpoint30);
        entryMemTable14.kvmap = entrySkipList29;
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher33 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint34 = null;
        long long35 = entryMemTable14.flushSnapshot(skipListFlusher33, checkpoint34);
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock36 = entryMemTable14.lock;
        org.junit.Assert.assertNull(entryKeyValue3);
        org.junit.Assert.assertNull(entryKeyValue7);
        org.junit.Assert.assertNull(entryKeyValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryMemTable14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(entryKeyValue19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertNotNull(entrySkipList23);
        org.junit.Assert.assertNotNull(entryMemTable24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration28);
        org.junit.Assert.assertNotNull(entrySkipList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(reentrantReadWriteLock36);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test550");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = entryMemTable0.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = entryMemTable0.snapshot();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher4 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint5 = null;
        long long6 = entryMemTable0.flush(skipListFlusher4, checkpoint5);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher7 = null;
        long long8 = entryMemTable0.flush(skipListFlusher7);
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher9 = null;
        long long10 = entryMemTable0.flush(skipListFlusher9);
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(atomicLong2);
        org.junit.Assert.assertNull(checkpoint3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test551");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore1 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.stats.EntryMemTableStats entryMemTableStats2 = entryMemTable0.memTableStats;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList4 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint3);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue6 = entrySkipList4.get((java.lang.Object) 1L);
        boolean boolean7 = entrySkipList4.isEmpty();
// flaky "16) test551(org.apache.bookkeeper.bookie.EntryMemTableRegression1)":         entryMemTable0.clearSnapshot(entrySkipList4);
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        org.apache.bookkeeper.bookie.SkipListFlusher skipListFlusher10 = null;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint11 = null;
        long long12 = entryMemTable9.flushSnapshot(skipListFlusher10, checkpoint11);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = entryMemTable9.conf;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList14 = entryMemTable9.kvmap;
        entryMemTable0.kvmap = entrySkipList14;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena16 = entryMemTable0.allocator;
        org.apache.bookkeeper.bookie.SkipListArena skipListArena17 = entryMemTable0.allocator;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint18 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList19 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint18);
        org.apache.bookkeeper.bookie.EntryKeyValue entryKeyValue21 = entrySkipList19.get((java.lang.Object) 1L);
        java.util.Map.Entry<org.apache.bookkeeper.bookie.EntryKey, org.apache.bookkeeper.bookie.EntryKeyValue> entryKeyEntry22 = entrySkipList19.lastEntry();
        entryMemTable0.snapshot = entrySkipList19;
        java.util.concurrent.Semaphore semaphore24 = entryMemTable0.skipListSemaphore;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList25 = org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList.EMPTY_VALUE;
        java.lang.String str26 = entrySkipList25.toString();
        entryMemTable0.snapshot = entrySkipList25;
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(semaphore1);
        org.junit.Assert.assertNotNull(entryMemTableStats2);
        org.junit.Assert.assertNull(entryKeyValue6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(entryMemTable9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNotNull(entrySkipList14);
        org.junit.Assert.assertNotNull(skipListArena16);
        org.junit.Assert.assertNotNull(skipListArena17);
        org.junit.Assert.assertNull(entryKeyValue21);
        org.junit.Assert.assertNull(entryKeyEntry22);
        org.junit.Assert.assertNotNull(semaphore24);
        org.junit.Assert.assertNotNull(entrySkipList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntryMemTableRegression1.test552");
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.PrimitiveIterator.OfLong ofLong2 = entryMemTable0.getListOfEntriesOfLedger(100L);
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint3 = entryMemTable0.snapshot();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = entryMemTable0.size;
        org.apache.bookkeeper.bookie.EntryMemTable entryMemTable5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidEntryMemTable();
        java.util.concurrent.Semaphore semaphore6 = entryMemTable5.skipListSemaphore;
        java.util.concurrent.atomic.AtomicLong atomicLong7 = entryMemTable5.size;
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint8 = entryMemTable5.snapshot();
        org.apache.bookkeeper.bookie.CheckpointSource.Checkpoint checkpoint9 = null;
        org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList entrySkipList10 = new org.apache.bookkeeper.bookie.EntryMemTable.EntrySkipList(checkpoint9);
        entryMemTable5.snapshot = entrySkipList10;
        entryMemTable0.snapshot = entrySkipList10;
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.EntryKey entryKey14 = entrySkipList10.ceilingKey(entryKey13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryMemTable0);
        org.junit.Assert.assertNotNull(ofLong2);
        org.junit.Assert.assertNull(checkpoint3);
        org.junit.Assert.assertNotNull(atomicLong4);
        org.junit.Assert.assertNotNull(entryMemTable5);
        org.junit.Assert.assertNotNull(semaphore6);
        org.junit.Assert.assertNotNull(atomicLong7);
        org.junit.Assert.assertNull(checkpoint8);
    }
}
