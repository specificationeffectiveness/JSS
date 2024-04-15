package com.greplin.zookeeper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = com.greplin.zookeeper.RobustZooKeeper.LOCK_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lock-" + "'", str0, "lock-");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = com.greplin.zookeeper.RobustZooKeeper.LOCK_NODE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/_greplin_robustZK_" + "'", str0, "/_greplin_robustZK_");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: builder2.build();
        org.junit.Assert.assertNotNull(builder2);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, 1, 0, 0, 1]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, -1, -1, 1]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 10, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.List<org.apache.zookeeper.data.ACL> aCLList0 = com.greplin.zookeeper.RobustZooKeeper.DEFAULT_ACL;
        org.junit.Assert.assertNotNull(aCLList0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 3, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 10, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder2.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        byte[] byteArray3 = new byte[] {};
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray3, runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        java.lang.Class<?> wildcardClass5 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder2.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 0, -1, 0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, -1, -1, 0]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 0, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }/*@Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer1 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
// flaky:             robustZooKeeper1.withLock("hi!", byteArray5, runnable6);
// // // flaky:             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.NoNodeException; message: KeeperErrorCode = NoNode for /_greplin_robustZK_hi!");
// flaky:         } catch (org.apache.zookeeper.KeeperException.NoNodeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray7, runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        java.lang.Class<?> wildcardClass4 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        java.lang.Class<?> wildcardClass2 = robustZooKeeper1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer1 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) (-1), file1, (java.lang.Long) 1L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
// flaky:             robustZooKeeper1.withLock("hi!", byteArray6, runnable7);
// // // flaky:             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.NoNodeException; message: KeeperErrorCode = NoNode for /_greplin_robustZK_hi!");
// flaky:         } catch (org.apache.zookeeper.KeeperException.NoNodeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable3);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 35, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray4 = new byte[] {};
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray4, runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, -1, 10, 10, -1]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, -1, 10, 1, -1]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, -1]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, -1, -1, 100, 0]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray5, runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1 };
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray5, runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, -1, 0]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 37, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 55 + "'", int5 == 55);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, 0, 0]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, -1]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 44, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 35, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 44, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable3);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        byte[] byteArray6 = new byte[] {};
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
// flaky:             robustZooKeeper1.withLock("", byteArray6, runnable7);
// // // flaky:             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.NoNodeException; message: KeeperErrorCode = NoNode for /_greplin_robustZK_");
// flaky:         } catch (org.apache.zookeeper.KeeperException.NoNodeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = null; // flaky: builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 75 + "'", int3 == 75);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        java.lang.Class<?> wildcardClass5 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray5 = new byte[] {};
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray5, runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 81 + "'", int3 == 81);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 83 + "'", int3 == 83);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, -1]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray9 = new byte[] { (byte) 100 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }/*@Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
    }*/

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 56, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("", byteArray9, runnable10);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 10, 1, 1, 100]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, -1, 1, 1, 10]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 100, 1, 100]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 91 + "'", int5 == 91);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10 };
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray6, runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray7, runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, -1, 100, 0, 0, 100]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 1, 0, 0, 0, 0]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1, 100, 0, 10]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray5, runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
    }/*@Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 3, file1, (java.lang.Long) 10L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 106 + "'", int3 == 106);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 1, 0, 10, 10]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 71, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114 + "'", int2 == 114);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 114 + "'", int3 == 114);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, -1, -1]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        java.lang.Class<?> wildcardClass3 = robustZooKeeper1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 113, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 84, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 117 + "'", int3 == 117);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 117 + "'", int4 == 117);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 10, 100, 10, -1]");
    }/*@Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 35, file1, (java.lang.Long) 100L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 123 + "'", int4 == 123);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 123 + "'", int5 == 123);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 124 + "'", int4 == 124);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, -1, 1, 10, 10]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 94, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, -1, 0]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = builder8.build();
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder6.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 132 + "'", int3 == 132);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1, 10, -1, 100, 100]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Class<?> wildcardClass6 = robustZooKeeper1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 135 + "'", int2 == 135);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("", runnable5);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 122, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 71, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 138 + "'", int4 == 138);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 138 + "'", int5 == 138);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder2.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable3);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 10, 10, 1]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 2, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.clientPort((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
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
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, -1, 10]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146 + "'", int2 == 146);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 146 + "'", int3 == 146);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 146 + "'", int4 == 146);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 148 + "'", int3 == 148);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 148 + "'", int4 == 148);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = null; // flaky: builder8.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(100);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("hi!", byteArray7, runnable8);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 153 + "'", int3 == 153);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 153 + "'", int4 == 153);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 10, 1, -1]");
    }/*@Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }*/

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 155 + "'", int3 == 155);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 152, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 157 + "'", int3 == 157);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 157 + "'", int4 == 157);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 159 + "'", int2 == 159);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 159 + "'", int3 == 159);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 159 + "'", int6 == 159);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 100, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("lock-", runnable6);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 163 + "'", int4 == 163);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 0, 0]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 166, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 121, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
            org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168 + "'", int2 == 168);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 168 + "'", int8 == 168);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder6.build();
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
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 0, file1, (java.lang.Long) 10L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        java.lang.Class<?> wildcardClass4 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 174 + "'", int3 == 174);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176 + "'", int2 == 176);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 176 + "'", int3 == 176);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 176 + "'", int5 == 176);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] {};
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 177 + "'", int6 == 177);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 179 + "'", int3 == 179);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 179 + "'", int4 == 179);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 180 + "'", int4 == 180);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 180 + "'", int5 == 180);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 10, 10, 100, -1, 0]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
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
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 181 + "'", int6 == 181);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 183 + "'", int3 == 183);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 10, -1, 10, 0]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 188 + "'", int4 == 188);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100, 0, -1, 1, -1]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        java.lang.Class<?> wildcardClass2 = robustZooKeeper1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 166, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.tickTime((java.lang.Long) (-1L));
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 195 + "'", int6 == 195);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, 10, -1, 0]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 198 + "'", int3 == 198);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 201 + "'", int2 == 201);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 201 + "'", int3 == 201);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 202 + "'", int4 == 202);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 205 + "'", int3 == 205);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 205 + "'", int5 == 205);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 204, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 207 + "'", int2 == 207);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 207 + "'", int3 == 207);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(0);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray12, runnable13);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 210 + "'", int2 == 210);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 210 + "'", int3 == 210);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 10, 100, 10, -1]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        byte[] byteArray7 = new byte[] { (byte) -1 };
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray7, runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
    }/*@Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 113, file1, (java.lang.Long) 100L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer5 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 0, file1, (java.lang.Long) 1L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 100, 10]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 214 + "'", int2 == 214);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 214 + "'", int3 == 214);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 214 + "'", int4 == 214);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 215 + "'", int2 == 215);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.dataDir(file13);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder10.build();
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
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
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 219 + "'", int3 == 219);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 193, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100, -1]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 227 + "'", int2 == 227);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 227 + "'", int3 == 227);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
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
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 230 + "'", int3 == 230);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 193, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable4 = null;
// flaky:         robustZooKeeper1.withLock("", runnable4);
        org.junit.Assert.assertNotNull(zooKeeper2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray14, runnable15);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 0, -1, 1, -1, 10]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort((int) (byte) -1);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
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
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 236 + "'", int3 == 236);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 237 + "'", int2 == 237);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 237 + "'", int3 == 237);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, -1, 1, 10, 10]");
    }/*@Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 37, file1, (java.lang.Long) 100L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 239 + "'", int4 == 239);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 239 + "'", int6 == 239);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 241 + "'", int4 == 241);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 241 + "'", int5 == 241);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 244 + "'", int6 == 244);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray9 = new byte[] {};
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 246 + "'", int3 == 246);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 246 + "'", int4 == 246);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 246 + "'", int6 == 246);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 246 + "'", int7 == 246);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 247 + "'", int4 == 247);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 247 + "'", int6 == 247);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 247 + "'", int7 == 247);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 249 + "'", int3 == 249);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 251 + "'", int3 == 251);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, -1]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("hi!", byteArray6, runnable7);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 253 + "'", int4 == 253);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 134, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 257 + "'", int5 == 257);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 260 + "'", int4 == 260);
        org.junit.Assert.assertNotNull(zooKeeper5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray7 = new byte[] {};
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("lock-", byteArray7, runnable8);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 263 + "'", int5 == 263);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray6 = new byte[] { (byte) 10 };
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray6, runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 264 + "'", int3 == 264);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 265 + "'", int4 == 265);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 267 + "'", int3 == 267);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 268 + "'", int3 == 268);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 269 + "'", int3 == 269);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 269 + "'", int4 == 269);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 269 + "'", int6 == 269);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 269 + "'", int7 == 269);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(56);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.dataDir(file11);
        java.lang.Class<?> wildcardClass13 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder6.build();
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 175, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 173, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.dataDir(file11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 121, file1, (java.lang.Long) 10L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        byte[] byteArray4 = new byte[] { (byte) -1 };
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray4, runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray12, runnable13);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 273 + "'", int2 == 273);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 273 + "'", int3 == 273);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, -1, -1, -1, 0, 10]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder6.build();
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 37, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper7 = new com.greplin.zookeeper.RobustZooKeeper("");
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        java.lang.Runnable runnable16 = null;
// flaky:         robustZooKeeper7.withLock("", byteArray15, runnable16);
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray15, runnable18);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 275 + "'", int3 == 275);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, 10, -1, 0, 100]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort((int) (byte) -1);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
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
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 222, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 223, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 167, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (short) 1);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 279 + "'", int3 == 279);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 0, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 281 + "'", int2 == 281);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 281 + "'", int3 == 281);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 1]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 37, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.tickTime((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(187);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.dataDir(file11);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = null; // flaky: builder12.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Class<?> wildcardClass5 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Class<?> wildcardClass5 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper7 = new com.greplin.zookeeper.RobustZooKeeper("");
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        java.lang.Runnable runnable16 = null;
// flaky:         robustZooKeeper7.withLock("", byteArray15, runnable16);
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray15, runnable18);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 287 + "'", int2 == 287);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 287 + "'", int3 == 287);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, 10, -1, 0, 100]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 206, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 262, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 289 + "'", int2 == 289);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 289 + "'", int3 == 289);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(97);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray11, runnable12);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292 + "'", int2 == 292);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 292 + "'", int3 == 292);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 10, 100, -1, 100]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 294 + "'", int3 == 294);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer17 = builder16.build();
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
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 297 + "'", int4 == 297);
        org.junit.Assert.assertNotNull(zooKeeper5);
    }/*@Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
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
    }*/

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper7 = new com.greplin.zookeeper.RobustZooKeeper("");
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        java.lang.Runnable runnable16 = null;
// flaky:         robustZooKeeper7.withLock("", byteArray15, runnable16);
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray15, runnable18);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 299 + "'", int2 == 299);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 299 + "'", int3 == 299);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, 10, -1, 0, 100]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 301 + "'", int2 == 301);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 301 + "'", int3 == 301);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 301 + "'", int5 == 301);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder4.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 189, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 302 + "'", int4 == 302);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100]");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        robustZooKeeper1.sync();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             robustZooKeeper1.withLock("lock-", byteArray9, runnable10);
// // // flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 10, 1, -1, -1]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 306 + "'", int2 == 306);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        java.lang.Class<?> wildcardClass6 = robustZooKeeper1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 308 + "'", int2 == 308);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 308 + "'", int3 == 308);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(0);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 309 + "'", int2 == 309);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 310 + "'", int2 == 310);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 310 + "'", int3 == 310);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 310 + "'", int6 == 310);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 312 + "'", int2 == 312);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 10, 10, 10]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 314 + "'", int4 == 314);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder8.build();
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
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray14, runnable15);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 100, 100, 1, 0, 10]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer13 = builder6.build();
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 318 + "'", int3 == 318);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getReconnectionCount();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 319 + "'", int2 == 319);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 319 + "'", int3 == 319);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = com.greplin.zookeeper.EmbeddedZookeeperServer.builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.tickTime((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 175, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }/*@Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray9, runnable10);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
    }*/

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 294, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(167);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = null; // flaky: builder0.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer11);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 58, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(0);
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 335 + "'", int2 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 335 + "'", int3 == 335);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 335 + "'", int5 == 335);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 335 + "'", int8 == 335);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder4.build();
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 3, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 0 };
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray12, runnable13);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 338 + "'", int6 == 338);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 0]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
            robustZooKeeper1.withLock("hi!", runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 339 + "'", int2 == 339);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 339 + "'", int3 == 339);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.clientPort(207);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 326, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 341 + "'", int4 == 341);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 341 + "'", int6 == 341);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        java.lang.Class<?> wildcardClass5 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 343 + "'", int4 == 343);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 344 + "'", int2 == 344);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 344 + "'", int3 == 344);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }/*@Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable5);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 345 + "'", int3 == 345);
    }*/

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder14.build();
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
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 232, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.clientPort(315);
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350 + "'", int2 == 350);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 350 + "'", int3 == 350);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 350 + "'", int8 == 350);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 351 + "'", int3 == 351);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 351 + "'", int4 == 351);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort(56);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 296, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 328, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 353 + "'", int5 == 353);
    }/*@Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }*/

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 357 + "'", int3 == 357);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray7, runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 109, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder6.build();
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder20 = builder18.clientPort(158);
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.dataDir(file5);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(349);
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
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Class<?> wildcardClass7 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 362 + "'", int3 == 362);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 362 + "'", int4 == 362);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 362 + "'", int6 == 362);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 363 + "'", int5 == 363);
    }/*@Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 328, file1, (java.lang.Long) 10L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 364 + "'", int4 == 364);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 364 + "'", int6 == 364);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 368 + "'", int7 == 368);
        org.junit.Assert.assertNotNull(zooKeeper8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 371 + "'", int3 == 371);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 371 + "'", int5 == 371);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.clientPort(207);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.dataDir(file13);
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
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 305, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(356);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 10, 10, 100, 100]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(97);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 154, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        int int9 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 378 + "'", int2 == 378);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 378 + "'", int3 == 378);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 378 + "'", int8 == 378);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 379 + "'", int2 == 379);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 379 + "'", int3 == 379);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 379 + "'", int5 == 379);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable7);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 371, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer17 = null; // flaky: builder14.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer17);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 387 + "'", int4 == 387);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        int int4 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper7 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 389 + "'", int4 == 389);
        org.junit.Assert.assertNotNull(zooKeeper5);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        int int8 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 390 + "'", int3 == 390);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 390 + "'", int4 == 390);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 390 + "'", int6 == 390);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 390 + "'", int7 == 390);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort((int) (byte) -1);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
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
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 392 + "'", int4 == 392);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 392 + "'", int5 == 392);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 392 + "'", int6 == 392);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 392 + "'", int8 == 392);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 393 + "'", int3 == 393);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 393 + "'", int4 == 393);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 394 + "'", int4 == 394);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 394 + "'", int5 == 394);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 395 + "'", int4 == 395);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 395 + "'", int5 == 395);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 311, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable4);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.dataDir(file9);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer11 = builder6.build();
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort((int) '#');
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray8 = new byte[] {};
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 398 + "'", int3 == 398);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 398 + "'", int4 == 398);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10, -1]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, -1]");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 401 + "'", int4 == 401);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 401 + "'", int5 == 401);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 401 + "'", int6 == 401);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 199, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
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
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 403 + "'", int2 == 403);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 403 + "'", int3 == 403);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 403 + "'", int4 == 403);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper6 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 404 + "'", int3 == 404);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 404 + "'", int5 == 404);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder4.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.tickTime((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 406 + "'", int6 == 406);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 407 + "'", int2 == 407);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }/*@Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.clientPort(71);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.dataDir(file13);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder10.build();
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
    }*/

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(56);
        java.io.File file11 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.dataDir(file11);
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder8.dataDir(file13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 408 + "'", int3 == 408);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
        java.lang.Class<?> wildcardClass9 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 409 + "'", int3 == 409);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 409 + "'", int4 == 409);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 409 + "'", int8 == 409);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 1L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder8.clientPort((int) (byte) -1);
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
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer7 = builder0.build();
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 194, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        java.io.File file13 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.dataDir(file13);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.tickTime((java.lang.Long) 10L);
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
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 154, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray5, runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
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
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder6.build();
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
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
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
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer15 = builder14.build();
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
    }/*@Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 94, file1, (java.lang.Long) 10L);
// //             org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }*/

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort(56);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        java.lang.Class<?> wildcardClass4 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(185);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }/*@Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
        org.apache.zookeeper.ZooKeeper zooKeeper9 = robustZooKeeper1.getClient();
        int int10 = robustZooKeeper1.getInstanceNumber();
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
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 423 + "'", int6 == 423);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 423 + "'", int8 == 423);
        org.junit.Assert.assertNotNull(zooKeeper9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 423 + "'", int10 == 423);
    }*/

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.clientPort(2);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.clientPort(167);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
            robustZooKeeper1.withLock("", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 424 + "'", int2 == 424);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 424 + "'", int3 == 424);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 424 + "'", int5 == 424);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 424 + "'", int8 == 424);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getInstanceNumber();
        byte[] byteArray7 = new byte[] {};
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray7, runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 425 + "'", int5 == 425);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray5 = new byte[] {};
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray5, runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        java.lang.Class<?> wildcardClass7 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 427 + "'", int3 == 427);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 427 + "'", int4 == 427);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 10L);
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
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", byteArray12, runnable13);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 428 + "'", int2 == 428);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 428 + "'", int3 == 428);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0, 10, -1]");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        java.lang.Class<?> wildcardClass3 = zooKeeper2.getClass();
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray15, runnable16);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 430 + "'", int6 == 430);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, -1, 100, 0, 1]");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable8);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 432 + "'", int4 == 432);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 432 + "'", int5 == 432);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 432 + "'", int6 == 432);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 434 + "'", int2 == 434);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 434 + "'", int3 == 434);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.tickTime((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder8.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.sync();
        int int7 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        java.lang.Class<?> wildcardClass10 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 438 + "'", int5 == 438);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        byte[] byteArray10 = new byte[] { (byte) 100 };
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray10, runnable11);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(151);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort(109);
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = null; // flaky: builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
// flaky:         org.junit.Assert.assertNotNull(embeddedZookeeperServer9);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.clientPort((int) (byte) 100);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(222);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.clientPort(56);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.clientPort(427);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder10.tickTime((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.clientPort((int) (byte) 10);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder6.tickTime((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 441 + "'", int5 == 441);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.dataDir(file15);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder12.clientPort(311);
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
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 442 + "'", int2 == 442);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 442 + "'", int3 == 442);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.clientPort(0);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = builder2.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("");
        int int2 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int5 = robustZooKeeper1.getReconnectionCount();
        int int6 = robustZooKeeper1.getReconnectionCount();
        int int7 = robustZooKeeper1.getReconnectionCount();
        int int8 = robustZooKeeper1.getInstanceNumber();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 446 + "'", int2 == 446);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 446 + "'", int3 == 446);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 446 + "'", int8 == 446);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.clientPort((int) (byte) -1);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.dataDir(file5);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer9 = builder6.build();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 233, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", byteArray8, runnable9);
