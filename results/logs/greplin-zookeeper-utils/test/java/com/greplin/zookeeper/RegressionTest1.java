package com.greplin.zookeeper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 471 + "'", int2 == 471);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 471 + "'", int3 == 471);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 471 + "'", int6 == 471);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 472 + "'", int4 == 472);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 472 + "'", int5 == 472);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(221);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 474 + "'", int2 == 474);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 474 + "'", int3 == 474);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zooKeeper7);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 252, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(122);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass15 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 477 + "'", int5 == 477);
        org.junit.Assert.assertNotNull(zooKeeper7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 477 + "'", int8 == 477);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Class<?> wildcardClass8 = robustZooKeeper1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 479 + "'", int2 == 479);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 479 + "'", int3 == 479);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(4);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder12.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.clientPort(207);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(221);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = null; // flaky: builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer11);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int7 = robustZooKeeper1.getReconnectionCount();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 481 + "'", int2 == 481);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 481 + "'", int3 == 481);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 482 + "'", int6 == 482);
        org.junit.Assert.assertNotNull(zooKeeper8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder2.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort((int) (short) 100);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.clientPort(296);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder10.dataDir(file15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 484 + "'", int4 == 484);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getReconnectionCount();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zooKeeper5);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 486 + "'", int3 == 486);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 486 + "'", int4 == 486);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 486 + "'", int8 == 486);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper4);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 488 + "'", int2 == 488);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 488 + "'", int3 == 488);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 488 + "'", int4 == 488);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 489 + "'", int3 == 489);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 489 + "'", int4 == 489);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder6.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 189, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 100, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.clientPort(10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(4);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.dataDir(file15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }/*@Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray15, runnable16);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 493 + "'", int7 == 493);
        org.junit.Assert.assertNotNull(zooKeeper8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, -1, 0, 100]");
    }*/

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 270, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 391, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 494 + "'", int2 == 494);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.clientPort(207);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(221);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder0.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.tickTime((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }/*@Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable7);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_lock-");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 495 + "'", int4 == 495);
        org.junit.Assert.assertNotNull(zooKeeper5);
    }*/

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.clientPort(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }/*@Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable5);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }*/
  /*
    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }*/

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(232);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = null; // flaky: builder12.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 342, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(37);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder14.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort((int) ' ');
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(307);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder6.clientPort(216);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder6.build();
//              org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(56);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(259);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }/*@Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable10);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_hi!");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 498 + "'", int5 == 498);
    }*/

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder2.clientPort(409);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        java.io.File file17 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder8.dataDir(file17);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }/*@Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable9);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 503 + "'", int5 == 503);
        org.junit.Assert.assertNotNull(zooKeeper7);
    }*/

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 443, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(233);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(326);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 506 + "'", int5 == 506);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 507 + "'", int4 == 507);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 508 + "'", int4 == 508);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 509 + "'", int4 == 509);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 511 + "'", int4 == 511);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 511 + "'", int5 == 511);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 511 + "'", int6 == 511);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 511, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.tickTime((java.lang.Long) 1L);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder10.dataDir(file15);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray6 = new byte[] { (byte) 10 };
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray6, runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10]");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 513 + "'", int3 == 513);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        java.io.File file17 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder8.dataDir(file17);
        java.io.File file19 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder20 = builder8.dataDir(file19);
        java.io.File file21 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder22 = builder8.dataDir(file21);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 486, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.tickTime((java.lang.Long) 1L);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder10.dataDir(file15);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer17 = builder16.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 515 + "'", int2 == 515);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 515 + "'", int3 == 515);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 515 + "'", int6 == 515);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }/*@Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable10);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 516 + "'", int4 == 516);
        org.junit.Assert.assertNotNull(zooKeeper5);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 516 + "'", int7 == 516);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }*/

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 517 + "'", int3 == 517);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 517 + "'", int4 == 517);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 517 + "'", int6 == 517);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 517 + "'", int7 == 517);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.tickTime((java.lang.Long) 1L);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder10.dataDir(file15);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder10.tickTime((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 518 + "'", int3 == 518);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 519 + "'", int2 == 519);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 519 + "'", int3 == 519);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 520 + "'", int2 == 520);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 520 + "'", int3 == 520);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 520 + "'", int6 == 520);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 520 + "'", int7 == 520);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 521 + "'", int2 == 521);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 521 + "'", int3 == 521);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 521 + "'", int8 == 521);
    }/*@Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable10);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_lock-");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 523 + "'", int7 == 523);
        org.junit.Assert.assertNotNull(zooKeeper8);
    }*/

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 524 + "'", int2 == 524);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 524 + "'", int3 == 524);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 525 + "'", int3 == 525);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 525 + "'", int4 == 525);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 525 + "'", int6 == 525);
    }/*@Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable9);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 526 + "'", int5 == 526);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }*/

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(311);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.clientPort(10);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(zooKeeper7);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(122);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 100L);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.dataDir(file15);
        java.io.File file17 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.dataDir(file17);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer19 = null; // flaky: builder18.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer19);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 530 + "'", int7 == 530);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 530 + "'", int8 == 530);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.clientPort(207);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(221);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder0.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 531 + "'", int4 == 531);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 531 + "'", int6 == 531);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort((int) (short) 0);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 32, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 514, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 535 + "'", int2 == 535);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 35, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(122);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.clientPort(437);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer19 = builder16.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }/*@Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(151);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder2.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }*/

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 536 + "'", int4 == 536);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        int int7 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 537 + "'", int4 == 537);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }/*@Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable7);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_lock-");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }*/

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) (-1L));
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.tickTime((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass15 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 539 + "'", int3 == 539);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 540 + "'", int2 == 540);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 540 + "'", int3 == 540);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 540 + "'", int5 == 540);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 540 + "'", int8 == 540);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.tickTime((java.lang.Long) 10L);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.dataDir(file15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }/*@Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable7);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 543 + "'", int4 == 543);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }*/

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort((int) (short) 0);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 545 + "'", int4 == 545);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 545 + "'", int5 == 545);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 546 + "'", int3 == 546);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }
/*
    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }*/
  
    /*@Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(167);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }*/

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 348, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 552 + "'", int2 == 552);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 552 + "'", int3 == 552);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(122);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        java.lang.Class<?> wildcardClass2 = robustZooKeeper1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.clientPort((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort((int) (short) 0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 556 + "'", int4 == 556);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 556 + "'", int5 == 556);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 556 + "'", int6 == 556);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.clientPort((int) (short) 100);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder10.clientPort(216);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertNotNull(zooKeeper2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 557 + "'", int3 == 557);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(154);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.dataDir(file15);
        java.lang.Class<?> wildcardClass17 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }/*@Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(56);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }*/

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 558 + "'", int2 == 558);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 10, -1]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 559 + "'", int3 == 559);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 559 + "'", int4 == 559);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 560 + "'", int3 == 560);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.clientPort(315);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer19 = builder16.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        int int9 = robustZooKeeper1.getReconnectionCount();
        int int10 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertNotNull(zooKeeper8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(4);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.tickTime((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 311, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.clientPort((int) (byte) 100);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder4.clientPort((int) '#');
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.clientPort(151);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer17 = builder16.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564 + "'", int2 == 564);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 564 + "'", int3 == 564);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.clientPort(152);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray9 = new byte[] {};
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 565 + "'", int6 == 565);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 566 + "'", int2 == 566);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 566 + "'", int3 == 566);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        int int7 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 568 + "'", int2 == 568);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 568 + "'", int3 == 568);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568 + "'", int6 == 568);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 569 + "'", int4 == 569);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int8 = robustZooKeeper1.getReconnectionCount();
        int int9 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 524, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.dataDir(file3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 576 + "'", int3 == 576);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 576 + "'", int4 == 576);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 577 + "'", int6 == 577);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 577 + "'", int8 == 577);
        org.junit.Assert.assertNotNull(zooKeeper9);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper10 = robustZooKeeper1.getClient();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 578 + "'", int5 == 578);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zooKeeper9);
        org.junit.Assert.assertNotNull(zooKeeper10);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass15 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 580 + "'", int4 == 580);
        org.junit.Assert.assertNotNull(zooKeeper5);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 580 + "'", int7 == 580);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 580 + "'", int8 == 580);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 0 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 10, 0]");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(212);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 582 + "'", int4 == 582);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 582 + "'", int5 == 582);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 583 + "'", int2 == 583);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 583 + "'", int3 == 583);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 583 + "'", int4 == 583);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 583 + "'", int5 == 583);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 100L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.dataDir(file11);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = builder12.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.tickTime((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder2.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(4);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 584 + "'", int5 == 584);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 585 + "'", int5 == 585);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zooKeeper9);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.clientPort(130);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = null; // flaky: builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer13);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int9 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 587 + "'", int5 == 587);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(37);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }/*@Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        byte[] byteArray7 = new byte[] {};
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray7, runnable8);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }*/

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }/*@Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray15, runnable16);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_lock-");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 589 + "'", int5 == 589);
        org.junit.Assert.assertNotNull(zooKeeper7);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 0, 10, -1, 1]");
    }*/

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 591 + "'", int2 == 591);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 591 + "'", int3 == 591);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 591 + "'", int4 == 591);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 591 + "'", int5 == 591);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray14, runnable15);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 593 + "'", int2 == 593);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 593 + "'", int3 == 593);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 593 + "'", int8 == 593);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 10, 100]");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zooKeeper6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 596 + "'", int7 == 596);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 597 + "'", int5 == 597);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.tickTime((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 598 + "'", int4 == 598);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(0);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 599 + "'", int3 == 599);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 599 + "'", int4 == 599);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 599 + "'", int6 == 599);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getInstanceNumber();
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600 + "'", int4 == 600);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(134);
        java.lang.Class<?> wildcardClass15 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 100, file1, (java.lang.Long) 10L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 577, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.dataDir(file5);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 602 + "'", int3 == 602);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 602 + "'", int4 == 602);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(151);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(56);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(410);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(44);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.dataDir(file15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 606 + "'", int3 == 606);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 606 + "'", int4 == 606);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 606 + "'", int8 == 606);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        robustZooKeeper1.shutdown();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 608 + "'", int5 == 608);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 608 + "'", int6 == 608);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 608 + "'", int7 == 608);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
        int int10 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 609 + "'", int6 == 609);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 609 + "'", int8 == 609);
        org.junit.Assert.assertNotNull(zooKeeper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder14.clientPort(167);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 611 + "'", int2 == 611);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 611 + "'", int3 == 611);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(187);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.clientPort(207);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(0);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.clientPort((int) (byte) 100);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder4.clientPort((int) '#');
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.dataDir(file15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder2.tickTime((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder2.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(122);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(zooKeeper8);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.clientPort(315);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder20 = builder18.tickTime((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 614 + "'", int4 == 614);
    }
/*
    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable4);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_hi!");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
    }
*/
    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 618 + "'", int5 == 618);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 618 + "'", int8 == 618);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        int int9 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper10 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 619 + "'", int2 == 619);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 619 + "'", int3 == 619);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 619 + "'", int8 == 619);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 619 + "'", int9 == 619);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.clientPort(44);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.dataDir(file15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }
