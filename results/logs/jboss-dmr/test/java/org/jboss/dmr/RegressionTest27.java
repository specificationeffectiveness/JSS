package org.jboss.dmr;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
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
        org.jboss.dmr.LongModelValue longModelValue49 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str50 = longModelValue49.asString();
        byte[] byteArray51 = longModelValue49.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue52 = new org.jboss.dmr.BytesModelValue(byteArray51);
        java.lang.String str53 = bytesModelValue52.asString();
        int int54 = bytesModelValue52.asInt();
        long long56 = bytesModelValue52.asLong((long) (short) 1);
        long long57 = bytesModelValue52.asLong();
        byte[] byteArray58 = bytesModelValue52.asBytes();
        org.jboss.dmr.ModelNode modelNode59 = modelNode11.set(byteArray58);
        org.jboss.dmr.ModelNode modelNode60 = modelNode59.setEmptyList();
        org.jboss.dmr.ModelType modelType61 = modelNode60.getType();
        org.jboss.dmr.ModelNode modelNode63 = modelNode60.get((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str53, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(modelNode59);
        org.junit.Assert.assertNotNull(modelNode60);
        org.junit.Assert.assertTrue("'" + modelType61 + "' != '" + org.jboss.dmr.ModelType.LIST + "'", modelType61.equals(org.jboss.dmr.ModelType.LIST));
        org.junit.Assert.assertNotNull(modelNode63);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("EXPRESSION_VALUE");
        org.jboss.dmr.BooleanModelValue booleanModelValue4 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger5 = booleanModelValue4.asBigInteger();
        byte[] byteArray6 = booleanModelValue4.asBytes();
        org.jboss.dmr.ModelNode modelNode7 = modelNode1.set("expression \"hi!\"", byteArray6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode7.resolve();
        org.jboss.dmr.BooleanModelValue booleanModelValue9 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double10 = booleanModelValue9.asDouble();
        org.jboss.dmr.ModelValue modelValue11 = booleanModelValue9.copy();
        java.math.BigInteger bigInteger12 = booleanModelValue9.asBigInteger();
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode(bigInteger12);
        org.jboss.dmr.ModelNode modelNode14 = new org.jboss.dmr.ModelNode(bigInteger12);
        org.jboss.dmr.ModelNode modelNode15 = modelNode7.set(bigInteger12);
        org.jboss.dmr.StringModelValue stringModelValue17 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        byte[] byteArray18 = stringModelValue17.asBytes();
        org.jboss.dmr.LongModelValue longModelValue20 = new org.jboss.dmr.LongModelValue(1L);
        java.math.BigDecimal bigDecimal21 = longModelValue20.asBigDecimal();
        byte[] byteArray22 = longModelValue20.asBytes();
        boolean boolean23 = stringModelValue17.equals((java.lang.Object) byteArray22);
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory25 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream26 = null;
        org.jboss.dmr.Base64.InputStream inputStream28 = new org.jboss.dmr.Base64.InputStream(inputStream26, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue30 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str31 = longModelValue30.asString();
        byte[] byteArray32 = longModelValue30.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue33 = new org.jboss.dmr.BytesModelValue(byteArray32);
        int int36 = inputStream28.read(byteArray32, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream38 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream28, (-1));
        org.jboss.dmr.stream.ModelReader modelReader39 = modelStreamFactory25.newModelReader((java.io.InputStream) inputStream38);
        java.io.InputStream inputStream40 = null;
        org.jboss.dmr.Base64.InputStream inputStream42 = new org.jboss.dmr.Base64.InputStream(inputStream40, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream43 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream42);
        byte[] byteArray45 = org.jboss.dmr.Base64.decode("true");
        boolean boolean47 = org.jboss.dmr.Base64.encodeToFile(byteArray45, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        int int50 = inputStream42.read(byteArray45, (int) 'l', 0);
        org.jboss.dmr.stream.ModelReader modelReader51 = modelStreamFactory25.newModelReader((java.io.InputStream) inputStream42);
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory53 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream54 = null;
        org.jboss.dmr.Base64.InputStream inputStream56 = new org.jboss.dmr.Base64.InputStream(inputStream54, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream57 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream56);
        org.jboss.dmr.stream.ModelReader modelReader58 = modelStreamFactory53.newModelReader((java.io.InputStream) inputStream57);
        java.io.OutputStream outputStream59 = null;
        org.jboss.dmr.Base64.OutputStream outputStream60 = new org.jboss.dmr.Base64.OutputStream(outputStream59);
        org.jboss.dmr.Base64.OutputStream outputStream61 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream60);
        outputStream60.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter64 = modelStreamFactory53.newModelWriter((java.io.OutputStream) outputStream60);
        outputStream60.write(2);
        org.jboss.dmr.stream.ModelWriter modelWriter67 = modelStreamFactory25.newModelWriter((java.io.OutputStream) outputStream60);
        boolean boolean68 = stringModelValue17.equals((java.lang.Object) modelWriter67);
        org.jboss.dmr.stream.ModelWriter modelWriter70 = modelWriter67.writeBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            modelNode15.write(modelWriter67);
            org.junit.Assert.fail("Expected exception of type org.jboss.dmr.stream.ModelException; message: Expecting EOF");
        } catch (org.jboss.dmr.stream.ModelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanModelValue4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(modelNode7);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(booleanModelValue9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(modelNode15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[69, 120, 112, 114, 101, 115, 115, 105, 111, 110, 32, 34, 116, 114, 117, 101, 34]");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(modelStreamFactory25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(modelReader39);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-74, -69, -98]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(modelReader51);
        org.junit.Assert.assertNotNull(modelStreamFactory53);
        org.junit.Assert.assertNotNull(modelReader58);
        org.junit.Assert.assertNotNull(modelWriter64);
        org.junit.Assert.assertNotNull(modelWriter67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(modelWriter70);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        int int3 = longModelValue1.asInt((int) (byte) 0);
        org.jboss.dmr.LongModelValue longModelValue5 = new org.jboss.dmr.LongModelValue((-1L));
        long long7 = longModelValue5.asLong((long) (byte) -1);
        double double9 = longModelValue5.asDouble((double) 10.0f);
        boolean boolean10 = longModelValue1.equals(longModelValue5);
        double double11 = longModelValue5.asDouble();
        java.lang.String str12 = longModelValue5.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
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
        int int16 = bytesModelValue4.asInt((int) 'I');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        org.jboss.dmr.ObjectModelValue objectModelValue1 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode2 = objectModelValue1.asObject();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue1.getChild("TYPE_MODEL_VALUE");
        org.jboss.dmr.PropertyModelValue propertyModelValue5 = new org.jboss.dmr.PropertyModelValue("(\"\\\"(\\\\\\\"hi!\\\\\\\" => 0.0)\\\"\" => (\"[(\\\"hi!\\\" => 0.0)]\" => PROPERTY))", modelNode4);
        org.jboss.dmr.ModelValue modelValue6 = propertyModelValue5.resolve();
        java.util.List<org.jboss.dmr.Property> propertyList7 = propertyModelValue5.asPropertyList();
        java.lang.String str8 = propertyModelValue5.asString();
        org.junit.Assert.assertNotNull(modelNode2);
        org.junit.Assert.assertNotNull(modelNode4);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertNotNull(propertyList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(\"(\\\"\\\\\\\"(\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\" => 0.0)\\\\\\\"\\\" => (\\\"[(\\\\\\\"hi!\\\\\\\" => 0.0)]\\\" => PROPERTY))\" => undefined)" + "'", str8, "(\"(\\\"\\\\\\\"(\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\" => 0.0)\\\\\\\"\\\" => (\\\"[(\\\\\\\"hi!\\\\\\\" => 0.0)]\\\" => PROPERTY))\" => undefined)");
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (byte) -1);
        org.jboss.dmr.DoubleModelValue doubleModelValue3 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        int int5 = doubleModelValue3.asInt((int) 'l');
        java.math.BigDecimal bigDecimal6 = doubleModelValue3.asBigDecimal();
        boolean boolean7 = doubleModelValue1.equals(doubleModelValue3);
        org.jboss.dmr.ModelNode modelNode9 = new org.jboss.dmr.ModelNode(35L);
        org.jboss.dmr.ModelNode modelNode11 = modelNode9.set((int) '4');
        boolean boolean12 = doubleModelValue3.equals((java.lang.Object) modelNode11);
        org.jboss.dmr.ValueExpression valueExpression13 = doubleModelValue3.asExpression();
        org.jboss.dmr.ValueExpression valueExpression14 = doubleModelValue3.asExpression();
        java.math.BigDecimal bigDecimal15 = valueExpression14.resolveBigDecimal();
        java.lang.String str16 = valueExpression14.resolveString();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = valueExpression14.resolveInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(valueExpression13);
        org.junit.Assert.assertNotNull(valueExpression14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0" + "'", str16, "10.0");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.jboss.dmr.stream.ModelException modelException1 = new org.jboss.dmr.stream.ModelException("rO0ABXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAE=");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        java.lang.String str3 = booleanModelValue1.asString();
        int int4 = booleanModelValue1.asInt();
        long long5 = booleanModelValue1.asLong();
        double double6 = booleanModelValue1.asDouble();
        org.jboss.dmr.ValueExpression valueExpression7 = booleanModelValue1.asExpression();
        int int8 = booleanModelValue1.asInt();
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(valueExpression7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
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
        org.jboss.dmr.ModelType modelType19 = typeModelValue5.asType();
        org.jboss.dmr.ModelType modelType20 = typeModelValue5.asType();
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
        org.junit.Assert.assertTrue("'" + modelType19 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType19.equals(org.jboss.dmr.ModelType.PROPERTY));
        org.junit.Assert.assertTrue("'" + modelType20 + "' != '" + org.jboss.dmr.ModelType.PROPERTY + "'", modelType20.equals(org.jboss.dmr.ModelType.PROPERTY));
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        int int6 = bigIntegerModelValue4.asInt((int) (short) 1);
        int int7 = bigIntegerModelValue4.asInt();
        double double8 = bigIntegerModelValue4.asDouble();
        java.math.BigInteger bigInteger9 = bigIntegerModelValue4.asBigInteger();
        org.jboss.dmr.ValueExpression valueExpression10 = bigIntegerModelValue4.asExpression();
        org.jboss.dmr.LongModelValue longModelValue12 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str13 = longModelValue12.asString();
        byte[] byteArray14 = longModelValue12.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue15 = new org.jboss.dmr.BytesModelValue(byteArray14);
        java.lang.String str16 = bytesModelValue15.asString();
        int int17 = bytesModelValue15.asInt();
        byte[] byteArray18 = bytesModelValue15.asBytes();
        org.jboss.dmr.LongModelValue longModelValue20 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str21 = longModelValue20.asString();
        byte[] byteArray22 = longModelValue20.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue23 = new org.jboss.dmr.BytesModelValue(byteArray22);
        java.lang.String str24 = bytesModelValue23.asString();
        int int25 = bytesModelValue23.asInt();
        int int26 = bytesModelValue23.asInt();
        org.jboss.dmr.LongModelValue longModelValue28 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str29 = longModelValue28.asString();
        byte[] byteArray30 = longModelValue28.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue31 = new org.jboss.dmr.BytesModelValue(byteArray30);
        double double32 = bytesModelValue31.asDouble();
        boolean boolean33 = bytesModelValue23.equals(bytesModelValue31);
        byte[] byteArray34 = bytesModelValue31.asBytes();
        java.math.BigInteger bigInteger35 = bytesModelValue31.asBigInteger();
        boolean boolean36 = bytesModelValue15.equals(bytesModelValue31);
        int int38 = bytesModelValue31.asInt((int) 'J');
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory40 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream41 = null;
        org.jboss.dmr.Base64.InputStream inputStream43 = new org.jboss.dmr.Base64.InputStream(inputStream41, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream44 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream43);
        org.jboss.dmr.stream.ModelReader modelReader45 = modelStreamFactory40.newModelReader((java.io.InputStream) inputStream44);
        java.io.OutputStream outputStream46 = null;
        org.jboss.dmr.Base64.OutputStream outputStream47 = new org.jboss.dmr.Base64.OutputStream(outputStream46);
        org.jboss.dmr.Base64.OutputStream outputStream48 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream47);
        outputStream47.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter51 = modelStreamFactory40.newModelWriter((java.io.OutputStream) outputStream47);
        org.jboss.dmr.stream.ModelWriter modelWriter52 = modelWriter51.writeListStart();
        bytesModelValue31.write(modelWriter52);
        org.jboss.dmr.BooleanModelValue booleanModelValue55 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray56 = booleanModelValue55.asBytes();
        java.lang.String str57 = booleanModelValue55.asString();
        int int58 = booleanModelValue55.asInt();
        long long59 = booleanModelValue55.asLong();
        boolean boolean61 = booleanModelValue55.equals((java.lang.Object) '4');
        java.math.BigInteger bigInteger62 = booleanModelValue55.asBigInteger();
        java.lang.String str63 = booleanModelValue55.asString();
        byte[] byteArray64 = booleanModelValue55.asBytes();
        java.lang.String str66 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) byteArray64, 10);
        org.jboss.dmr.stream.ModelWriter modelWriter67 = modelWriter52.writeBytes(byteArray64);
        bigIntegerModelValue4.write(modelWriter52);
        org.jboss.dmr.IntModelValue intModelValue70 = new org.jboss.dmr.IntModelValue(10);
        boolean boolean72 = intModelValue70.asBoolean(false);
        byte[] byteArray73 = intModelValue70.asBytes();
        org.jboss.dmr.stream.ModelWriter modelWriter74 = modelWriter52.writeBytes(byteArray73);
        org.jboss.dmr.stream.ModelWriter modelWriter75 = modelWriter74.writeObjectStart();
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(valueExpression10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str16, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str24, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.9E-324d + "'", double32 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(modelStreamFactory40);
        org.junit.Assert.assertNotNull(modelReader45);
        org.junit.Assert.assertNotNull(modelWriter51);
        org.junit.Assert.assertNotNull(modelWriter52);
        org.junit.Assert.assertNotNull(booleanModelValue55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "true" + "'", str57, "true");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "true" + "'", str63, "true");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "H4sIAAAAAAAAAFvzloG1tIiBKdppzWfxH2wcIQ+YGBgqChgYGBgZASVtzhAcAAAA" + "'", str66, "H4sIAAAAAAAAAFvzloG1tIiBKdppzWfxH2wcIQ+YGBgqChgYGBgZASVtzhAcAAAA");
        org.junit.Assert.assertNotNull(modelWriter67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(modelWriter74);
        org.junit.Assert.assertNotNull(modelWriter75);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
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
        org.jboss.dmr.ModelNode modelNode16 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode19 = modelNode16.set("hi!", 0.0d);
        java.lang.String str20 = modelNode16.toString();
        org.jboss.dmr.ModelNode modelNode21 = modelNode16.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode26 = modelNode23.set("hi!", 0.0d);
        org.jboss.dmr.Property property27 = new org.jboss.dmr.Property("", modelNode26);
        org.jboss.dmr.ModelNode modelNode28 = modelNode16.set(property27);
        org.jboss.dmr.PropertyModelValue propertyModelValue30 = new org.jboss.dmr.PropertyModelValue("EXPRESSION_VALUE", modelNode28, false);
        java.util.Set<java.lang.String> strSet31 = propertyModelValue30.getKeys();
        java.util.List<org.jboss.dmr.Property> propertyList32 = propertyModelValue30.asPropertyList();
        java.util.Set<java.lang.String> strSet33 = propertyModelValue30.getKeys();
        org.jboss.dmr.ModelNode modelNode35 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode38 = modelNode35.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode40 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode43 = modelNode40.set("hi!", 0.0d);
        org.jboss.dmr.Property property44 = new org.jboss.dmr.Property("", modelNode43);
        boolean boolean46 = modelNode43.equals((java.lang.Object) 100L);
        boolean boolean47 = modelNode35.equals(modelNode43);
        org.jboss.dmr.ModelNode modelNode49 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode52 = modelNode49.set("hi!", 0.0d);
        org.jboss.dmr.Property property53 = new org.jboss.dmr.Property("", modelNode52);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.jboss.dmr.ModelNode modelNode55 = modelNode52.get(strArray54);
        org.jboss.dmr.ModelNode modelNode56 = new org.jboss.dmr.ModelNode();
        java.lang.Integer int57 = modelNode56.asIntOrNull();
        org.jboss.dmr.ModelNode modelNode58 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode61 = modelNode58.setExpression("hi!", "hi!");
        java.lang.String str62 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode58);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList63 = modelNode58.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode64 = modelNode56.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList63);
        org.jboss.dmr.ModelNode modelNode65 = modelNode55.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList63);
        org.jboss.dmr.ModelNode modelNode66 = modelNode43.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList63);
        org.jboss.dmr.ModelNode modelNode68 = modelNode43.add("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AXV4");
        org.jboss.dmr.ModelType modelType69 = modelNode68.getType();
        byte[] byteArray72 = org.jboss.dmr.Base64.decode("true");
        org.jboss.dmr.ModelNode modelNode73 = modelNode68.set("\"(\\\"hi!\\\" => 0.0)\"", byteArray72);
        org.jboss.dmr.PropertyModelValue propertyModelValue74 = new org.jboss.dmr.PropertyModelValue("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", modelNode73);
        boolean boolean75 = propertyModelValue30.equals(propertyModelValue74);
        boolean boolean76 = intModelValue1.equals((java.lang.Object) propertyModelValue74);
        org.jboss.dmr.ModelValue modelValue77 = propertyModelValue74.resolve();
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNodeList6);
        org.junit.Assert.assertNotNull(modelValue9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(propertyList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(\"hi!\" => 0.0)" + "'", str20, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelNode28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(propertyList32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(modelNode38);
        org.junit.Assert.assertNotNull(modelNode43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(modelNode52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(modelNode55);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNotNull(modelNode61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str62, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList63);
        org.junit.Assert.assertNotNull(modelNode64);
        org.junit.Assert.assertNotNull(modelNode65);
        org.junit.Assert.assertNotNull(modelNode66);
        org.junit.Assert.assertNotNull(modelNode68);
        org.junit.Assert.assertTrue("'" + modelType69 + "' != '" + org.jboss.dmr.ModelType.LIST + "'", modelType69.equals(org.jboss.dmr.ModelType.LIST));
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-74, -69, -98]");
        org.junit.Assert.assertNotNull(modelNode73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(modelValue77);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.jboss.dmr.BooleanModelValue booleanModelValue1 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        byte[] byteArray2 = booleanModelValue1.asBytes();
        org.jboss.dmr.ValueExpression valueExpression3 = booleanModelValue1.asExpression();
        java.lang.String str4 = booleanModelValue1.asString();
        int int5 = booleanModelValue1.asInt();
        double double6 = booleanModelValue1.asDouble();
        double double8 = booleanModelValue1.asDouble((double) 52L);
        org.junit.Assert.assertNotNull(booleanModelValue1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(valueExpression3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        java.lang.String str2 = doubleModelValue1.asString();
        long long4 = doubleModelValue1.asLong((long) (short) -1);
        long long6 = doubleModelValue1.asLong((-1L));
        double double7 = doubleModelValue1.asDouble();
        org.jboss.dmr.DoubleModelValue doubleModelValue9 = new org.jboss.dmr.DoubleModelValue((double) (byte) -1);
        org.jboss.dmr.DoubleModelValue doubleModelValue11 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        int int13 = doubleModelValue11.asInt((int) 'l');
        java.math.BigDecimal bigDecimal14 = doubleModelValue11.asBigDecimal();
        boolean boolean15 = doubleModelValue9.equals(doubleModelValue11);
        org.jboss.dmr.ModelNode modelNode17 = new org.jboss.dmr.ModelNode(35L);
        org.jboss.dmr.ModelNode modelNode19 = modelNode17.set((int) '4');
        boolean boolean20 = doubleModelValue11.equals((java.lang.Object) modelNode19);
        org.jboss.dmr.ValueExpression valueExpression21 = doubleModelValue11.asExpression();
        org.jboss.dmr.ValueExpression valueExpression22 = doubleModelValue11.asExpression();
        double double23 = doubleModelValue11.asDouble();
        org.jboss.dmr.ValueExpression valueExpression24 = doubleModelValue11.asExpression();
        org.jboss.dmr.ObjectModelValue objectModelValue25 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode26 = objectModelValue25.asObject();
        org.jboss.dmr.ModelValue modelValue27 = objectModelValue25.protect();
        java.util.List<org.jboss.dmr.Property> propertyList28 = objectModelValue25.asPropertyList();
        org.jboss.dmr.LongModelValue longModelValue30 = new org.jboss.dmr.LongModelValue(97L);
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory32 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream33 = null;
        org.jboss.dmr.Base64.InputStream inputStream35 = new org.jboss.dmr.Base64.InputStream(inputStream33, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream36 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream35);
        org.jboss.dmr.stream.ModelReader modelReader37 = modelStreamFactory32.newModelReader((java.io.InputStream) inputStream36);
        java.io.OutputStream outputStream38 = null;
        org.jboss.dmr.Base64.OutputStream outputStream39 = new org.jboss.dmr.Base64.OutputStream(outputStream38);
        org.jboss.dmr.Base64.OutputStream outputStream40 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream39);
        outputStream39.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter43 = modelStreamFactory32.newModelWriter((java.io.OutputStream) outputStream39);
        org.jboss.dmr.stream.ModelWriter modelWriter44 = modelWriter43.writeListStart();
        org.jboss.dmr.IntModelValue intModelValue46 = new org.jboss.dmr.IntModelValue(10);
        byte[] byteArray47 = intModelValue46.asBytes();
        int int49 = intModelValue46.asInt(0);
        java.math.BigInteger bigInteger50 = intModelValue46.asBigInteger();
        org.jboss.dmr.stream.ModelWriter modelWriter51 = modelWriter44.writeBigInteger(bigInteger50);
        org.jboss.dmr.stream.ModelWriter modelWriter52 = modelWriter44.writeListStart();
        longModelValue30.write(modelWriter52);
        objectModelValue25.write(modelWriter52);
        org.jboss.dmr.stream.ModelWriter modelWriter56 = modelWriter52.writeLong((long) (byte) 100);
        doubleModelValue11.write(modelWriter52);
        boolean boolean58 = doubleModelValue1.equals(doubleModelValue11);
        java.math.BigInteger bigInteger59 = doubleModelValue11.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue60 = new org.jboss.dmr.BigIntegerModelValue(bigInteger59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(valueExpression21);
        org.junit.Assert.assertNotNull(valueExpression22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(valueExpression24);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelValue27);
        org.junit.Assert.assertNotNull(propertyList28);
        org.junit.Assert.assertNotNull(modelStreamFactory32);
        org.junit.Assert.assertNotNull(modelReader37);
        org.junit.Assert.assertNotNull(modelWriter43);
        org.junit.Assert.assertNotNull(modelWriter44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(modelWriter51);
        org.junit.Assert.assertNotNull(modelWriter52);
        org.junit.Assert.assertNotNull(modelWriter56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(bigInteger59);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("org.jboss.dmr.stream.ModelException: org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        boolean boolean5 = objectModelValue0.asBoolean();
        java.util.Set<java.lang.String> strSet6 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelValue modelValue7 = objectModelValue0.copy();
        java.util.Set<java.lang.String> strSet8 = objectModelValue0.getKeys();
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(modelValue7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        int int6 = bigIntegerModelValue4.asInt((int) (short) 1);
        org.jboss.dmr.ModelNode modelNode7 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode10 = modelNode7.set("hi!", 0.0d);
        java.lang.String str11 = modelNode7.toString();
        org.jboss.dmr.ModelNode modelNode12 = modelNode7.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode14 = modelNode7.set(100);
        org.jboss.dmr.ModelNode modelNode15 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode18 = modelNode15.set("hi!", 0.0d);
        java.lang.String str19 = modelNode15.toString();
        org.jboss.dmr.ModelNode modelNode20 = modelNode15.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode22 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode25 = modelNode22.set("hi!", 0.0d);
        org.jboss.dmr.Property property26 = new org.jboss.dmr.Property("", modelNode25);
        org.jboss.dmr.ModelNode modelNode27 = modelNode15.set(property26);
        java.lang.String str28 = modelNode27.asString();
        org.jboss.dmr.ModelNode modelNode29 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode32 = modelNode29.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList33 = modelNode32.asList();
        org.jboss.dmr.ListModelValue listModelValue34 = new org.jboss.dmr.ListModelValue(modelNodeList33);
        org.jboss.dmr.ModelNode modelNode35 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue34);
        org.jboss.dmr.ModelValue modelValue36 = listModelValue34.resolve();
        int int38 = listModelValue34.asInt((int) (byte) 100);
        boolean boolean39 = listModelValue34.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList40 = listModelValue34.asList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList41 = modelNode27.asList(modelNodeList40);
        org.jboss.dmr.ModelNode modelNode42 = modelNode14.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList40);
        boolean boolean43 = bigIntegerModelValue4.equals((java.lang.Object) modelNode14);
        org.jboss.dmr.ModelType modelType44 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode45 = new org.jboss.dmr.ModelNode(modelType44);
        org.jboss.dmr.ModelNode modelNode47 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode50 = modelNode47.set("hi!", 0.0d);
        org.jboss.dmr.Property property51 = new org.jboss.dmr.Property("", modelNode50);
        org.jboss.dmr.ModelNode modelNode52 = modelNode45.set(property51);
        org.jboss.dmr.PropertyModelValue propertyModelValue53 = new org.jboss.dmr.PropertyModelValue(property51);
        org.jboss.dmr.PropertyModelValue propertyModelValue54 = new org.jboss.dmr.PropertyModelValue(property51);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList55 = propertyModelValue54.asList();
        boolean boolean56 = bigIntegerModelValue4.equals((java.lang.Object) propertyModelValue54);
        double double58 = bigIntegerModelValue4.asDouble((double) 10);
        java.math.BigInteger bigInteger59 = bigIntegerModelValue4.asBigInteger();
        long long60 = bigIntegerModelValue4.asLong();
        java.lang.String str61 = bigIntegerModelValue4.asString();
        org.jboss.dmr.LongModelValue longModelValue63 = new org.jboss.dmr.LongModelValue(1L);
        int int65 = longModelValue63.asInt((int) (byte) 0);
        java.math.BigInteger bigInteger66 = longModelValue63.asBigInteger();
        org.jboss.dmr.LongModelValue longModelValue68 = new org.jboss.dmr.LongModelValue((-1L));
        long long70 = longModelValue68.asLong((long) (byte) -1);
        int int72 = longModelValue68.asInt(0);
        boolean boolean73 = longModelValue63.equals((java.lang.Object) longModelValue68);
        byte[] byteArray74 = longModelValue63.asBytes();
        boolean boolean75 = bigIntegerModelValue4.equals((java.lang.Object) longModelValue63);
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(\"hi!\" => 0.0)" + "'", str11, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode12);
        org.junit.Assert.assertNotNull(modelNode14);
        org.junit.Assert.assertNotNull(modelNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(\"hi!\" => 0.0)" + "'", str19, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNotNull(modelNode25);
        org.junit.Assert.assertNotNull(modelNode27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str28, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertNotNull(modelNode32);
        org.junit.Assert.assertNotNull(modelNodeList33);
        org.junit.Assert.assertNotNull(modelValue36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(modelNodeList40);
        org.junit.Assert.assertNotNull(modelNodeList41);
        org.junit.Assert.assertNotNull(modelNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + modelType44 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType44.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode50);
        org.junit.Assert.assertNotNull(modelNode52);
        org.junit.Assert.assertNotNull(modelNodeList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1" + "'", str61, "1");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("hi!");
        org.jboss.dmr.BooleanModelValue booleanModelValue6 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger7 = booleanModelValue6.asBigInteger();
        byte[] byteArray8 = booleanModelValue6.asBytes();
        int int10 = booleanModelValue6.asInt((int) (short) 1);
        boolean boolean11 = objectModelValue0.equals((java.lang.Object) int10);
        org.jboss.dmr.ModelNode modelNode13 = objectModelValue0.getChild("10.0");
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertNotNull(booleanModelValue6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(modelNode13);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream5 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4);
        org.jboss.dmr.stream.ModelReader modelReader6 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream5);
        java.io.OutputStream outputStream7 = null;
        org.jboss.dmr.Base64.OutputStream outputStream8 = new org.jboss.dmr.Base64.OutputStream(outputStream7);
        org.jboss.dmr.Base64.OutputStream outputStream9 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream8);
        outputStream8.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter12 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream8);
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory14 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream15 = null;
        org.jboss.dmr.Base64.InputStream inputStream17 = new org.jboss.dmr.Base64.InputStream(inputStream15, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue19 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str20 = longModelValue19.asString();
        byte[] byteArray21 = longModelValue19.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue22 = new org.jboss.dmr.BytesModelValue(byteArray21);
        int int25 = inputStream17.read(byteArray21, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream27 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream17, (-1));
        org.jboss.dmr.stream.ModelReader modelReader28 = modelStreamFactory14.newModelReader((java.io.InputStream) inputStream27);
        java.io.InputStream inputStream29 = null;
        org.jboss.dmr.Base64.InputStream inputStream31 = new org.jboss.dmr.Base64.InputStream(inputStream29, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream32 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream31);
        byte[] byteArray34 = org.jboss.dmr.Base64.decode("true");
        boolean boolean36 = org.jboss.dmr.Base64.encodeToFile(byteArray34, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3R3AANW9yZy5qYm9z\ncy5kbXIuc3RyZWFtLk1vZGVsRXhjZXB0aW9uOiBbKCJoaSEiID0+IDAuMCldcAADaGkhRAAAAAAA\nAAAAeA==");
        int int39 = inputStream31.read(byteArray34, (int) 'l', 0);
        org.jboss.dmr.stream.ModelReader modelReader40 = modelStreamFactory14.newModelReader((java.io.InputStream) inputStream31);
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory42 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream43 = null;
        org.jboss.dmr.Base64.InputStream inputStream45 = new org.jboss.dmr.Base64.InputStream(inputStream43, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream46 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream45);
        org.jboss.dmr.stream.ModelReader modelReader47 = modelStreamFactory42.newModelReader((java.io.InputStream) inputStream46);
        java.io.OutputStream outputStream48 = null;
        org.jboss.dmr.Base64.OutputStream outputStream49 = new org.jboss.dmr.Base64.OutputStream(outputStream48);
        org.jboss.dmr.Base64.OutputStream outputStream50 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream49);
        outputStream49.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter53 = modelStreamFactory42.newModelWriter((java.io.OutputStream) outputStream49);
        outputStream49.write(2);
        org.jboss.dmr.stream.ModelWriter modelWriter56 = modelStreamFactory14.newModelWriter((java.io.OutputStream) outputStream49);
        org.jboss.dmr.stream.ModelWriter modelWriter57 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream49);
        java.io.InputStream inputStream58 = null;
        org.jboss.dmr.Base64.InputStream inputStream60 = new org.jboss.dmr.Base64.InputStream(inputStream58, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream62 = new org.jboss.dmr.Base64.InputStream(inputStream58, (int) (byte) 100);
        org.jboss.dmr.StringModelValue stringModelValue64 = new org.jboss.dmr.StringModelValue("Expression \"true\"");
        org.jboss.dmr.StringModelValue stringModelValue66 = new org.jboss.dmr.StringModelValue("(\"\" => (\"hi!\" => 0.0))");
        boolean boolean67 = stringModelValue64.equals(stringModelValue66);
        byte[] byteArray68 = stringModelValue66.asBytes();
        boolean boolean70 = org.jboss.dmr.Base64.encodeToFile(byteArray68, "org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]");
        int int73 = inputStream62.read(byteArray68, 10, (int) (byte) -1);
        org.jboss.dmr.stream.ModelReader modelReader74 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream62);
        // The following exception was thrown during execution in test generation
        try {
            inputStream62.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertNotNull(modelReader6);
        org.junit.Assert.assertNotNull(modelWriter12);
        org.junit.Assert.assertNotNull(modelStreamFactory14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(modelReader28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-74, -69, -98]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(modelReader40);
        org.junit.Assert.assertNotNull(modelStreamFactory42);
        org.junit.Assert.assertNotNull(modelReader47);
        org.junit.Assert.assertNotNull(modelWriter53);
        org.junit.Assert.assertNotNull(modelWriter56);
        org.junit.Assert.assertNotNull(modelWriter57);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[40, 34, 34, 32, 61, 62, 32, 40, 34, 104, 105, 33, 34, 32, 61, 62, 32, 48, 46, 48, 41, 41]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(modelReader74);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode("\"(\\\"\\\" => (\\\"hi!\\\" => 0.0))\"");
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.setExpression("hi!", "hi!");
        java.lang.String str7 = org.jboss.dmr.Base64.encodeObject((java.io.Serializable) modelNode3);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList8 = modelNode3.asListOrEmpty();
        org.jboss.dmr.ModelNode modelNode10 = modelNode3.set((double) 0);
        org.jboss.dmr.ModelNode modelNode11 = modelNode3.clear();
        org.jboss.dmr.IntModelValue intModelValue14 = new org.jboss.dmr.IntModelValue((int) ' ');
        long long16 = intModelValue14.asLong((long) 'b');
        java.lang.String str17 = intModelValue14.asString();
        java.math.BigInteger bigInteger18 = intModelValue14.asBigInteger();
        org.jboss.dmr.ModelNode modelNode19 = modelNode11.add("H4sIAAAAAAAAAAMAAAAAAAAAAAA=", bigInteger18);
        org.jboss.dmr.ModelNode modelNode20 = modelNode1.set("org.jboss.dmr.stream.ModelException: [(\"hi!\" => 0.0)]", bigInteger18);
        org.jboss.dmr.ModelNode modelNode21 = modelNode20.asObject();
        org.jboss.dmr.ModelNode modelNode22 = modelNode21.asObject();
        org.jboss.dmr.ModelNode modelNode25 = modelNode22.set("", "(\"hi!\" => expression \"(\\\"hi!\\\" => 0.0)\")");
        modelNode22.protect();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int27 = modelNode22.asIntOrNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=" + "'", str7, "rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3DHAAA2hpIWUAA2hp\nIXg=");
        org.junit.Assert.assertNotNull(modelNodeList8);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32" + "'", str17, "32");
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(modelNode19);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNotNull(modelNode21);
        org.junit.Assert.assertNotNull(modelNode22);
        org.junit.Assert.assertNotNull(modelNode25);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        org.jboss.dmr.BooleanModelValue booleanModelValue0 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double1 = booleanModelValue0.asDouble();
        org.jboss.dmr.ModelValue modelValue2 = booleanModelValue0.copy();
        java.math.BigInteger bigInteger3 = booleanModelValue0.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue4 = new org.jboss.dmr.BigIntegerModelValue(bigInteger3);
        double double6 = bigIntegerModelValue4.asDouble((double) 'b');
        java.lang.String str7 = bigIntegerModelValue4.asString();
        org.jboss.dmr.ValueExpression valueExpression8 = bigIntegerModelValue4.asExpression();
        boolean boolean10 = bigIntegerModelValue4.asBoolean(true);
        org.jboss.dmr.BooleanModelValue booleanModelValue11 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double12 = booleanModelValue11.asDouble();
        org.jboss.dmr.ModelValue modelValue13 = booleanModelValue11.copy();
        java.math.BigInteger bigInteger14 = booleanModelValue11.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue15 = new org.jboss.dmr.BigIntegerModelValue(bigInteger14);
        java.lang.String str16 = bigIntegerModelValue15.asString();
        long long18 = bigIntegerModelValue15.asLong(32L);
        double double19 = bigIntegerModelValue15.asDouble();
        org.jboss.dmr.BooleanModelValue booleanModelValue20 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double21 = booleanModelValue20.asDouble();
        org.jboss.dmr.ModelValue modelValue22 = booleanModelValue20.copy();
        java.math.BigInteger bigInteger23 = booleanModelValue20.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue24 = new org.jboss.dmr.BigIntegerModelValue(bigInteger23);
        double double26 = bigIntegerModelValue24.asDouble((double) 'b');
        boolean boolean27 = bigIntegerModelValue15.equals(bigIntegerModelValue24);
        org.jboss.dmr.BooleanModelValue booleanModelValue28 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double29 = booleanModelValue28.asDouble();
        org.jboss.dmr.ModelValue modelValue30 = booleanModelValue28.copy();
        java.math.BigInteger bigInteger31 = booleanModelValue28.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue32 = new org.jboss.dmr.BigIntegerModelValue(bigInteger31);
        long long34 = bigIntegerModelValue32.asLong((long) 'b');
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue35 = null;
        boolean boolean36 = bigIntegerModelValue32.equals(bigIntegerModelValue35);
        boolean boolean37 = bigIntegerModelValue15.equals(bigIntegerModelValue32);
        java.math.BigDecimal bigDecimal38 = bigIntegerModelValue15.asBigDecimal();
        boolean boolean39 = bigIntegerModelValue4.equals(bigIntegerModelValue15);
        int int41 = bigIntegerModelValue15.asInt((int) (byte) -1);
        int int43 = bigIntegerModelValue15.asInt((int) 'D');
        org.junit.Assert.assertNotNull(booleanModelValue0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(valueExpression8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanModelValue11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(booleanModelValue20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanModelValue28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
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
        org.jboss.dmr.ModelNode modelNode25 = modelNode7.set("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3AloAeA==", (double) 0.0f);
        boolean boolean27 = modelNode7.hasDefined((int) 'b');
        org.jboss.dmr.ModelNode modelNode30 = modelNode7.set("\"\\\"(\\\\\\\"hi!\\\\\\\" => 0.0)\\\"\"", "");
        org.jboss.dmr.ExpressionValue expressionValue33 = new org.jboss.dmr.ExpressionValue("1");
        org.jboss.dmr.ValueExpression valueExpression34 = expressionValue33.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver35 = new org.jboss.dmr.ValueExpressionResolver();
        java.lang.String str36 = valueExpression34.resolveString(valueExpressionResolver35);
        java.lang.String str38 = valueExpressionResolver35.resolvePart("{ \"35\" : 0.0 }");
        java.lang.String str40 = valueExpressionResolver35.resolvePart("{\n    \"EXPRESSION_VALUE\" : 35\n}");
        org.jboss.dmr.BooleanModelValue booleanModelValue41 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double42 = booleanModelValue41.asDouble();
        org.jboss.dmr.ModelValue modelValue43 = booleanModelValue41.copy();
        java.math.BigInteger bigInteger44 = booleanModelValue41.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue45 = new org.jboss.dmr.BigIntegerModelValue(bigInteger44);
        java.lang.String str46 = bigIntegerModelValue45.asString();
        org.jboss.dmr.BooleanModelValue booleanModelValue47 = org.jboss.dmr.BooleanModelValue.TRUE;
        double double48 = booleanModelValue47.asDouble();
        org.jboss.dmr.ModelValue modelValue49 = booleanModelValue47.copy();
        java.math.BigInteger bigInteger50 = booleanModelValue47.asBigInteger();
        org.jboss.dmr.BigIntegerModelValue bigIntegerModelValue51 = new org.jboss.dmr.BigIntegerModelValue(bigInteger50);
        int int53 = bigIntegerModelValue51.asInt((int) (short) 1);
        org.jboss.dmr.ModelNode modelNode54 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode57 = modelNode54.set("hi!", 0.0d);
        java.lang.String str58 = modelNode54.toString();
        org.jboss.dmr.ModelNode modelNode59 = modelNode54.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode61 = modelNode54.set(100);
        org.jboss.dmr.ModelNode modelNode62 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode65 = modelNode62.set("hi!", 0.0d);
        java.lang.String str66 = modelNode62.toString();
        org.jboss.dmr.ModelNode modelNode67 = modelNode62.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode69 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode72 = modelNode69.set("hi!", 0.0d);
        org.jboss.dmr.Property property73 = new org.jboss.dmr.Property("", modelNode72);
        org.jboss.dmr.ModelNode modelNode74 = modelNode62.set(property73);
        java.lang.String str75 = modelNode74.asString();
        org.jboss.dmr.ModelNode modelNode76 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode79 = modelNode76.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList80 = modelNode79.asList();
        org.jboss.dmr.ListModelValue listModelValue81 = new org.jboss.dmr.ListModelValue(modelNodeList80);
        org.jboss.dmr.ModelNode modelNode82 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue81);
        org.jboss.dmr.ModelValue modelValue83 = listModelValue81.resolve();
        int int85 = listModelValue81.asInt((int) (byte) 100);
        boolean boolean86 = listModelValue81.asBoolean();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList87 = listModelValue81.asList();
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList88 = modelNode74.asList(modelNodeList87);
        org.jboss.dmr.ModelNode modelNode89 = modelNode61.set((java.util.Collection<org.jboss.dmr.ModelNode>) modelNodeList87);
        boolean boolean90 = bigIntegerModelValue51.equals((java.lang.Object) modelNode61);
        boolean boolean91 = bigIntegerModelValue45.equals(bigIntegerModelValue51);
        boolean boolean93 = bigIntegerModelValue51.equals((java.lang.Object) "{}");
        org.jboss.dmr.ValueExpression valueExpression94 = bigIntegerModelValue51.asExpression();
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver95 = new org.jboss.dmr.ValueExpressionResolver();
        java.math.BigDecimal bigDecimal96 = valueExpression94.resolveBigDecimal(valueExpressionResolver95);
        java.lang.String str97 = valueExpressionResolver35.resolve(valueExpression94);
        org.jboss.dmr.ModelNode modelNode98 = modelNode7.set("rO0ABXNyAB1vcmcuamJvc3MuZG1yLlZhbHVlRXhwcmVzc2lvbvwmn+JujpBcDAAAeHB3BgAEMTAu\nMHg=", valueExpression94);
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
        org.junit.Assert.assertNotNull(modelNode25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(modelNode30);
        org.junit.Assert.assertNotNull(valueExpression34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(booleanModelValue41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1" + "'", str46, "1");
        org.junit.Assert.assertNotNull(booleanModelValue47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(modelValue49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(modelNode57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(\"hi!\" => 0.0)" + "'", str58, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode59);
        org.junit.Assert.assertNotNull(modelNode61);
        org.junit.Assert.assertNotNull(modelNode65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(\"hi!\" => 0.0)" + "'", str66, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode67);
        org.junit.Assert.assertNotNull(modelNode72);
        org.junit.Assert.assertNotNull(modelNode74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str75, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertNotNull(modelNode79);
        org.junit.Assert.assertNotNull(modelNodeList80);
        org.junit.Assert.assertNotNull(modelValue83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(modelNodeList87);
        org.junit.Assert.assertNotNull(modelNodeList88);
        org.junit.Assert.assertNotNull(modelNode89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(valueExpression94);
        org.junit.Assert.assertNotNull(bigDecimal96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "1" + "'", str97, "1");
        org.junit.Assert.assertNotNull(modelNode98);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory3 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream4 = null;
        org.jboss.dmr.Base64.InputStream inputStream6 = new org.jboss.dmr.Base64.InputStream(inputStream4, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue8 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str9 = longModelValue8.asString();
        byte[] byteArray10 = longModelValue8.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue11 = new org.jboss.dmr.BytesModelValue(byteArray10);
        int int14 = inputStream6.read(byteArray10, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream16 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream6, (-1));
        org.jboss.dmr.stream.ModelReader modelReader17 = modelStreamFactory3.newModelReader((java.io.InputStream) inputStream16);
        java.io.InputStream inputStream18 = null;
        org.jboss.dmr.Base64.InputStream inputStream20 = new org.jboss.dmr.Base64.InputStream(inputStream18, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream21 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream20);
        org.jboss.dmr.Base64.InputStream inputStream22 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream20);
        org.jboss.dmr.stream.ModelReader modelReader23 = modelStreamFactory3.newModelReader((java.io.InputStream) inputStream20);
        java.io.InputStream inputStream24 = null;
        org.jboss.dmr.Base64.InputStream inputStream26 = new org.jboss.dmr.Base64.InputStream(inputStream24, (int) ' ');
        org.jboss.dmr.LongModelValue longModelValue28 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str29 = longModelValue28.asString();
        byte[] byteArray30 = longModelValue28.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue31 = new org.jboss.dmr.BytesModelValue(byteArray30);
        int int34 = inputStream26.read(byteArray30, (int) (short) 1, (int) (byte) -1);
        org.jboss.dmr.Base64.InputStream inputStream36 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream26, (-1));
        org.jboss.dmr.Base64.InputStream inputStream38 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream26, (int) 'p');
        org.jboss.dmr.Base64.InputStream inputStream39 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream38);
        org.jboss.dmr.stream.ModelReader modelReader40 = modelStreamFactory3.newModelReader((java.io.InputStream) inputStream38);
        org.jboss.dmr.stream.ModelReader modelReader41 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream38);
        java.io.OutputStream outputStream42 = null;
        org.jboss.dmr.Base64.OutputStream outputStream43 = new org.jboss.dmr.Base64.OutputStream(outputStream42);
        outputStream43.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream45 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream43);
        org.jboss.dmr.Base64.OutputStream outputStream46 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream45);
        outputStream46.flushBase64();
        outputStream46.flushBase64();
        outputStream46.flushBase64();
        org.jboss.dmr.stream.ModelWriter modelWriter50 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream46);
        outputStream46.resumeEncoding();
        outputStream46.write((int) (byte) 0);
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertNotNull(modelStreamFactory3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(modelReader17);
        org.junit.Assert.assertNotNull(modelReader23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(modelReader40);
        org.junit.Assert.assertNotNull(modelReader41);
        org.junit.Assert.assertNotNull(modelWriter50);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream5 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4);
        org.jboss.dmr.stream.ModelReader modelReader6 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream5);
        java.io.OutputStream outputStream7 = null;
        org.jboss.dmr.Base64.OutputStream outputStream8 = new org.jboss.dmr.Base64.OutputStream(outputStream7);
        org.jboss.dmr.Base64.OutputStream outputStream9 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream8);
        outputStream8.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter12 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream8);
        java.io.OutputStream outputStream13 = null;
        org.jboss.dmr.Base64.OutputStream outputStream14 = new org.jboss.dmr.Base64.OutputStream(outputStream13);
        outputStream14.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream16 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream14);
        org.jboss.dmr.Base64.OutputStream outputStream17 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream16);
        org.jboss.dmr.BooleanModelValue booleanModelValue19 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger20 = booleanModelValue19.asBigInteger();
        byte[] byteArray21 = booleanModelValue19.asBytes();
        boolean boolean23 = org.jboss.dmr.Base64.encodeToFile(byteArray21, "1L");
        boolean boolean25 = org.jboss.dmr.Base64.encodeToFile(byteArray21, "[(\"hi!\" => 0.0)]");
        outputStream17.write(byteArray21);
        outputStream17.write((int) (short) 0);
        outputStream17.resumeEncoding();
        org.jboss.dmr.stream.ModelWriter modelWriter30 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream17);
        java.io.InputStream inputStream31 = null;
        org.jboss.dmr.Base64.InputStream inputStream33 = new org.jboss.dmr.Base64.InputStream(inputStream31, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream34 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream33);
        org.jboss.dmr.Base64.InputStream inputStream36 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream34, 0);
        org.jboss.dmr.stream.ModelReader modelReader37 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream34);
        boolean boolean38 = modelReader37.isObjectStart();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger39 = modelReader37.getBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current event isn't big integer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertNotNull(modelReader6);
        org.junit.Assert.assertNotNull(modelWriter12);
        org.junit.Assert.assertNotNull(booleanModelValue19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(modelWriter30);
        org.junit.Assert.assertNotNull(modelReader37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
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
        org.jboss.dmr.ModelValue modelValue23 = listModelValue13.protect();
        boolean boolean25 = listModelValue13.has((int) (short) -1);
        int int27 = listModelValue13.asInt((int) (short) 1);
        int int29 = listModelValue13.asInt((int) (byte) 10);
        org.jboss.dmr.ModelNode modelNode30 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode33 = modelNode30.set("hi!", 0.0d);
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList34 = modelNode33.asList();
        org.jboss.dmr.ListModelValue listModelValue35 = new org.jboss.dmr.ListModelValue(modelNodeList34);
        org.jboss.dmr.ModelNode modelNode36 = new org.jboss.dmr.ModelNode((org.jboss.dmr.ModelValue) listModelValue35);
        org.jboss.dmr.ModelValue modelValue37 = listModelValue35.resolve();
        int int39 = listModelValue35.asInt((int) (byte) 100);
        boolean boolean40 = listModelValue35.asBoolean();
        org.jboss.dmr.ModelNode[] modelNodeArray41 = org.jboss.dmr.ListModelValue.NO_NODES;
        boolean boolean42 = listModelValue35.equals((java.lang.Object) modelNodeArray41);
        long long43 = listModelValue35.asLong();
        boolean boolean44 = listModelValue13.equals(listModelValue35);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.ModelNode modelNode45 = listModelValue35.addChild();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(modelValue23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(modelNode33);
        org.junit.Assert.assertNotNull(modelNodeList34);
        org.junit.Assert.assertNotNull(modelValue37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(modelNodeArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        org.jboss.dmr.ModelNode modelNode0 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode3 = modelNode0.setExpression("hi!", "hi!");
        org.jboss.dmr.ModelNode modelNode5 = modelNode3.set("PROPERTY_VALUE");
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.resolve();
        org.jboss.dmr.ModelNode modelNode8 = org.jboss.dmr.ModelNode.fromString("\"rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3GXAAEGV4cHJlc3Np\\nb24gImhpISJiAAAAAQF4\"");
        org.jboss.dmr.ModelNode modelNode10 = modelNode8.setExpression("AAAAIA==");
        modelNode6.setNoCopy(modelNode10);
        org.jboss.dmr.ModelNode modelNode12 = modelNode10.clone();
        org.junit.Assert.assertNotNull(modelNode3);
        org.junit.Assert.assertNotNull(modelNode5);
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelNode10);
        org.junit.Assert.assertNotNull(modelNode12);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
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
        boolean boolean16 = modelReader15.isString();
        boolean boolean17 = modelReader15.isObjectEnd();
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
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        org.jboss.dmr.ValueExpressionResolver valueExpressionResolver0 = org.jboss.dmr.ValueExpressionResolver.DEFAULT_RESOLVER;
        org.jboss.dmr.ValueExpression valueExpression2 = new org.jboss.dmr.ValueExpression("(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))");
        java.lang.String str3 = valueExpressionResolver0.resolve(valueExpression2);
        java.io.ObjectInput objectInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueExpression2.readExternal(objectInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueExpressionResolver0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))" + "'", str3, "(\"org.jboss.dmr.stream.ModelException: [(\\\"hi!\\\" => 0.0)]\" => (\"hi!\" => 0.0))");
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        org.jboss.dmr.LongModelValue longModelValue1 = new org.jboss.dmr.LongModelValue(1L);
        long long3 = longModelValue1.asLong((long) (short) 0);
        java.lang.String str4 = longModelValue1.asString();
        byte[] byteArray5 = longModelValue1.asBytes();
        java.math.BigInteger bigInteger6 = longModelValue1.asBigInteger();
        boolean boolean8 = longModelValue1.has("rO0ABXNyABdvcmcuamJvc3MuZG1yLk1vZGVsTm9kZRwtoUSdo44/DAAAeHB3LWwAAAACcAAAcAAD\naGkhRAAAAAAAAAAAcAAOKCJoaSEiID0+IDAuMClkAAIzMng=");
        java.math.BigDecimal bigDecimal9 = longModelValue1.asBigDecimal();
        byte[] byteArray10 = longModelValue1.asBytes();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory1 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream2 = null;
        org.jboss.dmr.Base64.InputStream inputStream4 = new org.jboss.dmr.Base64.InputStream(inputStream2, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream5 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream4);
        org.jboss.dmr.stream.ModelReader modelReader6 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream5);
        java.io.OutputStream outputStream7 = null;
        org.jboss.dmr.Base64.OutputStream outputStream8 = new org.jboss.dmr.Base64.OutputStream(outputStream7);
        org.jboss.dmr.Base64.OutputStream outputStream9 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream8);
        outputStream8.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter12 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream8);
        java.io.OutputStream outputStream13 = null;
        org.jboss.dmr.Base64.OutputStream outputStream14 = new org.jboss.dmr.Base64.OutputStream(outputStream13);
        outputStream14.resumeEncoding();
        org.jboss.dmr.Base64.OutputStream outputStream16 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream14);
        org.jboss.dmr.Base64.OutputStream outputStream17 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream16);
        org.jboss.dmr.BooleanModelValue booleanModelValue19 = org.jboss.dmr.BooleanModelValue.valueOf(true);
        java.math.BigInteger bigInteger20 = booleanModelValue19.asBigInteger();
        byte[] byteArray21 = booleanModelValue19.asBytes();
        boolean boolean23 = org.jboss.dmr.Base64.encodeToFile(byteArray21, "1L");
        boolean boolean25 = org.jboss.dmr.Base64.encodeToFile(byteArray21, "[(\"hi!\" => 0.0)]");
        outputStream17.write(byteArray21);
        outputStream17.write((int) (short) 0);
        outputStream17.resumeEncoding();
        org.jboss.dmr.stream.ModelWriter modelWriter30 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream17);
        java.io.InputStream inputStream31 = null;
        org.jboss.dmr.Base64.InputStream inputStream33 = new org.jboss.dmr.Base64.InputStream(inputStream31, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream34 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream33);
        org.jboss.dmr.Base64.InputStream inputStream36 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream34, 0);
        org.jboss.dmr.stream.ModelReader modelReader37 = modelStreamFactory1.newModelReader((java.io.InputStream) inputStream34);
        java.io.OutputStream outputStream38 = null;
        org.jboss.dmr.Base64.OutputStream outputStream39 = new org.jboss.dmr.Base64.OutputStream(outputStream38);
        org.jboss.dmr.Base64.OutputStream outputStream40 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream39);
        org.jboss.dmr.Base64.OutputStream outputStream41 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream40);
        outputStream41.suspendEncoding();
        outputStream41.resumeEncoding();
        outputStream41.flushBase64();
        org.jboss.dmr.stream.ModelWriter modelWriter45 = modelStreamFactory1.newModelWriter((java.io.OutputStream) outputStream41);
        java.io.Reader reader46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.dmr.stream.ModelReader modelReader47 = modelStreamFactory1.newModelReader(reader46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Parameter cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelStreamFactory1);
        org.junit.Assert.assertNotNull(modelReader6);
        org.junit.Assert.assertNotNull(modelWriter12);
        org.junit.Assert.assertNotNull(booleanModelValue19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(modelWriter30);
        org.junit.Assert.assertNotNull(modelReader37);
        org.junit.Assert.assertNotNull(modelWriter45);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        org.jboss.dmr.DoubleModelValue doubleModelValue1 = new org.jboss.dmr.DoubleModelValue((double) (short) 10);
        long long2 = doubleModelValue1.asLong();
        double double3 = doubleModelValue1.asDouble();
        java.lang.String str4 = doubleModelValue1.asString();
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleModelValue1.writeExternal(dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10.0" + "'", str4, "10.0");
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        org.jboss.dmr.ObjectModelValue objectModelValue0 = new org.jboss.dmr.ObjectModelValue();
        org.jboss.dmr.ModelNode modelNode1 = objectModelValue0.asObject();
        java.util.Set<java.lang.String> strSet2 = objectModelValue0.getKeys();
        org.jboss.dmr.ModelNode modelNode4 = objectModelValue0.removeChild("hi!");
        java.util.List<org.jboss.dmr.ModelNode> modelNodeList5 = objectModelValue0.asList();
        org.jboss.dmr.ModelValue modelValue6 = objectModelValue0.resolve();
        org.jboss.dmr.ModelValue modelValue7 = objectModelValue0.resolve();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = modelValue7.asBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modelNode1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(modelNode4);
        org.junit.Assert.assertNotNull(modelNodeList5);
        org.junit.Assert.assertNotNull(modelValue6);
        org.junit.Assert.assertNotNull(modelValue7);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        org.jboss.dmr.ModelType modelType0 = org.jboss.dmr.ModelType.INT;
        org.jboss.dmr.ModelNode modelNode1 = new org.jboss.dmr.ModelNode(modelType0);
        org.jboss.dmr.ModelNode modelNode3 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode6 = modelNode3.set("hi!", 0.0d);
        org.jboss.dmr.Property property7 = new org.jboss.dmr.Property("", modelNode6);
        org.jboss.dmr.ModelNode modelNode8 = modelNode1.set(property7);
        org.jboss.dmr.PropertyModelValue propertyModelValue9 = new org.jboss.dmr.PropertyModelValue(property7);
        org.jboss.dmr.ModelValue modelValue10 = propertyModelValue9.resolve();
        java.lang.String str11 = propertyModelValue9.asString();
        org.jboss.dmr.ModelValue modelValue12 = propertyModelValue9.copy();
        org.jboss.dmr.ModelNode modelNode13 = new org.jboss.dmr.ModelNode();
        org.jboss.dmr.ModelNode modelNode16 = modelNode13.set("hi!", 0.0d);
        java.lang.String str17 = modelNode13.toString();
        org.jboss.dmr.ModelNode modelNode18 = modelNode13.setEmptyObject();
        org.jboss.dmr.ModelNode modelNode20 = modelNode13.set(100);
        org.jboss.dmr.ModelNode modelNode23 = new org.jboss.dmr.ModelNode((double) 100);
        org.jboss.dmr.ModelNode modelNode25 = modelNode23.set((int) '#');
        org.jboss.dmr.ModelNode modelNode26 = modelNode13.setNoCopy("EXPRESSION_VALUE", modelNode25);
        org.jboss.dmr.ModelNode modelNode29 = modelNode13.setExpression("(\"\" => (\"hi!\" => 0.0))", "");
        org.jboss.dmr.LongModelValue longModelValue31 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str32 = longModelValue31.asString();
        byte[] byteArray33 = longModelValue31.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue34 = new org.jboss.dmr.BytesModelValue(byteArray33);
        java.lang.String str35 = bytesModelValue34.asString();
        int int36 = bytesModelValue34.asInt();
        byte[] byteArray37 = bytesModelValue34.asBytes();
        org.jboss.dmr.LongModelValue longModelValue39 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str40 = longModelValue39.asString();
        byte[] byteArray41 = longModelValue39.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue42 = new org.jboss.dmr.BytesModelValue(byteArray41);
        java.lang.String str43 = bytesModelValue42.asString();
        int int44 = bytesModelValue42.asInt();
        int int45 = bytesModelValue42.asInt();
        org.jboss.dmr.LongModelValue longModelValue47 = new org.jboss.dmr.LongModelValue(1L);
        java.lang.String str48 = longModelValue47.asString();
        byte[] byteArray49 = longModelValue47.asBytes();
        org.jboss.dmr.BytesModelValue bytesModelValue50 = new org.jboss.dmr.BytesModelValue(byteArray49);
        double double51 = bytesModelValue50.asDouble();
        boolean boolean52 = bytesModelValue42.equals(bytesModelValue50);
        byte[] byteArray53 = bytesModelValue50.asBytes();
        java.math.BigInteger bigInteger54 = bytesModelValue50.asBigInteger();
        boolean boolean55 = bytesModelValue34.equals(bytesModelValue50);
        int int57 = bytesModelValue50.asInt((int) 'J');
        org.jboss.dmr.stream.ModelStreamFactory modelStreamFactory59 = org.jboss.dmr.stream.ModelStreamFactory.getInstance(false);
        java.io.InputStream inputStream60 = null;
        org.jboss.dmr.Base64.InputStream inputStream62 = new org.jboss.dmr.Base64.InputStream(inputStream60, (int) ' ');
        org.jboss.dmr.Base64.InputStream inputStream63 = new org.jboss.dmr.Base64.InputStream((java.io.InputStream) inputStream62);
        org.jboss.dmr.stream.ModelReader modelReader64 = modelStreamFactory59.newModelReader((java.io.InputStream) inputStream63);
        java.io.OutputStream outputStream65 = null;
        org.jboss.dmr.Base64.OutputStream outputStream66 = new org.jboss.dmr.Base64.OutputStream(outputStream65);
        org.jboss.dmr.Base64.OutputStream outputStream67 = new org.jboss.dmr.Base64.OutputStream((java.io.OutputStream) outputStream66);
        outputStream66.write((int) (byte) -1);
        org.jboss.dmr.stream.ModelWriter modelWriter70 = modelStreamFactory59.newModelWriter((java.io.OutputStream) outputStream66);
        org.jboss.dmr.stream.ModelWriter modelWriter71 = modelWriter70.writeListStart();
        bytesModelValue50.write(modelWriter71);
        modelNode13.write(modelWriter71);
        org.jboss.dmr.stream.ModelWriter modelWriter75 = modelWriter71.writeExpression("big decimal 32");
        propertyModelValue9.write(modelWriter75);
        org.jboss.dmr.stream.ModelWriter modelWriter77 = modelWriter75.writeObjectStart();
        org.junit.Assert.assertTrue("'" + modelType0 + "' != '" + org.jboss.dmr.ModelType.INT + "'", modelType0.equals(org.jboss.dmr.ModelType.INT));
        org.junit.Assert.assertNotNull(modelNode6);
        org.junit.Assert.assertNotNull(modelNode8);
        org.junit.Assert.assertNotNull(modelValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(\"\" => (\"hi!\" => 0.0))" + "'", str11, "(\"\" => (\"hi!\" => 0.0))");
        org.junit.Assert.assertNotNull(modelValue12);
        org.junit.Assert.assertNotNull(modelNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(\"hi!\" => 0.0)" + "'", str17, "(\"hi!\" => 0.0)");
        org.junit.Assert.assertNotNull(modelNode18);
        org.junit.Assert.assertNotNull(modelNode20);
        org.junit.Assert.assertNotNull(modelNode25);
        org.junit.Assert.assertNotNull(modelNode26);
        org.junit.Assert.assertNotNull(modelNode29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str35, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1" + "'", str40, "1");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }" + "'", str43, "bytes { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 }");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1" + "'", str48, "1");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.9E-324d + "'", double51 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(modelStreamFactory59);
        org.junit.Assert.assertNotNull(modelReader64);
        org.junit.Assert.assertNotNull(modelWriter70);
        org.junit.Assert.assertNotNull(modelWriter71);
        org.junit.Assert.assertNotNull(modelWriter75);
        org.junit.Assert.assertNotNull(modelWriter77);
    }
}

