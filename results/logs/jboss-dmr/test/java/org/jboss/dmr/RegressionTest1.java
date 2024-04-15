package org.jboss.dmr;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode6.asList();
        org.jboss.dmr.ListModelValue listModelValue8 = new org.jboss.dmr.ListModelValue(modelNodeList7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property9 = listModelValue8.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNodeList7);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = org.jboss.dmr.ModelNode.fromJSONStream((java.io.InputStream) inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
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
        java.math.BigInteger bigInteger16 = bytesModelValue12.asBigInteger();
        int int18 = bytesModelValue12.asInt((-1));
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.formatMultiLine(printWriter19, (int) ' ');
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
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        boolean boolean9 = org.jboss.dmr.Base64.encodeToFile(byteArray6, "(\"\" => (\"hi!\" => 0.0))");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.jboss.dmr.Base64.encodeBytes(byteArray6, (int) (short) 10, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.format(printWriter6, (int) 'p', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList11 = listModelValue5.asPropertyList();
        java.lang.String str12 = listModelValue5.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode14 = listModelValue5.requireChild((int) '4');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [52]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(propertyList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str12, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        org.jboss.dmr.ModelNode modelNode5 = objectModelValue0.asObject();
        org.jboss.dmr.ModelNode modelNode6 = objectModelValue0.asObject();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.formatAsJSON(printWriter7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode6);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode6.asList();
        org.jboss.dmr.ListModelValue listModelValue8 = new org.jboss.dmr.ListModelValue(modelNodeList7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = listModelValue8.insertChild(2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNodeList7);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        java.lang.Throwable throwable3 = null;
        org.jboss.dmr.stream.ModelException modelException4 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable3);
        org.jboss.dmr.stream.ModelException modelException5 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException4);
        org.jboss.dmr.stream.ModelException modelException6 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException4);
        org.jboss.dmr.stream.ModelException modelException7 = new org.jboss.dmr.stream.ModelException("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", (java.lang.Throwable) modelException4);
        org.jboss.dmr.stream.ModelException modelException8 = new org.jboss.dmr.stream.ModelException("\"\\\"1L\\\"\"", (java.lang.Throwable) modelException4);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ValueExpression valueExpression8 = typeModelValue5.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.Property> propertyList9 = typeModelValue5.asPropertyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
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
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long3 = intModelValue1.asLong((long) '#');
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
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType2 = modelNode1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = inputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
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
        org.jboss.dmr.stream.ModelWriter modelWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue20.write(modelWriter26);
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
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
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

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue4 = new org.jboss.dmr.ExpressionValue(valueExpression3);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue4.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bigIntegerModelValue1.asLong((long) 'l');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.lang.String str5 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode1);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode1.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set((double) 0);
        org.jboss.dmr.ModelType modelType10 = org.jboss.dmr.ModelType.PROPERTY;
        char char11 = modelType10.getTypeChar();
        org.jboss.dmr.ModelNode modelNode12 = modelNode1.set("[(\"hi!\" => 0.0)]", modelType10);
        org.jboss.dmr.Property property13 = new org.jboss.dmr.Property("\"(\\\"hi!\\\" => 0.0)\"", modelNode12);
        org.jboss.dmr.ModelType modelType15 = org.jboss.dmr.ModelType.STRING;
        org.jboss.dmr.ModelNode modelNode16 = modelNode12.set("H4sIAAAAAAAAAAMAAAAAAAAAAAA=", modelType15);
        boolean boolean18 = modelNode16.has((-1));
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str5, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + modelType10 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType10.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'p' + "'", char11 == 'p');
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertTrue("'" + modelType15 + "' != '" + org.jboss.dmr.ModelType.STRING + "'", modelType15.equals(org.jboss.dmr.ModelType.STRING));
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        java.io.OutputStream outputStream4 = null;
        org.jboss.dmr.Base64.OutputStream outputStream5 = new org.jboss.dmr.Base64.OutputStream(outputStream4);
        outputStream5.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream7 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream5);
        org.jboss.dmr.Base64.OutputStream outputStream8 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream7);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue13 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger14 = booleanModelValue13.asBigInteger();
        byte[] byteArray15 = booleanModelValue13.asBytes();
        org.jboss.dmr.ModelNode modelNode16 = modelNode10.set("expression \"hi!\"", byteArray15);
        outputStream7.write(byteArray15);
        org.jboss.dmr.LongModelValue longModelValue19 = new org.jboss.dmr.LongModelValue(1L);
        long long20 = longModelValue19.asLong();
        byte[] byteArray21 = longModelValue19.asBytes();
        outputStream7.write(byteArray21, 2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = inputStream3.read(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        boolean boolean8 = bigDecimalModelValue7.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression9 = bigDecimalModelValue7.asExpression();
        org.jboss.dmr.stream.ModelWriter modelWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue7.write(modelWriter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(valueExpression9);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        int int5 = longModelValue1.asInt(0);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.format(printWriter6, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((long) (byte) 0);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        int int10 = inputStream2.read(byteArray6, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream12 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = inputStream2.read();
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
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = stringModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        java.io.PrintWriter printWriter0 = null;
        org.jboss.dmr.ModelValue.indent(printWriter0, (int) (byte) -1);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str2 = expressionValue1.toString();
        org.jboss.dmr.ModelNode modelNode4 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.set("hi!", 0.0d);
        org.jboss.dmr.Property property8 = new org.jboss.dmr.Property("", modelNode7);
        boolean boolean9 = expressionValue1.equals((java.lang.Object) property8);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = expressionValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "expression \"hi!\"" + "'", str2, "expression \"hi!\"");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
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
            valueExpression3.readExternal(objectInput9);
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
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode12 = modelNode6.set("Expression \"true\"", modelNode11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = modelNode12.add("EXPRESSION_VALUE", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode12);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = propertyModelValue10.asList();
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
        org.junit.Assert.assertNotNull(modelNodeList11);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        byte[] byteArray5 = stringModelValue3.asBytes();
        org.jboss.dmr.ValueExpression valueExpression6 = stringModelValue3.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = stringModelValue3.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(valueExpression6);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        org.jboss.dmr.ModelNode modelNode10 = listModelValue5.asObject();
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = modelNode10.addNoCopy(modelNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(modelNode10);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        int int6 = booleanModelValue1.asInt(52);
        org.jboss.dmr.stream.ModelWriter modelWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.write(modelWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromBase64String("32");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode5.remove("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode17 = modelNode14.set("hi!", 0.0d);
        java.lang.String str18 = modelNode14.toString();
        org.jboss.dmr.ModelNode modelNode19 = modelNode14.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode21 = modelNode14.set(100);
        org.jboss.dmr.ModelNode modelNode22 = modelNode13.add(modelNode14);
        org.jboss.dmr.Property property23 = new org.jboss.dmr.Property("", modelNode14);
        java.lang.String str24 = property23.getName();
        org.jboss.dmr.Property property25 = property23.clone();
        java.lang.String str26 = property23.getName();
        org.jboss.dmr.ModelNode modelNode27 = modelNode1.set(property23);
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.format(printWriter28, (int) (short) -1, false);
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
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(\"hi!\" => 0.0)" + "'", str18, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(modelNode27);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.setExpression("hi!", "(\"hi!\" => 0.0)");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = modelNode3.asInt((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
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
            org.jboss.dmr.ModelNode modelNode17 = propertyModelValue15.getChild("\"\\\"(\\\\\\\"hi!\\\\\\\" => 0.0)\\\"\"");
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
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ValueExpression valueExpression11 = expressionValue8.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue13 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression14 = expressionValue13.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue16 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str17 = expressionValue16.toString();
        org.jboss.dmr.ModelNode modelNode19 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode22 = modelNode19.set("hi!", 0.0d);
        org.jboss.dmr.Property property23 = new org.jboss.dmr.Property("", modelNode22);
        boolean boolean24 = expressionValue16.equals((java.lang.Object) property23);
        boolean boolean25 = expressionValue13.equals(expressionValue16);
        boolean boolean26 = expressionValue8.equals((java.lang.Object) boolean25);
        org.jboss.dmr.ValueExpression valueExpression27 = expressionValue8.asExpression();
        java.lang.String str29 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) valueExpression27, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(valueExpression11);
        org.junit.Assert.assertNotNull(valueExpression14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "expression \"hi!\"" + "'", str17, "expression \"hi!\"");
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(valueExpression27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BQADaGkh\neA==" + "'", str29, "rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BQADaGkh\neA==");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        boolean boolean4 = objectModelValue0.has((int) 'a');
        boolean boolean6 = objectModelValue0.has("");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = objectModelValue0.requireChild("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z?cy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA?AAAAeA==' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((int) 'a');
        org.jboss.dmr.ModelNode modelNode2 = modelNode1.setEmptyList();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = modelNode2.asBytesOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode2);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        byte[] byteArray2 = stringModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = stringModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = bigIntegerModelValue1.asBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromJSONString("rO0ABXNyABNqYXZhLmxhbmcuQ2hhcmFjdGVyNItH2WsaJngCAAFDAAV2YWx1ZXhwACM=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected character 'r' while reading DMR stream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.set("Expression \"1\"", (int) (byte) 1);
        org.jboss.dmr.ModelType modelType8 = modelNode3.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode3.add();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + modelType8 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType8.equals(org.jboss.dmr.ModelType.PROPERTY));
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = bigIntegerModelValue1.asLong((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.lang.String str12 = modelNode8.toString();
        org.jboss.dmr.ModelNode modelNode13 = modelNode8.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode15 = modelNode8.set(100);
        org.jboss.dmr.ModelNode modelNode16 = modelNode7.add(modelNode8);
        org.jboss.dmr.Property property17 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String str18 = property17.getName();
        org.jboss.dmr.Property property19 = property17.clone();
        java.lang.String str20 = property17.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode21 = modelNode4.add(property17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(\"hi!\" => 0.0)" + "'", str12, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
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
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        java.lang.String str7 = bytesModelValue4.asString();
        java.lang.String str8 = bytesModelValue4.asString();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatMultiLine(printWriter9, 32);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str8, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        java.lang.String str8 = listModelValue5.asString();
        org.jboss.dmr.ModelValue modelValue9 = listModelValue5.copy();
        org.jboss.dmr.stream.ModelWriter modelWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelValue9.write(modelWriter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str8, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertNotNull(modelValue9);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.lang.String str5 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode1);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode1.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set((double) 0);
        org.jboss.dmr.ModelType modelType10 = org.jboss.dmr.ModelType.PROPERTY;
        char char11 = modelType10.getTypeChar();
        org.jboss.dmr.ModelNode modelNode12 = modelNode1.set("[(\"hi!\" => 0.0)]", modelType10);
        org.jboss.dmr.Property property13 = new org.jboss.dmr.Property("\"(\\\"hi!\\\" => 0.0)\"", modelNode12);
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        int int16 = modelNode15.asInt();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = modelNode12.insert(modelNode15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str5, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + modelType10 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType10.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'p' + "'", char11 == 'p');
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.Property property12 = new org.jboss.dmr.Property("", modelNode11);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.set(property12);
        org.jboss.dmr.PropertyModelValue propertyModelValue15 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode13, false);
        java.util.List<org.jboss.dmr.Property> propertyList16 = propertyModelValue15.asPropertyList();
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue15.writeExternal(dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(propertyList16);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str4 = modelNode2.asString("true");
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("H4sIAAAAAAAAAAMAAAAAAAAAAAA=", modelNode2);
        java.io.InputStream inputStream6 = null;
        org.jboss.dmr.Base64.InputStream inputStream8 = new org.jboss.dmr.Base64.InputStream(inputStream6, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue10 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str11 = longModelValue10.asString();
        byte[] byteArray12 = longModelValue10.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue13 = new org.jboss.dmr.BytesModelValue(byteArray12);
        int int16 = inputStream8.read(byteArray12, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream18 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            modelNode2.readExternal((java.io.InputStream) inputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.clone();
        boolean boolean7 = modelNode0.asBoolean(true);
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        boolean boolean11 = modelNode8.equals((java.lang.Object) 100L);
        boolean boolean12 = modelNode0.equals(modelNode8);
        java.io.InputStream inputStream13 = null;
        org.jboss.dmr.Base64.InputStream inputStream15 = new org.jboss.dmr.Base64.InputStream(inputStream13, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream16 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream15);
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.readExternal((java.io.InputStream) inputStream16);
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
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.jboss.dmr.stream.ModelEvent modelEvent0 = org.jboss.dmr.stream.ModelEvent.LIST_END;
        org.junit.Assert.assertTrue("'" + modelEvent0 + "' != '" + org.jboss.dmr.stream.ModelEvent.LIST_END + "'", modelEvent0.equals(org.jboss.dmr.stream.ModelEvent.LIST_END));
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom(reader1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3GXAAEGV4cHJlc3Np\nb24gImhpISJiAAAAAQF4", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
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
        java.io.OutputStream outputStream41 = null;
        org.jboss.dmr.Base64.OutputStream outputStream42 = new org.jboss.dmr.Base64.OutputStream(outputStream41);
        outputStream42.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream44 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream42);
        // The following exception was thrown during execution in test generation
        try {
            modelNode27.writeBase64((java.io.OutputStream) outputStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        org.jboss.dmr.ModelValue modelValue10 = listModelValue5.protect();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = listModelValue5.requireChild("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(modelValue10);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        boolean boolean2 = doubleModelValue1.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression3 = doubleModelValue1.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver4 = org.jboss.dmr.ValueExpressionResolver.DEFAULT_RESOLVER;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = valueExpression3.resolveBigInteger(valueExpressionResolver4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(valueExpressionResolver4);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        int int2 = modelNode1.asInt();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode1.addEmptyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = valueExpression3.resolveInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
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
        org.jboss.dmr.stream.ModelWriter modelWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelValue13.write(modelWriter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        boolean boolean8 = bigDecimalModelValue7.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression9 = bigDecimalModelValue7.asExpression();
        org.jboss.dmr.IntModelValue intModelValue11 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long13 = intModelValue11.asLong((long) 'b');
        java.lang.String str14 = intModelValue11.asString();
        long long15 = intModelValue11.asLong();
        long long16 = intModelValue11.asLong();
        org.jboss.dmr.ValueExpression valueExpression17 = intModelValue11.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver18 = new org.jboss.dmr.ValueExpressionResolver();
        java.math.BigDecimal bigDecimal19 = valueExpression17.resolveBigDecimal(valueExpressionResolver18);
        boolean boolean20 = valueExpression9.equals(valueExpression17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = valueExpression9.resolveBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(valueExpression9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32" + "'", str14, "32");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(valueExpression17);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        boolean boolean8 = bigDecimalModelValue7.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression9 = bigDecimalModelValue7.asExpression();
        int int10 = bigDecimalModelValue7.asInt();
        long long11 = bigDecimalModelValue7.asLong();
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue7.writeExternal(dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(valueExpression9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(false);
        int int3 = modelNode1.asInt(2);
        org.jboss.dmr.ModelNode modelNode5 = modelNode1.set(52);
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = modelNode10.asList();
        org.jboss.dmr.ListModelValue listModelValue12 = new org.jboss.dmr.ListModelValue(modelNodeList11);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue12);
        org.jboss.dmr.ModelValue modelValue14 = listModelValue12.resolve();
        int int16 = listModelValue12.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList17 = listModelValue12.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList18 = listModelValue12.asPropertyList();
        org.jboss.dmr.ModelNode modelNode20 = listModelValue12.getChild((int) (short) 0);
        org.jboss.dmr.ModelNode modelNode21 = modelNode20.resolve();
        org.jboss.dmr.ModelNode modelNode22 = modelNode5.set("EXPRESSION_VALUE", modelNode21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean23 = modelNode5.asBooleanOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNodeList11);
        org.junit.Assert.assertNotNull(modelValue14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(propertyList17);
        org.junit.Assert.assertNotNull(propertyList18);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertNotNull(modelNode22);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
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
        org.jboss.dmr.ModelNode modelNode50 = modelNode47.set("Expression \"true\"", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode52 = modelNode50.require((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [-1]");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(modelNode50);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.StringModelValue stringModelValue5 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression6 = stringModelValue5.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode0.add(valueExpression6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(valueExpression6);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode(bigDecimal4);
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.set((double) (byte) 0);
        modelNode5.protect();
        org.jboss.dmr.IntModelValue intModelValue11 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str12 = intModelValue11.asString();
        double double14 = intModelValue11.asDouble((double) 2);
        java.math.BigDecimal bigDecimal15 = intModelValue11.asBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode5.set("", bigDecimal15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32" + "'", str12, "32");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal15);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(false);
        long long3 = booleanModelValue1.asLong((long) '#');
        byte[] byteArray4 = booleanModelValue1.asBytes();
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.writeJSONString(printWriter5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom(reader1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
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
        org.jboss.dmr.ModelNode modelNode22 = modelNode7.setExpression("\"(\\\"hi!\\\" => 0.0)\"", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.jboss.dmr.LongModelValue longModelValue25 = new org.jboss.dmr.LongModelValue(1L);
        long long27 = longModelValue25.asLong((long) (short) 0);
        java.lang.String str28 = longModelValue25.asString();
        byte[] byteArray29 = longModelValue25.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode30 = modelNode22.add("\"1L\"", byteArray29);
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
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        java.io.DataInput dataInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.readExternal(dataInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList11 = listModelValue5.asPropertyList();
        org.jboss.dmr.ModelNode modelNode13 = listModelValue5.getChild((int) (short) 0);
        org.jboss.dmr.ModelNode modelNode14 = modelNode13.resolve();
        java.io.ObjectInput objectInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode14.readExternal(objectInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(propertyList11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode14);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        boolean boolean4 = modelNode1.isProtected();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode1.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bigIntegerModelValue1.asDouble(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
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
        org.jboss.dmr.ModelNode modelNode47 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode50 = modelNode47.set("hi!", 0.0d);
        org.jboss.dmr.Property property51 = new org.jboss.dmr.Property("", modelNode50);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode53 = modelNode50.get(strArray52);
        org.jboss.dmr.ModelNode modelNode54 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int55 = modelNode54.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode56 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode59 = modelNode56.setExpression("hi!", "hi!");
        java.lang.String str60 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode56);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList61 = modelNode56.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode62 = modelNode54.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList61);
        org.jboss.dmr.ModelNode modelNode63 = modelNode53.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList61);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList64 = modelNode1.asList(modelNodeList61);
        modelNode1.protect();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode67 = modelNode1.set((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(modelNode53);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNotNull(modelNode59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str60, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList61);
        org.junit.Assert.assertNotNull(modelNode62);
        org.junit.Assert.assertNotNull(modelNode63);
        org.junit.Assert.assertNotNull(modelNodeList64);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode1.addEmptyObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
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
            org.jboss.dmr.ModelNode modelNode15 = modelNode0.require(0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [0]");
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
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.format(printWriter7, 100, true);
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
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        boolean boolean5 = valueExpression3.equals((java.lang.Object) 'p');
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue(valueExpression3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = valueExpression3.resolveLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
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
            org.jboss.dmr.ModelNode modelNode13 = listModelValue5.getChild((int) 'p');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.ZERO;
        org.jboss.dmr.ModelType modelType2 = org.jboss.dmr.ModelType.PROPERTY;
        char char3 = modelType2.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue4 = org.jboss.dmr.TypeModelValue.of(modelType2);
        org.jboss.dmr.ModelType modelType5 = org.jboss.dmr.ModelType.PROPERTY;
        char char6 = modelType5.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue7 = org.jboss.dmr.TypeModelValue.of(modelType5);
        boolean boolean8 = typeModelValue4.equals(typeModelValue7);
        java.lang.String str9 = typeModelValue7.asString();
        org.jboss.dmr.ModelType modelType10 = org.jboss.dmr.ModelType.PROPERTY;
        char char11 = modelType10.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue12 = org.jboss.dmr.TypeModelValue.of(modelType10);
        org.jboss.dmr.ModelType modelType13 = org.jboss.dmr.ModelType.PROPERTY;
        char char14 = modelType13.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue15 = org.jboss.dmr.TypeModelValue.of(modelType13);
        boolean boolean16 = typeModelValue12.equals(typeModelValue15);
        java.lang.String str17 = typeModelValue15.asString();
        boolean boolean19 = typeModelValue15.asBoolean(true);
        boolean boolean20 = typeModelValue7.equals(typeModelValue15);
        org.jboss.dmr.ValueExpression valueExpression21 = typeModelValue15.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode22 = modelNode0.set("{ \"35\" : 0.0 }", valueExpression21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + modelType2 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType2.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'p' + "'", char3 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue4);
        org.junit.Assert.assertTrue("'" + modelType5 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType5.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'p' + "'", char6 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PROPERTY" + "'", str9, "PROPERTY");
        org.junit.Assert.assertTrue("'" + modelType10 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType10.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'p' + "'", char11 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue12);
        org.junit.Assert.assertTrue("'" + modelType13 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType13.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'p' + "'", char14 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PROPERTY" + "'", str17, "PROPERTY");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(valueExpression21);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelValue modelValue2 = objectModelValue0.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = modelValue2.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelValue2);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = inputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ModelValue modelValue11 = expressionValue1.resolve();
        java.lang.String str12 = expressionValue1.asString();
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.writeExternal(dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(modelValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        int int10 = inputStream2.read(byteArray6, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream2.close();
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
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long3 = longModelValue1.asLong((long) (short) 0);
        double double4 = longModelValue1.asDouble();
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.writeString(printWriter5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
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
        java.math.BigInteger bigInteger16 = bytesModelValue12.asBigInteger();
        int int18 = bytesModelValue12.asInt((-1));
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.formatMultiLine(printWriter19, (int) 'p');
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
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        boolean boolean5 = objectModelValue0.asBoolean();
        org.jboss.dmr.ModelNode modelNode7 = objectModelValue0.getChild("1L");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode7.remove("10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = longModelValue1.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom("PROPERTY", true);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Unexpected character 'P' while reading DMR stream");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ModelType modelType8 = org.jboss.dmr.ModelType.PROPERTY;
        char char9 = modelType8.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue10 = org.jboss.dmr.TypeModelValue.of(modelType8);
        org.jboss.dmr.ModelType modelType11 = org.jboss.dmr.ModelType.PROPERTY;
        char char12 = modelType11.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue13 = org.jboss.dmr.TypeModelValue.of(modelType11);
        boolean boolean14 = typeModelValue10.equals(typeModelValue13);
        java.lang.String str15 = typeModelValue13.asString();
        boolean boolean17 = typeModelValue13.asBoolean(true);
        boolean boolean18 = typeModelValue5.equals(typeModelValue13);
        org.jboss.dmr.ValueExpression valueExpression19 = typeModelValue13.asExpression();
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue13.formatAsJSON(printWriter20, (int) (short) -1, false);
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
        org.junit.Assert.assertTrue("'" + modelType8 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType8.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'p' + "'", char9 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue10);
        org.junit.Assert.assertTrue("'" + modelType11 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType11.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'p' + "'", char12 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PROPERTY" + "'", str15, "PROPERTY");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(valueExpression19);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str2 = intModelValue1.asString();
        long long3 = intModelValue1.asLong();
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.lang.Throwable throwable1 = null;
        org.jboss.dmr.stream.ModelException modelException2 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable1);
        org.jboss.dmr.stream.ModelException modelException3 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        org.jboss.dmr.stream.ModelException modelException4 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        java.lang.Throwable throwable6 = null;
        org.jboss.dmr.stream.ModelException modelException7 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable6);
        org.jboss.dmr.stream.ModelException modelException8 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException7);
        java.lang.Throwable throwable10 = null;
        org.jboss.dmr.stream.ModelException modelException11 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable10);
        org.jboss.dmr.stream.ModelException modelException12 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException11);
        modelException7.addSuppressed((java.lang.Throwable) modelException11);
        java.lang.Throwable[] throwableArray14 = modelException11.getSuppressed();
        modelException4.addSuppressed((java.lang.Throwable) modelException11);
        java.lang.String str16 = modelException4.toString();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str16, "org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        long long6 = listModelValue5.asLong();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = listModelValue5.asDouble((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = inputStream4.markSupported();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        boolean boolean4 = objectModelValue0.has((int) 'a');
        boolean boolean6 = objectModelValue0.has("");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = objectModelValue0.requireChild("(\"hi!\" => expression \"(\\\"hi!\\\" => 0.0)\")");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '(\"hi!\" => expression \"(\\\"hi!\\\" => 0.0)\")' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
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
        org.jboss.dmr.ModelNode modelNode16 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode19 = modelNode16.set("hi!", 0.0d);
        org.jboss.dmr.Property property20 = new org.jboss.dmr.Property("", modelNode19);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode22 = modelNode19.get(strArray21);
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList27 = modelNode26.asList();
        org.jboss.dmr.ListModelValue listModelValue28 = new org.jboss.dmr.ListModelValue(modelNodeList27);
        org.jboss.dmr.ModelNode modelNode29 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue28);
        org.jboss.dmr.ModelValue modelValue30 = listModelValue28.resolve();
        int int32 = listModelValue28.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList33 = listModelValue28.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList34 = modelNode22.asPropertyList(propertyList33);
        org.jboss.dmr.ModelNode modelNode36 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode39 = modelNode36.set("hi!", 0.0d);
        org.jboss.dmr.Property property40 = new org.jboss.dmr.Property("", modelNode39);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode42 = modelNode39.get(strArray41);
        org.jboss.dmr.ModelNode modelNode43 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode46 = modelNode43.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList47 = modelNode46.asList();
        org.jboss.dmr.ListModelValue listModelValue48 = new org.jboss.dmr.ListModelValue(modelNodeList47);
        org.jboss.dmr.ModelNode modelNode49 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue48);
        org.jboss.dmr.ModelValue modelValue50 = listModelValue48.resolve();
        int int52 = listModelValue48.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList53 = listModelValue48.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList54 = modelNode42.asPropertyList(propertyList53);
        modelNode22.setNoCopy(modelNode42);
        boolean boolean56 = expressionValue12.equals((java.lang.Object) modelNode22);
        java.io.PrintWriter printWriter57 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue12.format(printWriter57, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelNodeList27);
        org.junit.Assert.assertNotNull(modelValue30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(propertyList33);
        org.junit.Assert.assertNotNull(propertyList34);
        org.junit.Assert.assertNotNull(modelNode39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(modelNode42);
        org.junit.Assert.assertNotNull(modelNode46);
        org.junit.Assert.assertNotNull(modelNodeList47);
        org.junit.Assert.assertNotNull(modelValue50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(propertyList53);
        org.junit.Assert.assertNotNull(propertyList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        java.io.ObjectOutput objectOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.writeExternal(objectOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelValue modelValue6 = listModelValue5.resolve();
        boolean boolean8 = listModelValue5.has((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = listModelValue5.getChild((int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger64 = modelNode12.asBigIntegerOrNull();
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
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        boolean boolean10 = listModelValue5.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = listModelValue5.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        boolean boolean9 = listModelValue5.asBoolean();
        org.jboss.dmr.stream.ModelWriter modelWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.write(modelWriter10);
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
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ValueExpression valueExpression3 = typeModelValue2.asExpression();
        java.io.DataOutput dataOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue2.writeExternal(dataOutput4);
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
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str2 = intModelValue1.asString();
        double double4 = intModelValue1.asDouble((double) 2);
        java.math.BigDecimal bigDecimal5 = intModelValue1.asBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue6 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal5);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = bigDecimalModelValue6.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set((double) 0);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(false);
        int int12 = modelNode10.asInt(2);
        org.jboss.dmr.ModelNode modelNode14 = modelNode10.set(52);
        org.jboss.dmr.LongModelValue longModelValue17 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str18 = longModelValue17.asString();
        byte[] byteArray19 = longModelValue17.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue20 = new org.jboss.dmr.BytesModelValue(byteArray19);
        java.lang.String str21 = bytesModelValue20.asString();
        int int22 = bytesModelValue20.asInt();
        int int23 = bytesModelValue20.asInt();
        org.jboss.dmr.LongModelValue longModelValue25 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str26 = longModelValue25.asString();
        byte[] byteArray27 = longModelValue25.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue28 = new org.jboss.dmr.BytesModelValue(byteArray27);
        double double29 = bytesModelValue28.asDouble();
        boolean boolean30 = bytesModelValue20.equals(bytesModelValue28);
        org.jboss.dmr.LongModelValue longModelValue32 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str33 = longModelValue32.asString();
        byte[] byteArray34 = longModelValue32.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue35 = new org.jboss.dmr.BytesModelValue(byteArray34);
        boolean boolean36 = bytesModelValue28.equals(bytesModelValue35);
        java.math.BigInteger bigInteger37 = bytesModelValue35.asBigInteger();
        org.jboss.dmr.ModelNode modelNode38 = modelNode14.set("1.0", bigInteger37);
        org.jboss.dmr.ModelNode modelNode39 = modelNode7.set("expression \"hi!\"", bigInteger37);
        java.io.OutputStream outputStream40 = null;
        org.jboss.dmr.Base64.OutputStream outputStream41 = new org.jboss.dmr.Base64.OutputStream(outputStream40);
        outputStream41.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream43 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream41);
        org.jboss.dmr.Base64.OutputStream outputStream44 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream43);
        outputStream43.flushBase64();
        org.jboss.dmr.Base64.OutputStream outputStream46 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream43);
        org.jboss.dmr.Base64.OutputStream outputStream47 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream43);
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.writeBase64((java.io.OutputStream) outputStream43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str21, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.9E-324d + "'", double29 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(modelNode38);
        org.junit.Assert.assertNotNull(modelNode39);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        java.lang.String str5 = bigIntegerModelValue4.asString();
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.writeExternal(dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("TYPE_MODEL_VALUE");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property2 = expressionValue1.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
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
            long long16 = modelNode13.asLong();
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
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        java.lang.String str8 = listModelValue5.asString();
        org.jboss.dmr.ModelValue modelValue9 = listModelValue5.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = listModelValue5.removeChild(32);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [32]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str8, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertNotNull(modelValue9);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal2 = longModelValue1.asBigDecimal();
        int int3 = longModelValue1.asInt();
        org.jboss.dmr.ValueExpression valueExpression4 = longModelValue1.asExpression();
        java.lang.String str5 = longModelValue1.asString();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(valueExpression4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52" + "'", str5, "52");
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        long long5 = booleanModelValue1.asLong();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType6 = booleanModelValue1.asType();
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
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode7.resolve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long9 = modelNode8.asLongOrNull();
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
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        java.lang.String str8 = valueExpression5.getExpressionString();
        java.lang.String str9 = valueExpression5.resolveString();
        org.jboss.dmr.ExpressionValue expressionValue10 = new org.jboss.dmr.ExpressionValue(valueExpression5);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue10.format(printWriter11, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0" + "'", str8, "1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0" + "'", str9, "1.0");
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue3.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
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
        org.jboss.dmr.ModelNode modelNode13 = objectModelValue7.asObject();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = objectModelValue7.getChild(100);
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
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("1");
        boolean boolean5 = objectModelValue0.asBoolean();
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.writeExternal(dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = valueExpression3.toString();
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression7 = expressionValue6.asExpression();
        boolean boolean8 = valueExpression3.equals(valueExpression7);
        org.jboss.dmr.LongModelValue longModelValue10 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal11 = longModelValue10.asBigDecimal();
        int int12 = longModelValue10.asInt();
        org.jboss.dmr.ValueExpression valueExpression13 = longModelValue10.asExpression();
        boolean boolean14 = valueExpression7.equals(valueExpression13);
        org.jboss.dmr.StringModelValue stringModelValue16 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue18 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean19 = stringModelValue16.equals(stringModelValue18);
        byte[] byteArray20 = stringModelValue18.asBytes();
        org.jboss.dmr.ValueExpression valueExpression21 = stringModelValue18.asExpression();
        boolean boolean22 = valueExpression13.equals(valueExpression21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = valueExpression13.resolveBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Expression \"true\"" + "'", str4, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(valueExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(valueExpression21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        org.jboss.dmr.BooleanModelValue booleanModelValue9 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long10 = booleanModelValue9.asLong();
        org.jboss.dmr.ValueExpression valueExpression11 = booleanModelValue9.asExpression();
        java.lang.String str12 = valueExpression11.toString();
        org.jboss.dmr.ExpressionValue expressionValue14 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression15 = expressionValue14.asExpression();
        boolean boolean16 = valueExpression11.equals(valueExpression15);
        java.lang.String str17 = valueExpression15.resolveString();
        org.jboss.dmr.ModelNode modelNode18 = modelNode3.set("Expression \"1\"", valueExpression15);
        java.io.ObjectOutput objectOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression15.writeExternal(objectOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(valueExpression11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Expression \"true\"" + "'", str12, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(modelNode18);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str2 = expressionValue1.toString();
        org.jboss.dmr.stream.ModelWriter modelWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.write(modelWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "expression \"hi!\"" + "'", str2, "expression \"hi!\"");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
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
            org.jboss.dmr.ModelNode modelNode13 = modelNode10.remove("1");
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
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
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
        org.jboss.dmr.ModelNode modelNode65 = new org.jboss.dmr.ModelNode();
        java.lang.Long long66 = modelNode65.asLongOrNull();
        java.lang.String str67 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode65);
        org.jboss.dmr.ModelNode modelNode69 = modelNode65.add(10L);
        org.jboss.dmr.BooleanModelValue booleanModelValue71 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long72 = booleanModelValue71.asLong();
        org.jboss.dmr.ValueExpression valueExpression73 = booleanModelValue71.asExpression();
        java.lang.String str74 = valueExpression73.toString();
        org.jboss.dmr.ExpressionValue expressionValue76 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression77 = expressionValue76.asExpression();
        boolean boolean78 = valueExpression73.equals(valueExpression77);
        org.jboss.dmr.LongModelValue longModelValue80 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal81 = longModelValue80.asBigDecimal();
        int int82 = longModelValue80.asInt();
        org.jboss.dmr.ValueExpression valueExpression83 = longModelValue80.asExpression();
        boolean boolean84 = valueExpression77.equals(valueExpression83);
        org.jboss.dmr.StringModelValue stringModelValue86 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue88 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean89 = stringModelValue86.equals(stringModelValue88);
        byte[] byteArray90 = stringModelValue88.asBytes();
        org.jboss.dmr.ValueExpression valueExpression91 = stringModelValue88.asExpression();
        boolean boolean92 = valueExpression83.equals(valueExpression91);
        org.jboss.dmr.ModelNode modelNode93 = modelNode69.set(valueExpression91);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode94 = modelNode0.add("[1]", valueExpression91);
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
        org.junit.Assert.assertNull(long66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4" + "'", str67, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
        org.junit.Assert.assertNotNull(modelNode69);
        org.junit.Assert.assertNotNull(booleanModelValue71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(valueExpression73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Expression \"true\"" + "'", str74, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertNotNull(valueExpression83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(valueExpression91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(modelNode93);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = modelNode4.asDouble((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.LongModelValue longModelValue12 = new org.jboss.dmr.LongModelValue(1L);
        long long13 = longModelValue12.asLong();
        byte[] byteArray14 = longModelValue12.asBytes();
        org.jboss.dmr.ModelNode modelNode15 = modelNode0.add("EXPRESSION_VALUE", byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = modelNode15.asBigDecimalOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stringModelValue3.asInt((int) 'p');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        double double6 = bigIntegerModelValue4.asDouble((double) 'b');
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.writeExternal(dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
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
        java.math.BigDecimal bigDecimal16 = bytesModelValue12.asBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = bytesModelValue12.removeChild("Expression \"true\"");
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
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(bigDecimal16);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
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
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.formatMultiLine(printWriter21, (-1));
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
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.get("Expression \"true\"");
        org.jboss.dmr.IntModelValue intModelValue10 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str11 = intModelValue10.asString();
        double double13 = intModelValue10.asDouble((double) 2);
        java.math.BigInteger bigInteger14 = intModelValue10.asBigInteger();
        org.jboss.dmr.ModelNode modelNode15 = modelNode7.set("Expression \"true\"", bigInteger14);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger16 = modelNode15.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        byte[] byteArray5 = stringModelValue3.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = stringModelValue3.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.stream.ModelReader modelReader5 = modelStreamFactory1.newModelReader(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        java.lang.String str12 = modelNode8.toString();
        org.jboss.dmr.ModelNode modelNode13 = modelNode8.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode15 = modelNode8.set(100);
        org.jboss.dmr.ModelNode modelNode16 = modelNode7.add(modelNode8);
        org.jboss.dmr.Property property17 = new org.jboss.dmr.Property("", modelNode8);
        java.lang.String str18 = property17.getName();
        org.jboss.dmr.ModelNode modelNode19 = modelNode5.set(property17);
        java.io.DataInput dataInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode19.readExternal(dataInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(\"hi!\" => 0.0)" + "'", str12, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(modelNode19);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode26 = bytesModelValue20.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.stream.ModelReader modelReader16 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream4, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        org.jboss.dmr.ModelType modelType8 = org.jboss.dmr.ModelType.PROPERTY;
        char char9 = modelType8.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue10 = org.jboss.dmr.TypeModelValue.of(modelType8);
        org.jboss.dmr.ModelType modelType11 = org.jboss.dmr.ModelType.PROPERTY;
        char char12 = modelType11.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue13 = org.jboss.dmr.TypeModelValue.of(modelType11);
        boolean boolean14 = typeModelValue10.equals(typeModelValue13);
        java.lang.String str15 = typeModelValue13.asString();
        org.jboss.dmr.ValueExpression valueExpression16 = typeModelValue13.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode17 = modelNode0.add(valueExpression16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + modelType8 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType8.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'p' + "'", char9 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue10);
        org.junit.Assert.assertTrue("'" + modelType11 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType11.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'p' + "'", char12 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PROPERTY" + "'", str15, "PROPERTY");
        org.junit.Assert.assertNotNull(valueExpression16);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal2 = longModelValue1.asBigDecimal();
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue((-1L));
        long long6 = longModelValue4.asLong((long) (byte) -1);
        int int8 = longModelValue4.asInt(0);
        boolean boolean9 = longModelValue1.equals(longModelValue4);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue4.writeExternal(dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3GXAAEGV4cHJlc3Np\nb24gImhpISJiAAAAAQF4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3GXAAEGV4cHJlc3Np?b24gImhpISJiAAAAAQF4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long2 = longModelValue1.asLong();
        byte[] byteArray3 = longModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet4 = longModelValue1.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
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
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        org.jboss.dmr.stream.ModelEvent modelEvent6 = org.jboss.dmr.stream.ModelEvent.UNDEFINED;
        boolean boolean7 = stringModelValue1.equals((java.lang.Object) modelEvent6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = stringModelValue1.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertTrue("'" + modelEvent6 + "' != '" + org.jboss.dmr.stream.ModelEvent.UNDEFINED + "'", modelEvent6.equals(org.jboss.dmr.stream.ModelEvent.UNDEFINED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom("0.0", true);
        java.io.InputStream inputStream7 = null;
        org.jboss.dmr.Base64.InputStream inputStream9 = new org.jboss.dmr.Base64.InputStream(inputStream7, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream10 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream9);
        org.jboss.dmr.Base64.InputStream inputStream11 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream10);
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode14 = modelNodeFactory0.readFrom((java.io.InputStream) inputStream10, charset12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode6);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
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
            java.lang.Long long15 = modelNode14.asLongOrNull();
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
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Long long1 = modelNode0.asLongOrNull();
        java.lang.String str2 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(10L);
        java.io.InputStream inputStream5 = null;
        org.jboss.dmr.Base64.InputStream inputStream7 = new org.jboss.dmr.Base64.InputStream(inputStream5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            modelNode4.readExternal(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4" + "'", str2, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        org.jboss.dmr.ModelValue modelValue11 = listModelValue5.clone();
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
        org.junit.Assert.assertNotNull(modelValue11);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        java.lang.Throwable throwable1 = null;
        org.jboss.dmr.stream.ModelException modelException2 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable1);
        org.jboss.dmr.stream.ModelException modelException3 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        org.jboss.dmr.stream.ModelException modelException4 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException2);
        java.lang.String str5 = modelException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]" + "'", str5, "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelType modelType5 = modelNode3.getType();
        org.jboss.dmr.TypeModelValue typeModelValue6 = org.jboss.dmr.TypeModelValue.of(modelType5);
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue6.formatAsJSON(printWriter7, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + modelType5 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType5.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertNotNull(typeModelValue6);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        org.jboss.dmr.stream.ModelEvent modelEvent6 = org.jboss.dmr.stream.ModelEvent.UNDEFINED;
        boolean boolean7 = stringModelValue1.equals((java.lang.Object) modelEvent6);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = stringModelValue1.asDouble((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertTrue("'" + modelEvent6 + "' != '" + org.jboss.dmr.stream.ModelEvent.UNDEFINED + "'", modelEvent6.equals(org.jboss.dmr.stream.ModelEvent.UNDEFINED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = stringModelValue1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        java.lang.Boolean boolean4 = modelNode1.asBooleanOrNull();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        java.lang.String str9 = modelNode5.toString();
        org.jboss.dmr.ModelNode modelNode10 = modelNode5.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode12 = modelNode5.set(100);
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode17 = modelNode15.set((int) '#');
        org.jboss.dmr.ModelNode modelNode18 = modelNode5.setNoCopy("EXPRESSION_VALUE", modelNode17);
        org.jboss.dmr.ModelNode modelNode19 = modelNode18.resolve();
        org.jboss.dmr.ModelType modelType20 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode(modelType20);
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.set("hi!", 0.0d);
        org.jboss.dmr.Property property27 = new org.jboss.dmr.Property("", modelNode26);
        org.jboss.dmr.ModelNode modelNode28 = modelNode21.set(property27);
        org.jboss.dmr.PropertyModelValue propertyModelValue29 = new org.jboss.dmr.PropertyModelValue(property27);
        org.jboss.dmr.PropertyModelValue propertyModelValue30 = new org.jboss.dmr.PropertyModelValue(property27);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList31 = propertyModelValue30.asList();
        org.jboss.dmr.ModelNode modelNode32 = modelNode19.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList31);
        org.jboss.dmr.IntModelValue intModelValue35 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str36 = intModelValue35.asString();
        double double38 = intModelValue35.asDouble((double) 2);
        java.math.BigDecimal bigDecimal39 = intModelValue35.asBigDecimal();
        org.jboss.dmr.ModelNode modelNode40 = modelNode32.add("(\"hi!\" => 0.0)", bigDecimal39);
        org.jboss.dmr.ModelNode modelNode41 = modelNode1.set(bigDecimal39);
        java.io.PrintWriter printWriter42 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode41.formatAsJSON(printWriter42, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(\"hi!\" => 0.0)" + "'", str9, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(modelNode18);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertTrue("'" + modelType20 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType20.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(modelNodeList31);
        org.junit.Assert.assertNotNull(modelNode32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "32" + "'", str36, "32");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 32.0d + "'", double38 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(modelNode40);
        org.junit.Assert.assertNotNull(modelNode41);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = stringModelValue1.asBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
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
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long19 = modelNode18.asLong();
        org.jboss.dmr.ValueExpression valueExpression20 = modelNode18.asExpression();
        java.math.BigDecimal bigDecimal21 = valueExpression20.resolveBigDecimal();
        java.lang.String str22 = valueExpression20.getExpressionString();
        java.math.BigDecimal bigDecimal23 = valueExpression20.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue24 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal23);
        boolean boolean25 = bigDecimalModelValue24.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression26 = bigDecimalModelValue24.asExpression();
        org.jboss.dmr.IntModelValue intModelValue28 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long30 = intModelValue28.asLong((long) 'b');
        java.lang.String str31 = intModelValue28.asString();
        long long32 = intModelValue28.asLong();
        long long33 = intModelValue28.asLong();
        org.jboss.dmr.ValueExpression valueExpression34 = intModelValue28.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver35 = new org.jboss.dmr.ValueExpressionResolver();
        java.math.BigDecimal bigDecimal36 = valueExpression34.resolveBigDecimal(valueExpressionResolver35);
        boolean boolean37 = valueExpression26.equals(valueExpression34);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode38 = modelNode16.add(valueExpression34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(valueExpression20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1.0" + "'", str22, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(valueExpression26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "32" + "'", str31, "32");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNotNull(valueExpression34);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = stringModelValue1.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"rO0ABXNyA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str2 = intModelValue1.asString();
        double double4 = intModelValue1.asDouble((double) 2);
        java.math.BigDecimal bigDecimal5 = intModelValue1.asBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue6 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal5);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue6.writeExternal(dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(false);
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
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ModelType modelType8 = org.jboss.dmr.ModelType.PROPERTY;
        char char9 = modelType8.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue10 = org.jboss.dmr.TypeModelValue.of(modelType8);
        org.jboss.dmr.ModelType modelType11 = org.jboss.dmr.ModelType.PROPERTY;
        char char12 = modelType11.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue13 = org.jboss.dmr.TypeModelValue.of(modelType11);
        boolean boolean14 = typeModelValue10.equals(typeModelValue13);
        java.lang.String str15 = typeModelValue13.asString();
        boolean boolean17 = typeModelValue13.asBoolean(true);
        boolean boolean18 = typeModelValue5.equals(typeModelValue13);
        org.jboss.dmr.stream.ModelWriter modelWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue5.write(modelWriter19);
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
        org.junit.Assert.assertTrue("'" + modelType8 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType8.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'p' + "'", char9 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue10);
        org.junit.Assert.assertTrue("'" + modelType11 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType11.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'p' + "'", char12 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PROPERTY" + "'", str15, "PROPERTY");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        java.io.OutputStream outputStream1 = null;
        org.jboss.dmr.Base64.OutputStream outputStream2 = new org.jboss.dmr.Base64.OutputStream(outputStream1);
        outputStream2.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream2);
        org.jboss.dmr.Base64.OutputStream outputStream5 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream4);
        org.jboss.dmr.BooleanModelValue booleanModelValue7 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger8 = booleanModelValue7.asBigInteger();
        byte[] byteArray9 = booleanModelValue7.asBytes();
        boolean boolean11 = org.jboss.dmr.Base64.encodeToFile(byteArray9, "1L");
        boolean boolean13 = org.jboss.dmr.Base64.encodeToFile(byteArray9, "[(\"hi!\" => 0.0)]");
        outputStream5.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeExternal((java.io.OutputStream) outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertNotNull(booleanModelValue7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str2 = expressionValue1.toString();
        org.jboss.dmr.ModelValue modelValue3 = expressionValue1.resolve();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = expressionValue1.asBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "expression \"hi!\"" + "'", str2, "expression \"hi!\"");
        org.junit.Assert.assertNotNull(modelValue3);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        boolean boolean11 = modelNode8.equals((java.lang.Object) 100L);
        boolean boolean12 = modelNode0.equals(modelNode8);
        org.jboss.dmr.DoubleModelValue doubleModelValue14 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long15 = doubleModelValue14.asLong();
        boolean boolean17 = doubleModelValue14.asBoolean(true);
        byte[] byteArray18 = doubleModelValue14.asBytes();
        org.jboss.dmr.ModelNode modelNode19 = modelNode0.set(byteArray18);
        java.io.ObjectOutput objectOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode19.writeExternal(objectOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[64, 36, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(modelNode19);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        boolean boolean7 = stringModelValue3.equals(stringModelValue6);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stringModelValue3.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==" + "'", str1, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
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
        int int24 = listModelValue16.asInt();
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue16.format(printWriter25, (int) 'b', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.writeExternal(dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.formatAsJSON(printWriter6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        int int11 = modelNode1.asInt(2);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode17 = modelNode14.set("hi!", 0.0d);
        java.lang.String str18 = modelNode14.toString();
        org.jboss.dmr.ModelNode modelNode19 = modelNode14.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode21 = modelNode14.set(100);
        org.jboss.dmr.ModelNode modelNode22 = modelNode13.add(modelNode14);
        org.jboss.dmr.Property property23 = new org.jboss.dmr.Property("", modelNode14);
        java.lang.String str24 = property23.getName();
        org.jboss.dmr.Property property25 = property23.clone();
        java.lang.String str26 = property23.getName();
        org.jboss.dmr.ModelNode modelNode27 = modelNode1.set(property23);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode29 = modelNode1.insert((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(\"hi!\" => 0.0)" + "'", str18, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(modelNode27);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("{}");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = stringModelValue1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"{}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromJSONString("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected character 'o' while reading DMR stream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.ZERO_LONG;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode0.add("rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BQADaGkh\neA==", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode0.add("1", "0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger2 = booleanModelValue1.asBigInteger();
        int int3 = booleanModelValue1.asInt();
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("(\"hi!\" => 0.0)");
        java.io.OutputStream outputStream2 = null;
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream(outputStream2);
        outputStream3.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream5 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3);
        org.jboss.dmr.Base64.OutputStream outputStream6 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream5);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue11 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger12 = booleanModelValue11.asBigInteger();
        byte[] byteArray13 = booleanModelValue11.asBytes();
        org.jboss.dmr.ModelNode modelNode14 = modelNode8.set("expression \"hi!\"", byteArray13);
        outputStream5.write(byteArray13);
        org.jboss.dmr.ModelNode modelNode16 = modelNode1.set(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.jboss.dmr.Base64.encodeBytes(byteArray13, 32, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode16);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set((double) 0);
        boolean boolean8 = modelNode0.isProtected();
        boolean boolean10 = modelNode0.hasDefined("[(\"hi!\" => 0.0)]");
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.set("hi!", (long) (short) 100);
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeString(printWriter14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode15 = modelNode12.set("hi!", 0.0d);
        org.jboss.dmr.Property property16 = new org.jboss.dmr.Property("", modelNode15);
        boolean boolean18 = modelNode15.equals((java.lang.Object) 100L);
        boolean boolean19 = modelNode7.equals(modelNode15);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.get(strArray26);
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int29 = modelNode28.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode30 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode33 = modelNode30.setExpression("hi!", "hi!");
        java.lang.String str34 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode30);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList35 = modelNode30.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode36 = modelNode28.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList35);
        org.jboss.dmr.ModelNode modelNode37 = modelNode27.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList35);
        org.jboss.dmr.ModelNode modelNode38 = modelNode15.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList35);
        org.jboss.dmr.ModelNode modelNode40 = modelNode15.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode41 = modelNode0.add("{}", modelNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"hi!\" => 0.0)" + "'", str4, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(modelNode33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str34, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList35);
        org.junit.Assert.assertNotNull(modelNode36);
        org.junit.Assert.assertNotNull(modelNode37);
        org.junit.Assert.assertNotNull(modelNode38);
        org.junit.Assert.assertNotNull(modelNode40);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        org.jboss.dmr.ModelNode modelNode16 = modelNode0.setExpression("(\"\" => (\"hi!\" => 0.0))", "");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = modelNode16.asBigIntegerOrNull();
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
        org.junit.Assert.assertNotNull(modelNode16);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jboss.dmr.Base64.encodeBytes(byteArray15, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        java.lang.Boolean boolean4 = modelNode1.asBooleanOrNull();
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.Validation.validate(modelNode1, "10.0");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode1.add(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("(\"hi!\" => expression \"hi!\")");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file (\"hi!\" => expression \"hi!\")");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(false);
        long long3 = booleanModelValue1.asLong((long) 32);
        int int4 = booleanModelValue1.asInt();
        org.jboss.dmr.ModelNode modelNode5 = org.jboss.dmr.ModelNode.FALSE;
        boolean boolean6 = booleanModelValue1.equals((java.lang.Object) modelNode5);
        boolean boolean8 = booleanModelValue1.asBoolean(true);
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode0.add((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.get("Expression \"true\"");
        org.jboss.dmr.IntModelValue intModelValue10 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str11 = intModelValue10.asString();
        double double13 = intModelValue10.asDouble((double) 2);
        java.math.BigInteger bigInteger14 = intModelValue10.asBigInteger();
        org.jboss.dmr.ModelNode modelNode15 = modelNode7.set("Expression \"true\"", bigInteger14);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = modelNode15.asBigDecimalOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        byte[] byteArray5 = stringModelValue3.asBytes();
        java.lang.Object obj6 = null;
        boolean boolean7 = stringModelValue3.equals(obj6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stringModelValue3.asInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        boolean boolean2 = org.jboss.dmr.Base64.decodeToFile("\"(\\\"hi!\\\" => 0.0)\"", "10.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.ModelNode modelNode2 = modelNode1.clear();
        boolean boolean4 = modelNode1.has((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode1.require(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [10]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromString("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3CUQ/8AAAAAAAAHg=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected character 'r' while reading DMR stream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double3 = booleanModelValue2.asDouble();
        org.jboss.dmr.ModelValue modelValue4 = booleanModelValue2.copy();
        java.math.BigInteger bigInteger5 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue6 = new org.jboss.dmr.BigIntegerModelValue(bigInteger5);
        java.lang.String str7 = bigIntegerModelValue6.asString();
        java.math.BigInteger bigInteger8 = bigIntegerModelValue6.asBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode0.set("{ \"35\" : 0.0 }", bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        boolean boolean5 = modelNode3.hasDefined("");
        modelNode3.protect();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode3.require("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode0.add((int) 'p');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType2 = stringModelValue1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.jboss.dmr.ModelType.Expression \"true\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        boolean boolean2 = objectModelValue0.asBoolean(false);
        java.io.DataOutput dataOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.writeExternal(dataOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        int int11 = listModelValue5.asInt((int) (short) -1);
        org.jboss.dmr.ModelNode modelNode12 = listModelValue5.asObject();
        boolean boolean14 = listModelValue5.asBoolean(true);
        boolean boolean15 = listModelValue5.asBoolean();
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.Property property12 = new org.jboss.dmr.Property("", modelNode11);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.set(property12);
        org.jboss.dmr.PropertyModelValue propertyModelValue15 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode13, false);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue15.writeExternal(dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.format(printWriter2, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        java.math.BigInteger bigInteger0 = null;
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue1 = new org.jboss.dmr.BigIntegerModelValue(bigInteger0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.Property> propertyList2 = bigIntegerModelValue1.asPropertyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
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
        java.io.OutputStream outputStream17 = null;
        org.jboss.dmr.Base64.OutputStream outputStream18 = new org.jboss.dmr.Base64.OutputStream(outputStream17);
        outputStream18.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream20 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream18);
        org.jboss.dmr.Base64.OutputStream outputStream21 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream20);
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue26 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger27 = booleanModelValue26.asBigInteger();
        byte[] byteArray28 = booleanModelValue26.asBytes();
        org.jboss.dmr.ModelNode modelNode29 = modelNode23.set("expression \"hi!\"", byteArray28);
        outputStream20.write(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            modelNode16.writeExternal((java.io.OutputStream) outputStream20);
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
        org.junit.Assert.assertNotNull(booleanModelValue26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertNotNull(modelNode29);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        int int9 = bigDecimalModelValue7.asInt(0);
        int int10 = bigDecimalModelValue7.asInt();
        double double11 = bigDecimalModelValue7.asDouble();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
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
        org.jboss.dmr.ModelNode modelNode41 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode44 = modelNode41.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode45 = new org.jboss.dmr.ModelNode();
        java.lang.Long long46 = modelNode45.asLongOrNull();
        org.jboss.dmr.ModelNode[] modelNodeArray47 = new org.jboss.dmr.ModelNode[] { modelNode41, modelNode45 };
        java.util.ArrayList<org.jboss.dmr.ModelNode> modelNodeList48 = new java.util.ArrayList<org.jboss.dmr.ModelNode>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48, modelNodeArray47);
        org.jboss.dmr.ModelNode modelNode50 = modelNode7.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48);
        org.jboss.dmr.ModelNode modelNode53 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long54 = modelNode53.asLong();
        org.jboss.dmr.ValueExpression valueExpression55 = modelNode53.asExpression();
        java.math.BigDecimal bigDecimal56 = valueExpression55.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode57 = modelNode7.set("true", bigDecimal56);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = modelNode57.asInt((int) (short) 100);
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
        org.junit.Assert.assertNotNull(modelNode44);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNotNull(modelNodeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(valueExpression55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(modelNode57);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.setExpression("hi!", "hi!");
        java.lang.String str6 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode2);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList7 = modelNode2.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode8 = modelNode0.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList7);
        java.util.List<org.jboss.dmr.Property> propertyList9 = modelNode8.asPropertyList();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode8.writeString(printWriter10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str6, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList7);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(propertyList9);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        boolean boolean5 = objectModelValue0.asBoolean();
        int int7 = objectModelValue0.asInt((int) 'b');
        int int9 = objectModelValue0.asInt((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = objectModelValue0.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.Property> propertyList11 = propertyModelValue10.asPropertyList();
        org.jboss.dmr.ModelNode modelNode13 = propertyModelValue10.getChild((int) (short) 0);
        org.jboss.dmr.ModelNode modelNode14 = modelNode13.setEmptyList();
        boolean boolean16 = modelNode14.asBoolean(false);
        java.io.DataInputStream dataInputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode14.readExternal(dataInputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(propertyList11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("{ \"35\" : 0.0 }");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
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
        org.jboss.dmr.stream.ModelWriter modelWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.write(modelWriter21);
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
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        int int8 = bytesModelValue4.asInt((int) 'a');
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.formatMultiLine(printWriter9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("hi!");
        int int5 = objectModelValue0.asInt();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = objectModelValue0.removeChild((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode0.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set((double) 0);
        org.jboss.dmr.ModelType modelType8 = org.jboss.dmr.ModelType.PROPERTY;
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.set(modelType8);
        org.jboss.dmr.ObjectModelValue objectModelValue10 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode11 = objectModelValue10.asObject();
        org.jboss.dmr.ModelNode modelNode13 = objectModelValue10.getChild("TYPE_MODEL_VALUE");
        org.jboss.dmr.ModelNode modelNode15 = objectModelValue10.getChild("[(\"hi!\" => 0.0)]");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode9.addNoCopy(modelNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + modelType8 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType8.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        boolean boolean10 = listModelValue5.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = listModelValue5.removeChild((int) '#');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [35]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(modelNodeList11);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = org.jboss.dmr.ModelNode.fromBase64((java.io.InputStream) inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
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
            double double69 = propertyModelValue67.asDouble((double) 10L);
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
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode23 = listModelValue13.requireChild((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [1]");
        } catch (java.util.NoSuchElementException e) {
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
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        boolean boolean8 = bigDecimalModelValue7.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression9 = bigDecimalModelValue7.asExpression();
        org.jboss.dmr.IntModelValue intModelValue11 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long13 = intModelValue11.asLong((long) 'b');
        java.lang.String str14 = intModelValue11.asString();
        long long15 = intModelValue11.asLong();
        long long16 = intModelValue11.asLong();
        org.jboss.dmr.ValueExpression valueExpression17 = intModelValue11.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver18 = new org.jboss.dmr.ValueExpressionResolver();
        java.math.BigDecimal bigDecimal19 = valueExpression17.resolveBigDecimal(valueExpressionResolver18);
        boolean boolean20 = valueExpression9.equals(valueExpression17);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = valueExpression17.resolveInt(valueExpressionResolver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(valueExpression9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32" + "'", str14, "32");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(valueExpression17);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode2 = modelNode0.clone();
        java.io.ObjectInput objectInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.readExternal(objectInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(modelNode2);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        org.jboss.dmr.stream.ModelEvent modelEvent2 = org.jboss.dmr.stream.ModelEvent.EXPRESSION;
        boolean boolean3 = stringModelValue1.equals((java.lang.Object) modelEvent2);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = stringModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelEvent2 + "' != '" + org.jboss.dmr.stream.ModelEvent.EXPRESSION + "'", modelEvent2.equals(org.jboss.dmr.stream.ModelEvent.EXPRESSION));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("1");
        java.lang.String str2 = expressionValue1.asString();
        org.jboss.dmr.stream.ModelWriter modelWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.write(modelWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
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
        org.jboss.dmr.ModelNode modelNode41 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode44 = modelNode41.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode45 = new org.jboss.dmr.ModelNode();
        java.lang.Long long46 = modelNode45.asLongOrNull();
        org.jboss.dmr.ModelNode[] modelNodeArray47 = new org.jboss.dmr.ModelNode[] { modelNode41, modelNode45 };
        java.util.ArrayList<org.jboss.dmr.ModelNode> modelNodeList48 = new java.util.ArrayList<org.jboss.dmr.ModelNode>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48, modelNodeArray47);
        org.jboss.dmr.ModelNode modelNode50 = modelNode7.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48);
        org.jboss.dmr.LongModelValue longModelValue52 = new org.jboss.dmr.LongModelValue((-1L));
        int int53 = longModelValue52.asInt();
        boolean boolean54 = modelNode7.equals((java.lang.Object) int53);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal55 = modelNode7.asBigDecimal();
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
        org.junit.Assert.assertNotNull(modelNode44);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNotNull(modelNodeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 1.0f);
        java.lang.String str2 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode1);
        org.jboss.dmr.ValueExpression valueExpression5 = new org.jboss.dmr.ValueExpression("rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BQADaGkh\neA==");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode1.add("(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))", valueExpression5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3CUQ/8AAAAAAAAHg=" + "'", str2, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3CUQ/8AAAAAAAAHg=");
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(false);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode(byteArray2);
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.set((long) 52);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode9 = modelNode6.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList10 = modelNode9.asList();
        org.jboss.dmr.ListModelValue listModelValue11 = new org.jboss.dmr.ListModelValue(modelNodeList10);
        java.lang.String str12 = listModelValue11.asString();
        long long13 = listModelValue11.asLong();
        int int15 = listModelValue11.asInt((int) '4');
        org.jboss.dmr.ModelValue modelValue16 = listModelValue11.protect();
        boolean boolean18 = listModelValue11.has((int) (short) 100);
        org.jboss.dmr.ModelValue modelValue19 = listModelValue11.resolve();
        boolean boolean20 = listModelValue11.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList21 = listModelValue11.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList22 = modelNode3.asList(modelNodeList21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str12, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(modelValue16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(modelValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(modelNodeList21);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        int int2 = modelNode1.asInt();
        java.io.ObjectInput objectInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.readExternal(objectInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        org.jboss.dmr.ModelNode modelNode16 = modelNode0.setExpression("(\"\" => (\"hi!\" => 0.0))", "");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = modelNode16.asBigInteger();
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
        org.junit.Assert.assertNotNull(modelNode16);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelValue modelValue6 = listModelValue5.resolve();
        long long8 = listModelValue5.asLong((long) (short) 10);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.writeExternal(dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
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
            org.jboss.dmr.ModelNode modelNode15 = modelNode13.get("10");
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
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long3 = intModelValue1.asLong((long) '#');
        org.jboss.dmr.IntModelValue intModelValue5 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long7 = intModelValue5.asLong((long) 'b');
        java.lang.String str8 = intModelValue5.asString();
        boolean boolean9 = intModelValue1.equals(intModelValue5);
        int int10 = intModelValue5.asInt();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = intModelValue5.requireChild(100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [100]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int3 = inputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long3 = intModelValue1.asLong((long) 'b');
        java.lang.String str4 = intModelValue1.asString();
        java.math.BigInteger bigInteger5 = intModelValue1.asBigInteger();
        boolean boolean7 = intModelValue1.asBoolean(false);
        byte[] byteArray8 = intModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = intModelValue1.requireChild((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [0]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 32]");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.TRUE;
        boolean boolean2 = modelNode0.has((int) (short) 0);
        java.lang.String str3 = modelNode0.asStringOrNull();
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double5 = booleanModelValue4.asDouble();
        org.jboss.dmr.ModelValue modelValue6 = booleanModelValue4.copy();
        java.math.BigInteger bigInteger7 = booleanModelValue4.asBigInteger();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode(bigInteger7);
        org.jboss.dmr.IntModelValue intModelValue10 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str11 = intModelValue10.asString();
        double double13 = intModelValue10.asDouble((double) 2);
        java.math.BigDecimal bigDecimal14 = intModelValue10.asBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue15 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal14);
        org.jboss.dmr.ModelNode modelNode16 = modelNode8.set(bigDecimal14);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = modelNode0.insert(modelNode16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(modelNode16);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode1.require((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [10]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        java.io.PrintWriter printWriter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelValue.indent(printWriter0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file {}");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
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
        java.io.InputStream inputStream14 = null;
        org.jboss.dmr.Base64.InputStream inputStream16 = new org.jboss.dmr.Base64.InputStream(inputStream14, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream17 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream16);
        // The following exception was thrown during execution in test generation
        try {
            modelNode13.readExternal((java.io.InputStream) inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver0 = org.jboss.dmr.ValueExpressionResolver.DEFAULT_RESOLVER;
        java.lang.String str2 = valueExpressionResolver0.resolvePart("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.jboss.dmr.ValueExpression valueExpression3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = valueExpressionResolver0.resolve(valueExpression3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpressionResolver0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = modelReader15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't string");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        int int9 = bigDecimalModelValue7.asInt(0);
        int int10 = bigDecimalModelValue7.asInt();
        int int11 = bigDecimalModelValue7.asInt();
        java.lang.String str12 = bigDecimalModelValue7.asString();
        java.lang.String str13 = bigDecimalModelValue7.asString();
        boolean boolean14 = bigDecimalModelValue7.asBoolean();
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue7.writeExternal(dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0" + "'", str12, "1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0" + "'", str13, "1.0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = org.jboss.dmr.ModelNode.fromBase64((java.io.InputStream) inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isLong();
        boolean boolean17 = modelReader15.isBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = modelReader15.getLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't long");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
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
        org.jboss.dmr.TypeModelValue typeModelValue14 = org.jboss.dmr.TypeModelValue.of(modelType11);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue14.writeExternal(dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(typeModelValue14);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(8);
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList6 = modelNode5.asList();
        org.jboss.dmr.ModelNode modelNode9 = modelNode5.set("Expression \"1\"", (int) (byte) 1);
        org.jboss.dmr.ModelType modelType10 = modelNode5.getType();
        org.jboss.dmr.ModelNode modelNode11 = modelNode1.set(modelNode5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = modelNode5.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertTrue("'" + modelType10 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType10.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertNotNull(modelNode11);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        java.lang.Boolean boolean4 = modelNode1.asBooleanOrNull();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        java.lang.String str9 = modelNode5.toString();
        org.jboss.dmr.ModelNode modelNode10 = modelNode5.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode12 = modelNode5.set(100);
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode17 = modelNode15.set((int) '#');
        org.jboss.dmr.ModelNode modelNode18 = modelNode5.setNoCopy("EXPRESSION_VALUE", modelNode17);
        org.jboss.dmr.ModelNode modelNode19 = modelNode18.resolve();
        org.jboss.dmr.ModelType modelType20 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode(modelType20);
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.set("hi!", 0.0d);
        org.jboss.dmr.Property property27 = new org.jboss.dmr.Property("", modelNode26);
        org.jboss.dmr.ModelNode modelNode28 = modelNode21.set(property27);
        org.jboss.dmr.PropertyModelValue propertyModelValue29 = new org.jboss.dmr.PropertyModelValue(property27);
        org.jboss.dmr.PropertyModelValue propertyModelValue30 = new org.jboss.dmr.PropertyModelValue(property27);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList31 = propertyModelValue30.asList();
        org.jboss.dmr.ModelNode modelNode32 = modelNode19.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList31);
        org.jboss.dmr.IntModelValue intModelValue35 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str36 = intModelValue35.asString();
        double double38 = intModelValue35.asDouble((double) 2);
        java.math.BigDecimal bigDecimal39 = intModelValue35.asBigDecimal();
        org.jboss.dmr.ModelNode modelNode40 = modelNode32.add("(\"hi!\" => 0.0)", bigDecimal39);
        org.jboss.dmr.ModelNode modelNode41 = modelNode1.set(bigDecimal39);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray42 = modelNode1.asBytesOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(\"hi!\" => 0.0)" + "'", str9, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(modelNode18);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertTrue("'" + modelType20 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType20.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(modelNodeList31);
        org.junit.Assert.assertNotNull(modelNode32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "32" + "'", str36, "32");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 32.0d + "'", double38 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(modelNode40);
        org.junit.Assert.assertNotNull(modelNode41);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
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
            bytesModelValue4.formatAsJSON(printWriter15, (int) 'b', true);
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
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.writeExternal(dataOutput11);
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
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode12 = modelNode6.set("Expression \"true\"", modelNode11);
        java.util.List<org.jboss.dmr.Property> propertyList13 = modelNode12.asPropertyList();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode12.formatAsJSON(printWriter14, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(propertyList13);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        java.lang.String str2 = doubleModelValue1.asString();
        java.io.DataOutput dataOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
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
        java.math.BigInteger bigInteger16 = bytesModelValue12.asBigInteger();
        org.jboss.dmr.stream.ModelWriter modelWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.write(modelWriter17);
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
        org.junit.Assert.assertNotNull(bigInteger16);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromBase64String("BYTES_VALUE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 5: 95(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        outputStream1.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream1);
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3);
        outputStream3.flushBase64();
        org.jboss.dmr.Base64.OutputStream outputStream6 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3);
        org.jboss.dmr.IntModelValue intModelValue8 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long10 = intModelValue8.asLong((long) 'b');
        java.lang.String str11 = intModelValue8.asString();
        java.math.BigInteger bigInteger12 = intModelValue8.asBigInteger();
        boolean boolean14 = intModelValue8.asBoolean(false);
        org.jboss.dmr.IntModelValue intModelValue16 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long18 = intModelValue16.asLong((long) 'b');
        java.lang.String str19 = intModelValue16.asString();
        boolean boolean20 = intModelValue8.equals(intModelValue16);
        byte[] byteArray21 = intModelValue16.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            outputStream3.write(byteArray21, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 32]");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.formatAsJSON(printWriter2, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
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
            bytesModelValue20.formatAsJSON(printWriter26, 0, true);
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
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
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
        org.jboss.dmr.ModelNode modelNode43 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long44 = modelNode43.asLong();
        org.jboss.dmr.ValueExpression valueExpression45 = modelNode43.asExpression();
        java.math.BigDecimal bigDecimal46 = valueExpression45.resolveBigDecimal();
        java.lang.String str47 = valueExpression45.getExpressionString();
        java.math.BigDecimal bigDecimal48 = valueExpression45.resolveBigDecimal();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode49 = modelNode27.add("true", bigDecimal48);
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(valueExpression45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1.0" + "'", str47, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal48);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
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
        double double26 = bytesModelValue20.asDouble();
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue20.writeExternal(dataOutput27);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.9E-324d + "'", double26 == 4.9E-324d);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str2 = expressionValue1.asString();
        java.lang.Throwable throwable4 = null;
        org.jboss.dmr.stream.ModelException modelException5 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable4);
        org.jboss.dmr.stream.ModelException modelException6 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException5);
        org.jboss.dmr.stream.ModelException modelException7 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException5);
        java.lang.Throwable throwable9 = null;
        org.jboss.dmr.stream.ModelException modelException10 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable9);
        org.jboss.dmr.stream.ModelException modelException11 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException10);
        java.lang.Throwable throwable13 = null;
        org.jboss.dmr.stream.ModelException modelException14 = new org.jboss.dmr.stream.ModelException("[(\"hi!\" => 0.0)]", throwable13);
        org.jboss.dmr.stream.ModelException modelException15 = new org.jboss.dmr.stream.ModelException((java.lang.Throwable) modelException14);
        modelException10.addSuppressed((java.lang.Throwable) modelException14);
        java.lang.Throwable[] throwableArray17 = modelException14.getSuppressed();
        modelException7.addSuppressed((java.lang.Throwable) modelException14);
        boolean boolean19 = expressionValue1.equals((java.lang.Object) modelException14);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property20 = expressionValue1.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode1.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
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
            org.jboss.dmr.ModelNode modelNode25 = listModelValue5.requireChild((-1));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [-1]");
        } catch (java.util.NoSuchElementException e) {
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
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode4 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        java.lang.String str9 = modelNode5.toString();
        org.jboss.dmr.ModelNode modelNode10 = modelNode5.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode12 = modelNode5.set(100);
        org.jboss.dmr.ModelNode modelNode13 = modelNode4.add(modelNode5);
        org.jboss.dmr.LongModelValue longModelValue16 = new org.jboss.dmr.LongModelValue(1L);
        long long17 = longModelValue16.asLong();
        byte[] byteArray18 = longModelValue16.asBytes();
        org.jboss.dmr.ModelNode modelNode19 = modelNode4.add("EXPRESSION_VALUE", byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode20 = modelNode3.addNoCopy(modelNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(\"hi!\" => 0.0)" + "'", str9, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(modelNode19);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = modelNode10.asList();
        org.jboss.dmr.ListModelValue listModelValue12 = new org.jboss.dmr.ListModelValue(modelNodeList11);
        java.lang.String str13 = listModelValue12.asString();
        long long14 = listModelValue12.asLong();
        int int16 = listModelValue12.asInt((int) '4');
        org.jboss.dmr.ModelValue modelValue17 = listModelValue12.protect();
        boolean boolean18 = listModelValue5.equals(listModelValue12);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode20 = listModelValue12.requireChild((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [1]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str13, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(modelValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet14 = listModelValue5.getKeys();
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
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = inputStream3.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
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
            org.jboss.dmr.ModelNode modelNode15 = modelNode13.add(true);
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
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        boolean boolean4 = modelNode3.isDefined();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set(true);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode6.writeExternal(dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(modelNode6);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(false);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode(byteArray2);
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.set((long) 52);
        java.io.DataInput dataInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode5.readExternal(dataInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
        org.junit.Assert.assertNotNull(modelNode5);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("hi!");
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asListOrEmpty();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode4, false);
        boolean boolean9 = propertyModelValue7.has("10.0");
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue7.writeExternal(dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        java.lang.String str8 = valueExpression5.getExpressionString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = valueExpression5.resolveBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0" + "'", str8, "1.0");
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        boolean boolean7 = stringModelValue3.equals(stringModelValue6);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue3.formatAsJSON(printWriter8, 52, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.set("expression \"hi!\"", (int) (short) -1);
        org.jboss.dmr.ModelNode modelNode7 = modelNode6.clear();
        java.lang.Integer int8 = modelNode6.asIntOrNull();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = modelNode6.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        org.jboss.dmr.stream.ModelEvent modelEvent6 = org.jboss.dmr.stream.ModelEvent.UNDEFINED;
        boolean boolean7 = stringModelValue1.equals((java.lang.Object) modelEvent6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stringModelValue1.asLong((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertTrue("'" + modelEvent6 + "' != '" + org.jboss.dmr.stream.ModelEvent.UNDEFINED + "'", modelEvent6.equals(org.jboss.dmr.stream.ModelEvent.UNDEFINED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        boolean boolean4 = modelNode1.isDefined();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode7 = modelNode1.add("Expression \"1\"", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode28 = modelNode12.get((int) ' ');
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
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        java.util.List<org.jboss.dmr.Property> propertyList3 = objectModelValue0.asPropertyList();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.formatAsJSON(printWriter4, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(propertyList3);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode3.writeJSONString(printWriter6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        int int10 = inputStream2.read(byteArray6, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream12 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode13 = org.jboss.dmr.ModelNode.fromBase64((java.io.InputStream) inputStream12);
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
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }", true);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Unexpected character 'b' while reading DMR stream");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList11 = listModelValue5.asPropertyList();
        org.jboss.dmr.ModelNode modelNode13 = listModelValue5.getChild((int) (short) 0);
        java.io.OutputStream outputStream14 = null;
        org.jboss.dmr.Base64.OutputStream outputStream15 = new org.jboss.dmr.Base64.OutputStream(outputStream14);
        outputStream15.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream17 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream15);
        org.jboss.dmr.Base64.OutputStream outputStream18 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream17);
        org.jboss.dmr.BooleanModelValue booleanModelValue20 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger21 = booleanModelValue20.asBigInteger();
        byte[] byteArray22 = booleanModelValue20.asBytes();
        boolean boolean24 = org.jboss.dmr.Base64.encodeToFile(byteArray22, "1L");
        boolean boolean26 = org.jboss.dmr.Base64.encodeToFile(byteArray22, "[(\"hi!\" => 0.0)]");
        outputStream18.write(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            modelNode13.writeExternal((java.io.OutputStream) outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertNotNull(propertyList11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(booleanModelValue20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode11 = listModelValue5.removeChild(52);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [52]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
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
        org.jboss.dmr.ModelNode modelNode13 = objectModelValue7.asObject();
        org.jboss.dmr.DoubleModelValue doubleModelValue16 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long17 = doubleModelValue16.asLong();
        boolean boolean18 = doubleModelValue16.asBoolean();
        byte[] byteArray19 = doubleModelValue16.asBytes();
        int int21 = doubleModelValue16.asInt((int) ' ');
        byte[] byteArray22 = doubleModelValue16.asBytes();
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode24 = modelNode13.add("EXPRESSION_VALUE", byteArray22);
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
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[64, 36, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode11 = modelNode9.set((double) (-1.0f));
        byte[] byteArray12 = modelNode11.asBytesOrNull();
        org.jboss.dmr.BooleanModelValue booleanModelValue15 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long16 = booleanModelValue15.asLong();
        org.jboss.dmr.ValueExpression valueExpression17 = booleanModelValue15.asExpression();
        java.lang.String str18 = valueExpression17.toString();
        org.jboss.dmr.ExpressionValue expressionValue20 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression21 = expressionValue20.asExpression();
        boolean boolean22 = valueExpression17.equals(valueExpression21);
        java.lang.String str23 = valueExpression21.resolveString();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver24 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str25 = valueExpression21.resolveString(valueExpressionResolver24);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode26 = modelNode11.add("\"bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }\"", valueExpression21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-65, -16, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(booleanModelValue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(valueExpression17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Expression \"true\"" + "'", str18, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.resolve();
        int int9 = listModelValue5.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList10 = listModelValue5.asPropertyList();
        long long11 = listModelValue5.asLong();
        long long13 = listModelValue5.asLong((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = listModelValue5.requireChild((int) 'l');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [108]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(propertyList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("", true);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Unexpected EOF while reading DMR stream");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        java.lang.String str2 = stringModelValue1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = stringModelValue1.asBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"" + "'", str2, "\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"");
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.Property property12 = new org.jboss.dmr.Property("", modelNode11);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.set(property12);
        org.jboss.dmr.PropertyModelValue propertyModelValue15 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode13, false);
        java.util.List<org.jboss.dmr.Property> propertyList16 = propertyModelValue15.asPropertyList();
        org.jboss.dmr.stream.ModelWriter modelWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue15.write(modelWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(propertyList16);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        java.lang.String str10 = valueExpression8.getExpressionString();
        org.jboss.dmr.LongModelValue longModelValue12 = new org.jboss.dmr.LongModelValue(1L);
        long long14 = longModelValue12.asLong((long) (short) 0);
        java.lang.String str15 = longModelValue12.asString();
        org.jboss.dmr.ValueExpression valueExpression16 = longModelValue12.asExpression();
        int int17 = valueExpression16.resolveInt();
        boolean boolean18 = valueExpression8.equals(valueExpression16);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver19 = org.jboss.dmr.ValueExpressionResolver.DEFAULT_RESOLVER;
        org.jboss.dmr.BooleanModelValue booleanModelValue21 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long22 = booleanModelValue21.asLong();
        org.jboss.dmr.ValueExpression valueExpression23 = booleanModelValue21.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue24 = new org.jboss.dmr.ExpressionValue(valueExpression23);
        java.lang.String str25 = valueExpression23.getExpressionString();
        java.lang.String str26 = valueExpressionResolver19.resolve(valueExpression23);
        long long27 = valueExpression16.resolveLong(valueExpressionResolver19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = valueExpression3.resolveBoolean(valueExpressionResolver19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0" + "'", str10, "1.0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(valueExpression16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(valueExpressionResolver19);
        org.junit.Assert.assertNotNull(booleanModelValue21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(valueExpression23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "true" + "'", str26, "true");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Long long1 = modelNode0.asLongOrNull();
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", byteArray6);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long11 = modelNode10.asLong();
        org.jboss.dmr.ValueExpression valueExpression12 = modelNode10.asExpression();
        java.math.BigDecimal bigDecimal13 = valueExpression12.resolveBigDecimal();
        java.lang.String str14 = valueExpression12.getExpressionString();
        org.jboss.dmr.ModelNode modelNode15 = modelNode0.set("BYTES_VALUE", valueExpression12);
        java.io.DataOutputStream dataOutputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode0.writeExternal(dataOutputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(valueExpression12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0" + "'", str14, "1.0");
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asList();
        org.jboss.dmr.ListModelValue listModelValue6 = new org.jboss.dmr.ListModelValue(modelNodeList5);
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue6);
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode12 = modelNode9.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode13 = modelNode7.set("Expression \"true\"", modelNode12);
        java.util.List<org.jboss.dmr.Property> propertyList14 = modelNode13.asPropertyList();
        org.jboss.dmr.PropertyModelValue propertyModelValue16 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==", modelNode13, true);
        java.io.ObjectOutput objectOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode13.writeExternal(objectOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(propertyList14);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        boolean boolean7 = stringModelValue3.equals(stringModelValue6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = stringModelValue3.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("PROPERTY", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", true);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Unexpected character 'r' while reading DMR stream");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long3 = longModelValue1.asLong((long) (short) 0);
        java.math.BigInteger bigInteger4 = longModelValue1.asBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.Property> propertyList5 = longModelValue1.asPropertyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromJSONString("(\"\" => (\"hi!\" => 0.0))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected character '(' while reading DMR stream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
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
            int int68 = propertyModelValue67.asInt();
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
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
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
        java.io.ObjectInput objectInput47 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode11.readExternal(objectInput47);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = modelReader15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't string");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.format(printWriter2, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(bigDecimal9);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.setNoCopy("35", modelNode12);
        java.lang.String[] strArray15 = new java.lang.String[] { "{}" };
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode13.get(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jboss.dmr.Base64.decodeToObject("\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 0: 34(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeJSONString(printWriter3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decode("\"\\\"1L\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bad Base64 input character at 0: 34(decimal)");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
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
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode20 = modelNode17.get(strArray19);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int22 = modelNode21.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.setExpression("hi!", "hi!");
        java.lang.String str27 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode23);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList28 = modelNode23.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode29 = modelNode21.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode30 = modelNode20.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode31 = modelNode8.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        java.io.DataInputStream dataInputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode8.readExternal(dataInputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str27, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList28);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertNotNull(modelNode30);
        org.junit.Assert.assertNotNull(modelNode31);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        java.lang.String str5 = bigIntegerModelValue4.asString();
        long long7 = bigIntegerModelValue4.asLong(32L);
        double double8 = bigIntegerModelValue4.asDouble();
        double double9 = bigIntegerModelValue4.asDouble();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.format(printWriter10, 112, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isLong();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = modelReader15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't string");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        java.lang.String str1 = org.jboss.dmr.ModelValue.quote("{\n    \"EXPRESSION_VALUE\" : 35\n}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"{\n    \\\"EXPRESSION_VALUE\\\" : 35\n}\"" + "'", str1, "\"{\n    \\\"EXPRESSION_VALUE\\\" : 35\n}\"");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int10 = modelNode9.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode11 = modelNode9.clone();
        org.jboss.dmr.ModelNode modelNode12 = modelNode7.setNoCopy("35", modelNode11);
        java.io.InputStream inputStream13 = null;
        org.jboss.dmr.Base64.InputStream inputStream15 = new org.jboss.dmr.Base64.InputStream(inputStream13, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream16 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream15);
        org.jboss.dmr.Base64.InputStream inputStream17 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream15);
        // The following exception was thrown during execution in test generation
        try {
            modelNode12.readExternal((java.io.InputStream) inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode12);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = new org.jboss.dmr.ModelNode(bigInteger3);
        org.jboss.dmr.IntModelValue intModelValue6 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str7 = intModelValue6.asString();
        double double9 = intModelValue6.asDouble((double) 2);
        java.math.BigDecimal bigDecimal10 = intModelValue6.asBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue11 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode4.set(bigDecimal10);
        java.io.OutputStream outputStream13 = null;
        org.jboss.dmr.Base64.OutputStream outputStream14 = new org.jboss.dmr.Base64.OutputStream(outputStream13);
        outputStream14.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream16 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream14);
        org.jboss.dmr.Base64.OutputStream outputStream17 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream16);
        // The following exception was thrown during execution in test generation
        try {
            modelNode12.writeBase64((java.io.OutputStream) outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(modelNode12);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isLong();
        boolean boolean17 = modelReader15.isBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger18 = modelReader15.getBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't big integer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode3.addEmptyList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        byte[] byteArray0 = null;
        org.jboss.dmr.BytesModelValue bytesModelValue1 = new org.jboss.dmr.BytesModelValue(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = bytesModelValue1.asInt((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        long long7 = listModelValue5.asLong();
        int int9 = listModelValue5.asInt((int) '4');
        int int11 = listModelValue5.asInt((int) (short) -1);
        org.jboss.dmr.ModelNode modelNode12 = listModelValue5.asObject();
        boolean boolean14 = listModelValue5.asBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = listModelValue5.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        boolean boolean4 = modelNode3.isDefined();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode3.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(modelNode6);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        org.jboss.dmr.stream.ModelWriter modelWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.write(modelWriter6);
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
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
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
        java.lang.String str22 = typeModelValue5.asString();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = typeModelValue5.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PROPERTY" + "'", str22, "PROPERTY");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode(bigInteger3);
        boolean boolean6 = modelNode5.isProtected();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode5.formatAsJSON(printWriter7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger2 = booleanModelValue1.asBigInteger();
        byte[] byteArray3 = booleanModelValue1.asBytes();
        boolean boolean4 = booleanModelValue1.asBoolean();
        java.lang.String str5 = booleanModelValue1.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = booleanModelValue1.asObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "true" + "'", str5, "true");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode28 = modelNode27.addEmptyList();
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
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.Property property12 = new org.jboss.dmr.Property("", modelNode11);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.set(property12);
        org.jboss.dmr.PropertyModelValue propertyModelValue15 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode13, false);
        java.util.Set<java.lang.String> strSet16 = propertyModelValue15.getKeys();
        org.jboss.dmr.ModelValue modelValue17 = propertyModelValue15.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode19 = propertyModelValue15.requireChild("{ \"expression \\\"hi!\\\"\" : { \"BYTES_VALUE\" : \"AQ==\" } }");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '{ \"expression \\\"hi!\\\"\" : { \"BYTES_VALUE\" : \"AQ==\" } }' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(modelValue17);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
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
        java.math.BigInteger bigInteger21 = bytesModelValue19.asBigInteger();
        double double23 = bytesModelValue19.asDouble((double) 32);
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue19.formatAsJSON(printWriter24, (int) 'p', false);
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
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))", (int) (short) 0);
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode4.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        org.jboss.dmr.stream.ModelEvent modelEvent2 = org.jboss.dmr.stream.ModelEvent.EXPRESSION;
        boolean boolean3 = stringModelValue1.equals((java.lang.Object) modelEvent2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stringModelValue1.asInt(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z?cy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA?AAAAeA==\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelEvent2 + "' != '" + org.jboss.dmr.stream.ModelEvent.EXPRESSION + "'", modelEvent2.equals(org.jboss.dmr.stream.ModelEvent.EXPRESSION));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue8 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean9 = stringModelValue6.equals(stringModelValue8);
        byte[] byteArray10 = stringModelValue8.asBytes();
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = inputStream4.read(byteArray10, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int1 = modelNode0.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long4 = modelNode3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = modelNode3.asExpression();
        java.math.BigDecimal bigDecimal6 = valueExpression5.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(valueExpression5);
        java.io.DataOutputStream dataOutputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.writeExternal(dataOutputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
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
        boolean boolean41 = modelNode27.isProtected();
        org.jboss.dmr.ModelNode modelNode44 = modelNode27.set("", (double) 8);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = modelNode27.asInt();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(modelNode44);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList0 = null;
        org.jboss.dmr.ListModelValue listModelValue1 = new org.jboss.dmr.ListModelValue(modelNodeList0);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.ModelNode modelNode2 = modelNode1.clear();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeJSONString(printWriter3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode2);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
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
        org.jboss.dmr.ModelNode modelNode41 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode44 = modelNode41.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode45 = new org.jboss.dmr.ModelNode();
        java.lang.Long long46 = modelNode45.asLongOrNull();
        org.jboss.dmr.ModelNode[] modelNodeArray47 = new org.jboss.dmr.ModelNode[] { modelNode41, modelNode45 };
        java.util.ArrayList<org.jboss.dmr.ModelNode> modelNodeList48 = new java.util.ArrayList<org.jboss.dmr.ModelNode>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48, modelNodeArray47);
        org.jboss.dmr.ModelNode modelNode50 = modelNode7.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48);
        org.jboss.dmr.ModelNode modelNode53 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long54 = modelNode53.asLong();
        org.jboss.dmr.ValueExpression valueExpression55 = modelNode53.asExpression();
        java.math.BigDecimal bigDecimal56 = valueExpression55.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode57 = modelNode7.set("true", bigDecimal56);
        boolean boolean59 = modelNode57.hasDefined((int) 'p');
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
        org.junit.Assert.assertNotNull(modelNode44);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNotNull(modelNodeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(valueExpression55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(modelNode57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.jboss.dmr.ValueExpression valueExpression1 = new org.jboss.dmr.ValueExpression("rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BQADaGkh\neA==");
        org.jboss.dmr.BooleanModelValue booleanModelValue3 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long4 = booleanModelValue3.asLong();
        org.jboss.dmr.ValueExpression valueExpression5 = booleanModelValue3.asExpression();
        java.lang.String str6 = valueExpression5.toString();
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression9 = expressionValue8.asExpression();
        boolean boolean10 = valueExpression5.equals(valueExpression9);
        java.lang.String str11 = valueExpression9.resolveString();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver12 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str13 = valueExpression9.resolveString(valueExpressionResolver12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = valueExpression1.resolveInt(valueExpressionResolver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BQADaGkh?eA==\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(valueExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Expression \"true\"" + "'", str6, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long7 = booleanModelValue6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = booleanModelValue6.asExpression();
        boolean boolean10 = valueExpression8.equals((java.lang.Object) 'p');
        boolean boolean11 = valueExpression3.equals(valueExpression8);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long14 = modelNode13.asLong();
        org.jboss.dmr.ValueExpression valueExpression15 = modelNode13.asExpression();
        java.math.BigDecimal bigDecimal16 = valueExpression15.resolveBigDecimal();
        java.lang.String str17 = valueExpression15.getExpressionString();
        boolean boolean18 = valueExpression8.equals(valueExpression15);
        org.jboss.dmr.ModelNode modelNode20 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long21 = modelNode20.asLong();
        org.jboss.dmr.ValueExpression valueExpression22 = modelNode20.asExpression();
        java.math.BigDecimal bigDecimal23 = valueExpression22.resolveBigDecimal();
        java.lang.String str24 = valueExpression22.getExpressionString();
        org.jboss.dmr.LongModelValue longModelValue26 = new org.jboss.dmr.LongModelValue(1L);
        long long28 = longModelValue26.asLong((long) (short) 0);
        java.lang.String str29 = longModelValue26.asString();
        org.jboss.dmr.ValueExpression valueExpression30 = longModelValue26.asExpression();
        int int31 = valueExpression30.resolveInt();
        boolean boolean32 = valueExpression22.equals(valueExpression30);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver33 = org.jboss.dmr.ValueExpressionResolver.DEFAULT_RESOLVER;
        org.jboss.dmr.BooleanModelValue booleanModelValue35 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long36 = booleanModelValue35.asLong();
        org.jboss.dmr.ValueExpression valueExpression37 = booleanModelValue35.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue38 = new org.jboss.dmr.ExpressionValue(valueExpression37);
        java.lang.String str39 = valueExpression37.getExpressionString();
        java.lang.String str40 = valueExpressionResolver33.resolve(valueExpression37);
        long long41 = valueExpression30.resolveLong(valueExpressionResolver33);
        org.jboss.dmr.ExpressionValue expressionValue43 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue45 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean46 = expressionValue43.equals(expressionValue45);
        org.jboss.dmr.ExpressionValue expressionValue48 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue50 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean51 = expressionValue48.equals(expressionValue50);
        boolean boolean52 = expressionValue43.equals(expressionValue50);
        org.jboss.dmr.ValueExpression valueExpression53 = expressionValue50.asExpression();
        java.lang.String str54 = valueExpressionResolver33.resolve(valueExpression53);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = valueExpression15.resolveInt(valueExpressionResolver33);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0\"");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(valueExpression15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0" + "'", str17, "1.0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(valueExpression22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1.0" + "'", str24, "1.0");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertNotNull(valueExpression30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(valueExpressionResolver33);
        org.junit.Assert.assertNotNull(booleanModelValue35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(valueExpression37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "true" + "'", str39, "true");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "true" + "'", str40, "true");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(valueExpression53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long5 = booleanModelValue4.asLong();
        org.jboss.dmr.ValueExpression valueExpression6 = booleanModelValue4.asExpression();
        java.lang.String str7 = valueExpression6.toString();
        org.jboss.dmr.ExpressionValue expressionValue9 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression10 = expressionValue9.asExpression();
        boolean boolean11 = valueExpression6.equals(valueExpression10);
        org.jboss.dmr.LongModelValue longModelValue13 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal14 = longModelValue13.asBigDecimal();
        int int15 = longModelValue13.asInt();
        org.jboss.dmr.ValueExpression valueExpression16 = longModelValue13.asExpression();
        boolean boolean17 = valueExpression10.equals(valueExpression16);
        int int18 = valueExpression16.resolveInt();
        org.jboss.dmr.BooleanModelValue booleanModelValue20 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long21 = booleanModelValue20.asLong();
        org.jboss.dmr.ValueExpression valueExpression22 = booleanModelValue20.asExpression();
        java.lang.String str23 = valueExpression22.toString();
        org.jboss.dmr.ExpressionValue expressionValue25 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression26 = expressionValue25.asExpression();
        boolean boolean27 = valueExpression22.equals(valueExpression26);
        java.lang.String str28 = valueExpression26.resolveString();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver29 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str30 = valueExpression26.resolveString(valueExpressionResolver29);
        java.lang.String str31 = valueExpression16.resolveString(valueExpressionResolver29);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = valueExpression2.resolveInt(valueExpressionResolver29);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(valueExpression6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Expression \"true\"" + "'", str7, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(valueExpression16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(booleanModelValue20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(valueExpression22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Expression \"true\"" + "'", str23, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "52" + "'", str31, "52");
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        org.jboss.dmr.stream.ModelEvent modelEvent6 = org.jboss.dmr.stream.ModelEvent.UNDEFINED;
        boolean boolean7 = stringModelValue1.equals((java.lang.Object) modelEvent6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = stringModelValue1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertTrue("'" + modelEvent6 + "' != '" + org.jboss.dmr.stream.ModelEvent.UNDEFINED + "'", modelEvent6.equals(org.jboss.dmr.stream.ModelEvent.UNDEFINED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
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
        org.jboss.dmr.ModelNode modelNode22 = modelNode7.setExpression("\"(\\\"hi!\\\" => 0.0)\"", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.jboss.dmr.IntModelValue intModelValue24 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long26 = intModelValue24.asLong((long) 'b');
        java.lang.String str27 = intModelValue24.asString();
        java.math.BigInteger bigInteger28 = intModelValue24.asBigInteger();
        boolean boolean30 = intModelValue24.asBoolean(false);
        org.jboss.dmr.IntModelValue intModelValue32 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long34 = intModelValue32.asLong((long) 'b');
        java.lang.String str35 = intModelValue32.asString();
        boolean boolean36 = intModelValue24.equals(intModelValue32);
        byte[] byteArray37 = intModelValue32.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode38 = modelNode22.add(byteArray37);
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
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "32" + "'", str27, "32");
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "32" + "'", str35, "32");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0, 0, 32]");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom("{ \"expression \\\"hi!\\\"\" : { \"BYTES_VALUE\" : \"AQ==\" } }", false);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Unexpected character ':' while reading DMR stream");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(false);
        long long3 = booleanModelValue1.asLong((long) '#');
        byte[] byteArray4 = booleanModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.jboss.dmr.Base64.encodeBytes(byteArray4, 32, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        byte[] byteArray2 = stringModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stringModelValue1.asInt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[69, 120, 112, 114, 101, 115, 115, 105, 111, 110, 32, 34, 116, 114, 117, 101, 34]");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        boolean boolean3 = modelNode1.hasDefined("[(\"hi!\" => 0.0)]");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.jboss.dmr.Property property0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.PropertyModelValue propertyModelValue1 = new org.jboss.dmr.PropertyModelValue(property0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: property is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelValue modelValue2 = objectModelValue0.protect();
        java.util.List<org.jboss.dmr.Property> propertyList3 = objectModelValue0.asPropertyList();
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(propertyList3);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        org.jboss.dmr.stream.ModelEvent modelEvent2 = org.jboss.dmr.stream.ModelEvent.EXPRESSION;
        boolean boolean3 = stringModelValue1.equals((java.lang.Object) modelEvent2);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z?cy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA?AAAAeA==\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelEvent2 + "' != '" + org.jboss.dmr.stream.ModelEvent.EXPRESSION + "'", modelEvent2.equals(org.jboss.dmr.stream.ModelEvent.EXPRESSION));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.stream.ModelReader modelReader16 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ModelValue modelValue11 = expressionValue1.resolve();
        java.lang.String str12 = expressionValue1.asString();
        java.lang.String str13 = expressionValue1.asString();
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.writeExternal(dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(modelValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(bigDecimal9);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.setNoCopy("35", modelNode12);
        boolean boolean15 = modelNode12.hasDefined("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode17 = modelNode12.add(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.get("Expression \"true\"");
        org.jboss.dmr.IntModelValue intModelValue10 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str11 = intModelValue10.asString();
        double double13 = intModelValue10.asDouble((double) 2);
        java.math.BigInteger bigInteger14 = intModelValue10.asBigInteger();
        org.jboss.dmr.ModelNode modelNode15 = modelNode7.set("Expression \"true\"", bigInteger14);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode17 = modelNode7.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(modelNode15);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        byte[] byteArray0 = null;
        org.jboss.dmr.BytesModelValue bytesModelValue1 = new org.jboss.dmr.BytesModelValue(byteArray0);
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue1.writeExternal(dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
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
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue12.writeExternal(dataOutput22);
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
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.get("Expression \"true\"");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = modelNode7.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        java.lang.String str1 = org.jboss.dmr.ModelValue.quote("BYTES_VALUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"BYTES_VALUE\"" + "'", str1, "\"BYTES_VALUE\"");
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        org.jboss.dmr.ModelValue modelValue6 = objectModelValue0.copy(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = objectModelValue0.requireChild("BYTES_VALUE");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child 'BYTES_VALUE' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertNotNull(modelValue6);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        long long6 = bigIntegerModelValue4.asLong((long) 'b');
        boolean boolean8 = bigIntegerModelValue4.asBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = bigIntegerModelValue4.removeChild("\"(\\\"hi!\\\" => 0.0)\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode12 = modelNode9.setExpression("hi!", "hi!");
        java.lang.String str13 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode9);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList14 = modelNode9.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode16 = modelNode9.set((double) 0);
        org.jboss.dmr.ModelNode modelNode19 = new org.jboss.dmr.ModelNode(false);
        int int21 = modelNode19.asInt(2);
        org.jboss.dmr.ModelNode modelNode23 = modelNode19.set(52);
        org.jboss.dmr.LongModelValue longModelValue26 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str27 = longModelValue26.asString();
        byte[] byteArray28 = longModelValue26.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue29 = new org.jboss.dmr.BytesModelValue(byteArray28);
        java.lang.String str30 = bytesModelValue29.asString();
        int int31 = bytesModelValue29.asInt();
        int int32 = bytesModelValue29.asInt();
        org.jboss.dmr.LongModelValue longModelValue34 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str35 = longModelValue34.asString();
        byte[] byteArray36 = longModelValue34.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue37 = new org.jboss.dmr.BytesModelValue(byteArray36);
        double double38 = bytesModelValue37.asDouble();
        boolean boolean39 = bytesModelValue29.equals(bytesModelValue37);
        org.jboss.dmr.LongModelValue longModelValue41 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str42 = longModelValue41.asString();
        byte[] byteArray43 = longModelValue41.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue44 = new org.jboss.dmr.BytesModelValue(byteArray43);
        boolean boolean45 = bytesModelValue37.equals(bytesModelValue44);
        java.math.BigInteger bigInteger46 = bytesModelValue44.asBigInteger();
        org.jboss.dmr.ModelNode modelNode47 = modelNode23.set("1.0", bigInteger46);
        org.jboss.dmr.ModelNode modelNode48 = modelNode16.set("expression \"hi!\"", bigInteger46);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode49 = modelNode6.add(modelNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str13, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList14);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(modelNode23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str30, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.9E-324d + "'", double38 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(modelNode47);
        org.junit.Assert.assertNotNull(modelNode48);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        byte[] byteArray9 = modelNode6.asBytesOrNull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.jboss.dmr.Base64.encodeBytes(byteArray9, 10, (int) 'l', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.jboss.dmr.stream.ModelException modelException1 = new org.jboss.dmr.stream.ModelException("1L");
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        java.lang.String str7 = bytesModelValue4.asString();
        java.lang.String str8 = bytesModelValue4.asString();
        long long10 = bytesModelValue4.asLong((long) (byte) 10);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.writeExternal(dataOutput11);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str8, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(100);
        java.lang.String str2 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rO0ABXNyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\nLk51bWJlcoaslR0LlOCLAgAAeHAAAABk" + "'", str2, "rO0ABXNyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\nLk51bWJlcoaslR0LlOCLAgAAeHAAAABk");
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        byte[] byteArray9 = modelNode6.asBytesOrNull();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode12 = modelNode6.add("Expression \"true\"", (long) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        boolean boolean20 = modelReader15.isUndefined();
        boolean boolean21 = modelReader15.isObjectStart();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = modelReader15.getBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't bytes");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        java.lang.String str4 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode0);
        boolean boolean6 = modelNode0.hasDefined((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode0.require((int) 'l');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [108]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str4, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ModelNode modelNode7 = modelNode3.setExpression("hi!", "(\"hi!\" => 0.0)");
        // The following exception was thrown during execution in test generation
        try {
            long long8 = modelNode3.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        byte[] byteArray9 = modelNode6.asBytesOrNull();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property10 = modelNode6.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType20 = modelReader15.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(bigDecimal9);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.setNoCopy("35", modelNode12);
        java.lang.String str15 = modelNode1.toJSONString(true);
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
        org.jboss.dmr.ModelNode modelNode58 = modelNode43.set((long) 100);
        org.jboss.dmr.ModelNode modelNode61 = modelNode43.set("(\"hi!\" => 0.0)", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode62 = modelNode1.addNoCopy(modelNode43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{ \"35\" : 0.0 }" + "'", str15, "{ \"35\" : 0.0 }");
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
        org.junit.Assert.assertNotNull(modelNode58);
        org.junit.Assert.assertNotNull(modelNode61);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
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
        java.lang.String str68 = modelNode2.asStringOrNull();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode71 = modelNode2.add("\"(\\\"hi!\\\" => 0.0)\"", "10.0");
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))" + "'", str68, "(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        org.jboss.dmr.stream.ModelWriter modelWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue1.write(modelWriter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        byte[] byteArray5 = stringModelValue3.asBytes();
        org.jboss.dmr.ModelValue modelValue6 = stringModelValue3.resolve();
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringModelValue3.format(printWriter7, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(modelValue6);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) 'p');
        java.math.BigDecimal bigDecimal2 = intModelValue1.asBigDecimal();
        boolean boolean4 = intModelValue1.has(52);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        double double9 = bigDecimalModelValue7.asDouble((double) 'p');
        org.jboss.dmr.ModelValue modelValue10 = bigDecimalModelValue7.copy();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue7.format(printWriter11, (int) (short) 0, false);
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
        org.junit.Assert.assertNotNull(modelValue10);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        org.jboss.dmr.Validation.validate(modelNode0, "[(\"hi!\" => 0.0)]");
        org.jboss.dmr.ModelType modelType6 = modelNode0.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode8 = modelNode0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + modelType6 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType6.equals(org.jboss.dmr.ModelType.PROPERTY));
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (byte) -1);
        org.jboss.dmr.DoubleModelValue doubleModelValue3 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        int int5 = doubleModelValue3.asInt((int) 'l');
        java.math.BigDecimal bigDecimal6 = doubleModelValue3.asBigDecimal();
        boolean boolean7 = doubleModelValue1.equals(doubleModelValue3);
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue3.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelValue modelValue2 = objectModelValue0.copy();
        int int4 = objectModelValue0.asInt((int) (short) 100);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.formatAsJSON(printWriter5, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom(reader4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
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
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode20 = modelNode17.get(strArray19);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int22 = modelNode21.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.setExpression("hi!", "hi!");
        java.lang.String str27 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode23);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList28 = modelNode23.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode29 = modelNode21.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode30 = modelNode20.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode31 = modelNode8.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode33 = modelNode8.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
        org.jboss.dmr.ModelNode modelNode35 = modelNode8.add(false);
        org.jboss.dmr.StringModelValue stringModelValue38 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue40 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean41 = stringModelValue38.equals(stringModelValue40);
        byte[] byteArray42 = stringModelValue40.asBytes();
        org.jboss.dmr.ModelNode modelNode43 = new org.jboss.dmr.ModelNode(byteArray42);
        org.jboss.dmr.ModelNode modelNode44 = modelNode8.add("H4sIAAAAAAAAAFvzloG1tIiBKdppzWfxH2wcIQ+YGBgqChgYGBgZASVtzhAcAAAA", byteArray42);
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode44.writeExternal(dataOutput45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str27, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList28);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertNotNull(modelNode30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode33);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(modelNode44);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        int int2 = modelNode1.asInt();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.insert(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression4 = stringModelValue3.asExpression();
        boolean boolean5 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stringModelValue3.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
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
        org.jboss.dmr.ModelNode modelNode47 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode50 = modelNode47.set("hi!", 0.0d);
        org.jboss.dmr.Property property51 = new org.jboss.dmr.Property("", modelNode50);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode53 = modelNode50.get(strArray52);
        org.jboss.dmr.ModelNode modelNode54 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int55 = modelNode54.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode56 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode59 = modelNode56.setExpression("hi!", "hi!");
        java.lang.String str60 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode56);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList61 = modelNode56.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode62 = modelNode54.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList61);
        org.jboss.dmr.ModelNode modelNode63 = modelNode53.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList61);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList64 = modelNode1.asList(modelNodeList61);
        modelNode1.protect();
        org.jboss.dmr.BooleanModelValue booleanModelValue67 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger68 = booleanModelValue67.asBigInteger();
        byte[] byteArray69 = booleanModelValue67.asBytes();
        boolean boolean71 = org.jboss.dmr.Base64.encodeToFile(byteArray69, "1L");
        java.lang.String str74 = org.jboss.dmr.Base64.encodeBytes(byteArray69, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode75 = modelNode1.add(byteArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(modelNode53);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNotNull(modelNode59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str60, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList61);
        org.junit.Assert.assertNotNull(modelNode62);
        org.junit.Assert.assertNotNull(modelNode63);
        org.junit.Assert.assertNotNull(modelNodeList64);
        org.junit.Assert.assertNotNull(booleanModelValue67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "AQ==" + "'", str74, "AQ==");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode17 = modelNode14.set("hi!", 0.0d);
        java.lang.String str18 = modelNode14.toString();
        org.jboss.dmr.ModelNode modelNode19 = modelNode14.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode24 = modelNode21.set("hi!", 0.0d);
        org.jboss.dmr.Property property25 = new org.jboss.dmr.Property("", modelNode24);
        org.jboss.dmr.ModelNode modelNode26 = modelNode14.set(property25);
        java.lang.String str27 = modelNode26.asString();
        org.jboss.dmr.ModelNode modelNode28 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode31 = modelNode28.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList32 = modelNode31.asList();
        org.jboss.dmr.ListModelValue listModelValue33 = new org.jboss.dmr.ListModelValue(modelNodeList32);
        org.jboss.dmr.ModelNode modelNode34 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue33);
        org.jboss.dmr.ModelValue modelValue35 = listModelValue33.resolve();
        int int37 = listModelValue33.asInt((int) (byte) 100);
        boolean boolean38 = listModelValue33.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList39 = listModelValue33.asList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList40 = modelNode26.asList(modelNodeList39);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList41 = modelNode13.asList(modelNodeList39);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode43 = modelNode13.addExpression("H4sIAAAAAAAAAAMAAAAAAAAAAAA=");
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
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(\"hi!\" => 0.0)" + "'", str18, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(modelNode24);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str27, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNodeList32);
        org.junit.Assert.assertNotNull(modelValue35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(modelNodeList39);
        org.junit.Assert.assertNotNull(modelNodeList40);
        org.junit.Assert.assertNotNull(modelNodeList41);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode8 = modelNode5.set("hi!", 0.0d);
        org.jboss.dmr.Property property9 = new org.jboss.dmr.Property("", modelNode8);
        boolean boolean11 = modelNode8.equals((java.lang.Object) 100L);
        boolean boolean12 = modelNode0.equals(modelNode8);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType13 = modelNode0.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = propertyModelValue10.asList();
        java.util.List<org.jboss.dmr.Property> propertyList12 = propertyModelValue10.asPropertyList();
        org.jboss.dmr.ModelValue modelValue13 = propertyModelValue10.protect();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue10.formatAsJSON(printWriter14, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNodeList11);
        org.junit.Assert.assertNotNull(propertyList12);
        org.junit.Assert.assertNotNull(modelValue13);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        boolean boolean20 = modelReader15.isUndefined();
        boolean boolean21 = modelReader15.isObjectStart();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType22 = modelReader15.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelValue modelValue6 = listModelValue5.resolve();
        boolean boolean8 = listModelValue5.has((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = listModelValue5.insertChild((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ValueExpression valueExpression11 = expressionValue8.asExpression();
        org.jboss.dmr.BooleanModelValue booleanModelValue13 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long14 = booleanModelValue13.asLong();
        org.jboss.dmr.ValueExpression valueExpression15 = booleanModelValue13.asExpression();
        java.lang.String str16 = valueExpression15.toString();
        org.jboss.dmr.ExpressionValue expressionValue18 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression19 = expressionValue18.asExpression();
        boolean boolean20 = valueExpression15.equals(valueExpression19);
        org.jboss.dmr.LongModelValue longModelValue22 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal23 = longModelValue22.asBigDecimal();
        int int24 = longModelValue22.asInt();
        org.jboss.dmr.ValueExpression valueExpression25 = longModelValue22.asExpression();
        boolean boolean26 = valueExpression19.equals(valueExpression25);
        int int27 = valueExpression25.resolveInt();
        org.jboss.dmr.ExpressionValue expressionValue29 = new org.jboss.dmr.ExpressionValue("1");
        org.jboss.dmr.ValueExpression valueExpression30 = expressionValue29.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver31 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str32 = valueExpression30.resolveString(valueExpressionResolver31);
        java.math.BigInteger bigInteger33 = valueExpression25.resolveBigInteger(valueExpressionResolver31);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = valueExpression11.resolveLong(valueExpressionResolver31);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(valueExpression11);
        org.junit.Assert.assertNotNull(booleanModelValue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(valueExpression15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Expression \"true\"" + "'", str16, "Expression \"true\"");
        org.junit.Assert.assertNotNull(valueExpression19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(valueExpression25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(valueExpression30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertNotNull(bigInteger33);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = valueExpression3.toString();
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression7 = expressionValue6.asExpression();
        boolean boolean8 = valueExpression3.equals(valueExpression7);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = valueExpression3.resolveBigDecimal();
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
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        org.jboss.dmr.StringModelValue stringModelValue6 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        boolean boolean7 = stringModelValue3.equals(stringModelValue6);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = stringModelValue6.asDouble(4.9E-324d);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        org.jboss.dmr.Property property6 = property5.clone();
        java.lang.String str7 = property6.getName();
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long7 = booleanModelValue6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = booleanModelValue6.asExpression();
        boolean boolean10 = valueExpression8.equals((java.lang.Object) 'p');
        boolean boolean11 = valueExpression3.equals(valueExpression8);
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = valueExpression3.resolveInt(valueExpressionResolver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = inputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = listModelValue5.insertChild((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelValue13);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode29 = modelNode13.insert(8);
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
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode23 = listModelValue13.requireChild(8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [8]");
        } catch (java.util.NoSuchElementException e) {
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
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
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
        org.jboss.dmr.ExpressionValue expressionValue70 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue72 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean73 = expressionValue70.equals(expressionValue72);
        org.jboss.dmr.ExpressionValue expressionValue75 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue77 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean78 = expressionValue75.equals(expressionValue77);
        boolean boolean79 = expressionValue70.equals(expressionValue77);
        org.jboss.dmr.ValueExpression valueExpression80 = expressionValue77.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue82 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ValueExpression valueExpression83 = expressionValue82.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue85 = new org.jboss.dmr.ExpressionValue("hi!");
        java.lang.String str86 = expressionValue85.toString();
        org.jboss.dmr.ModelNode modelNode88 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode91 = modelNode88.set("hi!", 0.0d);
        org.jboss.dmr.Property property92 = new org.jboss.dmr.Property("", modelNode91);
        boolean boolean93 = expressionValue85.equals((java.lang.Object) property92);
        boolean boolean94 = expressionValue82.equals(expressionValue85);
        boolean boolean95 = expressionValue77.equals((java.lang.Object) boolean94);
        org.jboss.dmr.ValueExpression valueExpression96 = expressionValue77.asExpression();
        org.jboss.dmr.ModelNode modelNode97 = modelNode2.set("(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))", valueExpression96);
        java.util.List<org.jboss.dmr.Property> propertyList98 = modelNode2.asPropertyList();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(valueExpression80);
        org.junit.Assert.assertNotNull(valueExpression83);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "expression \"hi!\"" + "'", str86, "expression \"hi!\"");
        org.junit.Assert.assertNotNull(modelNode91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(valueExpression96);
        org.junit.Assert.assertNotNull(modelNode97);
        org.junit.Assert.assertNotNull(propertyList98);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = modelNode4.asListOrEmpty();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", modelNode4, false);
        boolean boolean9 = propertyModelValue7.has("10.0");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue7.formatAsJSON(printWriter10, (int) 'b', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        java.lang.String str2 = stringModelValue1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = stringModelValue1.asBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"" + "'", str2, "\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.FALSE;
        org.jboss.dmr.Validation.validate(modelNode0, "\"BYTES_VALUE\"");
        org.junit.Assert.assertNotNull(modelNode0);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(bigDecimal9);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.setNoCopy("35", modelNode12);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNode12.add("AAAAZA==", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        boolean boolean20 = modelReader15.isUndefined();
        boolean boolean21 = modelReader15.isListStart();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType22 = modelReader15.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        boolean boolean8 = listModelValue5.equals((java.lang.Object) true);
        boolean boolean9 = listModelValue5.asBoolean();
        boolean boolean11 = listModelValue5.asBoolean(false);
        java.lang.String str12 = listModelValue5.toString();
        org.jboss.dmr.stream.ModelWriter modelWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.write(modelWriter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str12, "[(\"hi!\" => 0.0)]");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        long long6 = bigIntegerModelValue4.asLong((long) 'b');
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue7 = null;
        boolean boolean8 = bigIntegerModelValue4.equals(bigIntegerModelValue7);
        org.jboss.dmr.stream.ModelWriter modelWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.write(modelWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        int int6 = bigIntegerModelValue4.asInt((int) (short) 1);
        org.jboss.dmr.BooleanModelValue booleanModelValue7 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double8 = booleanModelValue7.asDouble();
        org.jboss.dmr.ModelValue modelValue9 = booleanModelValue7.copy();
        java.math.BigInteger bigInteger10 = booleanModelValue7.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue11 = new org.jboss.dmr.BigIntegerModelValue(bigInteger10);
        java.lang.String str12 = bigIntegerModelValue11.asString();
        java.math.BigInteger bigInteger13 = bigIntegerModelValue11.asBigInteger();
        boolean boolean14 = bigIntegerModelValue4.equals(bigIntegerModelValue11);
        org.jboss.dmr.stream.ModelWriter modelWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.write(modelWriter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(booleanModelValue7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.ModelNode modelNode10 = propertyModelValue9.asObject();
        java.lang.String str11 = propertyModelValue9.asString();
        org.jboss.dmr.BooleanModelValue booleanModelValue13 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray14 = booleanModelValue13.asBytes();
        java.lang.String str15 = booleanModelValue13.asString();
        int int16 = booleanModelValue13.asInt();
        long long17 = booleanModelValue13.asLong();
        boolean boolean19 = booleanModelValue13.equals((java.lang.Object) '4');
        java.math.BigInteger bigInteger20 = booleanModelValue13.asBigInteger();
        boolean boolean21 = propertyModelValue9.equals((java.lang.Object) bigInteger20);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode23 = propertyModelValue9.requireChild("(\"\" => (\"hi!\" => 0.0))");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '(\"\" => (\"hi!\" => 0.0))' exists");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str11, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertNotNull(booleanModelValue13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "true" + "'", str15, "true");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        int int1 = objectModelValue0.asInt();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.Property property2 = objectModelValue0.asProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode4 = modelNode1.add(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("PROPERTY", false);
        java.io.InputStream inputStream4 = null;
        org.jboss.dmr.Base64.InputStream inputStream6 = new org.jboss.dmr.Base64.InputStream(inputStream4, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream7 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream6);
        org.jboss.dmr.Base64.InputStream inputStream8 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode10 = modelNodeFactory0.readFrom((java.io.InputStream) inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(100);
        org.jboss.dmr.ModelNode modelNode9 = modelNode0.add(modelNode1);
        org.jboss.dmr.ModelNode modelNode11 = modelNode9.set((double) (-1.0f));
        byte[] byteArray12 = modelNode11.asBytesOrNull();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode15 = modelNode11.add("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }", (double) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-65, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        long long5 = booleanModelValue1.asLong();
        org.jboss.dmr.IntModelValue intModelValue7 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str8 = intModelValue7.asString();
        double double10 = intModelValue7.asDouble((double) 2);
        java.math.BigDecimal bigDecimal11 = intModelValue7.asBigDecimal();
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode(bigDecimal11);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode(bigDecimal11);
        boolean boolean14 = booleanModelValue1.equals((java.lang.Object) modelNode13);
        org.jboss.dmr.stream.ModelWriter modelWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            booleanModelValue1.write(modelWriter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        byte[] byteArray0 = null;
        org.jboss.dmr.BytesModelValue bytesModelValue1 = new org.jboss.dmr.BytesModelValue(byteArray0);
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue1.format(printWriter2, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        java.lang.String str1 = org.jboss.dmr.ModelValue.quote("35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"35\"" + "'", str1, "\"35\"");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        boolean boolean4 = booleanModelValue1.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = booleanModelValue1.insertChild((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        double double9 = bigDecimalModelValue7.asDouble((double) 'p');
        org.jboss.dmr.stream.ModelWriter modelWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue7.write(modelWriter10);
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
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.io.OutputStream outputStream0 = null;
        org.jboss.dmr.Base64.OutputStream outputStream1 = new org.jboss.dmr.Base64.OutputStream(outputStream0);
        outputStream1.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream3 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream1);
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream3);
        outputStream4.flushBase64();
        outputStream4.resumeEncoding();
        org.jboss.dmr.BooleanModelValue booleanModelValue8 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger9 = booleanModelValue8.asBigInteger();
        byte[] byteArray10 = booleanModelValue8.asBytes();
        boolean boolean12 = org.jboss.dmr.Base64.encodeToFile(byteArray10, "1L");
        // The following exception was thrown during execution in test generation
        try {
            outputStream4.write(byteArray10, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ValueExpression valueExpression8 = typeModelValue5.asExpression();
        org.jboss.dmr.ModelType modelType9 = typeModelValue5.asType();
        boolean boolean11 = typeModelValue5.asBoolean(true);
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            typeModelValue5.formatAsJSON(printWriter12, (int) 'l', true);
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
        org.junit.Assert.assertTrue("'" + modelType9 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType9.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
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
        org.jboss.dmr.ModelNode modelNode13 = objectModelValue7.asObject();
        java.util.List<org.jboss.dmr.Property> propertyList14 = objectModelValue7.asPropertyList();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue7.format(printWriter15, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(propertyList14);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        java.lang.String str2 = stringModelValue1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stringModelValue1.asInt((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"" + "'", str2, "\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        boolean boolean2 = doubleModelValue1.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression3 = doubleModelValue1.asExpression();
        long long4 = doubleModelValue1.asLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
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
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue18 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger19 = booleanModelValue18.asBigInteger();
        byte[] byteArray20 = booleanModelValue18.asBytes();
        org.jboss.dmr.ModelNode modelNode21 = modelNode15.set("expression \"hi!\"", byteArray20);
        java.lang.String str23 = org.jboss.dmr.Base64.encodeBytes(byteArray20, 1);
        // The following exception was thrown during execution in test generation
        try {
            outputStream3.write(byteArray20, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(booleanModelValue18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AQ==" + "'", str23, "AQ==");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 0);
        long long2 = doubleModelValue1.asLong();
        boolean boolean4 = doubleModelValue1.asBoolean(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ValueExpression valueExpression11 = expressionValue8.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = valueExpression11.resolveInt();
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
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
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
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.format(printWriter24, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long2 = booleanModelValue1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        org.jboss.dmr.ExpressionValue expressionValue4 = new org.jboss.dmr.ExpressionValue(valueExpression3);
        java.lang.String str5 = expressionValue4.asString();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue4.formatAsJSON(printWriter6, 2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "true" + "'", str5, "true");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        boolean boolean8 = bigDecimalModelValue7.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression9 = bigDecimalModelValue7.asExpression();
        org.jboss.dmr.ValueExpression valueExpression10 = bigDecimalModelValue7.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver11 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str13 = valueExpressionResolver11.resolvePart("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = valueExpression10.resolveBigInteger(valueExpressionResolver11);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(valueExpression9);
        org.junit.Assert.assertNotNull(valueExpression10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode1 = org.jboss.dmr.ModelNode.fromString("AAAAZA==");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected character 'A' while reading DMR stream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType1 = org.jboss.dmr.ModelType.forChar('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid type character 'a'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.format(printWriter9, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode2 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode5 = modelNode2.set("hi!", 0.0d);
        java.lang.String str6 = modelNode2.toString();
        org.jboss.dmr.ModelNode modelNode7 = modelNode2.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode9 = modelNode2.set(100);
        org.jboss.dmr.ModelNode modelNode10 = modelNode1.add(modelNode2);
        org.jboss.dmr.Property property11 = new org.jboss.dmr.Property("", modelNode2);
        java.lang.String str12 = property11.getName();
        org.jboss.dmr.Property property13 = property11.clone();
        java.lang.String str14 = property11.getName();
        java.lang.String str15 = property11.getName();
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        int int6 = bigIntegerModelValue4.asInt((int) (short) 1);
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.format(printWriter7, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        double double5 = bytesModelValue4.asDouble();
        org.jboss.dmr.stream.ModelWriter modelWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue4.write(modelWriter6);
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
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("10.0", false);
        boolean boolean4 = modelNode3.isDefined();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode3.add("false", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(modelNode6);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue4 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str5 = longModelValue4.asString();
        byte[] byteArray6 = longModelValue4.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue7 = new org.jboss.dmr.BytesModelValue(byteArray6);
        int int10 = inputStream2.read(byteArray6, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream12 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = inputStream2.skip((long) (short) 1);
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
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode1.add(4.9E-324d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str2 = longModelValue1.asString();
        byte[] byteArray3 = longModelValue1.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue4 = new org.jboss.dmr.BytesModelValue(byteArray3);
        java.lang.String str5 = bytesModelValue4.asString();
        int int6 = bytesModelValue4.asInt();
        long long8 = bytesModelValue4.asLong((long) (short) 1);
        long long9 = bytesModelValue4.asLong();
        java.lang.String str10 = bytesModelValue4.asString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str5, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str10, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = inputStream4.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.PROPERTY;
        char char1 = modelType0.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue2 = org.jboss.dmr.TypeModelValue.of(modelType0);
        org.jboss.dmr.ModelType modelType3 = org.jboss.dmr.ModelType.PROPERTY;
        char char4 = modelType3.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue5 = org.jboss.dmr.TypeModelValue.of(modelType3);
        boolean boolean6 = typeModelValue2.equals(typeModelValue5);
        java.lang.String str7 = typeModelValue5.asString();
        org.jboss.dmr.ModelType modelType8 = org.jboss.dmr.ModelType.PROPERTY;
        char char9 = modelType8.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue10 = org.jboss.dmr.TypeModelValue.of(modelType8);
        org.jboss.dmr.ModelType modelType11 = org.jboss.dmr.ModelType.PROPERTY;
        char char12 = modelType11.getTypeChar();
        org.jboss.dmr.TypeModelValue typeModelValue13 = org.jboss.dmr.TypeModelValue.of(modelType11);
        boolean boolean14 = typeModelValue10.equals(typeModelValue13);
        java.lang.String str15 = typeModelValue13.asString();
        boolean boolean17 = typeModelValue13.asBoolean(true);
        boolean boolean18 = typeModelValue5.equals(typeModelValue13);
        org.jboss.dmr.IntModelValue intModelValue20 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str21 = intModelValue20.asString();
        long long22 = intModelValue20.asLong();
        org.jboss.dmr.ModelValue modelValue23 = intModelValue20.protect();
        boolean boolean24 = typeModelValue13.equals((java.lang.Object) intModelValue20);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode26 = typeModelValue13.requireChild("35");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child '35' exists");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertTrue("'" + modelType8 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType8.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'p' + "'", char9 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue10);
        org.junit.Assert.assertTrue("'" + modelType11 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType11.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'p' + "'", char12 == 'p');
        org.junit.Assert.assertNotNull(typeModelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PROPERTY" + "'", str15, "PROPERTY");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "32" + "'", str21, "32");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(modelValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode7 = modelNode4.get(strArray6);
        java.io.DataInputStream dataInputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode4.readExternal(dataInputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        java.io.InputStream inputStream1 = null;
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream(inputStream1, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue5 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str6 = longModelValue5.asString();
        byte[] byteArray7 = longModelValue5.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue8 = new org.jboss.dmr.BytesModelValue(byteArray7);
        int int11 = inputStream3.read(byteArray7, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream13 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream3, (-1));
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = modelNodeFactory0.readFrom((java.io.InputStream) inputStream3, charset14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType18 = modelReader15.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((-1L));
        long long3 = longModelValue1.asLong((long) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.write(modelWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long3 = intModelValue1.asLong((long) 'b');
        java.lang.String str4 = intModelValue1.asString();
        java.math.BigInteger bigInteger5 = intModelValue1.asBigInteger();
        boolean boolean7 = intModelValue1.asBoolean(false);
        org.jboss.dmr.IntModelValue intModelValue9 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long11 = intModelValue9.asLong((long) 'b');
        java.lang.String str12 = intModelValue9.asString();
        boolean boolean13 = intModelValue1.equals(intModelValue9);
        int int15 = intModelValue9.asInt(112);
        double double16 = intModelValue9.asDouble();
        java.lang.String str17 = intModelValue9.asString();
        org.jboss.dmr.stream.ModelWriter modelWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            intModelValue9.write(modelWriter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32" + "'", str12, "32");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32" + "'", str17, "32");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        int int6 = bigIntegerModelValue4.asInt((int) (short) 1);
        org.jboss.dmr.BooleanModelValue booleanModelValue7 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double8 = booleanModelValue7.asDouble();
        org.jboss.dmr.ModelValue modelValue9 = booleanModelValue7.copy();
        java.math.BigInteger bigInteger10 = booleanModelValue7.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue11 = new org.jboss.dmr.BigIntegerModelValue(bigInteger10);
        java.lang.String str12 = bigIntegerModelValue11.asString();
        java.math.BigInteger bigInteger13 = bigIntegerModelValue11.asBigInteger();
        boolean boolean14 = bigIntegerModelValue4.equals(bigIntegerModelValue11);
        double double16 = bigIntegerModelValue4.asDouble(0.0d);
        double double18 = bigIntegerModelValue4.asDouble((double) 100.0f);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.writeExternal(dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(booleanModelValue7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
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
            org.jboss.dmr.ModelNode modelNode12 = listModelValue5.removeChild((int) (short) 0);
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
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        java.lang.String str1 = org.jboss.dmr.ModelValue.quote("bytes {\n    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01\n}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"bytes {\n    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01\n}\"" + "'", str1, "\"bytes {\n    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01\n}\"");
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
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
        java.math.BigInteger bigInteger21 = bytesModelValue19.asBigInteger();
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bytesModelValue19.formatAsJSON(printWriter22, (int) ' ', true);
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
        org.junit.Assert.assertNotNull(bigInteger21);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        java.lang.String str5 = modelNode1.toString();
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode8 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode11 = modelNode8.set("hi!", 0.0d);
        org.jboss.dmr.Property property12 = new org.jboss.dmr.Property("", modelNode11);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.set(property12);
        org.jboss.dmr.PropertyModelValue propertyModelValue15 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode13, false);
        org.jboss.dmr.Property property16 = propertyModelValue15.asProperty();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode18 = propertyModelValue15.getChild((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"hi!\" => 0.0)" + "'", str5, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(true);
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.stream.ModelReader modelReader3 = modelStreamFactory1.newModelReader(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.ModelValue modelValue11 = propertyModelValue10.clone();
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
        org.junit.Assert.assertNotNull(modelValue11);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = modelReader15.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't double");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
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
            org.jboss.dmr.ModelNode modelNode16 = listModelValue5.insertChild(10);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        java.lang.String str6 = modelNode3.asString("true");
        org.jboss.dmr.ModelNode modelNode8 = modelNode3.set((double) 'a');
        org.jboss.dmr.IntModelValue intModelValue10 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str11 = intModelValue10.asString();
        double double13 = intModelValue10.asDouble((double) 2);
        java.math.BigDecimal bigDecimal14 = intModelValue10.asBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue15 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal14);
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue16 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal14);
        org.jboss.dmr.ModelNode modelNode17 = modelNode8.set(bigDecimal14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet18 = modelNode8.keys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"hi!\" => 0.0)" + "'", str6, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(modelNode17);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        org.jboss.dmr.ModelNode modelNode8 = modelNode6.set("true");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = modelNode8.asIntOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelNode8);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = modelNode1.set("expression \"hi!\"", (int) (short) -1);
        java.util.Set<java.lang.String> strSet7 = modelNode6.keys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = modelNode6.asBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
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
        java.math.BigInteger bigInteger48 = modelNode47.asBigIntegerOrNull();
        java.io.DataInput dataInput49 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode47.readExternal(dataInput49);
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
        org.junit.Assert.assertNotNull(bigInteger48);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType2 = intModelValue1.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression4 = stringModelValue3.asExpression();
        boolean boolean5 = stringModelValue1.equals(stringModelValue3);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType6 = stringModelValue3.asType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.jboss.dmr.ModelType.(\"\" => (\"hi!\" => 0.0))");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.BooleanModelValue booleanModelValue2 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger3 = booleanModelValue2.asBigInteger();
        org.jboss.dmr.ModelNode modelNode4 = modelNode0.add(bigInteger3);
        org.jboss.dmr.ModelNode modelNode5 = new org.jboss.dmr.ModelNode(bigInteger3);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode5.writeJSONString(printWriter6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(modelNode4);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
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
        byte[] byteArray26 = bytesModelValue20.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.jboss.dmr.Base64.encodeBytes(byteArray26, (int) (byte) -1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue10 = new org.jboss.dmr.PropertyModelValue(property7);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList11 = propertyModelValue10.asList();
        java.util.List<org.jboss.dmr.Property> propertyList12 = propertyModelValue10.asPropertyList();
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyModelValue10.writeExternal(dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNodeList11);
        org.junit.Assert.assertNotNull(propertyList12);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((int) 'a');
        org.jboss.dmr.ModelNode modelNode2 = modelNode1.setEmptyList();
        java.io.OutputStream outputStream3 = null;
        org.jboss.dmr.Base64.OutputStream outputStream4 = new org.jboss.dmr.Base64.OutputStream(outputStream3);
        outputStream4.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream6 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream4);
        org.jboss.dmr.Base64.OutputStream outputStream8 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream6, (int) (byte) -1);
        outputStream6.suspendEncoding();
        // The following exception was thrown during execution in test generation
        try {
            modelNode2.writeExternal((java.io.OutputStream) outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode2);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode4 = modelNode1.set("hi!", 0.0d);
        org.jboss.dmr.Property property5 = new org.jboss.dmr.Property("", modelNode4);
        org.jboss.dmr.Property property6 = property5.clone();
        org.jboss.dmr.PropertyModelValue propertyModelValue7 = new org.jboss.dmr.PropertyModelValue(property6);
        org.jboss.dmr.ModelValue modelValue8 = propertyModelValue7.resolve();
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelValue8.writeExternal(dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(modelValue8);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
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
        org.jboss.dmr.ModelNode modelNode41 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode44 = modelNode41.set("hi!", 0.0d);
        org.jboss.dmr.ModelNode modelNode45 = new org.jboss.dmr.ModelNode();
        java.lang.Long long46 = modelNode45.asLongOrNull();
        org.jboss.dmr.ModelNode[] modelNodeArray47 = new org.jboss.dmr.ModelNode[] { modelNode41, modelNode45 };
        java.util.ArrayList<org.jboss.dmr.ModelNode> modelNodeList48 = new java.util.ArrayList<org.jboss.dmr.ModelNode>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48, modelNodeArray47);
        org.jboss.dmr.ModelNode modelNode50 = modelNode7.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList48);
        org.jboss.dmr.ModelNode modelNode53 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long54 = modelNode53.asLong();
        org.jboss.dmr.ValueExpression valueExpression55 = modelNode53.asExpression();
        java.math.BigDecimal bigDecimal56 = valueExpression55.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode57 = modelNode7.set("true", bigDecimal56);
        java.io.ObjectOutput objectOutput58 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode7.writeExternal(objectOutput58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(modelNode44);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNotNull(modelNodeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(valueExpression55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(modelNode57);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        java.lang.String str1 = org.jboss.dmr.ValueExpression.quote("1L");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1L" + "'", str1, "1L");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        boolean boolean4 = doubleModelValue1.asBoolean(true);
        byte[] byteArray5 = doubleModelValue1.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet6 = doubleModelValue1.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(bigDecimal9);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.setNoCopy("35", modelNode12);
        java.io.InputStream inputStream14 = null;
        org.jboss.dmr.Base64.InputStream inputStream16 = new org.jboss.dmr.Base64.InputStream(inputStream14, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue18 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str19 = longModelValue18.asString();
        byte[] byteArray20 = longModelValue18.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue21 = new org.jboss.dmr.BytesModelValue(byteArray20);
        int int24 = inputStream16.read(byteArray20, (int) (short) 1, (int) (byte) -1);
        java.lang.String str25 = org.jboss.dmr.Base64.encodeBytes(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode26 = modelNode13.add(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AAAAAAAAAAE=" + "'", str25, "AAAAAAAAAAE=");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isLong();
        boolean boolean17 = modelReader15.isBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelType modelType18 = modelReader15.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ModelValue modelValue11 = expressionValue1.resolve();
        java.lang.String str12 = expressionValue1.asString();
        org.jboss.dmr.ModelValue modelValue13 = expressionValue1.resolve();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue1.format(printWriter14, (int) 'p', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(modelValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(modelValue13);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        java.lang.String str5 = valueExpression3.getExpressionString();
        java.math.BigDecimal bigDecimal6 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue7 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal6);
        int int9 = bigDecimalModelValue7.asInt(0);
        int int10 = bigDecimalModelValue7.asInt();
        org.jboss.dmr.stream.ModelEvent modelEvent11 = org.jboss.dmr.stream.ModelEvent.PROPERTY_END;
        boolean boolean12 = bigDecimalModelValue7.equals((java.lang.Object) modelEvent11);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + modelEvent11 + "' != '" + org.jboss.dmr.stream.ModelEvent.PROPERTY_END + "'", modelEvent11.equals(org.jboss.dmr.stream.ModelEvent.PROPERTY_END));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jboss.dmr.Base64.encodeFromFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error encoding from file ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        java.io.InputStream inputStream0 = null;
        org.jboss.dmr.Base64.InputStream inputStream2 = new org.jboss.dmr.Base64.InputStream(inputStream0, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream3 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream2.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.jboss.dmr.ExpressionValue expressionValue1 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue3 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean4 = expressionValue1.equals(expressionValue3);
        org.jboss.dmr.ExpressionValue expressionValue6 = new org.jboss.dmr.ExpressionValue("hi!");
        org.jboss.dmr.ExpressionValue expressionValue8 = new org.jboss.dmr.ExpressionValue("hi!");
        boolean boolean9 = expressionValue6.equals(expressionValue8);
        boolean boolean10 = expressionValue1.equals(expressionValue8);
        org.jboss.dmr.ValueExpression valueExpression11 = expressionValue8.asExpression();
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long14 = modelNode13.asLong();
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
        org.jboss.dmr.ModelNode modelNode57 = modelNode13.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode23);
        boolean boolean58 = modelNode23.isDefined();
        boolean boolean59 = expressionValue8.equals((java.lang.Object) boolean58);
        org.jboss.dmr.stream.ModelWriter modelWriter60 = null;
        // The following exception was thrown during execution in test generation
        try {
            expressionValue8.write(modelWriter60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(valueExpression11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
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
        org.junit.Assert.assertNotNull(modelNode57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.get("Expression \"true\"");
        java.util.Collection<org.jboss.dmr.ModelNode> modelNodeCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode9 = modelNode7.set(modelNodeCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = modelNode1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"EXPRESSION_VALUE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.ModelValue modelValue2 = objectModelValue0.copy();
        org.jboss.dmr.ModelType modelType3 = modelValue2.getType();
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertTrue("'" + modelType3 + "' != '" + org.jboss.dmr.ModelType.OBJECT + "'", modelType3.equals(org.jboss.dmr.ModelType.OBJECT));
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        boolean boolean5 = objectModelValue0.asBoolean();
        int int7 = objectModelValue0.asInt((int) 'b');
        org.jboss.dmr.stream.ModelWriter modelWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue0.write(modelWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        boolean boolean20 = modelReader15.isUndefined();
        boolean boolean21 = modelReader15.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            modelReader15.close();
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Uncomplete DMR stream have been read");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z?cy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA?AAAAeA==\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.ModelNode modelNode9 = property7.getValue();
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str13 = modelNode11.asString("true");
        org.jboss.dmr.ModelNode modelNode16 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long17 = modelNode16.asLong();
        org.jboss.dmr.ValueExpression valueExpression18 = modelNode16.asExpression();
        java.math.BigDecimal bigDecimal19 = valueExpression18.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode20 = new org.jboss.dmr.ModelNode(bigDecimal19);
        org.jboss.dmr.ModelNode modelNode22 = modelNode20.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode23 = modelNode11.setNoCopy("35", modelNode22);
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
        org.jboss.dmr.ModelNode modelNode45 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode48 = modelNode45.set("hi!", 0.0d);
        org.jboss.dmr.Property property49 = new org.jboss.dmr.Property("", modelNode48);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode51 = modelNode48.get(strArray50);
        org.jboss.dmr.ModelNode modelNode52 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode55 = modelNode52.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList56 = modelNode55.asList();
        org.jboss.dmr.ListModelValue listModelValue57 = new org.jboss.dmr.ListModelValue(modelNodeList56);
        org.jboss.dmr.ModelNode modelNode58 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue57);
        org.jboss.dmr.ModelValue modelValue59 = listModelValue57.resolve();
        int int61 = listModelValue57.asInt((int) (byte) 100);
        java.util.List<org.jboss.dmr.Property> propertyList62 = listModelValue57.asPropertyList();
        java.util.List<org.jboss.dmr.Property> propertyList63 = modelNode51.asPropertyList(propertyList62);
        modelNode31.setNoCopy(modelNode51);
        org.jboss.dmr.ModelNode modelNode66 = modelNode51.set((long) 100);
        org.jboss.dmr.ModelNode modelNode67 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode70 = modelNode67.setExpression("hi!", "hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList71 = modelNode70.asListOrEmpty();
        java.lang.String[] strArray74 = new java.lang.String[] { "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=", "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" };
        boolean boolean75 = modelNode70.hasDefined(strArray74);
        boolean boolean76 = modelNode66.hasDefined(strArray74);
        boolean boolean77 = modelNode23.hasDefined(strArray74);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode78 = modelNode9.get(strArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(valueExpression18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertNotNull(modelNode23);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertNotNull(modelNodeList36);
        org.junit.Assert.assertNotNull(modelValue39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(propertyList42);
        org.junit.Assert.assertNotNull(propertyList43);
        org.junit.Assert.assertNotNull(modelNode48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(modelNode51);
        org.junit.Assert.assertNotNull(modelNode55);
        org.junit.Assert.assertNotNull(modelNodeList56);
        org.junit.Assert.assertNotNull(modelValue59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(propertyList62);
        org.junit.Assert.assertNotNull(propertyList63);
        org.junit.Assert.assertNotNull(modelNode66);
        org.junit.Assert.assertNotNull(modelNode70);
        org.junit.Assert.assertNotNull(modelNodeList71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode3 = modelNode1.add((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((long) 10);
        java.lang.String str3 = modelNode1.asString("true");
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long7 = modelNode6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = modelNode6.asExpression();
        java.math.BigDecimal bigDecimal9 = valueExpression8.resolveBigDecimal();
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode(bigDecimal9);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((double) (byte) 0);
        org.jboss.dmr.ModelNode modelNode13 = modelNode1.setNoCopy("35", modelNode12);
        boolean boolean15 = modelNode12.hasDefined("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long19 = modelNode18.asLong();
        org.jboss.dmr.ValueExpression valueExpression20 = modelNode18.asExpression();
        java.math.BigDecimal bigDecimal21 = valueExpression20.resolveBigDecimal();
        java.lang.String str22 = valueExpression20.getExpressionString();
        java.math.BigDecimal bigDecimal23 = valueExpression20.resolveBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue24 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal23);
        boolean boolean25 = bigDecimalModelValue24.asBoolean();
        org.jboss.dmr.ValueExpression valueExpression26 = bigDecimalModelValue24.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode27 = modelNode12.add("bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }", valueExpression26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(valueExpression20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1.0" + "'", str22, "1.0");
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(valueExpression26);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
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
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectModelValue7.format(printWriter13, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode4 = modelNode3.setEmptyList();
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.asObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode5.get("Expression \"true\"");
        org.jboss.dmr.IntModelValue intModelValue10 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str11 = intModelValue10.asString();
        double double13 = intModelValue10.asDouble((double) 2);
        java.math.BigInteger bigInteger14 = intModelValue10.asBigInteger();
        org.jboss.dmr.ModelNode modelNode15 = modelNode7.set("Expression \"true\"", bigInteger14);
        org.jboss.dmr.ModelNode modelNode17 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode20 = modelNode17.set("hi!", 0.0d);
        java.lang.String str21 = modelNode17.toString();
        org.jboss.dmr.ModelNode modelNode22 = modelNode17.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode24 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode27 = modelNode24.set("hi!", 0.0d);
        org.jboss.dmr.Property property28 = new org.jboss.dmr.Property("", modelNode27);
        org.jboss.dmr.ModelNode modelNode29 = modelNode17.set(property28);
        java.lang.String str30 = modelNode29.asString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode31 = modelNode7.add("\"{\n    \\\"EXPRESSION_VALUE\\\" : 35\n}\"", modelNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(\"hi!\" => 0.0)" + "'", str21, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str30, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        double double6 = bigIntegerModelValue4.asDouble((double) 'b');
        java.lang.String str7 = bigIntegerModelValue4.asString();
        java.io.DataOutput dataOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigIntegerModelValue4.writeExternal(dataOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.jboss.dmr.ModelNode modelNode0 = org.jboss.dmr.ModelNode.ZERO_LONG;
        boolean boolean2 = modelNode0.asBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode5 = modelNode0.add("Expression \"1\"", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelValue modelValue6 = listModelValue5.resolve();
        long long8 = listModelValue5.asLong((long) (short) 10);
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode();
        java.lang.Long long10 = modelNode9.asLongOrNull();
        org.jboss.dmr.ModelNode modelNode11 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode14 = modelNode11.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList15 = modelNode14.asList();
        org.jboss.dmr.ListModelValue listModelValue16 = new org.jboss.dmr.ListModelValue(modelNodeList15);
        java.lang.String str17 = listModelValue16.asString();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList18 = listModelValue16.asList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList19 = modelNode9.asList(modelNodeList18);
        boolean boolean20 = listModelValue5.equals((java.lang.Object) modelNodeList19);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode22 = listModelValue5.requireChild((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child exists at index [100]");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str17, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertNotNull(modelNodeList18);
        org.junit.Assert.assertNotNull(modelNodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        org.jboss.dmr.ModelNode modelNode6 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue5);
        long long7 = listModelValue5.asLong();
        java.lang.Class<?> wildcardClass8 = listModelValue5.getClass();
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue3 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean4 = stringModelValue1.equals(stringModelValue3);
        byte[] byteArray5 = stringModelValue3.asBytes();
        org.jboss.dmr.ValueExpression valueExpression6 = stringModelValue3.asExpression();
        java.io.ObjectOutput objectOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression6.writeExternal(objectOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(valueExpression6);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
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
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList15 = listModelValue5.asList();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode16 = listModelValue5.addChild();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(modelNodeList15);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.jboss.dmr.ModelNodeFactory modelNodeFactory0 = org.jboss.dmr.ModelNodeFactory.INSTANCE;
        org.jboss.dmr.ModelNode modelNode3 = modelNodeFactory0.readFrom("PROPERTY", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNodeFactory0.readFrom("(\"hi!\" => expression \"hi!\")", true);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Unexpected character '(' while reading DMR stream");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNodeFactory0);
        org.junit.Assert.assertNotNull(modelNode3);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = modelReader15.getInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't int");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
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
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode20 = modelNode17.get(strArray19);
        org.jboss.dmr.ModelNode modelNode21 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int22 = modelNode21.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.setExpression("hi!", "hi!");
        java.lang.String str27 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode23);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList28 = modelNode23.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode29 = modelNode21.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode30 = modelNode20.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode31 = modelNode8.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList28);
        org.jboss.dmr.ModelNode modelNode33 = modelNode8.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
        org.jboss.dmr.ModelNode modelNode35 = modelNode8.add(false);
        org.jboss.dmr.StringModelValue stringModelValue38 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue40 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean41 = stringModelValue38.equals(stringModelValue40);
        byte[] byteArray42 = stringModelValue40.asBytes();
        org.jboss.dmr.ModelNode modelNode43 = new org.jboss.dmr.ModelNode(byteArray42);
        org.jboss.dmr.ModelNode modelNode44 = modelNode8.add("H4sIAAAAAAAAAFvzloG1tIiBKdppzWfxH2wcIQ+YGBgqChgYGBgZASVtzhAcAAAA", byteArray42);
        java.io.PrintWriter printWriter45 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelNode8.format(printWriter45, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(modelNode17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str27, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList28);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertNotNull(modelNode30);
        org.junit.Assert.assertNotNull(modelNode31);
        org.junit.Assert.assertNotNull(modelNode33);
        org.junit.Assert.assertNotNull(modelNode35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertNotNull(modelNode44);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) (byte) 1);
        long long2 = modelNode1.asLong();
        org.jboss.dmr.ValueExpression valueExpression3 = modelNode1.asExpression();
        java.math.BigDecimal bigDecimal4 = valueExpression3.resolveBigDecimal();
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        long long7 = booleanModelValue6.asLong();
        org.jboss.dmr.ValueExpression valueExpression8 = booleanModelValue6.asExpression();
        boolean boolean10 = valueExpression8.equals((java.lang.Object) 'p');
        boolean boolean11 = valueExpression3.equals(valueExpression8);
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode(valueExpression3);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode16 = modelNode13.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList17 = modelNode16.asList();
        org.jboss.dmr.ListModelValue listModelValue18 = new org.jboss.dmr.ListModelValue(modelNodeList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jboss.dmr.ModelNode> modelNodeList19 = modelNode12.asList(modelNodeList17);
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
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertNotNull(modelNodeList17);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        boolean boolean4 = stringModelValue1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = stringModelValue1.asString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"\" => (\"hi!\" => 0.0))\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str5, "(\"\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.jboss.dmr.Base64.decodeFromFile("{ \"35\" : 0.0 }");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error decoding from file { \"35\" : 0.0 }");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.lang.String str4 = modelNode0.toString();
        org.jboss.dmr.ModelNode modelNode5 = modelNode0.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode7 = modelNode0.set(100);
        org.jboss.dmr.ModelNode modelNode10 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.set((int) '#');
        org.jboss.dmr.ModelNode modelNode13 = modelNode0.setNoCopy("EXPRESSION_VALUE", modelNode12);
        org.jboss.dmr.ModelNode modelNode14 = modelNode13.resolve();
        org.jboss.dmr.ModelType modelType15 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode16 = new org.jboss.dmr.ModelNode(modelType15);
        org.jboss.dmr.ModelNode modelNode18 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode21 = modelNode18.set("hi!", 0.0d);
        org.jboss.dmr.Property property22 = new org.jboss.dmr.Property("", modelNode21);
        org.jboss.dmr.ModelNode modelNode23 = modelNode16.set(property22);
        org.jboss.dmr.PropertyModelValue propertyModelValue24 = new org.jboss.dmr.PropertyModelValue(property22);
        org.jboss.dmr.PropertyModelValue propertyModelValue25 = new org.jboss.dmr.PropertyModelValue(property22);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList26 = propertyModelValue25.asList();
        org.jboss.dmr.ModelNode modelNode27 = modelNode14.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList26);
        org.jboss.dmr.LongModelValue longModelValue30 = new org.jboss.dmr.LongModelValue(1L);
        int int32 = longModelValue30.asInt((int) (byte) 0);
        org.jboss.dmr.LongModelValue longModelValue34 = new org.jboss.dmr.LongModelValue((-1L));
        long long36 = longModelValue34.asLong((long) (byte) -1);
        double double38 = longModelValue34.asDouble((double) 10.0f);
        boolean boolean39 = longModelValue30.equals(longModelValue34);
        org.jboss.dmr.ModelType modelType40 = longModelValue30.getType();
        org.jboss.dmr.ModelNode modelNode41 = modelNode27.set("{ \"35\" : 0.0 }", modelType40);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = modelNode27.asLong();
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
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertTrue("'" + modelType15 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType15.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertNotNull(modelNode23);
        org.junit.Assert.assertNotNull(modelNodeList26);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + modelType40 + "' != '" + org.jboss.dmr.ModelType.LONG + "'", modelType40.equals(org.jboss.dmr.ModelType.LONG));
        org.junit.Assert.assertNotNull(modelNode41);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(false);
        int int3 = modelNode1.asInt(2);
        org.jboss.dmr.ModelNode modelNode5 = modelNode1.set(52);
        boolean boolean6 = modelNode1.asBoolean();
        java.io.OutputStream outputStream7 = null;
        org.jboss.dmr.Base64.OutputStream outputStream8 = new org.jboss.dmr.Base64.OutputStream(outputStream7);
        outputStream8.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream10 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream8);
        org.jboss.dmr.Base64.OutputStream outputStream12 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream10, (int) (byte) -1);
        outputStream10.suspendEncoding();
        // The following exception was thrown during execution in test generation
        try {
            modelNode1.writeExternal((java.io.OutputStream) outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        org.jboss.dmr.Validation.validate(modelNode1, "10.0");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = modelNode1.asDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isLong();
        boolean boolean17 = modelReader15.isBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = modelReader15.getBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't boolean");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.jboss.dmr.StringModelValue stringModelValue1 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.ValueExpression valueExpression2 = stringModelValue1.asExpression();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = stringModelValue1.asLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expression \"true\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpression2);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        boolean boolean2 = org.jboss.dmr.Base64.decodeToFile("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3CUQ/8AAAAAAAAHg=", "PROPERTY_VALUE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue6 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str7 = longModelValue6.asString();
        byte[] byteArray8 = longModelValue6.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue9 = new org.jboss.dmr.BytesModelValue(byteArray8);
        int int12 = inputStream4.read(byteArray8, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream14 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4, (-1));
        org.jboss.dmr.stream.ModelReader modelReader15 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream14);
        boolean boolean16 = modelReader15.isBigInteger();
        boolean boolean17 = modelReader15.isLong();
        boolean boolean18 = modelReader15.isBigDecimal();
        boolean boolean19 = modelReader15.isUndefined();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = modelReader15.getBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't big integer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(modelReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str2 = intModelValue1.asString();
        double double4 = intModelValue1.asDouble((double) 2);
        java.math.BigDecimal bigDecimal5 = intModelValue1.asBigDecimal();
        org.jboss.dmr.BigDecimalModelValue bigDecimalModelValue6 = new org.jboss.dmr.BigDecimalModelValue(bigDecimal5);
        long long7 = bigDecimalModelValue6.asLong();
        long long8 = bigDecimalModelValue6.asLong();
        long long10 = bigDecimalModelValue6.asLong((long) 'b');
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigDecimalModelValue6.writeJSONString(printWriter11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.jboss.dmr.IntModelValue intModelValue1 = new org.jboss.dmr.IntModelValue((int) ' ');
        double double2 = intModelValue1.asDouble();
        int int4 = intModelValue1.asInt((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode3 = modelNode1.set((int) '#');
        boolean boolean4 = modelNode1.isProtected();
        org.jboss.dmr.ModelNode modelNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode6 = modelNode1.set(modelNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newValue is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList4 = modelNode3.asList();
        org.jboss.dmr.ListModelValue listModelValue5 = new org.jboss.dmr.ListModelValue(modelNodeList4);
        java.lang.String str6 = listModelValue5.asString();
        org.jboss.dmr.ModelValue modelValue7 = listModelValue5.protect();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            listModelValue5.formatAsJSON(printWriter8, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[(\"hi!\" => 0.0)]" + "'", str6, "[(\"hi!\" => 0.0)]");
        org.junit.Assert.assertNotNull(modelValue7);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue((long) '4');
        java.math.BigDecimal bigDecimal2 = longModelValue1.asBigDecimal();
        int int3 = longModelValue1.asInt();
        java.lang.String str4 = longModelValue1.asString();
        boolean boolean5 = longModelValue1.asBoolean();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            longModelValue1.formatAsJSON(printWriter6, (int) 'p', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52" + "'", str4, "52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        long long5 = booleanModelValue1.asLong();
        org.jboss.dmr.IntModelValue intModelValue7 = new org.jboss.dmr.IntModelValue((int) ' ');
        java.lang.String str8 = intModelValue7.asString();
        double double10 = intModelValue7.asDouble((double) 2);
        java.math.BigDecimal bigDecimal11 = intModelValue7.asBigDecimal();
        org.jboss.dmr.ModelNode modelNode12 = new org.jboss.dmr.ModelNode(bigDecimal11);
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode(bigDecimal11);
        boolean boolean14 = booleanModelValue1.equals((java.lang.Object) modelNode13);
        java.io.InputStream inputStream15 = null;
        org.jboss.dmr.Base64.InputStream inputStream17 = new org.jboss.dmr.Base64.InputStream(inputStream15, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue19 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str20 = longModelValue19.asString();
        byte[] byteArray21 = longModelValue19.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue22 = new org.jboss.dmr.BytesModelValue(byteArray21);
        int int25 = inputStream17.read(byteArray21, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream27 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream17, (-1));
        // The following exception was thrown during execution in test generation
        try {
            modelNode13.readExternal((java.io.InputStream) inputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }
}

