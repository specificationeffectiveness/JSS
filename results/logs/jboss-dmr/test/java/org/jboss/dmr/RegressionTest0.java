package org.jboss.dmr;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.LIST_START;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.LIST_START + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.LIST_START));
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.UNDEFINED;
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.UNDEFINED + "'", modelType0.equals(org.jboss.dmr.ModelType.UNDEFINED));
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue1.writeExternal(dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        java.io.OutputStream outputStream2 = null;
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream(outputStream2);
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeBase64((java.io.OutputStream) outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet2 = bigIntegerModelValue1.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.io.DataInput dataInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.readExternal(dataInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = bigIntegerModelValue1.removeChild((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        org.jboss.dmr.ValueExpression valueExpression7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode4.add("hi!", valueExpression7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = listModelValue5.requireChild((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [-1]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        boolean boolean5 = modelNode3.hasDefined("");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode3.add(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode2 = bigIntegerModelValue1.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter6, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = modelNode3.asLong(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.jboss.dmr.Base64.decode(byteArray5, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 0, 10, 1]");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        java.io.OutputStream outputStream3 = null;
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream(outputStream3);
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeBase64(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet1 = modelNode0.keys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.format(printWriter6, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = listModelValue5.insertChild((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromJSONStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        boolean boolean5 = modelNode3.hasDefined("");
        // The following exception was thrown during execution in test generation
        try {
            long long6 = modelNode3.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType2 = modelNode1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode3.require((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [100]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue1.format(printWriter2, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode0.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = modelNode1.asLong(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = listModelValue5.removeChild(100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [100]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = listModelValue5.insertChild((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ValueExpression valueExpression7 = listModelValue5.asExpression();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue1.writeExternal(dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = listModelValue5.removeChild("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asListOrEmpty();
        org.jboss.dmr.ModelType modelType5 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode(modelType5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode3.addNoCopy(modelNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + modelType5 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType5.equals(org.jboss.dmr.ModelType.INT));
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        java.math.BigDecimal bigDecimal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode1.set("hi!", bigDecimal4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            outputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = listModelValue5.asDouble((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        long long7 = listModelValue5.asLong();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property8 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter6, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        boolean boolean5 = modelNode3.hasDefined("");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode3.add(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        boolean boolean5 = modelNode3.hasDefined("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double6 = modelNode3.asDoubleOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        java.math.BigDecimal bigDecimal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.set(bigDecimal3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = listModelValue5.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        org.jboss.dmr.stream.ModelWriter modelWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.write(modelWriter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        org.jboss.dmr.Validation.validate(modelNode0, "[(\"hi!\" => 0.0)]");
        java.math.BigDecimal bigDecimal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode0.add("hi!", bigDecimal7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        boolean boolean5 = modelNode3.hasDefined("");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode3.add((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.PropertyModelValue propertyModelValue1 = new org.jboss.dmr.PropertyModelValue(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str0 = org.jboss.dmr.ExpressionValue.TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EXPRESSION_VALUE" + "'", str0, "EXPRESSION_VALUE");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode2 = expressionValue1.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.add("EXPRESSION_VALUE", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.setExpression("hi!", "(\"hi!\" => 0.0)");
        java.util.Set<java.lang.String> strSet8 = modelNode7.keys();
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNode7.add("EXPRESSION_VALUE", bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = modelNode0.asBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = listModelValue5.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        java.math.BigDecimal bigDecimal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.add(bigDecimal3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        java.io.DataOutputStream dataOutputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeExternal(dataOutputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int0 = org.jboss.dmr.Base64.DECODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.Object obj1 = org.jboss.dmr.Base64.decodeToObject("");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        long long7 = listModelValue5.asLong();
        java.io.DataOutput dataOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.writeExternal(dataOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = listModelValue5.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = listModelValue5.requireChild("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'hi!' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property7 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jboss.dmr.Base64.encodeBytes(byteArray0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.format(printWriter2, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.writeExternal(dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        boolean boolean2 = org.jboss.dmr.Base64.decodeToFile("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeString(printWriter6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter11, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver0 = new org.jboss.dmr.ValueExpressionResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = valueExpressionResolver0.resolvePart("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key can't be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String str0 = org.jboss.dmr.TypeModelValue.TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TYPE_MODEL_VALUE" + "'", str0, "TYPE_MODEL_VALUE");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter8, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode6.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.Throwable throwable1 = null;
        org.jboss.dmr.stream.ModelException modelException2 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable1);
        java.lang.String str3 = modelException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str3, "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode9 = modelNode6.set("hi!", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNode5.insert(modelNode6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = listModelValue5.removeChild("(\"hi!\" => 0.0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        java.lang.String str3 = modelNode0.asStringOrNull();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger7 = booleanModelValue6.asBigInteger();
        byte[] byteArray8 = booleanModelValue6.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode0.set("", byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertNotNull(booleanModelValue6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.PROPERTY_START;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.PROPERTY_START + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.PROPERTY_START));
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver4 = new org.jboss.dmr.ValueExpressionResolver();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = valueExpression3.resolveBoolean(valueExpressionResolver4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("[(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file [(\"hi!\" => 0.0)]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.BYTES;
        char char1 = modelType0.getTypeChar();
        java.lang.Class<?> wildcardClass2 = modelType0.getClass();
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.BYTES + "'", modelType0.equals(org.jboss.dmr.ModelType.BYTES));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'b' + "'", char1 == 'b');
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = valueExpression3.resolveBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode5.add("EXPRESSION_VALUE", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.setExpression("hi!", "(\"hi!\" => 0.0)");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode3.require((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [0]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int0 = org.jboss.dmr.Base64.ENCODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asListOrEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = modelNode3.asBigIntegerOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.setExpression("hi!", "(\"hi!\" => 0.0)");
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNode3.add("[(\"hi!\" => 0.0)]", modelNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.setExpression("hi!", "hi!");
        java.lang.String str6 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode2);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode2.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode8 = modelNode0.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet9 = modelNode8.keys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str6, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList7);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        boolean boolean11 = modelNode8.equals((java.lang.Object) 100L);
        boolean boolean12 = modelNode0.equals(modelNode8);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode17 = modelNode14.set("hi!", 0.0d);
        org.jboss.dmr.Property property18 = new org.jboss.dmr.Property("", modelNode17);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode19 = modelNode0.add(property18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelNode17);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asListOrEmpty();
        java.lang.String[] strArray7 = new java.lang.String[] { "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" };
        boolean boolean8 = modelNode3.hasDefined(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = modelNode3.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.BYTES;
        java.lang.Class<?> wildcardClass1 = modelEvent0.getClass();
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.BYTES + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.BYTES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode0.set(property11);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long15 = modelNode14.asLong();
        org.jboss.dmr.ValueExpression valueExpression16 = modelNode14.asExpression();
        java.math.BigDecimal bigDecimal17 = valueExpression16.resolveBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = modelNode12.add(valueExpression16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(valueExpression16);
        org.junit.Assert.assertNotNull(bigDecimal17);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.STRING;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.STRING + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.STRING));
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property10 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType1 = org.jboss.dmr.ModelType.forChar('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid type character '#'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        int int3 = modelNode0.asInt(10);
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.formatAsJSON(printWriter4, (int) 'p', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeJSONString(printWriter2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = org.jboss.dmr.Base64.GZIP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList3 = modelNode1.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.Property> propertyList2 = booleanModelValue1.asPropertyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode0.add("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelType modelType5 = modelNode3.getType();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode13 = modelNode10.get(strArray12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode17 = modelNode14.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList18 = modelNode17.asList();
        org.jboss.dmr.ListModelValue listModelValue19 = new org.jboss.dmr.ListModelValue(modelNodeList18);
        org.jboss.dmr.ModelNode modelNode20 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue19);
        org.jboss.dmr.ModelValue modelValue21 = listModelValue19.resolve();
        int int23 = listModelValue19.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList24 = listModelValue19.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList25 = modelNode13.asPropertyList(propertyList24);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode26 = modelNode3.addNoCopy(modelNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + modelType5 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType5.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(modelNodeList18);
        org.junit.Assert.assertNotNull(modelValue21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(propertyList24);
        org.junit.Assert.assertNotNull(propertyList25);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.BytesModelValue bytesModelValue1 = new org.jboss.dmr.BytesModelValue(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList18 = listModelValue13.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList19 = modelNode7.asPropertyList(propertyList18);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.get(strArray26);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList32 = modelNode31.asList();
        org.jboss.dmr.ListModelValue listModelValue33 = new org.jboss.dmr.ListModelValue(modelNodeList32);
        org.jboss.dmr.ModelNode modelNode34 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue33);
        org.jboss.dmr.ModelValue modelValue35 = listModelValue33.resolve();
        int int37 = listModelValue33.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList38 = listModelValue33.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList39 = modelNode27.asPropertyList(propertyList38);
        modelNode7.setNoCopy(modelNode27);
        org.jboss.dmr.ModelNode modelNode42 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long43 = modelNode42.asLong();
        org.jboss.dmr.ValueExpression valueExpression44 = modelNode42.asExpression();
        java.math.BigDecimal bigDecimal45 = valueExpression44.resolveBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode46 = modelNode27.add(bigDecimal45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(propertyList18);
        org.junit.Assert.assertNotNull(propertyList19);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNodeList32);
        org.junit.Assert.assertNotNull(modelValue35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(propertyList38);
        org.junit.Assert.assertNotNull(propertyList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(valueExpression44);
        org.junit.Assert.assertNotNull(bigDecimal45);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asListOrEmpty();
        java.lang.String[] strArray7 = new java.lang.String[] { "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" };
        boolean boolean8 = modelNode3.hasDefined(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = modelNode3.asBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        org.jboss.dmr.stream.ModelWriter modelWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue1.write(modelWriter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        boolean boolean3 = modelNode1.hasDefined("[(\"hi!\" => 0.0)]");
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeJSONString(printWriter4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode0.set(property11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = modelNode0.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList18 = listModelValue13.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList19 = modelNode7.asPropertyList(propertyList18);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.get(strArray26);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList32 = modelNode31.asList();
        org.jboss.dmr.ListModelValue listModelValue33 = new org.jboss.dmr.ListModelValue(modelNodeList32);
        org.jboss.dmr.ModelNode modelNode34 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue33);
        org.jboss.dmr.ModelValue modelValue35 = listModelValue33.resolve();
        int int37 = listModelValue33.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList38 = listModelValue33.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList39 = modelNode27.asPropertyList(propertyList38);
        modelNode7.setNoCopy(modelNode27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double41 = modelNode7.asDoubleOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(propertyList18);
        org.junit.Assert.assertNotNull(propertyList19);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNodeList32);
        org.junit.Assert.assertNotNull(modelValue35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(propertyList38);
        org.junit.Assert.assertNotNull(propertyList39);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        java.math.BigInteger bigInteger2 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue3 = new org.jboss.dmr.BigIntegerModelValue(bigInteger2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = bigIntegerModelValue1.equals(bigIntegerModelValue3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = modelNode7.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.io.DataInput dataInput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.readExternal(dataInput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeString(printWriter5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bigIntegerModelValue1.asDouble((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long6 = modelNode5.asLong();
        org.jboss.dmr.ValueExpression valueExpression7 = modelNode5.asExpression();
        java.math.BigDecimal bigDecimal8 = valueExpression7.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode(bigDecimal8);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = modelNode0.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", bigDecimal8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(valueExpression7);
        org.junit.Assert.assertNotNull(bigDecimal8);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        java.io.DataOutput dataOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.writeExternal(dataOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        int int0 = org.jboss.dmr.Base64.DONT_BREAK_LINES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = modelNode7.asBooleanOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList11 = listModelValue5.asPropertyList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = listModelValue5.insertChild(8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(propertyList11);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean3 = doubleModelValue1.asBoolean();
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = modelNode0.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        boolean boolean5 = valueExpression3.equals((java.lang.Object) 'p');
        java.io.ObjectOutput objectOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression3.writeExternal(objectOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode0.require((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [10]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.jboss.dmr.ModelValue modelValue0 = org.jboss.dmr.ModelValue.UNDEFINED;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = modelValue0.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelValue0);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        outputStream1.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream1);
        org.jboss.dmr.Base64.OutputStream outputStream5 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3, (int) (byte) -1);
        org.jboss.dmr.Base64.OutputStream outputStream6 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream5);
        org.jboss.dmr.LongModelValue longModelValue8 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str9 = longModelValue8.asString();
        byte[] byteArray10 = longModelValue8.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue11 = new org.jboss.dmr.BytesModelValue(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            outputStream5.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver8 = new org.jboss.dmr.ValueExpressionResolver();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = valueExpression5.resolveLong(valueExpressionResolver8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.io.PrintWriter printWriter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelValue.indent(printWriter0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ValueExpression valueExpression11 = listModelValue5.asExpression();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode(bigDecimal4);
        java.lang.Class<?> wildcardClass6 = bigDecimal4.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Long long1 = modelNode0.asLongOrNull();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = modelNode0.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = bigIntegerModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            inputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.String str1 = org.jboss.dmr.ModelValue.quote("(\"hi!\" => 0.0)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"(\\\"hi!\\\" => 0.0)\"" + "'", str1, "\"(\\\"hi!\\\" => 0.0)\"");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.writeExternal(dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        org.jboss.dmr.stream.ModelWriter modelWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.write(modelWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = expressionValue8.asLong((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode4.writeString(printWriter6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = modelNode3.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = modelNode6.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==", modelNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file true");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType5 = modelNode0.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = modelNode3.asBytesOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.format(printWriter11, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = expressionValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode0.set(property11);
        java.lang.String str13 = modelNode12.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = modelNode12.add("TYPE_MODEL_VALUE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str13, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode2 = objectModelValue0.requireChild("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'H4sIAAAAAAAAAAMAAAAAAAAAAAA=' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = stringModelValue1.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.OBJECT_END;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.OBJECT_END + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.OBJECT_END));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.writeExternal(dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = expressionValue1.removeChild(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = stringModelValue1.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.jboss.dmr.Base64.encodeBytes(byteArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.jboss.dmr.Base64.decode(byteArray0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H4sIAAAAAAAAAAMAAAAAAAAAAAA=" + "'", str2, "H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        boolean boolean2 = objectModelValue0.asBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.requireChild("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromString("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected character 'r' while reading DMR stream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decode("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 3: 46(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("TYPE_MODEL_VALUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TYPE_MODEL_VALUE" + "'", str1, "TYPE_MODEL_VALUE");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = modelNode3.asInt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.get(strArray10);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode15 = modelNode12.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList16 = modelNode15.asList();
        org.jboss.dmr.ListModelValue listModelValue17 = new org.jboss.dmr.ListModelValue(modelNodeList16);
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue17);
        org.jboss.dmr.ModelValue modelValue19 = listModelValue17.resolve();
        int int21 = listModelValue17.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList22 = listModelValue17.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList23 = modelNode11.asPropertyList(propertyList22);
        org.jboss.dmr.ModelNode modelNode25 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode28 = modelNode25.set("hi!", 0.0d);
        org.jboss.dmr.Property property29 = new org.jboss.dmr.Property("", modelNode28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.get(strArray30);
        org.jboss.dmr.ModelNode modelNode32 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode35 = modelNode32.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList36 = modelNode35.asList();
        org.jboss.dmr.ListModelValue listModelValue37 = new org.jboss.dmr.ListModelValue(modelNodeList36);
        org.jboss.dmr.ModelNode modelNode38 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue37);
        org.jboss.dmr.ModelValue modelValue39 = listModelValue37.resolve();
        int int41 = listModelValue37.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList42 = listModelValue37.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList43 = modelNode31.asPropertyList(propertyList42);
        modelNode11.setNoCopy(modelNode31);
        org.jboss.dmr.ModelNode modelNode45 = modelNode1.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode11);
        org.jboss.dmr.ModelNode modelNode48 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long49 = modelNode48.asLong();
        org.jboss.dmr.ValueExpression valueExpression50 = modelNode48.asExpression();
        java.math.BigDecimal bigDecimal51 = valueExpression50.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode52 = new org.jboss.dmr.ModelNode(bigDecimal51);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode53 = modelNode11.add("hi!", bigDecimal51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNodeList16);
        org.junit.Assert.assertNotNull(modelValue19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(propertyList22);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertNotNull(modelNodeList36);
        org.junit.Assert.assertNotNull(modelValue39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(propertyList42);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(modelNode45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(valueExpression50);
        org.junit.Assert.assertNotNull(bigDecimal51);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger2 = booleanModelValue1.asBigInteger();
        byte[] byteArray3 = booleanModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.jboss.dmr.Base64.encodeBytes(byteArray3, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.writeExternal(dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = bigIntegerModelValue1.asInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.DOUBLE;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.DOUBLE + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.DOUBLE));
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = org.jboss.dmr.ModelNode.fromBase64((java.io.InputStream) inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = listModelValue5.asBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        double double5 = bytesModelValue4.asDouble();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatAsJSON(printWriter6, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelType modelType11 = org.jboss.dmr.ModelType.BYTES;
        char char12 = modelType11.getTypeChar();
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelType11);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = modelNode13.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + modelType11 + "' != '" + org.jboss.dmr.ModelType.BYTES + "'", modelType11.equals(org.jboss.dmr.ModelType.BYTES));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'b' + "'", char12 == 'b');
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromBase64String("EXPRESSION_VALUE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 10: 95(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        org.jboss.dmr.stream.ModelWriter modelWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.write(modelWriter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.formatAsJSON(printWriter2, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.ModelNode modelNode4 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue7 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger8 = booleanModelValue7.asBigInteger();
        byte[] byteArray9 = booleanModelValue7.asBytes();
        org.jboss.dmr.ModelNode modelNode10 = modelNode4.set("expression \"hi!\"", byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = inputStream2.read(byteArray9, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(modelNode10);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.Throwable throwable1 = null;
        org.jboss.dmr.stream.ModelException modelException2 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable1);
        org.jboss.dmr.stream.ModelException modelException3 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        java.lang.String str4 = modelException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str4, "org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode6.asList();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode6.format(printWriter8, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNodeList7);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression2 = expressionValue1.asExpression();
        java.io.ObjectOutput objectOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression2.writeExternal(objectOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode1.require((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [10]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNode1.add("\"(\\\"hi!\\\" => 0.0)\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long2 = longModelValue1.asLong();
        byte[] byteArray3 = longModelValue1.asBytes();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.format(printWriter4, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = modelNode13.require("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        java.io.OutputStream outputStream3 = null;
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream(outputStream3);
        outputStream4.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream6 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream4);
        org.jboss.dmr.Base64.OutputStream outputStream7 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream6);
        org.jboss.dmr.BooleanModelValue booleanModelValue9 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger10 = booleanModelValue9.asBigInteger();
        byte[] byteArray11 = booleanModelValue9.asBytes();
        outputStream6.write(byteArray11, (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = modelNode0.add(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue9.writeExternal(dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double2 = modelNode1.asDoubleOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"EXPRESSION_VALUE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.BIG_DECIMAL;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.BIG_DECIMAL + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.BIG_DECIMAL));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.format(printWriter4, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.BooleanModelValue booleanModelValue8 = org.jboss.dmr.BooleanModelValue.valueOf(false);
        long long10 = booleanModelValue8.asLong((long) '#');
        byte[] byteArray11 = booleanModelValue8.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = modelNode0.add("", byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(booleanModelValue8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.ZERO_LONG;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode0.add("expression \"hi!\"", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = listModelValue5.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        boolean boolean9 = listModelValue5.asBoolean();
        boolean boolean11 = listModelValue5.asBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = listModelValue5.insertChild((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decode("[(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 0: 91(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList10 = propertyModelValue9.asList();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = propertyModelValue9.asDouble((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNodeList10);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        org.jboss.dmr.BooleanModelValue booleanModelValue9 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long10 = booleanModelValue9.asLong();
        org.jboss.dmr.ValueExpression valueExpression11 = booleanModelValue9.asExpression();
        boolean boolean13 = valueExpression11.equals((java.lang.Object) 'p');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode14 = modelNode1.add(valueExpression11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(valueExpression11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList2 = modelNode1.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode14 = modelNode12.set((int) '#');
        org.jboss.dmr.ModelNode modelNode15 = modelNode1.setNoCopy("1.0", modelNode12);
        java.io.DataInput dataInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode15.readExternal(dataInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        int int5 = longModelValue1.asInt(0);
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.writeExternal(dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bigIntegerModelValue1.asLong((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        boolean boolean5 = valueExpression3.equals((java.lang.Object) 'p');
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver6 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str8 = valueExpressionResolver6.resolvePart("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = valueExpression3.resolveInt(valueExpressionResolver6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long3 = intModelValue1.asLong((long) 'b');
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.String str0 = org.jboss.dmr.PropertyModelValue.TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PROPERTY_VALUE" + "'", str0, "PROPERTY_VALUE");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode4.require("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode14 = modelNode13.addEmptyObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        boolean boolean9 = listModelValue5.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList10 = listModelValue5.asList();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter11, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(modelNodeList10);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet7 = listModelValue5.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asListOrEmpty();
        java.lang.String[] strArray7 = new java.lang.String[] { "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" };
        boolean boolean8 = modelNode3.hasDefined(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = modelNode3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ExpressionValue expressionValue12 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str13 = expressionValue12.asString();
        boolean boolean14 = expressionValue1.equals(expressionValue12);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.writeExternal(dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue1 = new org.jboss.dmr.BigDecimalModelValue(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = listModelValue5.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(modelNodeList11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set((double) 0);
        java.io.OutputStream outputStream8 = null;
        org.jboss.dmr.Base64.OutputStream outputStream9 = new org.jboss.dmr.Base64.OutputStream(outputStream8);
        outputStream9.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream11 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream9);
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.writeExternal((java.io.OutputStream) outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue10.writeExternal(dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.BOOLEAN;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.BOOLEAN + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.BOOLEAN));
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = modelNode1.add(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        java.io.DataOutput dataOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean3 = doubleModelValue1.asBoolean();
        byte[] byteArray4 = doubleModelValue1.asBytes();
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelValue modelValue2 = objectModelValue0.protect();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property3 = modelValue2.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelValue2);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ModelValue modelValue11 = expressionValue1.resolve();
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.writeExternal(dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(modelValue11);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.Property property12 = new org.jboss.dmr.Property("", modelNode11);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.set(property12);
        org.jboss.dmr.PropertyModelValue propertyModelValue15 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode13, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode17 = propertyModelValue15.getChild("PROPERTY_VALUE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.OBJECT_START;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.OBJECT_START + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.OBJECT_START));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        boolean boolean7 = modelNode4.equals((java.lang.Object) 100L);
        boolean boolean9 = modelNode4.has((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.jboss.dmr.Base64.OutputStream outputStream11 = new org.jboss.dmr.Base64.OutputStream(outputStream10);
        outputStream11.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream13 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream11);
        org.jboss.dmr.Base64.OutputStream outputStream15 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            modelNode4.writeBase64((java.io.OutputStream) outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.IntModelValue intModelValue4 = new org.jboss.dmr.IntModelValue((int) ' ');
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList9 = modelNode8.asList();
        org.jboss.dmr.ListModelValue listModelValue10 = new org.jboss.dmr.ListModelValue(modelNodeList9);
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue10);
        org.jboss.dmr.ModelValue modelValue12 = listModelValue10.resolve();
        int int14 = listModelValue10.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList15 = listModelValue10.asPropertyList();
        boolean boolean16 = intModelValue4.equals((java.lang.Object) listModelValue10);
        java.math.BigDecimal bigDecimal17 = intModelValue4.asBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = modelNode1.add("10", bigDecimal17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNodeList9);
        org.junit.Assert.assertNotNull(modelValue12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(propertyList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bigDecimal17);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue12 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger13 = booleanModelValue12.asBigInteger();
        org.jboss.dmr.ModelNode modelNode14 = modelNode10.add(bigInteger13);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = modelNode1.add(bigInteger13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(booleanModelValue12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(modelNode14);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("\"(\\\"hi!\\\" => 0.0)\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file \"(\\\"hi!\\\" => 0.0)\"");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList18 = listModelValue13.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList19 = modelNode7.asPropertyList(propertyList18);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.get(strArray26);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList32 = modelNode31.asList();
        org.jboss.dmr.ListModelValue listModelValue33 = new org.jboss.dmr.ListModelValue(modelNodeList32);
        org.jboss.dmr.ModelNode modelNode34 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue33);
        org.jboss.dmr.ModelValue modelValue35 = listModelValue33.resolve();
        int int37 = listModelValue33.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList38 = listModelValue33.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList39 = modelNode27.asPropertyList(propertyList38);
        modelNode7.setNoCopy(modelNode27);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode43 = modelNode27.add("32", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(propertyList18);
        org.junit.Assert.assertNotNull(propertyList19);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNodeList32);
        org.junit.Assert.assertNotNull(modelValue35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(propertyList38);
        org.junit.Assert.assertNotNull(propertyList39);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jboss.dmr.Base64.decodeToObject("[(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 0: 91(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        long long8 = bytesModelValue4.asLong((long) (short) 1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.writeExternal(dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = inputStream2.markSupported();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.insert((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = inputStream2.read(byteArray6, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set((double) 0);
        org.jboss.dmr.BooleanModelValue booleanModelValue9 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger10 = booleanModelValue9.asBigInteger();
        byte[] byteArray11 = booleanModelValue9.asBytes();
        boolean boolean13 = org.jboss.dmr.Base64.encodeToFile(byteArray11, "1L");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode14 = modelNode7.add(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.stream.ModelWriter modelWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.write(modelWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode(bigDecimal4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode5.asListOrEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        java.lang.String str2 = doubleModelValue1.asString();
        long long4 = doubleModelValue1.asLong((long) (short) -1);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.stream.ModelWriter modelWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.write(modelWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue1.format(printWriter2, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = valueExpression3.resolveLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long7 = booleanModelValue6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = booleanModelValue6.asExpression();
        boolean boolean10 = valueExpression8.equals((java.lang.Object) 'p');
        boolean boolean11 = valueExpression3.equals(valueExpression8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = valueExpression3.resolveBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(booleanModelValue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.io.ObjectOutput objectOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression3.writeExternal(objectOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        org.jboss.dmr.LongModelValue longModelValue16 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str17 = longModelValue16.asString();
        byte[] byteArray18 = longModelValue16.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue19 = new org.jboss.dmr.BytesModelValue(byteArray18);
        boolean boolean20 = bytesModelValue12.equals(bytesModelValue19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList21 = bytesModelValue19.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue11 = new org.jboss.dmr.PropertyModelValue(property7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = propertyModelValue11.getChild("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = stringModelValue1.asBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = bigIntegerModelValue1.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue3.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("PROPERTY_VALUE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file PROPERTY_VALUE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList10 = propertyModelValue9.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = propertyModelValue9.getChild("(\"\" => (\"hi!\" => 0.0))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNodeList10);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode4.add(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = modelNode7.asBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long4 = inputStream2.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = org.jboss.dmr.ModelNode.fromBase64(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean4 = doubleModelValue1.asBoolean(true);
        int int6 = doubleModelValue1.asInt(2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.Property> propertyList7 = doubleModelValue1.asPropertyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        boolean boolean9 = listModelValue5.asBoolean();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            long long3 = stringModelValue1.asLong((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        boolean boolean5 = objectModelValue0.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = objectModelValue0.requireChild("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'H4sIAAAAAAAAAAMAAAAAAAAAAAA=' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = stringModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver7 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str9 = valueExpressionResolver7.resolvePart("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = valueExpression3.resolveBoolean(valueExpressionResolver7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = modelNode1.asInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue9.writeString(printWriter10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = inputStream2.markSupported();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = propertyModelValue9.getChild(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str2 = expressionValue1.asString();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.formatAsJSON(printWriter3, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        int int3 = longModelValue1.asInt((int) (byte) 0);
        org.jboss.dmr.LongModelValue longModelValue5 = new org.jboss.dmr.LongModelValue((-1L));
        long long7 = longModelValue5.asLong((long) (byte) -1);
        double double9 = longModelValue5.asDouble((double) 10.0f);
        boolean boolean10 = longModelValue1.equals(longModelValue5);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue5.writeExternal(dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode3.insert((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode4.add((double) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        boolean boolean9 = listModelValue5.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList10 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = listModelValue5.getChild((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(modelNodeList10);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.setExpression("hi!", "(\"hi!\" => 0.0)");
        java.util.Set<java.lang.String> strSet8 = modelNode7.keys();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = modelNode7.asDouble((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.get(strArray10);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode15 = modelNode12.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList16 = modelNode15.asList();
        org.jboss.dmr.ListModelValue listModelValue17 = new org.jboss.dmr.ListModelValue(modelNodeList16);
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue17);
        org.jboss.dmr.ModelValue modelValue19 = listModelValue17.resolve();
        int int21 = listModelValue17.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList22 = listModelValue17.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList23 = modelNode11.asPropertyList(propertyList22);
        org.jboss.dmr.ModelNode modelNode25 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode28 = modelNode25.set("hi!", 0.0d);
        org.jboss.dmr.Property property29 = new org.jboss.dmr.Property("", modelNode28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.get(strArray30);
        org.jboss.dmr.ModelNode modelNode32 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode35 = modelNode32.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList36 = modelNode35.asList();
        org.jboss.dmr.ListModelValue listModelValue37 = new org.jboss.dmr.ListModelValue(modelNodeList36);
        org.jboss.dmr.ModelNode modelNode38 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue37);
        org.jboss.dmr.ModelValue modelValue39 = listModelValue37.resolve();
        int int41 = listModelValue37.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList42 = listModelValue37.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList43 = modelNode31.asPropertyList(propertyList42);
        modelNode11.setNoCopy(modelNode31);
        org.jboss.dmr.ModelNode modelNode45 = modelNode1.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode11);
        org.jboss.dmr.ModelNode modelNode47 = modelNode11.set(false);
        java.io.InputStream inputStream48 = null;
        org.jboss.dmr.Base64.InputStream inputStream50 = new org.jboss.dmr.Base64.InputStream(inputStream48, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream51 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream50);
        // The following exception was thrown during execution in test generation
        try {
            modelNode11.readExternal((java.io.InputStream) inputStream51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNodeList16);
        org.junit.Assert.assertNotNull(modelValue19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(propertyList22);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertNotNull(modelNodeList36);
        org.junit.Assert.assertNotNull(modelValue39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(propertyList42);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(modelNode45);
        org.junit.Assert.assertNotNull(modelNode47);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeExternal(dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ValueExpression valueExpression11 = expressionValue8.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver12 = new org.jboss.dmr.ValueExpressionResolver();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = valueExpression11.resolveLong(valueExpressionResolver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(valueExpression11);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        org.jboss.dmr.ModelType modelType13 = org.jboss.dmr.ModelType.BYTES;
        org.jboss.dmr.ModelNode modelNode14 = modelNode1.set("[(\"hi!\" => 0.0)]", modelType13);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = modelNode1.asLong((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + modelType13 + "' != '" + org.jboss.dmr.ModelType.BYTES + "'", modelType13.equals(org.jboss.dmr.ModelType.BYTES));
        org.junit.Assert.assertNotNull(modelNode14);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = listModelValue5.asDouble((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        boolean boolean11 = modelNode8.equals((java.lang.Object) 100L);
        boolean boolean12 = modelNode0.equals(modelNode8);
        java.io.DataInput dataInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode8.readExternal(dataInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("TYPE_MODEL_VALUE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file TYPE_MODEL_VALUE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        org.jboss.dmr.stream.ModelWriter modelWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.write(modelWriter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        int int5 = longModelValue1.asInt(0);
        org.jboss.dmr.stream.ModelWriter modelWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.write(modelWriter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode14 = modelNode12.set((int) '#');
        org.jboss.dmr.ModelNode modelNode15 = modelNode1.setNoCopy("1.0", modelNode12);
        java.io.DataInput dataInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.readExternal(dataInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = listModelValue5.getChild(10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertNotNull(modelNodeList7);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.get(strArray10);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode15 = modelNode12.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList16 = modelNode15.asList();
        org.jboss.dmr.ListModelValue listModelValue17 = new org.jboss.dmr.ListModelValue(modelNodeList16);
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue17);
        org.jboss.dmr.ModelValue modelValue19 = listModelValue17.resolve();
        int int21 = listModelValue17.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList22 = listModelValue17.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList23 = modelNode11.asPropertyList(propertyList22);
        org.jboss.dmr.ModelNode modelNode25 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode28 = modelNode25.set("hi!", 0.0d);
        org.jboss.dmr.Property property29 = new org.jboss.dmr.Property("", modelNode28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.get(strArray30);
        org.jboss.dmr.ModelNode modelNode32 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode35 = modelNode32.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList36 = modelNode35.asList();
        org.jboss.dmr.ListModelValue listModelValue37 = new org.jboss.dmr.ListModelValue(modelNodeList36);
        org.jboss.dmr.ModelNode modelNode38 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue37);
        org.jboss.dmr.ModelValue modelValue39 = listModelValue37.resolve();
        int int41 = listModelValue37.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList42 = listModelValue37.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList43 = modelNode31.asPropertyList(propertyList42);
        modelNode11.setNoCopy(modelNode31);
        org.jboss.dmr.ModelNode modelNode45 = modelNode1.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode11);
        org.jboss.dmr.ModelNode modelNode47 = modelNode11.set(false);
        org.jboss.dmr.ModelType modelType48 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode49 = new org.jboss.dmr.ModelNode(modelType48);
        org.jboss.dmr.ModelNode modelNode51 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode54 = modelNode51.set("hi!", 0.0d);
        org.jboss.dmr.Property property55 = new org.jboss.dmr.Property("", modelNode54);
        org.jboss.dmr.ModelNode modelNode56 = modelNode49.set(property55);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode57 = modelNode47.add(property55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNodeList16);
        org.junit.Assert.assertNotNull(modelValue19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(propertyList22);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertNotNull(modelNodeList36);
        org.junit.Assert.assertNotNull(modelValue39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(propertyList42);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(modelNode45);
        org.junit.Assert.assertNotNull(modelNode47);
        org.junit.Assert.assertTrue("'" + modelType48 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType48.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode54);
        org.junit.Assert.assertNotNull(modelNode56);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        int int0 = org.jboss.dmr.Base64.NO_OPTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str1, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        int int11 = listModelValue5.asInt((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = listModelValue5.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        long long5 = booleanModelValue1.asLong();
        boolean boolean7 = booleanModelValue1.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = booleanModelValue1.getChild(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue9.formatAsJSON(printWriter10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = propertyModelValue10.getChild("10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode5.asList();
        org.jboss.dmr.ListModelValue listModelValue7 = new org.jboss.dmr.ListModelValue(modelNodeList6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue7);
        org.jboss.dmr.ModelValue modelValue9 = listModelValue7.resolve();
        int int11 = listModelValue7.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList12 = listModelValue7.asPropertyList();
        boolean boolean13 = intModelValue1.equals((java.lang.Object) listModelValue7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property14 = listModelValue7.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelValue9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(propertyList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.formatAsJSON(printWriter2, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = modelNode1.insert(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression2 = expressionValue1.asExpression();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.formatAsJSON(printWriter3, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        java.io.DataInputStream dataInputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.readExternal(dataInputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ObjectModelValue objectModelValue1 = new org.jboss.dmr.ObjectModelValue(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = longModelValue1.removeChild("10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = valueExpression3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = valueExpression3.resolveInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Expression \"true\"" + "'", str4, "Expression \"true\"");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ListModelValue listModelValue1 = new org.jboss.dmr.ListModelValue(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelType modelType11 = org.jboss.dmr.ModelType.BYTES;
        char char12 = modelType11.getTypeChar();
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelType11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode0.add("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + modelType11 + "' != '" + org.jboss.dmr.ModelType.BYTES + "'", modelType11.equals(org.jboss.dmr.ModelType.BYTES));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'b' + "'", char12 == 'b');
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        org.jboss.dmr.LongModelValue longModelValue16 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str17 = longModelValue16.asString();
        byte[] byteArray18 = longModelValue16.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue19 = new org.jboss.dmr.BytesModelValue(byteArray18);
        boolean boolean20 = bytesModelValue12.equals(bytesModelValue19);
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.writeExternal(dataOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            double double2 = bigIntegerModelValue1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        java.lang.String str8 = valueExpression5.getExpressionString();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver9 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str11 = valueExpressionResolver9.resolvePart("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        // The following exception was thrown during execution in test generation
        try {
            long long12 = valueExpression5.resolveLong(valueExpressionResolver9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0" + "'", str8, "1.0");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        java.io.InputStream inputStream1 = null;
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream(inputStream1, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNodeFactory0.readFrom((java.io.InputStream) inputStream4, charset5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType5 = stringModelValue1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.jboss.dmr.ModelType.Expression \"true\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        org.jboss.dmr.ModelNode modelNode6 = modelNode0.add((double) 100);
        java.lang.Class<?> wildcardClass7 = modelNode0.getClass();
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        java.lang.String str3 = modelNode0.asStringOrNull();
        java.io.DataOutput dataOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeExternal(dataOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = valueExpression3.toString();
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression7 = expressionValue6.asExpression();
        boolean boolean8 = valueExpression3.equals(valueExpression7);
        java.io.ObjectInput objectInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression7.readExternal(objectInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Expression \"true\"" + "'", str4, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.lang.String str0 = org.jboss.dmr.BytesModelValue.TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BYTES_VALUE" + "'", str0, "BYTES_VALUE");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType1 = org.jboss.dmr.ModelType.forChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid type character ' '");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.io.ObjectInput objectInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression3.readExternal(objectInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jboss.dmr.Base64.decodeToObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 2: 33(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode13 = modelNode10.set("hi!", 0.0d);
        java.lang.String str14 = modelNode10.toString();
        org.jboss.dmr.ModelNode modelNode15 = modelNode10.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode17 = modelNode10.set(100);
        org.jboss.dmr.ModelNode modelNode18 = modelNode9.add(modelNode10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode19 = modelNode4.add("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }", modelNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(\"hi!\" => 0.0)" + "'", str14, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(modelNode18);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = listModelValue5.getChild((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = modelNode1.remove("1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        java.io.DataOutput dataOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.writeExternal(dataOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str2 = expressionValue1.toString();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.format(printWriter3, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "expression \"hi!\"" + "'", str2, "expression \"hi!\"");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode5.asList();
        org.jboss.dmr.ListModelValue listModelValue7 = new org.jboss.dmr.ListModelValue(modelNodeList6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue7);
        org.jboss.dmr.ModelValue modelValue9 = listModelValue7.resolve();
        int int11 = listModelValue7.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList12 = listModelValue7.asPropertyList();
        boolean boolean13 = intModelValue1.equals((java.lang.Object) listModelValue7);
        java.math.BigDecimal bigDecimal14 = intModelValue1.asBigDecimal();
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.writeExternal(dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelValue9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(propertyList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatAsJSON(printWriter15, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertyModelValue10.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean3 = doubleModelValue1.asBoolean();
        byte[] byteArray4 = doubleModelValue1.asBytes();
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = valueExpression3.toString();
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression7 = expressionValue6.asExpression();
        boolean boolean8 = valueExpression3.equals(valueExpression7);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = valueExpression7.resolveString(valueExpressionResolver9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Expression \"true\"" + "'", str4, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str2 = intModelValue1.asString();
        long long3 = intModelValue1.asLong();
        java.io.DataOutput dataOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.writeExternal(dataOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str1, "org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = valueExpression3.toString();
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression7 = expressionValue6.asExpression();
        boolean boolean8 = valueExpression3.equals(valueExpression7);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver9 = org.jboss.dmr.ValueExpressionResolver.DEFAULT_RESOLVER;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = valueExpression3.resolveBigDecimal(valueExpressionResolver9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Expression \"true\"" + "'", str4, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(valueExpressionResolver9);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.stream.ModelWriter modelWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue10.write(modelWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("1");
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.format(printWriter2, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stringModelValue1.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        // The following exception was thrown during execution in test generation
        try {
            double double9 = modelNode8.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = stringModelValue1.asBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = stringModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        java.lang.String str7 = bytesModelValue4.asString();
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str7, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = bigIntegerModelValue1.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelNode modelNode3 = objectModelValue0.getChild("TYPE_MODEL_VALUE");
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.format(printWriter4, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean4 = doubleModelValue1.asBoolean(true);
        boolean boolean6 = doubleModelValue1.asBoolean(false);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        long long3 = doubleModelValue1.asLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = stringModelValue1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode7.resolve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = modelNode8.asIntOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ValueExpression valueExpression2 = bigIntegerModelValue1.asExpression();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asListOrEmpty();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode4, false);
        boolean boolean9 = propertyModelValue7.has("10.0");
        org.jboss.dmr.ModelNode modelNode11 = propertyModelValue7.getChild(0);
        org.jboss.dmr.stream.ModelWriter modelWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue7.write(modelWriter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(modelNode11);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            inputStream4.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        outputStream1.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream1);
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3);
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode9 = modelNode6.set("hi!", 0.0d);
        java.lang.String str10 = modelNode6.toString();
        org.jboss.dmr.ModelNode modelNode11 = modelNode6.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode13 = modelNode6.set(100);
        org.jboss.dmr.ModelNode modelNode14 = modelNode5.add(modelNode6);
        org.jboss.dmr.LongModelValue longModelValue17 = new org.jboss.dmr.LongModelValue(1L);
        long long18 = longModelValue17.asLong();
        byte[] byteArray19 = longModelValue17.asBytes();
        org.jboss.dmr.ModelNode modelNode20 = modelNode5.add("EXPRESSION_VALUE", byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            outputStream4.write(byteArray19, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(\"hi!\" => 0.0)" + "'", str10, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(modelNode20);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue4 = new org.jboss.dmr.ExpressionValue(valueExpression3);
        org.jboss.dmr.ModelValue modelValue5 = expressionValue4.resolve();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = modelValue5.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(modelValue5);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bigIntegerModelValue1.asLong((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        byte[] byteArray4 = longModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.jboss.dmr.Base64.encodeBytes(byteArray4, (int) 'p', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 112");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatMultiLine(printWriter8, (int) 'p');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long7 = booleanModelValue6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = booleanModelValue6.asExpression();
        boolean boolean10 = valueExpression8.equals((java.lang.Object) 'p');
        boolean boolean11 = valueExpression3.equals(valueExpression8);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver12 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str14 = valueExpressionResolver12.resolvePart("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = valueExpression8.resolveInt(valueExpressionResolver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(booleanModelValue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.String str1 = org.jboss.dmr.ModelValue.quote("\"(\\\"hi!\\\" => 0.0)\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"(\\\\\\\"hi!\\\\\\\" => 0.0)\\\"\"" + "'", str1, "\"\\\"(\\\\\\\"hi!\\\\\\\" => 0.0)\\\"\"");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelValue modelValue6 = listModelValue5.resolve();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property7 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue6);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        int int10 = inputStream2.read(byteArray6, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = inputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue3.formatAsJSON(printWriter5, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue(10);
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.writeExternal(dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        org.jboss.dmr.LongModelValue longModelValue16 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str17 = longModelValue16.asString();
        byte[] byteArray18 = longModelValue16.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue19 = new org.jboss.dmr.BytesModelValue(byteArray18);
        boolean boolean20 = bytesModelValue12.equals(bytesModelValue19);
        long long21 = bytesModelValue12.asLong();
        org.jboss.dmr.stream.ModelWriter modelWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.write(modelWriter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = inputStream4.skip((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            inputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue11 = new org.jboss.dmr.PropertyModelValue(property7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = propertyModelValue11.getChild((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        byte[] byteArray4 = longModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = longModelValue1.getChild("(\"hi!\" => 0.0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList18 = listModelValue13.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList19 = modelNode7.asPropertyList(propertyList18);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.get(strArray26);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList32 = modelNode31.asList();
        org.jboss.dmr.ListModelValue listModelValue33 = new org.jboss.dmr.ListModelValue(modelNodeList32);
        org.jboss.dmr.ModelNode modelNode34 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue33);
        org.jboss.dmr.ModelValue modelValue35 = listModelValue33.resolve();
        int int37 = listModelValue33.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList38 = listModelValue33.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList39 = modelNode27.asPropertyList(propertyList38);
        modelNode7.setNoCopy(modelNode27);
        org.jboss.dmr.ModelNode modelNode42 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode45 = modelNode42.set("hi!", 0.0d);
        org.jboss.dmr.Property property46 = new org.jboss.dmr.Property("", modelNode45);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode48 = modelNode45.get(strArray47);
        org.jboss.dmr.ModelNode modelNode49 = modelNode27.get(strArray47);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray50 = modelNode27.asBytesOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(propertyList18);
        org.junit.Assert.assertNotNull(propertyList19);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNodeList32);
        org.junit.Assert.assertNotNull(modelValue35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(propertyList38);
        org.junit.Assert.assertNotNull(propertyList39);
        org.junit.Assert.assertNotNull(modelNode45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(modelNode48);
        org.junit.Assert.assertNotNull(modelNode49);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.String str1 = org.jboss.dmr.ModelValue.jsonEscape("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }\"" + "'", str1, "\"bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }\"");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode9 = modelNode6.set("hi!", 0.0d);
        org.jboss.dmr.Property property10 = new org.jboss.dmr.Property("", modelNode9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode12 = modelNode9.get(strArray11);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode16 = modelNode13.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList17 = modelNode16.asList();
        org.jboss.dmr.ListModelValue listModelValue18 = new org.jboss.dmr.ListModelValue(modelNodeList17);
        org.jboss.dmr.ModelNode modelNode19 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue18);
        org.jboss.dmr.ModelValue modelValue20 = listModelValue18.resolve();
        int int22 = listModelValue18.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList23 = listModelValue18.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList24 = modelNode12.asPropertyList(propertyList23);
        org.jboss.dmr.ModelNode modelNode26 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode29 = modelNode26.set("hi!", 0.0d);
        org.jboss.dmr.Property property30 = new org.jboss.dmr.Property("", modelNode29);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode32 = modelNode29.get(strArray31);
        org.jboss.dmr.ModelNode modelNode33 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode36 = modelNode33.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList37 = modelNode36.asList();
        org.jboss.dmr.ListModelValue listModelValue38 = new org.jboss.dmr.ListModelValue(modelNodeList37);
        org.jboss.dmr.ModelNode modelNode39 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue38);
        org.jboss.dmr.ModelValue modelValue40 = listModelValue38.resolve();
        int int42 = listModelValue38.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList43 = listModelValue38.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList44 = modelNode32.asPropertyList(propertyList43);
        modelNode12.setNoCopy(modelNode32);
        org.jboss.dmr.ModelNode modelNode46 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode49 = modelNode46.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode50 = new org.jboss.dmr.ModelNode();
        java.lang.Long long51 = modelNode50.asLongOrNull();
        org.jboss.dmr.ModelNode[] modelNodeArray52 = new org.jboss.dmr.ModelNode[] { modelNode46, modelNode50 };
        java.util.ArrayList<org.jboss.dmr.ModelNode> modelNodeList53 = new java.util.ArrayList<org.jboss.dmr.ModelNode>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList53, modelNodeArray52);
        org.jboss.dmr.ModelNode modelNode55 = modelNode12.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList53);
        org.jboss.dmr.ModelNode modelNode58 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long59 = modelNode58.asLong();
        org.jboss.dmr.ValueExpression valueExpression60 = modelNode58.asExpression();
        java.math.BigDecimal bigDecimal61 = valueExpression60.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode62 = modelNode12.set("true", bigDecimal61);
        org.jboss.dmr.ModelNode modelNode63 = modelNode0.set("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode12);
        org.jboss.dmr.BooleanModelValue booleanModelValue65 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long66 = booleanModelValue65.asLong();
        org.jboss.dmr.ValueExpression valueExpression67 = booleanModelValue65.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue68 = new org.jboss.dmr.ExpressionValue(valueExpression67);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode69 = modelNode63.add(valueExpression67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertNotNull(modelNodeList17);
        org.junit.Assert.assertNotNull(modelValue20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(propertyList24);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(modelNode32);
        org.junit.Assert.assertNotNull(modelNode36);
        org.junit.Assert.assertNotNull(modelNodeList37);
        org.junit.Assert.assertNotNull(modelValue40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(propertyList44);
        org.junit.Assert.assertNotNull(modelNode49);
        org.junit.Assert.assertNull(long51);
        org.junit.Assert.assertNotNull(modelNodeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(modelNode55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNotNull(valueExpression60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(modelNode62);
        org.junit.Assert.assertNotNull(modelNode63);
        org.junit.Assert.assertNotNull(booleanModelValue65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(valueExpression67);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.Throwable throwable1 = null;
        org.jboss.dmr.stream.ModelException modelException2 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable1);
        org.jboss.dmr.stream.ModelException modelException3 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        java.lang.Throwable throwable5 = null;
        org.jboss.dmr.stream.ModelException modelException6 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable5);
        org.jboss.dmr.stream.ModelException modelException7 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException6);
        modelException2.addSuppressed((java.lang.Throwable) modelException6);
        java.lang.Throwable[] throwableArray9 = modelException6.getSuppressed();
        java.lang.String str10 = modelException6.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str10, "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.String str1 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rO0ABXNyABNqYXZhLmxhbmcuQ2hhcmFjdGVyNItH2WsaJngCAAFDAAV2YWx1ZXhwACM=" + "'", str1, "rO0ABXNyABNqYXZhLmxhbmcuQ2hhcmFjdGVyNItH2WsaJngCAAFDAAV2YWx1ZXhwACM=");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode2 = modelNode0.add(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = inputStream3.skip((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean3 = doubleModelValue1.asBoolean();
        byte[] byteArray4 = doubleModelValue1.asBytes();
        int int6 = doubleModelValue1.asInt((int) ' ');
        boolean boolean7 = doubleModelValue1.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = doubleModelValue1.asObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[64, 36, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ValueExpression valueExpression3 = typeModelValue2.asExpression();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue2.formatAsJSON(printWriter4, 52, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType0.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'p' + "'", char1 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue2);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.jboss.dmr.ModelNode modelNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.PropertyModelValue propertyModelValue2 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        long long3 = objectModelValue0.asLong();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.formatAsJSON(printWriter4, 8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromJSONString("1.0");
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str5 = modelNode3.asString("true");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode1.add(modelNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long7 = booleanModelValue6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = booleanModelValue6.asExpression();
        boolean boolean10 = valueExpression8.equals((java.lang.Object) 'p');
        boolean boolean11 = valueExpression3.equals(valueExpression8);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = valueExpression8.resolveLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(booleanModelValue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        outputStream1.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream1);
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue9 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger10 = booleanModelValue9.asBigInteger();
        byte[] byteArray11 = booleanModelValue9.asBytes();
        org.jboss.dmr.ModelNode modelNode12 = modelNode6.set("expression \"hi!\"", byteArray11);
        outputStream3.write(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.jboss.dmr.Base64.encodeBytes(byteArray11, (int) ' ', 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(modelNode12);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.String str1 = org.jboss.dmr.ModelValue.jsonEscape("1L");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"1L\"" + "'", str1, "\"1L\"");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger2 = booleanModelValue1.asBigInteger();
        java.io.DataOutput dataOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.writeExternal(dataOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode12 = modelNode6.set("Expression \"true\"", modelNode11);
        byte[] byteArray13 = new byte[] {};
        java.lang.String str15 = org.jboss.dmr.Base64.encodeBytes(byteArray13, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode6.add(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H4sIAAAAAAAAAAMAAAAAAAAAAAA=" + "'", str15, "H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode3.addEmptyObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatAsJSON(printWriter15, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.ModelNode modelNode10 = property7.getValue();
        java.util.List<org.jboss.dmr.Property> propertyList11 = modelNode10.asPropertyListOrEmpty();
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str16 = modelNode14.asString("true");
        org.jboss.dmr.ModelNode modelNode19 = modelNode14.set("expression \"hi!\"", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode20 = modelNode10.add("BYTES_VALUE", modelNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(propertyList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(modelNode19);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asListOrEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode3.add(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        org.jboss.dmr.ModelType modelType13 = org.jboss.dmr.ModelType.BYTES;
        org.jboss.dmr.ModelNode modelNode14 = modelNode1.set("[(\"hi!\" => 0.0)]", modelType13);
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode(modelType13);
        java.io.DataInputStream dataInputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode15.readExternal(dataInputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + modelType13 + "' != '" + org.jboss.dmr.ModelType.BYTES + "'", modelType13.equals(org.jboss.dmr.ModelType.BYTES));
        org.junit.Assert.assertNotNull(modelNode14);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = org.jboss.dmr.ModelNode.fromStream((java.io.InputStream) inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = bytesModelValue4.asObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet8 = modelNode7.keys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(true);
        org.jboss.dmr.ModelNode modelNode2 = modelNode1.resolve();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property3 = modelNode1.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode2);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode3.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        boolean boolean2 = org.jboss.dmr.Base64.decodeToFile("35", "TYPE_MODEL_VALUE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNode8.add("10", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.writeJSONString(printWriter7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long3 = longModelValue1.asLong((long) (short) 0);
        java.lang.String str4 = longModelValue1.asString();
        byte[] byteArray5 = longModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.Property> propertyList6 = longModelValue1.asPropertyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        boolean boolean2 = org.jboss.dmr.Base64.decodeToFile("\"(\\\"hi!\\\" => 0.0)\"", "1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        java.lang.String str2 = doubleModelValue1.asString();
        long long4 = doubleModelValue1.asLong((long) (short) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelNode modelNode3 = objectModelValue0.getChild("TYPE_MODEL_VALUE");
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property12 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(modelNodeList11);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long3 = longModelValue1.asLong((long) (short) 0);
        java.lang.String str4 = longModelValue1.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = longModelValue1.removeChild((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode6.asListOrEmpty();
        java.lang.String[] strArray10 = new java.lang.String[] { "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" };
        boolean boolean11 = modelNode6.hasDefined(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = modelNode0.get(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNodeList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        org.jboss.dmr.ModelNode modelNode14 = modelNode13.setEmptyList();
        org.jboss.dmr.ModelType modelType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode13.set(modelType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode14);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.get(strArray10);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode15 = modelNode12.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList16 = modelNode15.asList();
        org.jboss.dmr.ListModelValue listModelValue17 = new org.jboss.dmr.ListModelValue(modelNodeList16);
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue17);
        org.jboss.dmr.ModelValue modelValue19 = listModelValue17.resolve();
        int int21 = listModelValue17.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList22 = listModelValue17.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList23 = modelNode11.asPropertyList(propertyList22);
        org.jboss.dmr.ModelNode modelNode25 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode28 = modelNode25.set("hi!", 0.0d);
        org.jboss.dmr.Property property29 = new org.jboss.dmr.Property("", modelNode28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.get(strArray30);
        org.jboss.dmr.ModelNode modelNode32 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode35 = modelNode32.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList36 = modelNode35.asList();
        org.jboss.dmr.ListModelValue listModelValue37 = new org.jboss.dmr.ListModelValue(modelNodeList36);
        org.jboss.dmr.ModelNode modelNode38 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue37);
        org.jboss.dmr.ModelValue modelValue39 = listModelValue37.resolve();
        int int41 = listModelValue37.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList42 = listModelValue37.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList43 = modelNode31.asPropertyList(propertyList42);
        modelNode11.setNoCopy(modelNode31);
        org.jboss.dmr.ModelNode modelNode45 = modelNode1.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode11);
        org.jboss.dmr.ModelNode modelNode48 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long49 = modelNode48.asLong();
        org.jboss.dmr.ValueExpression valueExpression50 = modelNode48.asExpression();
        java.math.BigDecimal bigDecimal51 = valueExpression50.resolveBigDecimal();
        java.lang.String str52 = valueExpression50.getExpressionString();
        java.math.BigDecimal bigDecimal53 = valueExpression50.resolveBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode54 = modelNode45.add("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", bigDecimal53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNodeList16);
        org.junit.Assert.assertNotNull(modelValue19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(propertyList22);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertNotNull(modelNodeList36);
        org.junit.Assert.assertNotNull(modelValue39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(propertyList42);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(modelNode45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(valueExpression50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1.0" + "'", str52, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal53);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        boolean boolean7 = modelNode4.equals((java.lang.Object) 100L);
        boolean boolean9 = modelNode4.has((int) '4');
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode4.writeString(printWriter10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.ModelValue modelValue10 = propertyModelValue9.resolve();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelValue10.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelValue10);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = stringModelValue1.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expressi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) 'p');
        org.jboss.dmr.stream.ModelWriter modelWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.write(modelWriter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        byte[] byteArray2 = stringModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType3 = stringModelValue1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.jboss.dmr.ModelType.(\"\" => (\"hi!\" => 0.0))");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property7 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        boolean boolean4 = modelNode1.asBoolean(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        modelNode7.protect();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int11 = modelNode10.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long14 = modelNode13.asLong();
        org.jboss.dmr.ValueExpression valueExpression15 = modelNode13.asExpression();
        java.math.BigDecimal bigDecimal16 = valueExpression15.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode17 = modelNode10.set(valueExpression15);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = modelNode7.add("", valueExpression15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(valueExpression15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(modelNode17);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = expressionValue3.asLong((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.Throwable throwable1 = null;
        org.jboss.dmr.stream.ModelException modelException2 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable1);
        org.jboss.dmr.stream.ModelException modelException3 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        java.lang.Throwable throwable5 = null;
        org.jboss.dmr.stream.ModelException modelException6 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable5);
        org.jboss.dmr.stream.ModelException modelException7 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException6);
        modelException2.addSuppressed((java.lang.Throwable) modelException6);
        java.lang.String str9 = modelException6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str9, "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode0.set(property11);
        java.lang.String str13 = modelNode12.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode12.add("PROPERTY_VALUE", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str13, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ModelValue modelValue11 = expressionValue1.resolve();
        java.lang.String str12 = expressionValue1.asString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList13 = expressionValue1.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(modelValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        byte[] byteArray5 = stringModelValue3.asBytes();
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue3.writeExternal(dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        org.jboss.dmr.ModelNode modelNode8 = modelNode3.set((double) 'a');
        org.jboss.dmr.LongModelValue longModelValue10 = new org.jboss.dmr.LongModelValue(1L);
        long long12 = longModelValue10.asLong((long) (short) 0);
        java.lang.String str13 = longModelValue10.asString();
        org.jboss.dmr.ValueExpression valueExpression14 = longModelValue10.asExpression();
        int int15 = valueExpression14.resolveInt();
        org.jboss.dmr.ModelNode modelNode16 = modelNode3.set(valueExpression14);
        org.jboss.dmr.stream.ModelWriter modelWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode3.write(modelWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(valueExpression14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(modelNode16);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        org.jboss.dmr.ModelValue modelValue11 = listModelValue5.clone();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter12, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(modelValue11);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        org.jboss.dmr.LongModelValue longModelValue3 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str4 = longModelValue3.asString();
        byte[] byteArray5 = longModelValue3.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue6 = new org.jboss.dmr.BytesModelValue(byteArray5);
        java.lang.String str7 = bytesModelValue6.asString();
        int int8 = bytesModelValue6.asInt();
        int int9 = bytesModelValue6.asInt();
        org.jboss.dmr.LongModelValue longModelValue11 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str12 = longModelValue11.asString();
        byte[] byteArray13 = longModelValue11.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue14 = new org.jboss.dmr.BytesModelValue(byteArray13);
        double double15 = bytesModelValue14.asDouble();
        boolean boolean16 = bytesModelValue6.equals(bytesModelValue14);
        byte[] byteArray17 = bytesModelValue14.asBytes();
        java.math.BigInteger bigInteger18 = bytesModelValue14.asBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode19 = modelNode0.add("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }", bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str7, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        boolean boolean2 = doubleModelValue1.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression3 = doubleModelValue1.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = doubleModelValue1.getChild("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.ModelNode modelNode10 = property7.getValue();
        java.util.List<org.jboss.dmr.Property> propertyList11 = modelNode10.asPropertyListOrEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = modelNode10.add();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(propertyList11);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = bigIntegerModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        long long4 = doubleModelValue1.asLong((long) 32);
        byte[] byteArray5 = doubleModelValue1.asBytes();
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int7 = bytesModelValue4.asInt();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        double double13 = bytesModelValue12.asDouble();
        boolean boolean14 = bytesModelValue4.equals(bytesModelValue12);
        byte[] byteArray15 = bytesModelValue12.asBytes();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.writeString(printWriter16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode14 = modelNode12.set((int) '#');
        org.jboss.dmr.ModelNode modelNode15 = modelNode1.setNoCopy("1.0", modelNode12);
        org.jboss.dmr.ModelNode modelNode17 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode20 = modelNode17.set("hi!", 0.0d);
        org.jboss.dmr.Property property21 = new org.jboss.dmr.Property("", modelNode20);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode23 = modelNode20.get(strArray22);
        org.jboss.dmr.ModelNode modelNode24 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList28 = modelNode27.asList();
        org.jboss.dmr.ListModelValue listModelValue29 = new org.jboss.dmr.ListModelValue(modelNodeList28);
        org.jboss.dmr.ModelNode modelNode30 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue29);
        org.jboss.dmr.ModelValue modelValue31 = listModelValue29.resolve();
        int int33 = listModelValue29.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList34 = listModelValue29.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList35 = modelNode23.asPropertyList(propertyList34);
        org.jboss.dmr.ModelNode modelNode37 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode40 = modelNode37.set("hi!", 0.0d);
        org.jboss.dmr.Property property41 = new org.jboss.dmr.Property("", modelNode40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode43 = modelNode40.get(strArray42);
        org.jboss.dmr.ModelNode modelNode44 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode47 = modelNode44.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList48 = modelNode47.asList();
        org.jboss.dmr.ListModelValue listModelValue49 = new org.jboss.dmr.ListModelValue(modelNodeList48);
        org.jboss.dmr.ModelNode modelNode50 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue49);
        org.jboss.dmr.ModelValue modelValue51 = listModelValue49.resolve();
        int int53 = listModelValue49.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList54 = listModelValue49.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList55 = modelNode43.asPropertyList(propertyList54);
        modelNode23.setNoCopy(modelNode43);
        org.jboss.dmr.ModelNode modelNode57 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode60 = modelNode57.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode61 = new org.jboss.dmr.ModelNode();
        java.lang.Long long62 = modelNode61.asLongOrNull();
        org.jboss.dmr.ModelNode[] modelNodeArray63 = new org.jboss.dmr.ModelNode[] { modelNode57, modelNode61 };
        java.util.ArrayList<org.jboss.dmr.ModelNode> modelNodeList64 = new java.util.ArrayList<org.jboss.dmr.ModelNode>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList64, modelNodeArray63);
        org.jboss.dmr.ModelNode modelNode66 = modelNode23.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList64);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList67 = modelNode12.asList((java.util.List<org.jboss.dmr.ModelNode>) modelNodeList64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(modelNode23);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNodeList28);
        org.junit.Assert.assertNotNull(modelValue31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(propertyList34);
        org.junit.Assert.assertNotNull(propertyList35);
        org.junit.Assert.assertNotNull(modelNode40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(modelNode43);
        org.junit.Assert.assertNotNull(modelNode47);
        org.junit.Assert.assertNotNull(modelNodeList48);
        org.junit.Assert.assertNotNull(modelValue51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(propertyList54);
        org.junit.Assert.assertNotNull(propertyList55);
        org.junit.Assert.assertNotNull(modelNode60);
        org.junit.Assert.assertNull(long62);
        org.junit.Assert.assertNotNull(modelNodeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(modelNode66);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long3 = intModelValue1.asLong((long) 'b');
        java.lang.String str4 = intModelValue1.asString();
        long long5 = intModelValue1.asLong();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.writeJSONString(printWriter6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        long long11 = listModelValue5.asLong();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = listModelValue5.requireChild((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [100]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = booleanModelValue1.asObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long3 = modelNode2.asLong();
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode9 = modelNode6.set("hi!", 0.0d);
        org.jboss.dmr.Property property10 = new org.jboss.dmr.Property("", modelNode9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode12 = modelNode9.get(strArray11);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode16 = modelNode13.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList17 = modelNode16.asList();
        org.jboss.dmr.ListModelValue listModelValue18 = new org.jboss.dmr.ListModelValue(modelNodeList17);
        org.jboss.dmr.ModelNode modelNode19 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue18);
        org.jboss.dmr.ModelValue modelValue20 = listModelValue18.resolve();
        int int22 = listModelValue18.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList23 = listModelValue18.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList24 = modelNode12.asPropertyList(propertyList23);
        org.jboss.dmr.ModelNode modelNode26 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode29 = modelNode26.set("hi!", 0.0d);
        org.jboss.dmr.Property property30 = new org.jboss.dmr.Property("", modelNode29);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode32 = modelNode29.get(strArray31);
        org.jboss.dmr.ModelNode modelNode33 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode36 = modelNode33.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList37 = modelNode36.asList();
        org.jboss.dmr.ListModelValue listModelValue38 = new org.jboss.dmr.ListModelValue(modelNodeList37);
        org.jboss.dmr.ModelNode modelNode39 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue38);
        org.jboss.dmr.ModelValue modelValue40 = listModelValue38.resolve();
        int int42 = listModelValue38.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList43 = listModelValue38.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList44 = modelNode32.asPropertyList(propertyList43);
        modelNode12.setNoCopy(modelNode32);
        org.jboss.dmr.ModelNode modelNode46 = modelNode2.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode12);
        org.jboss.dmr.ModelNode modelNode48 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode51 = modelNode48.set("hi!", 0.0d);
        org.jboss.dmr.Property property52 = new org.jboss.dmr.Property("", modelNode51);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode54 = modelNode51.get(strArray53);
        org.jboss.dmr.ModelNode modelNode55 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int56 = modelNode55.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode57 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode60 = modelNode57.setExpression("hi!", "hi!");
        java.lang.String str61 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode57);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList62 = modelNode57.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode63 = modelNode55.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList62);
        org.jboss.dmr.ModelNode modelNode64 = modelNode54.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList62);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList65 = modelNode2.asList(modelNodeList62);
        org.jboss.dmr.PropertyModelValue propertyModelValue67 = new org.jboss.dmr.PropertyModelValue("Expression \"true\"", modelNode2, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode69 = propertyModelValue67.getChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertNotNull(modelNodeList17);
        org.junit.Assert.assertNotNull(modelValue20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(propertyList24);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(modelNode32);
        org.junit.Assert.assertNotNull(modelNode36);
        org.junit.Assert.assertNotNull(modelNodeList37);
        org.junit.Assert.assertNotNull(modelValue40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(propertyList44);
        org.junit.Assert.assertNotNull(modelNode46);
        org.junit.Assert.assertNotNull(modelNode51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(modelNode54);
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertNotNull(modelNode60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str61, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList62);
        org.junit.Assert.assertNotNull(modelNode63);
        org.junit.Assert.assertNotNull(modelNode64);
        org.junit.Assert.assertNotNull(modelNodeList65);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = modelNode6.remove("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            inputStream4.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = stringModelValue1.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expressi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bigIntegerModelValue1.asLong((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        org.jboss.dmr.ModelValue modelValue10 = listModelValue5.protect();
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode14 = modelNode11.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList15 = modelNode14.asList();
        org.jboss.dmr.ListModelValue listModelValue16 = new org.jboss.dmr.ListModelValue(modelNodeList15);
        org.jboss.dmr.ModelNode modelNode17 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue16);
        org.jboss.dmr.ModelValue modelValue18 = listModelValue16.resolve();
        int int20 = listModelValue16.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList21 = listModelValue16.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList22 = listModelValue16.asPropertyList();
        boolean boolean23 = listModelValue5.equals(listModelValue16);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode25 = listModelValue5.getChild((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(modelValue10);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNodeList15);
        org.junit.Assert.assertNotNull(modelValue18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(propertyList21);
        org.junit.Assert.assertNotNull(propertyList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        boolean boolean2 = org.jboss.dmr.Base64.decodeToFile("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "1L");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.LIST;
        char char1 = modelType0.getTypeChar();
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.LIST + "'", modelType0.equals(org.jboss.dmr.ModelType.LIST));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'l' + "'", char1 == 'l');
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.set("expression \"hi!\"", (int) (short) -1);
        org.jboss.dmr.ModelNode modelNode7 = modelNode6.clear();
        java.lang.Integer int8 = modelNode6.asIntOrNull();
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNode6.set("PROPERTY_VALUE", byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = org.jboss.dmr.ModelNode.fromBase64((java.io.InputStream) inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        org.jboss.dmr.ModelNode modelNode14 = modelNode13.resolve();
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode18 = modelNode15.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode19 = modelNode18.setEmptyList();
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long22 = modelNode21.asLong();
        org.jboss.dmr.ValueExpression valueExpression23 = modelNode21.asExpression();
        java.math.BigDecimal bigDecimal24 = valueExpression23.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode25 = new org.jboss.dmr.ModelNode(bigDecimal24);
        org.jboss.dmr.ModelNode modelNode26 = modelNode18.set(bigDecimal24);
        org.jboss.dmr.ModelNode modelNode27 = modelNode13.set(bigDecimal24);
        java.io.OutputStream outputStream28 = null;
        org.jboss.dmr.Base64.OutputStream outputStream29 = new org.jboss.dmr.Base64.OutputStream(outputStream28);
        outputStream29.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream31 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream29);
        org.jboss.dmr.Base64.OutputStream outputStream33 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream31, (int) (byte) -1);
        org.jboss.dmr.Base64.OutputStream outputStream34 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream33);
        // The following exception was thrown during execution in test generation
        try {
            modelNode27.writeExternal((java.io.OutputStream) outputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode18);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(valueExpression23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelNode27);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        long long7 = listModelValue5.asLong();
        java.util.List<org.jboss.dmr.Property> propertyList8 = listModelValue5.asPropertyList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = listModelValue5.insertChild((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(propertyList8);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("(\"hi!\" => 0.0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file (\"hi!\" => 0.0)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            inputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        boolean boolean18 = listModelValue13.asBoolean();
        org.jboss.dmr.ModelNode[] modelNodeArray19 = org.jboss.dmr.ListModelValue.NO_NODES;
        boolean boolean20 = listModelValue13.equals((java.lang.Object) modelNodeArray19);
        boolean boolean21 = typeModelValue5.equals((java.lang.Object) listModelValue13);
        org.jboss.dmr.ModelValue modelValue22 = listModelValue13.resolve();
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue13.formatAsJSON(printWriter23, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType0.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'p' + "'", char1 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue2);
        org.junit.Assert.assertTrue("'" + modelType3 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType3.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'p' + "'", char4 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PROPERTY" + "'", str7, "PROPERTY");
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(modelNodeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(modelValue22);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        java.lang.Boolean boolean4 = modelNode1.asBooleanOrNull();
        java.lang.String str6 = modelNode1.asString("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        java.io.DataInput dataInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.readExternal(dataInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35" + "'", str6, "35");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal2 = longModelValue1.asBigDecimal();
        int int3 = longModelValue1.asInt();
        org.jboss.dmr.ValueExpression valueExpression4 = longModelValue1.asExpression();
        int int6 = longModelValue1.asInt((int) 'p');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType7 = longModelValue1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(valueExpression4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = org.jboss.dmr.ModelNode.fromStream((java.io.InputStream) inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode3.add("0.0", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ValueExpression valueExpression8 = typeModelValue5.asExpression();
        org.jboss.dmr.stream.ModelWriter modelWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue5.write(modelWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType0.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'p' + "'", char1 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue2);
        org.junit.Assert.assertTrue("'" + modelType3 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType3.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'p' + "'", char4 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PROPERTY" + "'", str7, "PROPERTY");
        org.junit.Assert.assertNotNull(valueExpression8);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.set("expression \"hi!\"", (int) (short) -1);
        org.jboss.dmr.ModelNode modelNode7 = modelNode6.clear();
        java.io.ObjectOutput objectOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.writeExternal(objectOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelType modelType5 = modelNode3.getType();
        java.io.InputStream inputStream6 = null;
        org.jboss.dmr.Base64.InputStream inputStream8 = new org.jboss.dmr.Base64.InputStream(inputStream6, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue10 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str11 = longModelValue10.asString();
        byte[] byteArray12 = longModelValue10.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue13 = new org.jboss.dmr.BytesModelValue(byteArray12);
        int int16 = inputStream8.read(byteArray12, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            modelNode3.readExternal((java.io.InputStream) inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + modelType5 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType5.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        int int3 = longModelValue1.asInt((int) (byte) 0);
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode7.clear();
        java.io.DataInputStream dataInputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode8.readExternal(dataInputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Long long1 = modelNode0.asLongOrNull();
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType8 = modelNode0.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int4 = modelNode3.asIntOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.Property> propertyList11 = propertyModelValue10.asPropertyList();
        org.jboss.dmr.stream.ModelWriter modelWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue10.write(modelWriter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(propertyList11);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        boolean boolean7 = stringModelValue3.equals(stringModelValue6);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue3.format(printWriter8, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        byte[] byteArray7 = bytesModelValue4.asBytes();
        org.jboss.dmr.LongModelValue longModelValue9 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str10 = longModelValue9.asString();
        byte[] byteArray11 = longModelValue9.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue12 = new org.jboss.dmr.BytesModelValue(byteArray11);
        java.lang.String str13 = bytesModelValue12.asString();
        int int14 = bytesModelValue12.asInt();
        int int15 = bytesModelValue12.asInt();
        org.jboss.dmr.LongModelValue longModelValue17 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str18 = longModelValue17.asString();
        byte[] byteArray19 = longModelValue17.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue20 = new org.jboss.dmr.BytesModelValue(byteArray19);
        double double21 = bytesModelValue20.asDouble();
        boolean boolean22 = bytesModelValue12.equals(bytesModelValue20);
        byte[] byteArray23 = bytesModelValue20.asBytes();
        java.math.BigInteger bigInteger24 = bytesModelValue20.asBigInteger();
        boolean boolean25 = bytesModelValue4.equals(bytesModelValue20);
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatAsJSON(printWriter26, 52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str13, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger2 = booleanModelValue1.asBigInteger();
        byte[] byteArray3 = booleanModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = booleanModelValue1.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = listModelValue5.asList();
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.writeExternal(dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(modelNodeList11);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        outputStream1.resumeEncoding();
        org.jboss.dmr.DoubleModelValue doubleModelValue4 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long5 = doubleModelValue4.asLong();
        long long7 = doubleModelValue4.asLong((long) 32);
        byte[] byteArray8 = doubleModelValue4.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            outputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        java.lang.String str8 = bytesModelValue7.asString();
        int int9 = bytesModelValue7.asInt();
        byte[] byteArray10 = bytesModelValue7.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = inputStream2.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str8, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode14 = modelNode12.set((int) '#');
        org.jboss.dmr.ModelNode modelNode15 = modelNode1.setNoCopy("1.0", modelNode12);
        org.jboss.dmr.ModelNode modelNode16 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode19 = modelNode16.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList20 = modelNode19.asListOrEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" };
        boolean boolean24 = modelNode19.hasDefined(strArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode26 = modelNode15.insert(modelNode19, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(modelNodeList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode0.set(property11);
        java.lang.String str13 = modelNode12.asString();
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode17 = modelNode14.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList18 = modelNode17.asList();
        org.jboss.dmr.ListModelValue listModelValue19 = new org.jboss.dmr.ListModelValue(modelNodeList18);
        org.jboss.dmr.ModelNode modelNode20 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue19);
        org.jboss.dmr.ModelValue modelValue21 = listModelValue19.resolve();
        int int23 = listModelValue19.asInt((int) (byte) 100);
        boolean boolean24 = listModelValue19.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList25 = listModelValue19.asList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList26 = modelNode12.asList(modelNodeList25);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.lang.String str32 = modelNode28.toString();
        org.jboss.dmr.ModelNode modelNode33 = modelNode28.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode35 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode38 = modelNode35.set("hi!", 0.0d);
        org.jboss.dmr.Property property39 = new org.jboss.dmr.Property("", modelNode38);
        org.jboss.dmr.ModelNode modelNode40 = modelNode28.set(property39);
        java.lang.String str41 = modelNode40.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode42 = modelNode12.add("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }", modelNode40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str13, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(modelNodeList18);
        org.junit.Assert.assertNotNull(modelValue21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(modelNodeList25);
        org.junit.Assert.assertNotNull(modelNodeList26);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(\"hi!\" => 0.0)" + "'", str32, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode33);
        org.junit.Assert.assertNotNull(modelNode38);
        org.junit.Assert.assertNotNull(modelNode40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str41, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean3 = doubleModelValue1.asBoolean();
        byte[] byteArray4 = doubleModelValue1.asBytes();
        int int6 = doubleModelValue1.asInt((int) ' ');
        long long7 = doubleModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = doubleModelValue1.asExpression();
        org.jboss.dmr.stream.ModelWriter modelWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.write(modelWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[64, 36, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(valueExpression8);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asListOrEmpty();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode4, false);
        org.jboss.dmr.LongModelValue longModelValue10 = new org.jboss.dmr.LongModelValue((-1L));
        long long12 = longModelValue10.asLong((long) (byte) -1);
        java.math.BigDecimal bigDecimal13 = longModelValue10.asBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode14 = modelNode4.add("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", bigDecimal13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal13);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        java.io.InputStream inputStream4 = null;
        org.jboss.dmr.Base64.InputStream inputStream6 = new org.jboss.dmr.Base64.InputStream(inputStream4, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream7 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream6);
        org.jboss.dmr.Base64.InputStream inputStream8 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream7);
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = modelNodeFactory0.readFrom((java.io.InputStream) inputStream8, charset9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asListOrEmpty();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode4, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode4.add();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = valueExpression3.resolveInt(valueExpressionResolver7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        modelNode7.protect();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType9 = modelNode7.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("hi!");
        java.lang.String str5 = objectModelValue0.asString();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.formatAsJSON(printWriter6, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set((double) 0);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode12 = modelNode9.set("hi!", 0.0d);
        java.lang.String str13 = modelNode9.toString();
        org.jboss.dmr.ModelNode modelNode14 = modelNode9.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode16 = modelNode9.set(100);
        org.jboss.dmr.ModelNode modelNode17 = modelNode8.add(modelNode9);
        org.jboss.dmr.ModelNode modelNode19 = modelNode17.set((double) (-1.0f));
        byte[] byteArray20 = modelNode19.asBytesOrNull();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode21 = modelNode7.add(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(\"hi!\" => 0.0)" + "'", str13, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-65, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        org.jboss.dmr.ModelNode modelNode5 = objectModelValue0.asObject();
        org.jboss.dmr.ModelNode modelNode6 = objectModelValue0.asObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = modelNode10.asList();
        java.lang.String str13 = modelNode10.asString("true");
        org.jboss.dmr.ModelNode modelNode15 = modelNode10.set((double) 'a');
        org.jboss.dmr.LongModelValue longModelValue17 = new org.jboss.dmr.LongModelValue(1L);
        long long19 = longModelValue17.asLong((long) (short) 0);
        java.lang.String str20 = longModelValue17.asString();
        org.jboss.dmr.ValueExpression valueExpression21 = longModelValue17.asExpression();
        int int22 = valueExpression21.resolveInt();
        org.jboss.dmr.ModelNode modelNode23 = modelNode10.set(valueExpression21);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode24 = modelNode6.add(valueExpression21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(\"hi!\" => 0.0)" + "'", str13, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertNotNull(valueExpression21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(modelNode23);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = inputStream4.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        java.lang.String str8 = listModelValue5.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property9 = listModelValue5.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str8, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        boolean boolean18 = listModelValue13.asBoolean();
        org.jboss.dmr.ModelNode[] modelNodeArray19 = org.jboss.dmr.ListModelValue.NO_NODES;
        boolean boolean20 = listModelValue13.equals((java.lang.Object) modelNodeArray19);
        boolean boolean21 = typeModelValue5.equals((java.lang.Object) listModelValue13);
        org.jboss.dmr.ModelValue modelValue22 = listModelValue13.resolve();
        java.io.DataOutput dataOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue13.writeExternal(dataOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType0.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'p' + "'", char1 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue2);
        org.junit.Assert.assertTrue("'" + modelType3 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType3.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'p' + "'", char4 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PROPERTY" + "'", str7, "PROPERTY");
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(modelNodeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(modelValue22);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        byte[] byteArray2 = stringModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = stringModelValue1.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue4 = new org.jboss.dmr.ExpressionValue(valueExpression3);
        java.lang.String str5 = valueExpression3.getExpressionString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "true" + "'", str5, "true");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        java.io.OutputStream outputStream3 = null;
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream(outputStream3);
        outputStream4.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream6 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream4);
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeBase64((java.io.OutputStream) outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode6.asList();
        java.io.DataInput dataInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode6.readExternal(dataInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNodeList7);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        boolean boolean7 = stringModelValue3.equals(stringModelValue6);
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue6.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue(10);
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode5.asList();
        org.jboss.dmr.ListModelValue listModelValue7 = new org.jboss.dmr.ListModelValue(modelNodeList6);
        org.jboss.dmr.ModelValue modelValue8 = listModelValue7.resolve();
        boolean boolean9 = intModelValue1.equals((java.lang.Object) modelValue8);
        int int11 = intModelValue1.asInt((int) (short) 1);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelValue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ValueExpression valueExpression3 = typeModelValue2.asExpression();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue2.formatAsJSON(printWriter4, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType0.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'p' + "'", char1 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue2);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        org.jboss.dmr.stream.ModelWriter modelWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.write(modelWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        boolean boolean4 = objectModelValue0.has((int) 'a');
        boolean boolean6 = objectModelValue0.has("");
        org.jboss.dmr.ObjectModelValue objectModelValue7 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode8 = objectModelValue7.asObject();
        java.util.Set<java.lang.String> strSet9 = objectModelValue7.getKeys();
        boolean boolean11 = objectModelValue7.has((int) 'a');
        boolean boolean12 = objectModelValue0.equals(objectModelValue7);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = objectModelValue0.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asListOrEmpty();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode4, false);
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue7.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode0.require((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [32]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        // The following exception was thrown during execution in test generation
        try {
            long long8 = modelNode3.asLong((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stringModelValue1.asInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = bigIntegerModelValue1.asInt((int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = modelNode9.addEmptyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.get(strArray10);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode15 = modelNode12.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList16 = modelNode15.asList();
        org.jboss.dmr.ListModelValue listModelValue17 = new org.jboss.dmr.ListModelValue(modelNodeList16);
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue17);
        org.jboss.dmr.ModelValue modelValue19 = listModelValue17.resolve();
        int int21 = listModelValue17.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList22 = listModelValue17.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList23 = modelNode11.asPropertyList(propertyList22);
        org.jboss.dmr.ModelNode modelNode25 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode28 = modelNode25.set("hi!", 0.0d);
        org.jboss.dmr.Property property29 = new org.jboss.dmr.Property("", modelNode28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.get(strArray30);
        org.jboss.dmr.ModelNode modelNode32 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode35 = modelNode32.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList36 = modelNode35.asList();
        org.jboss.dmr.ListModelValue listModelValue37 = new org.jboss.dmr.ListModelValue(modelNodeList36);
        org.jboss.dmr.ModelNode modelNode38 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue37);
        org.jboss.dmr.ModelValue modelValue39 = listModelValue37.resolve();
        int int41 = listModelValue37.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList42 = listModelValue37.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList43 = modelNode31.asPropertyList(propertyList42);
        modelNode11.setNoCopy(modelNode31);
        org.jboss.dmr.ModelNode modelNode45 = modelNode1.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode11);
        boolean boolean46 = modelNode11.isDefined();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger47 = modelNode11.asBigIntegerOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNodeList16);
        org.junit.Assert.assertNotNull(modelValue19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(propertyList22);
        org.junit.Assert.assertNotNull(propertyList23);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertNotNull(modelNodeList36);
        org.junit.Assert.assertNotNull(modelValue39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(propertyList42);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(modelNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelValue modelValue2 = objectModelValue0.copy();
        java.lang.String str3 = objectModelValue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = objectModelValue0.requireChild("EXPRESSION_VALUE");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'EXPRESSION_VALUE' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int9 = modelNode8.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode13 = modelNode10.setExpression("hi!", "hi!");
        java.lang.String str14 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode10);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList15 = modelNode10.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode16 = modelNode8.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList15);
        org.jboss.dmr.ModelNode modelNode17 = modelNode7.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList15);
        java.io.OutputStream outputStream18 = null;
        org.jboss.dmr.Base64.OutputStream outputStream19 = new org.jboss.dmr.Base64.OutputStream(outputStream18);
        outputStream19.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream21 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream19);
        org.jboss.dmr.Base64.OutputStream outputStream22 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream21);
        org.jboss.dmr.ModelNode modelNode24 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue27 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger28 = booleanModelValue27.asBigInteger();
        byte[] byteArray29 = booleanModelValue27.asBytes();
        org.jboss.dmr.ModelNode modelNode30 = modelNode24.set("expression \"hi!\"", byteArray29);
        outputStream21.write(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            modelNode17.writeExternal((java.io.OutputStream) outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str14, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList15);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(booleanModelValue27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertNotNull(modelNode30);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList12 = modelNode11.asList();
        org.jboss.dmr.ListModelValue listModelValue13 = new org.jboss.dmr.ListModelValue(modelNodeList12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue13);
        org.jboss.dmr.ModelValue modelValue15 = listModelValue13.resolve();
        int int17 = listModelValue13.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList18 = listModelValue13.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList19 = modelNode7.asPropertyList(propertyList18);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.get(strArray26);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList32 = modelNode31.asList();
        org.jboss.dmr.ListModelValue listModelValue33 = new org.jboss.dmr.ListModelValue(modelNodeList32);
        org.jboss.dmr.ModelNode modelNode34 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue33);
        org.jboss.dmr.ModelValue modelValue35 = listModelValue33.resolve();
        int int37 = listModelValue33.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList38 = listModelValue33.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList39 = modelNode27.asPropertyList(propertyList38);
        modelNode7.setNoCopy(modelNode27);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode42 = modelNode7.add((int) 'p');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNodeList12);
        org.junit.Assert.assertNotNull(modelValue15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(propertyList18);
        org.junit.Assert.assertNotNull(propertyList19);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNodeList32);
        org.junit.Assert.assertNotNull(modelValue35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(propertyList38);
        org.junit.Assert.assertNotNull(propertyList39);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.stream.ModelReader modelReader6 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        org.jboss.dmr.ModelNode modelNode8 = modelNode3.set((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList9 = modelNode8.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        double double9 = bigDecimalModelValue7.asDouble((double) 'p');
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue7.writeExternal(dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.io.PrintWriter printWriter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelValue.indent(printWriter0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = expressionValue8.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = propertyModelValue10.asList();
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue10.writeExternal(dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNodeList11);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ValueExpression valueExpression11 = expressionValue8.asExpression();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue8.formatAsJSON(printWriter12, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(valueExpression11);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        org.jboss.dmr.ModelValue modelValue10 = listModelValue5.protect();
        boolean boolean12 = listModelValue5.has((int) (short) 100);
        org.jboss.dmr.ModelValue modelValue13 = listModelValue5.resolve();
        boolean boolean14 = listModelValue5.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = listModelValue5.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(modelValue10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((int) (short) 1);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String str1 = org.jboss.dmr.ModelValue.jsonEscape("\"1L\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"1L\\\"\"" + "'", str1, "\"\\\"1L\\\"\"");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = listModelValue5.requireChild("expression \"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'expression \"hi!\"' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertNotNull(modelNodeList7);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }
}