// //             org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: lock-: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10, 0]");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 368, file1, (java.lang.Long) 0L);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 451 + "'", int4 == 451);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 451 + "'", int5 == 451);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 451 + "'", int6 == 451);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 451 + "'", int7 == 451);
    }/*@Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        int int5 = robustZooKeeper1.getReconnectionCount();
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
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }*/

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 454 + "'", int2 == 454);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 454 + "'", int3 == 454);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 454 + "'", int6 == 454);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 451, file1, (java.lang.Long) 100L);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int6 = robustZooKeeper1.getInstanceNumber();
        int int7 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper8 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 456 + "'", int2 == 456);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 456 + "'", int3 == 456);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 456 + "'", int6 == 456);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 456 + "'", int7 == 456);
    }/*@Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("hi!", runnable6);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_hi!");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }*/

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getReconnectionCount();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getReconnectionCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 458 + "'", int4 == 458);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        int int2 = robustZooKeeper1.getInstanceNumber();
        int int3 = robustZooKeeper1.getInstanceNumber();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Class<?> wildcardClass5 = robustZooKeeper1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 459 + "'", int2 == 459);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 459 + "'", int3 == 459);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        org.apache.zookeeper.ZooKeeper zooKeeper5 = robustZooKeeper1.getClient();
        robustZooKeeper1.shutdown();
        java.lang.Class<?> wildcardClass7 = robustZooKeeper1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(zooKeeper5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder14.tickTime((java.lang.Long) 10L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder14.tickTime((java.lang.Long) 0L);
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder0.tickTime((java.lang.Long) 100L);
        java.io.File file5 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder0.dataDir(file5);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder0.dataDir(file7);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder0.dataDir(file9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (byte) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder6.tickTime((java.lang.Long) 0L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder6.clientPort(372);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.shutdown();
        int int4 = robustZooKeeper1.getReconnectionCount();
        int int5 = robustZooKeeper1.getReconnectionCount();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", byteArray13, runnable14);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, 1, 1, 0, 100]");
    }/*@Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("", runnable7);
// //             org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.KeeperException.ConnectionLossException; message: KeeperErrorCode = ConnectionLoss for /_greplin_robustZK_");
        } catch (org.apache.zookeeper.KeeperException.ConnectionLossException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }*/

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = null; // flaky: new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 266, file1, (java.lang.Long) 1L);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder4.clientPort((int) (short) 1);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder4.tickTime((java.lang.Long) 100L);
        java.io.File file9 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.dataDir(file9);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder12 = builder10.tickTime((java.lang.Long) 100L);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder14 = builder12.clientPort(349);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.clientPort(315);
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
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder12.clientPort(305);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder18 = builder12.clientPort(71);
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder0 = new com.greplin.zookeeper.EmbeddedZookeeperServer.Builder();
        java.io.File file1 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder2 = builder0.dataDir(file1);
        java.io.File file3 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder4 = builder2.dataDir(file3);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder6 = builder2.clientPort(151);
        java.io.File file7 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder8 = builder2.dataDir(file7);
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder10 = builder8.tickTime((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }/*@Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        org.apache.zookeeper.ZooKeeper zooKeeper3 = robustZooKeeper1.getClient();
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
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertNotNull(zooKeeper3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 464 + "'", int4 == 464);
        org.junit.Assert.assertNotNull(zooKeeper5);
    }*/

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("lock-");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getInstanceNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.ZooKeeper zooKeeper4 = robustZooKeeper1.getClient();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 466 + "'", int3 == 466);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.zookeeper.EmbeddedZookeeperServer embeddedZookeeperServer3 = new com.greplin.zookeeper.EmbeddedZookeeperServer((java.lang.Integer) 443, file1, (java.lang.Long) (-1L));
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        int int2 = robustZooKeeper1.getReconnectionCount();
        robustZooKeeper1.sync();
        robustZooKeeper1.sync();
        robustZooKeeper1.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.sync();
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("/_greplin_robustZK_");
        org.apache.zookeeper.ZooKeeper zooKeeper2 = robustZooKeeper1.getClient();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getReconnectionCount();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable6);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zooKeeper2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        int int3 = robustZooKeeper1.getReconnectionCount();
        int int4 = robustZooKeeper1.getInstanceNumber();
        int int5 = robustZooKeeper1.getInstanceNumber();
        int int6 = robustZooKeeper1.getInstanceNumber();
        robustZooKeeper1.shutdown();
        int int8 = robustZooKeeper1.getInstanceNumber();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("/_greplin_robustZK_", runnable10);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 469 + "'", int4 == 469);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 469 + "'", int5 == 469);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 469 + "'", int6 == 469);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 469 + "'", int8 == 469);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        java.io.File file15 = null;
        com.greplin.zookeeper.EmbeddedZookeeperServer.Builder builder16 = builder8.dataDir(file15);
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
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.greplin.zookeeper.RobustZooKeeper robustZooKeeper1 = new com.greplin.zookeeper.RobustZooKeeper("hi!");
        robustZooKeeper1.shutdown();
        robustZooKeeper1.shutdown();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            robustZooKeeper1.withLock("lock-", runnable5);
// //             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }
}