/*
    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable9);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_hi!");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 620 + "'", int4 == 620);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 620 + "'", int7 == 620);
    }
*/
    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 623 + "'", int6 == 623);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray15, runnable16);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 624 + "'", int6 == 624);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 0, -1, 10]");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(zooKeeper4);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort(113);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(192);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(189);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(221);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 216, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 630 + "'", int4 == 630);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 630 + "'", int5 == 630);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 630 + "'", int6 == 630);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 630 + "'", int8 == 630);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 545, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 635 + "'", int2 == 635);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 635 + "'", int3 == 635);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort(113);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(192);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(252);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.clientPort((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder10.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 641 + "'", int4 == 641);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 641 + "'", int7 == 641);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(37);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(311);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.clientPort(455);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(250);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(527);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 471, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.tickTime((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 642 + "'", int4 == 642);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 642 + "'", int5 == 642);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 642 + "'", int6 == 642);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 642 + "'", int8 == 642);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 643 + "'", int3 == 643);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 643 + "'", int4 == 643);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        java.lang.Class<?> wildcardClass3 = robustZooKeeper1.getClass();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(322);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.clientPort(207);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder0.clientPort(311);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder0.clientPort(167);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        java.lang.Class<?> wildcardClass6 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 645 + "'", int4 == 645);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 645 + "'", int5 == 645);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 405, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getReconnectionCount();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 646 + "'", int2 == 646);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 646 + "'", int3 == 646);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 280, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 647 + "'", int3 == 647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 648 + "'", int4 == 648);
        org.junit.Assert.assertNotNull(zooKeeper5);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 648 + "'", int7 == 648);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
        int int7 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zooKeeper6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort((int) (short) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 158, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 652 + "'", int5 == 652);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 653 + "'", int2 == 653);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 653 + "'", int6 == 653);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 654 + "'", int2 == 654);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 654 + "'", int3 == 654);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 654 + "'", int4 == 654);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 654 + "'", int5 == 654);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 655 + "'", int2 == 655);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 655 + "'", int3 == 655);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 655 + "'", int7 == 655);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 656 + "'", int4 == 656);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 656 + "'", int5 == 656);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, 0]");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        int int9 = robustZooKeeper1.getReconnectionCount();
        org.apache.zookeeper.ZooKeeper zooKeeper10 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable12);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_hi!");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 658 + "'", int7 == 658);
        org.junit.Assert.assertNotNull(zooKeeper8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(zooKeeper10);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.clientPort((int) (byte) 100);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder4.clientPort(579);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.clientPort(134);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.clientPort(231);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = builder12.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 659 + "'", int3 == 659);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 659 + "'", int4 == 659);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 660 + "'", int5 == 660);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(192);
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.dataDir(file15);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.clientPort(455);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 661 + "'", int3 == 661);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 661 + "'", int4 == 661);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.clientPort(4);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.clientPort(231);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.tickTime((java.lang.Long) 1L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort(113);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(192);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder2.clientPort(311);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 663 + "'", int5 == 663);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder2.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder2.clientPort(84);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 664 + "'", int2 == 664);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 664 + "'", int3 == 664);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 664 + "'", int4 == 664);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 664 + "'", int5 == 664);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 665 + "'", int4 == 665);
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 665 + "'", int7 == 665);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getReconnectionCount();
        java.lang.Class<?> wildcardClass9 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.tickTime((java.lang.Long) 100L);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder16.clientPort(315);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer19 = builder18.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 518, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable7);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_lock-");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 671 + "'", int4 == 671);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int8 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 672 + "'", int5 == 672);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }
}
