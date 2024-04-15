package com.greplin.interval;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        java.lang.String str30 = integerInterval23.asString();
        boolean boolean32 = integerInterval23.contains((int) (short) 100);
        java.lang.String str33 = integerInterval23.toString();
        boolean boolean35 = integerInterval23.contains((int) 'a');
        int int36 = integerInterval23.getStart();
        java.lang.Class<?> wildcardClass37 = integerInterval23.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str15 = integerInterval14.toString();
        java.lang.String str16 = integerInterval14.asString();
        boolean boolean18 = integerInterval14.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval14.asStringList();
        boolean boolean21 = integerInterval14.contains((int) '4');
        boolean boolean22 = integerInterval9.equals((java.lang.Object) integerInterval14);
        int int23 = integerInterval2.compareTo(integerInterval9);
        int int24 = integerInterval2.getStart();
        java.lang.String str25 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        int int12 = intervalSegment2.getShift();
        long long13 = intervalSegment2.getStart();
        int int14 = intervalSegment2.getShift();
        long long15 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass16 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str11 = integerInterval10.toString();
        int int12 = integerInterval10.getEnd();
        java.lang.String str13 = integerInterval10.asString();
        java.lang.String str14 = integerInterval10.asString();
        int int15 = integerInterval10.getEnd();
        int int16 = integerInterval2.compareTo(integerInterval10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval10.asList();
        boolean boolean19 = integerInterval10.contains(100);
        java.lang.Class<?> wildcardClass20 = integerInterval10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (byte) 10);
        int int3 = integerInterval2.getStart();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean8 = integerInterval6.equals((java.lang.Object) "");
        int int9 = integerInterval6.getEnd();
        int int10 = integerInterval2.compareTo(integerInterval6);
        java.lang.String str11 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0-97" + "'", str11, "0-97");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        boolean boolean18 = integerInterval2.equals((java.lang.Object) (short) 0);
        java.lang.String str19 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(0);
        int int6 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        java.lang.String str12 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 1);
        int int18 = integerInterval9.compareTo(integerInterval15);
        java.lang.String str19 = integerInterval15.asString();
        java.lang.String str20 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str24 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean28 = integerInterval23.intersects(integerInterval27);
        boolean boolean30 = integerInterval27.contains(0);
        boolean boolean31 = integerInterval15.intersects(integerInterval27);
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean39 = integerInterval37.contains((int) (short) 100);
        java.lang.String str40 = integerInterval37.toString();
        com.greplin.interval.IntegerInterval integerInterval43 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean45 = integerInterval43.contains((int) (short) 1);
        int int46 = integerInterval37.compareTo(integerInterval43);
        java.lang.String str47 = integerInterval43.asString();
        boolean boolean48 = integerInterval34.intersects(integerInterval43);
        com.greplin.interval.IntegerInterval integerInterval50 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean51 = integerInterval43.intersects(integerInterval50);
        com.greplin.interval.IntegerInterval integerInterval54 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval57 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean59 = integerInterval57.contains((int) (short) 100);
        java.lang.String str60 = integerInterval57.toString();
        com.greplin.interval.IntegerInterval integerInterval63 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean65 = integerInterval63.contains((int) (short) 1);
        int int66 = integerInterval57.compareTo(integerInterval63);
        java.lang.String str67 = integerInterval63.asString();
        boolean boolean68 = integerInterval54.intersects(integerInterval63);
        com.greplin.interval.IntegerInterval integerInterval70 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean71 = integerInterval63.intersects(integerInterval70);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList72 = integerInterval70.asList();
        int int73 = integerInterval50.compareTo(integerInterval70);
        com.greplin.interval.IntegerInterval integerInterval76 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str77 = integerInterval76.toString();
        java.lang.String str78 = integerInterval76.asString();
        int int79 = integerInterval76.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList80 = integerInterval76.asList();
        com.greplin.interval.IntegerInterval integerInterval83 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str84 = integerInterval83.toString();
        java.lang.String str85 = integerInterval83.asString();
        boolean boolean87 = integerInterval83.contains(10);
        java.lang.String str88 = integerInterval83.toString();
        boolean boolean89 = integerInterval76.intersects(integerInterval83);
        boolean boolean90 = integerInterval70.equals((java.lang.Object) integerInterval83);
        com.google.common.collect.ImmutableList<java.lang.String> strList91 = integerInterval83.asStringList();
        boolean boolean92 = integerInterval27.intersects(integerInterval83);
        int int93 = integerInterval2.compareTo(integerInterval83);
        boolean boolean95 = integerInterval83.contains(0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{-1--1}" + "'", str24, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10-52" + "'", str47, "10-52");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(integerInterval50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "IntegerInterval{10-52}" + "'", str60, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "10-52" + "'", str67, "10-52");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(integerInterval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(intList72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "IntegerInterval{10-52}" + "'", str77, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "10-52" + "'", str78, "10-52");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertNotNull(intList80);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "IntegerInterval{10-52}" + "'", str84, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "10-52" + "'", str85, "10-52");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "IntegerInterval{10-52}" + "'", str88, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (short) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35--1}" + "'", str3, "IntegerInterval{35--1}");
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getStart();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean19 = integerInterval11.intersects(integerInterval18);
        boolean boolean21 = integerInterval18.contains((int) (byte) 1);
        java.lang.String str22 = integerInterval18.asString();
        java.lang.String str23 = integerInterval18.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1--1" + "'", str22, "-1--1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) '4');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-10" + "'", str4, "10-10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-10}" + "'", str5, "IntegerInterval{10-10}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-10}" + "'", str6, "IntegerInterval{10-10}");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) 'a');
        com.greplin.interval.IntervalSegment intervalSegment5 = new com.greplin.interval.IntervalSegment(0L, (int) (short) 0);
        boolean boolean6 = integerInterval2.equals((java.lang.Object) 0L);
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        java.lang.String str16 = integerInterval11.toString();
        int int17 = integerInterval11.getStart();
        java.lang.String str18 = integerInterval11.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval11.asStringList();
        boolean boolean20 = integerInterval2.equals((java.lang.Object) strList19);
        int int21 = integerInterval2.getStart();
        java.lang.String str22 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass25 = strList24.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100--1" + "'", str22, "100--1");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        java.lang.String str16 = integerInterval11.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval11.asList();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 100);
        java.lang.String str23 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 1);
        int int29 = integerInterval20.compareTo(integerInterval26);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 100);
        java.lang.String str35 = integerInterval32.toString();
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean40 = integerInterval38.contains((int) (short) 1);
        int int41 = integerInterval32.compareTo(integerInterval38);
        java.lang.String str42 = integerInterval38.asString();
        java.lang.String str43 = integerInterval38.toString();
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str47 = integerInterval46.toString();
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean51 = integerInterval46.intersects(integerInterval50);
        boolean boolean53 = integerInterval50.contains(0);
        boolean boolean54 = integerInterval38.intersects(integerInterval50);
        int int55 = integerInterval26.compareTo(integerInterval50);
        boolean boolean56 = integerInterval11.intersects(integerInterval26);
        int int57 = integerInterval2.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = integerInterval11.asStringList();
        java.lang.String str59 = integerInterval11.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "IntegerInterval{-1--1}" + "'", str47, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{10-52}" + "'", str59, "IntegerInterval{10-52}");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        boolean boolean6 = integerInterval2.intersects(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval2.toString();
        java.lang.String str18 = integerInterval2.toString();
        boolean boolean20 = integerInterval2.equals((java.lang.Object) 100);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval23.asList();
        int int25 = integerInterval2.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval23.asStringList();
        int int27 = integerInterval23.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 1);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        java.lang.String str11 = integerInterval2.asString();
        java.lang.String str12 = integerInterval2.toString();
        java.lang.String str13 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) '#', 52);
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        java.lang.String str10 = integerInterval6.toString();
        boolean boolean11 = integerInterval2.equals((java.lang.Object) str10);
        boolean boolean13 = integerInterval2.contains((int) (byte) -1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{35-52}" + "'", str9, "IntegerInterval{35-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{35-52}" + "'", str10, "IntegerInterval{35-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass8 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        int int12 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, 35);
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        boolean boolean6 = integerInterval2.contains(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval8.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval8.asList();
        java.lang.Class<?> wildcardClass17 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 97);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 100);
        java.lang.String str14 = integerInterval11.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 1);
        int int20 = integerInterval11.compareTo(integerInterval17);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 100);
        java.lang.String str26 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 1);
        int int32 = integerInterval23.compareTo(integerInterval29);
        java.lang.String str33 = integerInterval29.asString();
        java.lang.String str34 = integerInterval29.toString();
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str38 = integerInterval37.toString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean42 = integerInterval37.intersects(integerInterval41);
        boolean boolean44 = integerInterval41.contains(0);
        boolean boolean45 = integerInterval29.intersects(integerInterval41);
        int int46 = integerInterval17.compareTo(integerInterval41);
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str50 = integerInterval49.asString();
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str54 = integerInterval53.toString();
        com.greplin.interval.IntegerInterval integerInterval57 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean58 = integerInterval53.intersects(integerInterval57);
        boolean boolean60 = integerInterval57.contains(0);
        java.lang.String str61 = integerInterval57.asString();
        boolean boolean62 = integerInterval49.equals((java.lang.Object) integerInterval57);
        boolean boolean63 = integerInterval41.intersects(integerInterval57);
        boolean boolean65 = integerInterval41.contains(0);
        boolean boolean67 = integerInterval41.contains(35);
        boolean boolean68 = integerInterval2.intersects(integerInterval41);
        com.greplin.interval.IntegerInterval integerInterval71 = new com.greplin.interval.IntegerInterval(35, (-1));
        java.lang.String str72 = integerInterval71.toString();
        boolean boolean73 = integerInterval2.equals((java.lang.Object) integerInterval71);
        boolean boolean75 = integerInterval2.contains((int) ' ');
        java.lang.String str76 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList77 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10-52" + "'", str33, "10-52");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{-1--1}" + "'", str38, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "100--1" + "'", str50, "100--1");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{-1--1}" + "'", str54, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1--1" + "'", str61, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IntegerInterval{35--1}" + "'", str72, "IntegerInterval{35--1}");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "10-52" + "'", str76, "10-52");
        org.junit.Assert.assertNotNull(strList77);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) '#');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-35}" + "'", str3, "IntegerInterval{0-35}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getStart();
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean11 = integerInterval9.equals((java.lang.Object) "");
        int int12 = integerInterval9.getEnd();
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        boolean boolean15 = integerInterval2.contains((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass8 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        java.lang.String str9 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        boolean boolean12 = integerInterval2.contains((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str33 = integerInterval32.toString();
        java.lang.String str34 = integerInterval32.asString();
        boolean boolean36 = integerInterval32.contains(10);
        java.lang.String str37 = integerInterval32.toString();
        boolean boolean38 = integerInterval8.intersects(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean42 = integerInterval32.intersects(integerInterval41);
        java.lang.String str43 = integerInterval41.asString();
        int int44 = integerInterval41.getEnd();
        boolean boolean46 = integerInterval41.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = integerInterval41.asStringList();
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval(0, 35);
        java.lang.String str51 = integerInterval50.asString();
        boolean boolean53 = integerInterval50.contains(10);
        int int54 = integerInterval41.compareTo(integerInterval50);
        java.lang.String str55 = integerInterval41.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList56 = integerInterval41.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "100--1" + "'", str43, "100--1");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0-35" + "'", str51, "0-35");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "100--1" + "'", str55, "100--1");
        org.junit.Assert.assertNotNull(intList56);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        java.lang.String str9 = integerInterval5.asString();
        java.lang.String str10 = integerInterval5.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval5.asList();
        java.lang.String str12 = integerInterval5.asString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-0}" + "'", str3, "IntegerInterval{10-0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-0" + "'", str4, "10-0");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        boolean boolean6 = integerInterval2.contains(1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        java.lang.String str25 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str29 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean33 = integerInterval28.intersects(integerInterval32);
        boolean boolean35 = integerInterval32.contains(0);
        boolean boolean36 = integerInterval20.intersects(integerInterval32);
        int int37 = integerInterval8.compareTo(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str41 = integerInterval40.asString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str45 = integerInterval44.toString();
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean49 = integerInterval44.intersects(integerInterval48);
        boolean boolean51 = integerInterval48.contains(0);
        java.lang.String str52 = integerInterval48.asString();
        boolean boolean53 = integerInterval40.equals((java.lang.Object) integerInterval48);
        boolean boolean54 = integerInterval32.intersects(integerInterval48);
        int int55 = integerInterval48.getStart();
        int int56 = integerInterval48.getEnd();
        java.lang.String str57 = integerInterval48.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{-1--1}" + "'", str29, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "100--1" + "'", str41, "100--1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1--1" + "'", str52, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "IntegerInterval{-1--1}" + "'", str57, "IntegerInterval{-1--1}");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        java.lang.String str16 = integerInterval11.toString();
        boolean boolean18 = integerInterval11.contains((int) ' ');
        java.lang.Object obj19 = null;
        boolean boolean20 = integerInterval11.equals(obj19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (byte) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{100-10}" + "'", str4, "IntegerInterval{100-10}");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str11 = integerInterval10.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval10.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval10.asList();
        boolean boolean14 = integerInterval2.intersects(integerInterval10);
        java.lang.String str15 = integerInterval10.toString();
        int int16 = integerInterval10.getEnd();
        java.lang.String str17 = integerInterval10.asString();
        boolean boolean19 = integerInterval10.contains((int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval10.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-10");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 1);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.toString();
        boolean boolean6 = integerInterval2.contains((int) (short) 100);
        int int7 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{97-1}" + "'", str4, "IntegerInterval{97-1}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        int int13 = integerInterval8.getStart();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 100);
        java.lang.String str19 = integerInterval16.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 1);
        int int25 = integerInterval16.compareTo(integerInterval22);
        boolean boolean26 = integerInterval8.equals((java.lang.Object) int25);
        int int27 = integerInterval8.getStart();
        java.lang.String str28 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 10);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-10}" + "'", str3, "IntegerInterval{1-10}");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        java.lang.String str25 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str29 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean33 = integerInterval28.intersects(integerInterval32);
        boolean boolean35 = integerInterval32.contains(0);
        boolean boolean36 = integerInterval20.intersects(integerInterval32);
        int int37 = integerInterval8.compareTo(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str41 = integerInterval40.asString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str45 = integerInterval44.toString();
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean49 = integerInterval44.intersects(integerInterval48);
        boolean boolean51 = integerInterval48.contains(0);
        java.lang.String str52 = integerInterval48.asString();
        boolean boolean53 = integerInterval40.equals((java.lang.Object) integerInterval48);
        boolean boolean54 = integerInterval32.intersects(integerInterval48);
        java.lang.Object obj55 = null;
        boolean boolean56 = integerInterval32.equals(obj55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{-1--1}" + "'", str29, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "100--1" + "'", str41, "100--1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1--1" + "'", str52, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        boolean boolean6 = integerInterval2.contains((int) (byte) 0);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        java.lang.String str12 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 1);
        int int18 = integerInterval9.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval15.asList();
        boolean boolean21 = integerInterval15.contains(100);
        boolean boolean22 = integerInterval2.equals((java.lang.Object) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass24 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-1}" + "'", str4, "IntegerInterval{52-1}");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getStart();
        java.lang.String str7 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) (byte) 10);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32-10}" + "'", str3, "IntegerInterval{32-10}");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 52);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        java.lang.String str18 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 1);
        int int24 = integerInterval15.compareTo(integerInterval21);
        java.lang.String str25 = integerInterval21.asString();
        int int26 = integerInterval21.getStart();
        boolean boolean27 = integerInterval2.intersects(integerInterval21);
        boolean boolean29 = integerInterval2.contains(100);
        int int30 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) '4');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.toString();
        boolean boolean12 = integerInterval2.contains((int) (short) 100);
        int int13 = integerInterval2.getEnd();
        int int14 = integerInterval2.getStart();
        int int15 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval11.asString();
        com.greplin.interval.IntervalSegment intervalSegment20 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int21 = intervalSegment20.getShift();
        long long22 = intervalSegment20.getStart();
        int int23 = intervalSegment20.getShift();
        boolean boolean24 = integerInterval11.equals((java.lang.Object) int23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval11.asList();
        int int26 = integerInterval11.getEnd();
        java.lang.String str27 = integerInterval11.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        java.lang.String str16 = integerInterval11.asString();
        java.lang.String str17 = integerInterval11.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 100);
        java.lang.String str23 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 1);
        int int29 = integerInterval20.compareTo(integerInterval26);
        java.lang.String str30 = integerInterval26.asString();
        java.lang.String str31 = integerInterval26.asString();
        int int32 = integerInterval11.compareTo(integerInterval26);
        java.lang.String str33 = integerInterval26.asString();
        boolean boolean35 = integerInterval26.contains((int) (short) 100);
        java.lang.String str36 = integerInterval26.toString();
        boolean boolean37 = integerInterval2.intersects(integerInterval26);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList38 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10-52" + "'", str33, "10-52");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "IntegerInterval{10-52}" + "'", str36, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intList38);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 35);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str7 = integerInterval6.toString();
        java.lang.String str8 = integerInterval6.asString();
        int int9 = integerInterval6.getStart();
        java.lang.String str10 = integerInterval6.toString();
        java.lang.String str11 = integerInterval6.toString();
        int int12 = integerInterval6.getStart();
        boolean boolean14 = integerInterval6.contains((int) 'a');
        int int15 = integerInterval6.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval6.asStringList();
        boolean boolean17 = integerInterval2.equals((java.lang.Object) strList16);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        int int8 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        java.lang.String str10 = integerInterval2.asString();
        boolean boolean12 = integerInterval2.contains((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str11 = integerInterval10.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval10.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval10.asList();
        boolean boolean14 = integerInterval2.intersects(integerInterval10);
        java.lang.String str15 = integerInterval10.toString();
        java.lang.Class<?> wildcardClass16 = integerInterval10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 97);
        boolean boolean4 = integerInterval2.contains((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int8 = intervalSegment7.getShift();
        int int9 = intervalSegment7.getShift();
        int int10 = intervalSegment7.getShift();
        long long11 = intervalSegment7.getStart();
        boolean boolean12 = integerInterval2.equals((java.lang.Object) long11);
        int int13 = integerInterval2.getStart();
        java.lang.String str14 = integerInterval2.toString();
        java.lang.String str15 = integerInterval2.asString();
        boolean boolean17 = integerInterval2.contains((int) (short) 100);
        java.lang.String str18 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1--1" + "'", str15, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{-1--1}" + "'", str18, "IntegerInterval{-1--1}");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        java.lang.String str15 = integerInterval8.toString();
        boolean boolean17 = integerInterval8.contains(52);
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str24 = integerInterval23.toString();
        int int25 = integerInterval20.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval20.asStringList();
        boolean boolean27 = integerInterval8.equals((java.lang.Object) integerInterval20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 35);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{35-100}" + "'", str4, "IntegerInterval{35-100}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval2.asStringList();
        int int15 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval18.asList();
        int int20 = integerInterval8.compareTo(integerInterval18);
        int int21 = integerInterval8.getStart();
        boolean boolean23 = integerInterval8.contains((int) (short) 100);
        com.greplin.interval.IntervalSegment intervalSegment26 = new com.greplin.interval.IntervalSegment(0L, 1);
        int int27 = intervalSegment26.getShift();
        boolean boolean28 = integerInterval8.equals((java.lang.Object) intervalSegment26);
        java.lang.String str29 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getEnd();
        int int16 = integerInterval8.getEnd();
        boolean boolean18 = integerInterval8.contains((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str11 = integerInterval10.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval10.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval10.asList();
        boolean boolean14 = integerInterval2.intersects(integerInterval10);
        java.lang.String str15 = integerInterval10.toString();
        boolean boolean17 = integerInterval10.contains((-1));
        int int18 = integerInterval10.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) '#');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 97);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 52);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-52}" + "'", str3, "IntegerInterval{1-52}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 52);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(32);
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        boolean boolean4 = integerInterval2.contains((int) (short) 0);
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        java.lang.String str11 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        boolean boolean28 = integerInterval14.intersects(integerInterval23);
        boolean boolean30 = integerInterval14.equals((java.lang.Object) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str34 = integerInterval33.toString();
        int int35 = integerInterval33.getEnd();
        java.lang.String str36 = integerInterval33.asString();
        java.lang.String str37 = integerInterval33.asString();
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean42 = integerInterval40.contains((int) (short) 100);
        java.lang.String str43 = integerInterval40.toString();
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean48 = integerInterval46.contains((int) (short) 1);
        int int49 = integerInterval40.compareTo(integerInterval46);
        java.lang.String str50 = integerInterval46.asString();
        java.lang.String str51 = integerInterval46.asString();
        java.lang.String str52 = integerInterval46.toString();
        boolean boolean53 = integerInterval33.intersects(integerInterval46);
        java.lang.String str54 = integerInterval33.toString();
        boolean boolean55 = integerInterval14.intersects(integerInterval33);
        boolean boolean56 = integerInterval6.equals((java.lang.Object) integerInterval14);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList57 = integerInterval14.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "10-52" + "'", str50, "10-52");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10-52" + "'", str51, "10-52");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "IntegerInterval{10-52}" + "'", str52, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intList57);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 0);
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval9 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int10 = integerInterval9.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval9.asList();
        int int12 = integerInterval2.compareTo(integerInterval9);
        java.lang.String str13 = integerInterval9.toString();
        boolean boolean15 = integerInterval9.contains(97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(integerInterval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{52--1}" + "'", str13, "IntegerInterval{52--1}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52-32");
        org.junit.Assert.assertNotNull(integerInterval1);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        int int11 = integerInterval2.getStart();
        int int12 = integerInterval2.getEnd();
        int int13 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 52);
        boolean boolean4 = integerInterval2.contains((int) (byte) -1);
        java.lang.String str5 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{100-52}" + "'", str5, "IntegerInterval{100-52}");
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval10 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str14 = integerInterval13.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean18 = integerInterval13.intersects(integerInterval17);
        int int19 = integerInterval10.compareTo(integerInterval17);
        int int20 = integerInterval2.compareTo(integerInterval17);
        int int21 = integerInterval17.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval17.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(integerInterval10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList30 = integerInterval8.asList();
        java.lang.String str31 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList32 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 1);
        int int17 = integerInterval8.compareTo(integerInterval14);
        java.lang.String str18 = integerInterval14.asString();
        boolean boolean19 = integerInterval5.intersects(integerInterval14);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 100);
        java.lang.String str25 = integerInterval22.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean30 = integerInterval28.contains((int) (short) 1);
        int int31 = integerInterval22.compareTo(integerInterval28);
        java.lang.String str32 = integerInterval28.asString();
        int int33 = integerInterval28.getEnd();
        boolean boolean34 = integerInterval5.equals((java.lang.Object) int33);
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = integerInterval5.asStringList();
        int int36 = integerInterval5.getEnd();
        int int37 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str38 = integerInterval2.toString();
        java.lang.String str39 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{97-0}" + "'", str38, "IntegerInterval{97-0}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "97-0" + "'", str39, "97-0");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 0);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str16 = integerInterval15.toString();
        java.lang.String str17 = integerInterval15.asString();
        boolean boolean19 = integerInterval15.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval15.asStringList();
        boolean boolean22 = integerInterval15.contains((int) '4');
        boolean boolean23 = integerInterval10.equals((java.lang.Object) integerInterval15);
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str27 = integerInterval26.toString();
        java.lang.String str28 = integerInterval26.asString();
        int int29 = integerInterval26.getStart();
        java.lang.String str30 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean35 = integerInterval33.equals((java.lang.Object) "");
        int int36 = integerInterval33.getEnd();
        boolean boolean37 = integerInterval26.intersects(integerInterval33);
        boolean boolean38 = integerInterval10.intersects(integerInterval33);
        int int39 = integerInterval10.getEnd();
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str43 = integerInterval42.toString();
        java.lang.String str44 = integerInterval42.asString();
        int int45 = integerInterval42.getStart();
        java.lang.String str46 = integerInterval42.toString();
        java.lang.String str47 = integerInterval42.toString();
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str51 = integerInterval50.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList52 = integerInterval50.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList53 = integerInterval50.asList();
        boolean boolean54 = integerInterval42.intersects(integerInterval50);
        int int55 = integerInterval10.compareTo(integerInterval42);
        java.lang.String str56 = integerInterval42.toString();
        int int57 = integerInterval2.compareTo(integerInterval42);
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = integerInterval42.asStringList();
        java.lang.String str59 = integerInterval42.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{10-52}" + "'", str30, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10-52" + "'", str44, "10-52");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{10-52}" + "'", str46, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "IntegerInterval{10-52}" + "'", str47, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IntegerInterval{10-52}" + "'", str51, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList52);
        org.junit.Assert.assertNotNull(intList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "IntegerInterval{10-52}" + "'", str56, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{10-52}" + "'", str59, "IntegerInterval{10-52}");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.toString();
        boolean boolean12 = integerInterval2.contains((int) (short) 100);
        int int13 = integerInterval2.getEnd();
        int int14 = integerInterval2.getStart();
        boolean boolean16 = integerInterval2.contains(100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) '4');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 32);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.toString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{1-32}" + "'", str4, "IntegerInterval{1-32}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        int int9 = intervalSegment6.getShift();
        long long10 = intervalSegment6.getStart();
        long long11 = intervalSegment6.getStart();
        int int12 = intervalSegment6.getShift();
        long long13 = intervalSegment6.getStart();
        long long14 = intervalSegment6.getStart();
        long long15 = intervalSegment6.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        java.lang.String str9 = integerInterval2.toString();
        int int10 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (-1));
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval2.getEnd();
        int int12 = integerInterval2.getStart();
        boolean boolean14 = integerInterval2.contains(32);
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval2.asList();
        java.lang.String str17 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{35-100}" + "'", str17, "IntegerInterval{35-100}");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) 'a', (int) '#');
        java.lang.Object obj11 = null;
        boolean boolean12 = integerInterval10.equals(obj11);
        boolean boolean13 = integerInterval2.intersects(integerInterval10);
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval(1, (-1));
        boolean boolean18 = integerInterval16.contains((int) (byte) 1);
        java.lang.String str19 = integerInterval16.asString();
        boolean boolean21 = integerInterval16.contains((int) (short) 0);
        java.lang.String str22 = integerInterval16.toString();
        java.lang.String str23 = integerInterval16.asString();
        int int24 = integerInterval16.getEnd();
        int int25 = integerInterval16.getStart();
        int int26 = integerInterval2.compareTo(integerInterval16);
        boolean boolean28 = integerInterval2.contains(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1--1" + "'", str19, "1--1");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{1--1}" + "'", str22, "IntegerInterval{1--1}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1--1" + "'", str23, "1--1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 0);
        boolean boolean4 = integerInterval2.contains(32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval8 = com.greplin.interval.IntegerInterval.valueOf("0-10");
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 0);
        boolean boolean13 = integerInterval11.contains(32);
        int int14 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval8.asStringList();
        boolean boolean16 = integerInterval2.equals((java.lang.Object) strList15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(integerInterval8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains((int) (short) 10);
        boolean boolean7 = integerInterval2.contains(0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52-10");
        boolean boolean3 = integerInterval1.contains((int) (byte) -1);
        int int4 = integerInterval1.getEnd();
        java.lang.String str5 = integerInterval1.asString();
        java.lang.String str6 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52-10" + "'", str5, "52-10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52-10" + "'", str6, "52-10");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        int int3 = integerInterval1.getEnd();
        int int4 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval1.asList();
        java.lang.String str6 = integerInterval1.asString();
        java.lang.String str7 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str18 = integerInterval17.toString();
        int int19 = integerInterval17.getEnd();
        java.lang.String str20 = integerInterval17.asString();
        java.lang.String str21 = integerInterval17.asString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 100);
        java.lang.String str27 = integerInterval24.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 1);
        int int33 = integerInterval24.compareTo(integerInterval30);
        java.lang.String str34 = integerInterval30.asString();
        java.lang.String str35 = integerInterval30.asString();
        java.lang.String str36 = integerInterval30.toString();
        boolean boolean37 = integerInterval17.intersects(integerInterval30);
        boolean boolean38 = integerInterval8.intersects(integerInterval17);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str43 = integerInterval42.toString();
        int int44 = integerInterval8.compareTo(integerInterval42);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList45 = integerInterval42.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "IntegerInterval{10-52}" + "'", str36, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{100--1}" + "'", str43, "IntegerInterval{100--1}");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intList45);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str19 = integerInterval18.toString();
        java.lang.String str20 = integerInterval18.asString();
        int int21 = integerInterval18.getStart();
        java.lang.String str22 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean27 = integerInterval25.equals((java.lang.Object) "");
        int int28 = integerInterval25.getEnd();
        boolean boolean29 = integerInterval18.intersects(integerInterval25);
        boolean boolean30 = integerInterval2.intersects(integerInterval25);
        int int31 = integerInterval25.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = integerInterval25.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = integerInterval25.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (-1));
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        boolean boolean9 = integerInterval2.contains((int) (short) 0);
        int int10 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval2.getEnd();
        int int12 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval15.asList();
        int int17 = integerInterval2.compareTo(integerInterval15);
        java.lang.String str18 = integerInterval15.toString();
        java.lang.String str19 = integerInterval15.asString();
        int int20 = integerInterval15.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{0--1}" + "'", str18, "IntegerInterval{0--1}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0--1" + "'", str19, "0--1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 0);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97-0" + "'", str3, "97-0");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 100);
        int int15 = integerInterval5.compareTo(integerInterval12);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 100);
        java.lang.String str21 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 1);
        int int27 = integerInterval18.compareTo(integerInterval24);
        java.lang.String str28 = integerInterval24.asString();
        int int29 = integerInterval24.getStart();
        boolean boolean30 = integerInterval5.intersects(integerInterval24);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str34 = integerInterval33.toString();
        boolean boolean35 = integerInterval24.intersects(integerInterval33);
        int int36 = integerInterval2.compareTo(integerInterval24);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList37 = integerInterval2.asList();
        int int38 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{1-1}" + "'", str34, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        boolean boolean7 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str11 = integerInterval10.toString();
        java.lang.String str12 = integerInterval10.asString();
        int int13 = integerInterval10.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval10.asList();
        int int15 = integerInterval2.compareTo(integerInterval10);
        java.lang.String str16 = integerInterval2.toString();
        java.lang.String str17 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1-52}" + "'", str16, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1-52}" + "'", str17, "IntegerInterval{-1-52}");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        java.lang.String str12 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 1);
        int int18 = integerInterval9.compareTo(integerInterval15);
        java.lang.String str19 = integerInterval15.asString();
        java.lang.String str20 = integerInterval15.asString();
        java.lang.String str21 = integerInterval15.toString();
        boolean boolean22 = integerInterval2.intersects(integerInterval15);
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 100);
        java.lang.String str28 = integerInterval25.toString();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean33 = integerInterval31.contains((int) (short) 1);
        int int34 = integerInterval25.compareTo(integerInterval31);
        java.lang.String str35 = integerInterval31.asString();
        java.lang.String str36 = integerInterval31.toString();
        int int37 = integerInterval31.getStart();
        java.lang.String str38 = integerInterval31.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = integerInterval31.asStringList();
        boolean boolean40 = integerInterval2.intersects(integerInterval31);
        com.greplin.interval.IntegerInterval integerInterval43 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean45 = integerInterval43.equals((java.lang.Object) "");
        int int46 = integerInterval43.getEnd();
        java.lang.String str47 = integerInterval43.toString();
        int int48 = integerInterval2.compareTo(integerInterval43);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList49 = integerInterval2.asList();
        java.lang.String str50 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "IntegerInterval{10-52}" + "'", str36, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "IntegerInterval{-1-52}" + "'", str47, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(intList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        java.lang.String str8 = integerInterval2.asString();
        int int9 = integerInterval2.getEnd();
        int int10 = integerInterval2.getStart();
        java.lang.String str11 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval5.getEnd();
        int int12 = integerInterval5.getStart();
        java.lang.String str13 = integerInterval5.toString();
        int int14 = integerInterval5.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean17 = integerInterval15.contains((int) (short) -1);
        int int18 = integerInterval8.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval15.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) 'a');
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-97" + "'", str4, "35-97");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval1.asStringList();
        java.lang.String str10 = integerInterval1.toString();
        com.greplin.interval.IntervalSegment intervalSegment13 = new com.greplin.interval.IntervalSegment(10L, (-1));
        boolean boolean14 = integerInterval1.equals((java.lang.Object) intervalSegment13);
        int int15 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', 52);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        java.lang.String str9 = integerInterval2.asString();
        int int10 = integerInterval2.getStart();
        int int11 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 100);
        int int15 = integerInterval5.compareTo(integerInterval12);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 100);
        java.lang.String str21 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 1);
        int int27 = integerInterval18.compareTo(integerInterval24);
        java.lang.String str28 = integerInterval24.asString();
        int int29 = integerInterval24.getStart();
        boolean boolean30 = integerInterval5.intersects(integerInterval24);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str34 = integerInterval33.toString();
        boolean boolean35 = integerInterval24.intersects(integerInterval33);
        int int36 = integerInterval2.compareTo(integerInterval24);
        int int37 = integerInterval24.getStart();
        java.lang.Class<?> wildcardClass38 = integerInterval24.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{1-1}" + "'", str34, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        java.lang.String str11 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        boolean boolean28 = integerInterval14.intersects(integerInterval23);
        boolean boolean30 = integerInterval14.equals((java.lang.Object) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str34 = integerInterval33.toString();
        int int35 = integerInterval33.getEnd();
        java.lang.String str36 = integerInterval33.asString();
        java.lang.String str37 = integerInterval33.asString();
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean42 = integerInterval40.contains((int) (short) 100);
        java.lang.String str43 = integerInterval40.toString();
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean48 = integerInterval46.contains((int) (short) 1);
        int int49 = integerInterval40.compareTo(integerInterval46);
        java.lang.String str50 = integerInterval46.asString();
        java.lang.String str51 = integerInterval46.asString();
        java.lang.String str52 = integerInterval46.toString();
        boolean boolean53 = integerInterval33.intersects(integerInterval46);
        java.lang.String str54 = integerInterval33.toString();
        boolean boolean55 = integerInterval14.intersects(integerInterval33);
        boolean boolean56 = integerInterval6.equals((java.lang.Object) integerInterval14);
        java.lang.Object obj57 = null;
        boolean boolean58 = integerInterval6.equals(obj57);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList59 = integerInterval6.asList();
        boolean boolean61 = integerInterval6.contains(100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "10-52" + "'", str50, "10-52");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10-52" + "'", str51, "10-52");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "IntegerInterval{10-52}" + "'", str52, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str15 = integerInterval14.toString();
        java.lang.String str16 = integerInterval14.asString();
        boolean boolean18 = integerInterval14.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval14.asStringList();
        boolean boolean21 = integerInterval14.contains((int) '4');
        boolean boolean22 = integerInterval9.equals((java.lang.Object) integerInterval14);
        int int23 = integerInterval2.compareTo(integerInterval9);
        int int24 = integerInterval2.getStart();
        int int25 = integerInterval2.getEnd();
        java.lang.String str26 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10-52" + "'", str26, "10-52");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int2 = integerInterval1.getStart();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(0, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval5.asStringList();
        boolean boolean7 = integerInterval1.intersects(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval1.asList();
        int int9 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        java.lang.String str8 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        int int12 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int2 = integerInterval1.getEnd();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-52}" + "'", str3, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        int int12 = intervalSegment2.getShift();
        long long13 = intervalSegment2.getStart();
        long long14 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass15 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        boolean boolean7 = integerInterval2.contains(52);
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) 'a');
        boolean boolean12 = integerInterval2.contains(32);
        java.lang.String str13 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52--1" + "'", str3, "52--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        int int9 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        java.lang.String str11 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        boolean boolean28 = integerInterval14.intersects(integerInterval23);
        java.lang.String str29 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str38 = integerInterval37.toString();
        java.lang.String str39 = integerInterval37.asString();
        boolean boolean41 = integerInterval37.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = integerInterval37.asStringList();
        boolean boolean44 = integerInterval37.contains((int) '4');
        boolean boolean45 = integerInterval32.equals((java.lang.Object) integerInterval37);
        boolean boolean46 = integerInterval14.intersects(integerInterval37);
        java.lang.String str47 = integerInterval37.toString();
        int int48 = integerInterval2.compareTo(integerInterval37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10-52" + "'", str39, "10-52");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "IntegerInterval{10-52}" + "'", str47, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) ' ');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        int int9 = integerInterval2.getEnd();
        java.lang.String str10 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        boolean boolean18 = integerInterval2.equals((java.lang.Object) (short) 0);
        int int19 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        boolean boolean6 = integerInterval2.contains(0);
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str13 = integerInterval12.toString();
        int int14 = integerInterval12.getEnd();
        java.lang.String str15 = integerInterval12.asString();
        java.lang.String str16 = integerInterval12.asString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        java.lang.String str30 = integerInterval25.asString();
        java.lang.String str31 = integerInterval25.toString();
        boolean boolean32 = integerInterval12.intersects(integerInterval25);
        int int33 = integerInterval2.compareTo(integerInterval25);
        java.lang.String str34 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean40 = integerInterval38.contains((int) (short) 100);
        java.lang.String str41 = integerInterval38.toString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean46 = integerInterval44.contains((int) (short) 1);
        int int47 = integerInterval38.compareTo(integerInterval44);
        boolean boolean49 = integerInterval44.contains(0);
        java.lang.String str50 = integerInterval44.toString();
        java.lang.Object obj51 = null;
        boolean boolean52 = integerInterval44.equals(obj51);
        boolean boolean53 = integerInterval2.intersects(integerInterval44);
        com.google.common.collect.ImmutableList<java.lang.String> strList54 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1--1" + "'", str34, "-1--1");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{10-52}" + "'", str41, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval18.asList();
        int int20 = integerInterval8.compareTo(integerInterval18);
        java.lang.String str21 = integerInterval8.asString();
        java.lang.String str22 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = integerInterval8.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str28 = integerInterval27.asString();
        boolean boolean30 = integerInterval27.contains((int) (short) 0);
        java.lang.String str31 = integerInterval27.asString();
        int int32 = integerInterval27.getEnd();
        boolean boolean33 = integerInterval8.equals((java.lang.Object) integerInterval27);
        int int34 = integerInterval27.getStart();
        int int35 = integerInterval27.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1-52" + "'", str28, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1-52" + "'", str31, "-1-52");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        java.lang.String str15 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval8.asStringList();
        int int17 = integerInterval8.getEnd();
        java.lang.String str18 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 0);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, 32);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 1);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) ' ');
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 100);
        java.lang.String str32 = integerInterval29.toString();
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean37 = integerInterval35.contains((int) (short) 1);
        int int38 = integerInterval29.compareTo(integerInterval35);
        java.lang.String str39 = integerInterval35.asString();
        java.lang.String str40 = integerInterval35.toString();
        com.greplin.interval.IntegerInterval integerInterval43 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str44 = integerInterval43.toString();
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean48 = integerInterval43.intersects(integerInterval47);
        boolean boolean50 = integerInterval47.contains(0);
        boolean boolean51 = integerInterval35.intersects(integerInterval47);
        int int52 = integerInterval23.compareTo(integerInterval47);
        boolean boolean53 = integerInterval8.intersects(integerInterval23);
        int int54 = integerInterval23.getStart();
        int int55 = integerInterval23.getStart();
        java.lang.String str56 = integerInterval23.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{10-52}" + "'", str32, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10-52" + "'", str39, "10-52");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "IntegerInterval{-1--1}" + "'", str44, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10-52" + "'", str56, "10-52");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) ' ');
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str21 = integerInterval20.toString();
        java.lang.String str22 = integerInterval20.toString();
        java.lang.String str23 = integerInterval20.toString();
        int int24 = integerInterval2.compareTo(integerInterval20);
        int int25 = integerInterval20.getStart();
        java.lang.String str26 = integerInterval20.toString();
        int int27 = integerInterval20.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{-1--1}" + "'", str21, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1--1}" + "'", str22, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{-1--1}" + "'", str26, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getEnd();
        java.lang.String str7 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1--1" + "'", str7, "-1--1");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        int int9 = intervalSegment6.getShift();
        long long10 = intervalSegment6.getStart();
        long long11 = intervalSegment6.getStart();
        int int12 = intervalSegment6.getShift();
        int int13 = intervalSegment6.getShift();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getEnd();
        boolean boolean10 = integerInterval2.contains((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        int int10 = integerInterval5.getEnd();
        boolean boolean12 = integerInterval5.contains(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 35);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str19 = integerInterval18.toString();
        java.lang.String str20 = integerInterval18.asString();
        int int21 = integerInterval18.getStart();
        java.lang.String str22 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean27 = integerInterval25.equals((java.lang.Object) "");
        int int28 = integerInterval25.getEnd();
        boolean boolean29 = integerInterval18.intersects(integerInterval25);
        boolean boolean30 = integerInterval2.intersects(integerInterval25);
        int int31 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str35 = integerInterval34.toString();
        java.lang.String str36 = integerInterval34.asString();
        int int37 = integerInterval34.getStart();
        java.lang.String str38 = integerInterval34.toString();
        java.lang.String str39 = integerInterval34.toString();
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str43 = integerInterval42.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList44 = integerInterval42.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList45 = integerInterval42.asList();
        boolean boolean46 = integerInterval34.intersects(integerInterval42);
        int int47 = integerInterval2.compareTo(integerInterval34);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList48 = integerInterval34.asList();
        java.lang.String str49 = integerInterval34.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{10-52}" + "'", str39, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList44);
        org.junit.Assert.assertNotNull(intList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "IntegerInterval{10-52}" + "'", str49, "IntegerInterval{10-52}");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str15 = integerInterval14.toString();
        java.lang.String str16 = integerInterval14.asString();
        boolean boolean18 = integerInterval14.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval14.asStringList();
        boolean boolean21 = integerInterval14.contains((int) '4');
        boolean boolean22 = integerInterval9.equals((java.lang.Object) integerInterval14);
        int int23 = integerInterval2.compareTo(integerInterval9);
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval32.asStringList();
        java.lang.String str37 = integerInterval32.asString();
        int int38 = integerInterval9.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval9.asList();
        java.lang.String str40 = integerInterval9.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10-52" + "'", str40, "10-52");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) '4');
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "10-52");
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        long long11 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        java.lang.String str25 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str29 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean33 = integerInterval28.intersects(integerInterval32);
        boolean boolean35 = integerInterval32.contains(0);
        boolean boolean36 = integerInterval20.intersects(integerInterval32);
        int int37 = integerInterval8.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList38 = integerInterval32.asList();
        java.lang.Class<?> wildcardClass39 = integerInterval32.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{-1--1}" + "'", str29, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intList38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval5.asList();
        int int14 = integerInterval5.getStart();
        int int15 = integerInterval2.compareTo(integerInterval5);
        boolean boolean17 = integerInterval2.contains(32);
        int int18 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval21.asStringList();
        java.lang.String str23 = integerInterval21.toString();
        boolean boolean24 = integerInterval2.intersects(integerInterval21);
        boolean boolean26 = integerInterval21.contains((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{1-32}" + "'", str23, "IntegerInterval{1-32}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        java.lang.String str20 = integerInterval16.asString();
        java.lang.String str21 = integerInterval16.toString();
        int int22 = integerInterval16.getStart();
        java.lang.String str23 = integerInterval16.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval16.asStringList();
        int int25 = integerInterval2.compareTo(integerInterval16);
        int int26 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval2.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment30 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) ' ');
        boolean boolean31 = integerInterval2.equals((java.lang.Object) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList32 = integerInterval2.asList();
        boolean boolean34 = integerInterval2.contains(10);
        int int35 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 52);
        boolean boolean4 = integerInterval2.contains(32);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval10 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str14 = integerInterval13.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean18 = integerInterval13.intersects(integerInterval17);
        int int19 = integerInterval10.compareTo(integerInterval17);
        int int20 = integerInterval2.compareTo(integerInterval17);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str24 = integerInterval23.toString();
        java.lang.String str25 = integerInterval23.asString();
        int int26 = integerInterval23.getStart();
        java.lang.String str27 = integerInterval23.toString();
        java.lang.String str28 = integerInterval23.toString();
        boolean boolean29 = integerInterval17.intersects(integerInterval23);
        java.lang.String str30 = integerInterval17.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList31 = integerInterval17.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = integerInterval17.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(integerInterval10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1--1" + "'", str30, "-1--1");
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 100);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, 97);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1--1");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        int int3 = integerInterval1.getStart();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 1);
        int int15 = integerInterval6.compareTo(integerInterval12);
        java.lang.String str16 = integerInterval12.asString();
        java.lang.String str17 = integerInterval12.toString();
        int int18 = integerInterval12.getStart();
        java.lang.String str19 = integerInterval12.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval12.asStringList();
        int int21 = integerInterval12.getEnd();
        boolean boolean22 = integerInterval1.equals((java.lang.Object) int21);
        boolean boolean24 = integerInterval1.contains((int) (byte) 10);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 97);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        int int10 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval5.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval5.asStringList();
        boolean boolean14 = integerInterval5.contains(10);
        boolean boolean16 = integerInterval5.contains(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval6.asStringList();
        java.lang.String str8 = integerInterval6.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval6.asStringList();
        int int10 = integerInterval6.getEnd();
        boolean boolean11 = integerInterval2.intersects(integerInterval6);
        int int12 = integerInterval2.getEnd();
        java.lang.String str13 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{52-1}" + "'", str8, "IntegerInterval{52-1}");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{35-1}" + "'", str13, "IntegerInterval{35-1}");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        int int10 = integerInterval5.getEnd();
        int int11 = integerInterval5.getStart();
        java.lang.String str12 = integerInterval5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        java.lang.String str25 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str29 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean33 = integerInterval28.intersects(integerInterval32);
        boolean boolean35 = integerInterval32.contains(0);
        boolean boolean36 = integerInterval20.intersects(integerInterval32);
        int int37 = integerInterval8.compareTo(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str41 = integerInterval40.asString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str45 = integerInterval44.toString();
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean49 = integerInterval44.intersects(integerInterval48);
        boolean boolean51 = integerInterval48.contains(0);
        java.lang.String str52 = integerInterval48.asString();
        boolean boolean53 = integerInterval40.equals((java.lang.Object) integerInterval48);
        boolean boolean54 = integerInterval32.intersects(integerInterval48);
        int int55 = integerInterval48.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = integerInterval48.asStringList();
        boolean boolean58 = integerInterval48.contains((int) (short) 100);
        boolean boolean60 = integerInterval48.contains((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{-1--1}" + "'", str29, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "100--1" + "'", str41, "100--1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1--1" + "'", str52, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str22 = integerInterval21.toString();
        int int23 = integerInterval18.compareTo(integerInterval21);
        int int24 = integerInterval7.compareTo(integerInterval21);
        java.lang.String str25 = integerInterval21.toString();
        java.lang.Class<?> wildcardClass26 = integerInterval21.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1--1}" + "'", str22, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{-1--1}" + "'", str25, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        int int6 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        int int9 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean18 = integerInterval16.contains((int) 'a');
        boolean boolean19 = integerInterval2.equals((java.lang.Object) 'a');
        boolean boolean21 = integerInterval2.contains(32);
        java.lang.Class<?> wildcardClass22 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) '#');
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getStart();
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-35" + "'", str3, "100-35");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{100-35}" + "'", str5, "IntegerInterval{100-35}");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean11 = integerInterval6.intersects(integerInterval10);
        int int12 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval6.asList();
        java.lang.String str14 = integerInterval6.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval6.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval6.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval6.asList();
        boolean boolean18 = integerInterval2.intersects(integerInterval6);
        java.lang.String str19 = integerInterval2.toString();
        java.lang.String str20 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{1--1}" + "'", str19, "IntegerInterval{1--1}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{1--1}" + "'", str20, "IntegerInterval{1--1}");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str26 = integerInterval25.toString();
        java.lang.String str27 = integerInterval25.asString();
        boolean boolean29 = integerInterval25.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = integerInterval25.asStringList();
        boolean boolean32 = integerInterval25.contains((int) '4');
        boolean boolean33 = integerInterval20.equals((java.lang.Object) integerInterval25);
        boolean boolean34 = integerInterval2.intersects(integerInterval25);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList35 = integerInterval25.asList();
        int int36 = integerInterval25.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList37 = integerInterval25.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(intList37);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        int int13 = integerInterval8.getEnd();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str27 = integerInterval26.toString();
        int int28 = integerInterval23.compareTo(integerInterval26);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval26.asStringList();
        boolean boolean30 = integerInterval17.intersects(integerInterval26);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str34 = integerInterval33.toString();
        int int35 = integerInterval33.getEnd();
        java.lang.String str36 = integerInterval33.asString();
        boolean boolean37 = integerInterval26.intersects(integerInterval33);
        java.lang.String str38 = integerInterval33.toString();
        java.lang.String str39 = integerInterval33.toString();
        int int40 = integerInterval33.getEnd();
        int int41 = integerInterval8.compareTo(integerInterval33);
        java.lang.String str42 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{-1--1}" + "'", str27, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{10-52}" + "'", str39, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 0);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32-0" + "'", str3, "32-0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean17 = integerInterval15.contains((int) (short) -1);
        int int18 = integerInterval8.compareTo(integerInterval15);
        java.lang.String str19 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval8.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval8.asList();
        java.lang.String str22 = integerInterval8.asString();
        java.lang.String str23 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 32);
        int int3 = integerInterval2.getStart();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1--1" + "'", str4, "-1--1");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        boolean boolean25 = integerInterval11.intersects(integerInterval20);
        java.lang.String str26 = integerInterval11.toString();
        java.lang.String str27 = integerInterval11.toString();
        int int28 = integerInterval2.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval11.asStringList();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 1);
        boolean boolean33 = integerInterval11.intersects(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval(0, (int) (short) 0);
        java.lang.String str37 = integerInterval36.asString();
        boolean boolean38 = integerInterval11.intersects(integerInterval36);
        boolean boolean40 = integerInterval11.contains((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0-0" + "'", str37, "0-0");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str15 = integerInterval14.toString();
        java.lang.String str16 = integerInterval14.asString();
        boolean boolean18 = integerInterval14.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval14.asStringList();
        boolean boolean21 = integerInterval14.contains((int) '4');
        boolean boolean22 = integerInterval9.equals((java.lang.Object) integerInterval14);
        int int23 = integerInterval2.compareTo(integerInterval9);
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval32.asStringList();
        java.lang.String str37 = integerInterval32.asString();
        int int38 = integerInterval9.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval9.asList();
        int int40 = integerInterval9.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getStart();
        boolean boolean17 = integerInterval8.contains((int) '#');
        boolean boolean19 = integerInterval8.contains((-1));
        int int20 = integerInterval8.getEnd();
        java.lang.String str21 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean29 = integerInterval27.contains((int) (short) 100);
        java.lang.String str30 = integerInterval27.toString();
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean35 = integerInterval33.contains((int) (short) 1);
        int int36 = integerInterval27.compareTo(integerInterval33);
        java.lang.String str37 = integerInterval33.asString();
        boolean boolean38 = integerInterval24.intersects(integerInterval33);
        com.greplin.interval.IntegerInterval integerInterval40 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean41 = integerInterval33.intersects(integerInterval40);
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean49 = integerInterval47.contains((int) (short) 100);
        java.lang.String str50 = integerInterval47.toString();
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean55 = integerInterval53.contains((int) (short) 1);
        int int56 = integerInterval47.compareTo(integerInterval53);
        java.lang.String str57 = integerInterval53.asString();
        boolean boolean58 = integerInterval44.intersects(integerInterval53);
        com.greplin.interval.IntegerInterval integerInterval60 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean61 = integerInterval53.intersects(integerInterval60);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList62 = integerInterval60.asList();
        int int63 = integerInterval40.compareTo(integerInterval60);
        boolean boolean64 = integerInterval8.intersects(integerInterval40);
        java.lang.String str65 = integerInterval8.asString();
        java.lang.String str66 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{10-52}" + "'", str30, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(integerInterval40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10-52" + "'", str57, "10-52");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(integerInterval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "10-52" + "'", str65, "10-52");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "IntegerInterval{10-52}" + "'", str66, "IntegerInterval{10-52}");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval(0, (int) (short) 100);
        boolean boolean14 = integerInterval2.intersects(integerInterval13);
        boolean boolean16 = integerInterval2.contains((int) (byte) 1);
        java.lang.String str17 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35-100" + "'", str17, "35-100");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 0);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97-0" + "'", str3, "97-0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) 'a');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getEnd();
        com.greplin.interval.IntervalSegment intervalSegment15 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int16 = intervalSegment15.getShift();
        int int17 = intervalSegment15.getShift();
        long long18 = intervalSegment15.getStart();
        long long19 = intervalSegment15.getStart();
        long long20 = intervalSegment15.getStart();
        boolean boolean21 = integerInterval2.equals((java.lang.Object) long20);
        int int22 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass23 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        int int7 = integerInterval1.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.asString();
        com.greplin.interval.IntegerInterval integerInterval9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = integerInterval5.compareTo(integerInterval9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval18.asList();
        int int20 = integerInterval8.compareTo(integerInterval18);
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval8.asStringList();
        int int22 = integerInterval8.getEnd();
        java.lang.String str23 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10-52" + "'", str23, "10-52");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        com.greplin.interval.IntegerInterval integerInterval13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = integerInterval8.intersects(integerInterval13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval18.asList();
        int int20 = integerInterval8.compareTo(integerInterval18);
        int int21 = integerInterval8.getStart();
        boolean boolean23 = integerInterval8.contains((int) (short) 100);
        com.greplin.interval.IntervalSegment intervalSegment26 = new com.greplin.interval.IntervalSegment(0L, 1);
        int int27 = intervalSegment26.getShift();
        boolean boolean28 = integerInterval8.equals((java.lang.Object) intervalSegment26);
        int int29 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        int int7 = integerInterval1.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        int int9 = integerInterval5.getEnd();
        int int10 = integerInterval5.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        int int13 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 1);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass5 = intList4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 100);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) -1);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList30 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str37 = integerInterval36.toString();
        java.lang.String str38 = integerInterval36.asString();
        boolean boolean40 = integerInterval36.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = integerInterval36.asStringList();
        boolean boolean43 = integerInterval36.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList44 = integerInterval36.asList();
        int int45 = integerInterval36.getStart();
        int int46 = integerInterval33.compareTo(integerInterval36);
        boolean boolean47 = integerInterval8.intersects(integerInterval33);
        boolean boolean49 = integerInterval8.contains(0);
        com.greplin.interval.IntegerInterval integerInterval52 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        boolean boolean54 = integerInterval52.contains((int) (byte) -1);
        boolean boolean55 = integerInterval8.intersects(integerInterval52);
        com.greplin.interval.IntegerInterval integerInterval57 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean59 = integerInterval57.contains((int) (short) 1);
        int int60 = integerInterval52.compareTo(integerInterval57);
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = integerInterval52.asStringList();
        java.lang.String str62 = integerInterval52.asString();
        int int63 = integerInterval52.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(integerInterval57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0-35" + "'", str62, "0-35");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        long long12 = intervalSegment2.getStart();
        int int13 = intervalSegment2.getShift();
        int int14 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) 10);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int5 = integerInterval4.getEnd();
        int int6 = integerInterval4.getEnd();
        boolean boolean7 = integerInterval2.intersects(integerInterval4);
        java.lang.Class<?> wildcardClass8 = integerInterval4.getClass();
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str22 = integerInterval21.toString();
        int int23 = integerInterval18.compareTo(integerInterval21);
        int int24 = integerInterval7.compareTo(integerInterval21);
        int int25 = integerInterval21.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval21.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval21.asList();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str31 = integerInterval30.toString();
        java.lang.String str32 = integerInterval30.asString();
        boolean boolean34 = integerInterval30.contains(10);
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean39 = integerInterval37.contains((int) (short) 100);
        int int40 = integerInterval30.compareTo(integerInterval37);
        boolean boolean41 = integerInterval21.intersects(integerInterval30);
        com.greplin.interval.IntegerInterval integerInterval43 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = integerInterval43.asStringList();
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str51 = integerInterval50.toString();
        int int52 = integerInterval47.compareTo(integerInterval50);
        boolean boolean53 = integerInterval43.intersects(integerInterval50);
        com.greplin.interval.IntegerInterval integerInterval56 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str57 = integerInterval56.asString();
        com.greplin.interval.IntegerInterval integerInterval60 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str61 = integerInterval60.toString();
        com.greplin.interval.IntegerInterval integerInterval64 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean65 = integerInterval60.intersects(integerInterval64);
        boolean boolean67 = integerInterval64.contains(0);
        java.lang.String str68 = integerInterval64.asString();
        boolean boolean69 = integerInterval56.equals((java.lang.Object) integerInterval64);
        int int70 = integerInterval43.compareTo(integerInterval56);
        boolean boolean71 = integerInterval21.equals((java.lang.Object) integerInterval56);
        java.lang.String str72 = integerInterval21.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1--1}" + "'", str22, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(integerInterval43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IntegerInterval{10-52}" + "'", str51, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "100--1" + "'", str57, "100--1");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "IntegerInterval{-1--1}" + "'", str61, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1--1" + "'", str68, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IntegerInterval{-1--1}" + "'", str72, "IntegerInterval{-1--1}");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        java.lang.String str20 = integerInterval16.asString();
        java.lang.String str21 = integerInterval16.toString();
        int int22 = integerInterval16.getStart();
        java.lang.String str23 = integerInterval16.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval16.asStringList();
        int int25 = integerInterval2.compareTo(integerInterval16);
        int int26 = integerInterval16.getEnd();
        int int27 = integerInterval16.getStart();
        java.lang.String str28 = integerInterval16.asString();
        int int29 = integerInterval16.getEnd();
        java.lang.String str30 = integerInterval16.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str33 = integerInterval32.toString();
        java.lang.String str34 = integerInterval32.asString();
        boolean boolean36 = integerInterval32.contains(10);
        java.lang.String str37 = integerInterval32.toString();
        boolean boolean38 = integerInterval8.intersects(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = integerInterval8.asStringList();
        java.lang.Class<?> wildcardClass40 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval10 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str14 = integerInterval13.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean18 = integerInterval13.intersects(integerInterval17);
        int int19 = integerInterval10.compareTo(integerInterval17);
        int int20 = integerInterval2.compareTo(integerInterval17);
        int int21 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(integerInterval10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{0-35}" + "'", str6, "IntegerInterval{0-35}");
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str19 = integerInterval18.toString();
        int int20 = integerInterval18.getEnd();
        java.lang.String str21 = integerInterval18.asString();
        boolean boolean22 = integerInterval11.intersects(integerInterval18);
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = integerInterval18.asStringList();
        boolean boolean25 = integerInterval18.contains((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        boolean boolean10 = integerInterval2.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval2.asList();
        int int12 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        java.lang.String str4 = integerInterval1.asString();
        java.lang.String str5 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52--1" + "'", str4, "52--1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{52--1}" + "'", str5, "IntegerInterval{52--1}");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, 97);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        int int3 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        boolean boolean6 = integerInterval1.contains((-1));
        int int7 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        boolean boolean25 = integerInterval11.intersects(integerInterval20);
        java.lang.String str26 = integerInterval11.toString();
        java.lang.String str27 = integerInterval11.toString();
        int int28 = integerInterval2.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval11.asStringList();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 1);
        boolean boolean33 = integerInterval11.intersects(integerInterval32);
        java.lang.String str34 = integerInterval11.asString();
        int int35 = integerInterval11.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        int int10 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str11 = integerInterval2.asString();
        java.lang.Class<?> wildcardClass12 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0-1" + "'", str11, "0-1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 0);
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval9 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int10 = integerInterval9.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval9.asList();
        int int12 = integerInterval2.compareTo(integerInterval9);
        java.lang.String str13 = integerInterval9.toString();
        int int14 = integerInterval9.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(integerInterval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{52--1}" + "'", str13, "IntegerInterval{52--1}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) -1);
        int int3 = integerInterval2.getStart();
        boolean boolean5 = integerInterval2.contains((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, 100);
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{0-100}" + "'", str4, "IntegerInterval{0-100}");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getEnd();
        com.greplin.interval.IntervalSegment intervalSegment15 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int16 = intervalSegment15.getShift();
        int int17 = intervalSegment15.getShift();
        long long18 = intervalSegment15.getStart();
        long long19 = intervalSegment15.getStart();
        long long20 = intervalSegment15.getStart();
        boolean boolean21 = integerInterval2.equals((java.lang.Object) long20);
        int int22 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str19 = integerInterval18.toString();
        int int20 = integerInterval18.getEnd();
        java.lang.String str21 = integerInterval18.asString();
        boolean boolean22 = integerInterval11.intersects(integerInterval18);
        int int23 = integerInterval11.getStart();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str27 = integerInterval26.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList28 = integerInterval26.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList29 = integerInterval26.asList();
        boolean boolean30 = integerInterval11.intersects(integerInterval26);
        boolean boolean32 = integerInterval11.contains((int) (byte) 1);
        boolean boolean34 = integerInterval11.contains((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList35 = integerInterval11.asList();
        java.lang.String str36 = integerInterval11.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1--1" + "'", str36, "-1--1");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (byte) 10);
        boolean boolean4 = integerInterval2.contains((int) (byte) -1);
        boolean boolean6 = integerInterval2.contains((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(52);
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1-0" + "'", str6, "1-0");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        java.lang.String str4 = integerInterval1.asString();
        java.lang.String str5 = integerInterval1.toString();
        java.lang.Class<?> wildcardClass6 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52--1" + "'", str4, "52--1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{52--1}" + "'", str5, "IntegerInterval{52--1}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 1);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 97);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (-1));
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval(0, (int) (short) 100);
        boolean boolean14 = integerInterval2.intersects(integerInterval13);
        boolean boolean16 = integerInterval2.contains((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = integerInterval2.compareTo(integerInterval18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean19 = integerInterval11.intersects(integerInterval18);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 100);
        java.lang.String str28 = integerInterval25.toString();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean33 = integerInterval31.contains((int) (short) 1);
        int int34 = integerInterval25.compareTo(integerInterval31);
        java.lang.String str35 = integerInterval31.asString();
        boolean boolean36 = integerInterval22.intersects(integerInterval31);
        com.greplin.interval.IntegerInterval integerInterval38 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean39 = integerInterval31.intersects(integerInterval38);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList40 = integerInterval38.asList();
        int int41 = integerInterval18.compareTo(integerInterval38);
        java.lang.String str42 = integerInterval38.toString();
        java.lang.String str43 = integerInterval38.asString();
        java.lang.String str44 = integerInterval38.asString();
        java.lang.String str45 = integerInterval38.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList46 = integerInterval38.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(integerInterval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "IntegerInterval{-1--1}" + "'", str42, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-1--1" + "'", str43, "-1--1");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1--1" + "'", str44, "-1--1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-1--1" + "'", str45, "-1--1");
        org.junit.Assert.assertNotNull(intList46);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getEnd();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str12 = integerInterval11.asString();
        java.lang.String str13 = integerInterval11.asString();
        int int14 = integerInterval2.compareTo(integerInterval11);
        int int15 = integerInterval11.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-52" + "'", str12, "-1-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1-52" + "'", str13, "-1-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        java.lang.String str16 = integerInterval2.asString();
        java.lang.String str17 = integerInterval2.toString();
        boolean boolean19 = integerInterval2.contains((int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        int int12 = intervalSegment2.getShift();
        int int13 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        int int9 = intervalSegment6.getShift();
        long long10 = intervalSegment6.getStart();
        long long11 = intervalSegment6.getStart();
        int int12 = intervalSegment6.getShift();
        long long13 = intervalSegment6.getStart();
        long long14 = intervalSegment6.getStart();
        int int15 = intervalSegment6.getShift();
        java.lang.Class<?> wildcardClass16 = intervalSegment6.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1--1");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        int int3 = integerInterval1.getStart();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 1);
        int int15 = integerInterval6.compareTo(integerInterval12);
        java.lang.String str16 = integerInterval12.asString();
        java.lang.String str17 = integerInterval12.toString();
        int int18 = integerInterval12.getStart();
        java.lang.String str19 = integerInterval12.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval12.asStringList();
        int int21 = integerInterval12.getEnd();
        boolean boolean22 = integerInterval1.equals((java.lang.Object) int21);
        boolean boolean24 = integerInterval1.contains(35);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        boolean boolean25 = integerInterval11.intersects(integerInterval20);
        java.lang.String str26 = integerInterval11.toString();
        java.lang.String str27 = integerInterval11.toString();
        int int28 = integerInterval2.compareTo(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean33 = integerInterval31.contains((int) (short) 100);
        java.lang.String str34 = integerInterval31.toString();
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str41 = integerInterval40.toString();
        int int42 = integerInterval37.compareTo(integerInterval40);
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = integerInterval40.asStringList();
        boolean boolean44 = integerInterval31.intersects(integerInterval40);
        java.lang.String str45 = integerInterval40.toString();
        java.lang.String str46 = integerInterval40.toString();
        int int47 = integerInterval2.compareTo(integerInterval40);
        java.lang.String str48 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{-1--1}" + "'", str41, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{-1--1}" + "'", str46, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "IntegerInterval{10-52}" + "'", str48, "IntegerInterval{10-52}");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval2.toString();
        java.lang.String str18 = integerInterval2.toString();
        boolean boolean20 = integerInterval2.contains((int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval2.asStringList();
        boolean boolean23 = integerInterval2.contains(1);
        int int24 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 10);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{35-10}" + "'", str5, "IntegerInterval{35-10}");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int8 = intervalSegment7.getShift();
        int int9 = intervalSegment7.getShift();
        int int10 = intervalSegment7.getShift();
        long long11 = intervalSegment7.getStart();
        boolean boolean12 = integerInterval2.equals((java.lang.Object) long11);
        java.lang.String str13 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) -1);
        int int17 = integerInterval2.compareTo(integerInterval16);
        int int18 = integerInterval16.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getStart();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.asString();
        boolean boolean8 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{1-100}" + "'", str5, "IntegerInterval{1-100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1-100" + "'", str6, "1-100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) -1);
        boolean boolean4 = integerInterval2.contains(1);
        boolean boolean6 = integerInterval2.contains((int) (short) 10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) '#');
        java.lang.String str10 = integerInterval9.asString();
        boolean boolean12 = integerInterval9.contains((int) ' ');
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-35" + "'", str10, "10-35");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        int int4 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) '4');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 35);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        java.lang.String str20 = integerInterval16.asString();
        java.lang.String str21 = integerInterval16.toString();
        int int22 = integerInterval16.getStart();
        java.lang.String str23 = integerInterval16.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval16.asStringList();
        int int25 = integerInterval2.compareTo(integerInterval16);
        int int26 = integerInterval16.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval16.asStringList();
        int int28 = integerInterval16.getEnd();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 52);
        int int32 = integerInterval16.compareTo(integerInterval31);
        boolean boolean34 = integerInterval31.contains(35);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList35 = integerInterval31.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) ' ');
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0-32" + "'", str4, "0-32");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, 100);
        boolean boolean4 = integerInterval2.contains(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        int int5 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str9 = integerInterval8.toString();
        java.lang.String str10 = integerInterval8.asString();
        int int11 = integerInterval8.getStart();
        java.lang.String str12 = integerInterval8.toString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval2.compareTo(integerInterval8);
        int int16 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        java.lang.String str20 = integerInterval16.asString();
        java.lang.String str21 = integerInterval16.toString();
        int int22 = integerInterval16.getStart();
        java.lang.String str23 = integerInterval16.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval16.asStringList();
        int int25 = integerInterval2.compareTo(integerInterval16);
        int int26 = integerInterval16.getEnd();
        boolean boolean28 = integerInterval16.contains((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval16.asStringList();
        boolean boolean31 = integerInterval16.contains((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean19 = integerInterval11.intersects(integerInterval18);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval18.asList();
        int int21 = integerInterval18.getStart();
        com.greplin.interval.IntervalSegment intervalSegment24 = new com.greplin.interval.IntervalSegment((long) 0, (int) (short) 100);
        boolean boolean25 = integerInterval18.equals((java.lang.Object) intervalSegment24);
        int int26 = integerInterval18.getEnd();
        boolean boolean28 = integerInterval18.contains((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        boolean boolean18 = integerInterval2.contains((int) (short) 0);
        boolean boolean20 = integerInterval2.contains((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.toString();
        java.lang.String str11 = integerInterval2.toString();
        int int12 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 52);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 1);
        int int15 = integerInterval6.compareTo(integerInterval12);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval12.asList();
        boolean boolean18 = integerInterval12.contains(0);
        boolean boolean20 = integerInterval12.contains((int) (short) -1);
        int int21 = integerInterval12.getEnd();
        boolean boolean22 = integerInterval2.equals((java.lang.Object) integerInterval12);
        java.lang.String str23 = integerInterval12.toString();
        java.lang.String str24 = integerInterval12.asString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) '4');
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 10);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str9 = integerInterval8.toString();
        int int10 = integerInterval5.compareTo(integerInterval8);
        boolean boolean11 = integerInterval1.intersects(integerInterval8);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str15 = integerInterval14.asString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str19 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean23 = integerInterval18.intersects(integerInterval22);
        boolean boolean25 = integerInterval22.contains(0);
        java.lang.String str26 = integerInterval22.asString();
        boolean boolean27 = integerInterval14.equals((java.lang.Object) integerInterval22);
        int int28 = integerInterval1.compareTo(integerInterval14);
        int int29 = integerInterval1.getEnd();
        java.lang.String str30 = integerInterval1.toString();
        java.lang.String str31 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100--1" + "'", str15, "100--1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{-1--1}" + "'", str19, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1--1" + "'", str26, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{10-52}" + "'", str30, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 100);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-10");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 0);
        boolean boolean6 = integerInterval4.contains(32);
        int int7 = integerInterval1.compareTo(integerInterval4);
        int int8 = integerInterval4.getStart();
        int int9 = integerInterval4.getStart();
        int int10 = integerInterval4.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval4.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval4.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 35);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{97-35}" + "'", str3, "IntegerInterval{97-35}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        com.greplin.interval.IntervalSegment intervalSegment15 = new com.greplin.interval.IntervalSegment((long) (short) 1, 1);
        int int16 = intervalSegment15.getShift();
        boolean boolean17 = integerInterval9.equals((java.lang.Object) int16);
        boolean boolean19 = integerInterval9.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str23 = integerInterval22.toString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean27 = integerInterval22.intersects(integerInterval26);
        boolean boolean29 = integerInterval26.contains(0);
        int int30 = integerInterval26.getEnd();
        java.lang.String str31 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean39 = integerInterval37.contains((int) (short) 100);
        java.lang.String str40 = integerInterval37.toString();
        com.greplin.interval.IntegerInterval integerInterval43 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean45 = integerInterval43.contains((int) (short) 1);
        int int46 = integerInterval37.compareTo(integerInterval43);
        java.lang.String str47 = integerInterval43.asString();
        boolean boolean48 = integerInterval34.intersects(integerInterval43);
        boolean boolean50 = integerInterval34.equals((java.lang.Object) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str54 = integerInterval53.toString();
        int int55 = integerInterval53.getEnd();
        java.lang.String str56 = integerInterval53.asString();
        java.lang.String str57 = integerInterval53.asString();
        com.greplin.interval.IntegerInterval integerInterval60 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean62 = integerInterval60.contains((int) (short) 100);
        java.lang.String str63 = integerInterval60.toString();
        com.greplin.interval.IntegerInterval integerInterval66 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean68 = integerInterval66.contains((int) (short) 1);
        int int69 = integerInterval60.compareTo(integerInterval66);
        java.lang.String str70 = integerInterval66.asString();
        java.lang.String str71 = integerInterval66.asString();
        java.lang.String str72 = integerInterval66.toString();
        boolean boolean73 = integerInterval53.intersects(integerInterval66);
        java.lang.String str74 = integerInterval53.toString();
        boolean boolean75 = integerInterval34.intersects(integerInterval53);
        boolean boolean76 = integerInterval26.equals((java.lang.Object) integerInterval34);
        int int77 = integerInterval34.getEnd();
        int int78 = integerInterval34.getEnd();
        boolean boolean79 = integerInterval9.intersects(integerInterval34);
        java.lang.String str80 = integerInterval34.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{-1--1}" + "'", str31, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10-52" + "'", str47, "10-52");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10-52" + "'", str56, "10-52");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10-52" + "'", str57, "10-52");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "IntegerInterval{10-52}" + "'", str63, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "10-52" + "'", str70, "10-52");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "10-52" + "'", str71, "10-52");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IntegerInterval{10-52}" + "'", str72, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "IntegerInterval{10-52}" + "'", str74, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 52 + "'", int77 == 52);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 52 + "'", int78 == 52);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "10-52" + "'", str80, "10-52");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval9.getEnd();
        java.lang.String str14 = integerInterval9.asString();
        int int15 = integerInterval9.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval9.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int8 = intervalSegment7.getShift();
        int int9 = intervalSegment7.getShift();
        int int10 = intervalSegment7.getShift();
        long long11 = intervalSegment7.getStart();
        boolean boolean12 = integerInterval2.equals((java.lang.Object) long11);
        int int13 = integerInterval2.getStart();
        java.lang.String str14 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass17 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 1);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) -1);
        int int6 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-1" + "'", str3, "1-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100--1" + "'", str6, "100--1");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval2.toString();
        java.lang.String str18 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str21 = integerInterval20.toString();
        int int22 = integerInterval20.getEnd();
        int int23 = integerInterval20.getStart();
        boolean boolean24 = integerInterval2.intersects(integerInterval20);
        java.lang.String str25 = integerInterval2.asString();
        java.lang.String str26 = integerInterval2.toString();
        java.lang.String str27 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(integerInterval20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) ' ');
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        java.lang.String str6 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = integerInterval10.toString();
        java.lang.String str12 = integerInterval10.toString();
        java.lang.String str13 = integerInterval10.toString();
        int int14 = integerInterval10.getEnd();
        int int15 = integerInterval10.getStart();
        boolean boolean16 = integerInterval2.intersects(integerInterval10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval10.asList();
        java.lang.String str18 = integerInterval10.asString();
        java.lang.Object obj19 = null;
        boolean boolean20 = integerInterval10.equals(obj19);
        com.greplin.interval.IntegerInterval integerInterval21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = integerInterval10.intersects(integerInterval21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1--1" + "'", str6, "-1--1");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{-1--1}" + "'", str13, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1--1" + "'", str18, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass6 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str33 = integerInterval32.toString();
        java.lang.String str34 = integerInterval32.asString();
        boolean boolean36 = integerInterval32.contains(10);
        java.lang.String str37 = integerInterval32.toString();
        boolean boolean38 = integerInterval8.intersects(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean42 = integerInterval32.intersects(integerInterval41);
        java.lang.String str43 = integerInterval41.asString();
        java.lang.String str44 = integerInterval41.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "100--1" + "'", str43, "100--1");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "IntegerInterval{100--1}" + "'", str44, "IntegerInterval{100--1}");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval5.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{1-32}" + "'", str6, "IntegerInterval{1-32}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        java.lang.String str12 = integerInterval10.asString();
        com.greplin.interval.IntervalSegment intervalSegment15 = new com.greplin.interval.IntervalSegment((long) 97, (int) ' ');
        boolean boolean16 = integerInterval10.equals((java.lang.Object) ' ');
        com.greplin.interval.IntegerInterval integerInterval18 = com.greplin.interval.IntegerInterval.valueOf("52-10");
        boolean boolean20 = integerInterval18.contains((int) (byte) -1);
        int int21 = integerInterval18.getEnd();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean29 = integerInterval27.contains((int) (short) 100);
        java.lang.String str30 = integerInterval27.toString();
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean35 = integerInterval33.contains((int) (short) 1);
        int int36 = integerInterval27.compareTo(integerInterval33);
        java.lang.String str37 = integerInterval33.asString();
        boolean boolean38 = integerInterval24.intersects(integerInterval33);
        com.greplin.interval.IntegerInterval integerInterval40 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean41 = integerInterval33.intersects(integerInterval40);
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean49 = integerInterval47.contains((int) (short) 100);
        java.lang.String str50 = integerInterval47.toString();
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean55 = integerInterval53.contains((int) (short) 1);
        int int56 = integerInterval47.compareTo(integerInterval53);
        java.lang.String str57 = integerInterval53.asString();
        boolean boolean58 = integerInterval44.intersects(integerInterval53);
        com.greplin.interval.IntegerInterval integerInterval60 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean61 = integerInterval53.intersects(integerInterval60);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList62 = integerInterval60.asList();
        int int63 = integerInterval40.compareTo(integerInterval60);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList64 = integerInterval40.asList();
        boolean boolean66 = integerInterval40.contains(100);
        boolean boolean67 = integerInterval18.intersects(integerInterval40);
        boolean boolean68 = integerInterval10.intersects(integerInterval18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1-100" + "'", str12, "1-100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{10-52}" + "'", str30, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(integerInterval40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10-52" + "'", str57, "10-52");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(integerInterval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intList64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        java.lang.String str12 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 1);
        int int18 = integerInterval9.compareTo(integerInterval15);
        java.lang.String str19 = integerInterval15.asString();
        java.lang.String str20 = integerInterval15.asString();
        java.lang.String str21 = integerInterval15.toString();
        boolean boolean22 = integerInterval2.intersects(integerInterval15);
        com.greplin.interval.IntervalSegment intervalSegment25 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 100);
        boolean boolean26 = integerInterval2.equals((java.lang.Object) intervalSegment25);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval9.getEnd();
        java.lang.String str14 = integerInterval9.asString();
        int int15 = integerInterval9.getEnd();
        com.greplin.interval.IntegerInterval integerInterval17 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str21 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean25 = integerInterval20.intersects(integerInterval24);
        int int26 = integerInterval17.compareTo(integerInterval24);
        java.lang.Object obj27 = null;
        boolean boolean28 = integerInterval17.equals(obj27);
        int int29 = integerInterval9.compareTo(integerInterval17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(integerInterval17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{-1--1}" + "'", str21, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((-1), (int) '4');
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        boolean boolean25 = integerInterval11.intersects(integerInterval20);
        int int26 = integerInterval11.getEnd();
        java.lang.String str27 = integerInterval11.toString();
        boolean boolean28 = integerInterval8.intersects(integerInterval11);
        int int29 = integerInterval11.getStart();
        int int30 = integerInterval2.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList31 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass6 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        java.lang.String str13 = integerInterval2.asString();
        java.lang.String str14 = integerInterval2.asString();
        boolean boolean16 = integerInterval2.contains((int) (byte) 0);
        boolean boolean18 = integerInterval2.contains((-1));
        int int19 = integerInterval2.getEnd();
        java.lang.String str20 = integerInterval2.asString();
        int int21 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        java.lang.String str8 = integerInterval6.toString();
        java.lang.String str9 = integerInterval6.toString();
        boolean boolean10 = integerInterval2.equals((java.lang.Object) str9);
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str14 = integerInterval13.toString();
        boolean boolean16 = integerInterval13.contains(52);
        int int17 = integerInterval13.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval13.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval13.asList();
        int int20 = integerInterval2.compareTo(integerInterval13);
        boolean boolean22 = integerInterval2.contains(52);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-1" + "'", str4, "10-1");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int5 = integerInterval4.getEnd();
        int int6 = integerInterval4.getEnd();
        boolean boolean7 = integerInterval2.intersects(integerInterval4);
        java.lang.Class<?> wildcardClass8 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        long long13 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) (byte) 100);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32-100}" + "'", str3, "IntegerInterval{32-100}");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) '#');
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 52);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) 'a', 97);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval7.asStringList();
        boolean boolean9 = integerInterval2.equals((java.lang.Object) strList8);
        java.lang.Class<?> wildcardClass10 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-52" + "'", str3, "100-52");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-100");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        java.lang.String str4 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-100" + "'", str4, "35-100");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        java.lang.String str13 = integerInterval2.asString();
        int int14 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        java.lang.String str12 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 1);
        int int18 = integerInterval9.compareTo(integerInterval15);
        java.lang.String str19 = integerInterval15.asString();
        java.lang.String str20 = integerInterval15.asString();
        java.lang.String str21 = integerInterval15.toString();
        boolean boolean22 = integerInterval2.intersects(integerInterval15);
        com.greplin.interval.IntervalSegment intervalSegment25 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 100);
        boolean boolean26 = integerInterval2.equals((java.lang.Object) intervalSegment25);
        int int27 = intervalSegment25.getShift();
        int int28 = intervalSegment25.getShift();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (byte) 0);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, 35);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean11 = integerInterval9.equals((java.lang.Object) "");
        int int12 = integerInterval9.getEnd();
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        java.lang.String str14 = integerInterval9.asString();
        int int15 = integerInterval9.getEnd();
        java.lang.Class<?> wildcardClass16 = integerInterval9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1-52" + "'", str14, "-1-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 100);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval4.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval4.asList();
        java.lang.String str7 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval10.asList();
        int int21 = integerInterval10.getEnd();
        int int22 = integerInterval4.compareTo(integerInterval10);
        int int23 = integerInterval2.compareTo(integerInterval4);
        java.lang.String str24 = integerInterval2.toString();
        int int25 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{32-100}" + "'", str24, "IntegerInterval{32-100}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 0);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52-52");
        java.lang.String str2 = integerInterval1.asString();
        java.lang.Class<?> wildcardClass3 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52-52" + "'", str2, "52-52");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 1);
        boolean boolean4 = integerInterval2.contains((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) 'a');
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) '#');
        java.lang.Object obj3 = null;
        boolean boolean4 = integerInterval2.equals(obj3);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        int int17 = integerInterval7.compareTo(integerInterval14);
        int int18 = integerInterval14.getEnd();
        java.lang.String str19 = integerInterval14.asString();
        boolean boolean20 = integerInterval2.intersects(integerInterval14);
        java.lang.String str21 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval2.asList();
        int int23 = integerInterval2.getStart();
        java.lang.String str24 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97-35" + "'", str21, "97-35");
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97-35" + "'", str24, "97-35");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (byte) -1);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        java.lang.String str11 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        boolean boolean28 = integerInterval14.intersects(integerInterval23);
        boolean boolean30 = integerInterval14.equals((java.lang.Object) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str34 = integerInterval33.toString();
        int int35 = integerInterval33.getEnd();
        java.lang.String str36 = integerInterval33.asString();
        java.lang.String str37 = integerInterval33.asString();
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean42 = integerInterval40.contains((int) (short) 100);
        java.lang.String str43 = integerInterval40.toString();
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean48 = integerInterval46.contains((int) (short) 1);
        int int49 = integerInterval40.compareTo(integerInterval46);
        java.lang.String str50 = integerInterval46.asString();
        java.lang.String str51 = integerInterval46.asString();
        java.lang.String str52 = integerInterval46.toString();
        boolean boolean53 = integerInterval33.intersects(integerInterval46);
        java.lang.String str54 = integerInterval33.toString();
        boolean boolean55 = integerInterval14.intersects(integerInterval33);
        boolean boolean56 = integerInterval6.equals((java.lang.Object) integerInterval14);
        java.lang.String str57 = integerInterval14.toString();
        com.greplin.interval.IntervalSegment intervalSegment60 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long61 = intervalSegment60.getStart();
        long long62 = intervalSegment60.getStart();
        long long63 = intervalSegment60.getStart();
        long long64 = intervalSegment60.getStart();
        int int65 = intervalSegment60.getShift();
        long long66 = intervalSegment60.getStart();
        long long67 = intervalSegment60.getStart();
        long long68 = intervalSegment60.getStart();
        boolean boolean69 = integerInterval14.equals((java.lang.Object) intervalSegment60);
        boolean boolean71 = integerInterval14.contains((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "10-52" + "'", str50, "10-52");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10-52" + "'", str51, "10-52");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "IntegerInterval{10-52}" + "'", str52, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "IntegerInterval{10-52}" + "'", str57, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 100L + "'", long64 == 100L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L + "'", long66 == 100L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L + "'", long67 == 100L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 100L + "'", long68 == 100L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        java.lang.String str15 = integerInterval8.toString();
        boolean boolean17 = integerInterval8.contains((int) 'a');
        java.lang.String str18 = integerInterval8.toString();
        boolean boolean20 = integerInterval8.contains((int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) 'a');
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32--1" + "'", str3, "32--1");
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, 35);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str9 = integerInterval8.toString();
        java.lang.String str10 = integerInterval8.asString();
        int int11 = integerInterval8.getStart();
        java.lang.String str12 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int16 = integerInterval8.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval15.asList();
        int int18 = integerInterval15.getStart();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        boolean boolean22 = integerInterval15.intersects(integerInterval21);
        int int23 = integerInterval2.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval15.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0-35" + "'", str3, "0-35");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        boolean boolean13 = integerInterval8.contains(0);
        java.lang.String str14 = integerInterval8.toString();
        int int15 = integerInterval8.getEnd();
        int int16 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str18 = integerInterval17.toString();
        int int19 = integerInterval17.getEnd();
        java.lang.String str20 = integerInterval17.asString();
        java.lang.String str21 = integerInterval17.asString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 100);
        java.lang.String str27 = integerInterval24.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 1);
        int int33 = integerInterval24.compareTo(integerInterval30);
        java.lang.String str34 = integerInterval30.asString();
        java.lang.String str35 = integerInterval30.asString();
        java.lang.String str36 = integerInterval30.toString();
        boolean boolean37 = integerInterval17.intersects(integerInterval30);
        boolean boolean38 = integerInterval8.intersects(integerInterval17);
        boolean boolean40 = integerInterval8.contains(35);
        java.lang.String str41 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "IntegerInterval{10-52}" + "'", str36, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{10-52}" + "'", str41, "IntegerInterval{10-52}");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-10" + "'", str4, "10-10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-10}" + "'", str5, "IntegerInterval{10-10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        boolean boolean6 = integerInterval2.contains(52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval2.toString();
        java.lang.String str18 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str22 = integerInterval21.toString();
        int int23 = integerInterval21.getStart();
        boolean boolean24 = integerInterval2.equals((java.lang.Object) integerInterval21);
        int int25 = integerInterval21.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1--1}" + "'", str22, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        java.lang.String str15 = integerInterval8.toString();
        int int16 = integerInterval8.getEnd();
        java.lang.String str17 = integerInterval8.asString();
        boolean boolean19 = integerInterval8.contains((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str22 = integerInterval21.toString();
        int int23 = integerInterval18.compareTo(integerInterval21);
        int int24 = integerInterval7.compareTo(integerInterval21);
        int int25 = integerInterval21.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval21.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval21.asList();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str31 = integerInterval30.toString();
        java.lang.String str32 = integerInterval30.asString();
        boolean boolean34 = integerInterval30.contains(10);
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean39 = integerInterval37.contains((int) (short) 100);
        int int40 = integerInterval30.compareTo(integerInterval37);
        boolean boolean41 = integerInterval21.intersects(integerInterval30);
        com.greplin.interval.IntegerInterval integerInterval43 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = integerInterval43.asStringList();
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str51 = integerInterval50.toString();
        int int52 = integerInterval47.compareTo(integerInterval50);
        boolean boolean53 = integerInterval43.intersects(integerInterval50);
        com.greplin.interval.IntegerInterval integerInterval56 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str57 = integerInterval56.asString();
        com.greplin.interval.IntegerInterval integerInterval60 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str61 = integerInterval60.toString();
        com.greplin.interval.IntegerInterval integerInterval64 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean65 = integerInterval60.intersects(integerInterval64);
        boolean boolean67 = integerInterval64.contains(0);
        java.lang.String str68 = integerInterval64.asString();
        boolean boolean69 = integerInterval56.equals((java.lang.Object) integerInterval64);
        int int70 = integerInterval43.compareTo(integerInterval56);
        boolean boolean71 = integerInterval21.equals((java.lang.Object) integerInterval56);
        boolean boolean73 = integerInterval21.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList74 = integerInterval21.asList();
        int int75 = integerInterval21.getEnd();
        java.lang.String str76 = integerInterval21.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1--1}" + "'", str22, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(integerInterval43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IntegerInterval{10-52}" + "'", str51, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "100--1" + "'", str57, "100--1");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "IntegerInterval{-1--1}" + "'", str61, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1--1" + "'", str68, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "-1--1" + "'", str76, "-1--1");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) '4');
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 35);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) 100);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean17 = integerInterval15.contains((int) (short) -1);
        int int18 = integerInterval8.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        boolean boolean24 = integerInterval22.contains(100);
        int int25 = integerInterval8.compareTo(integerInterval22);
        java.lang.String str26 = integerInterval22.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{35-10}" + "'", str26, "IntegerInterval{35-10}");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) '#');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-35}" + "'", str3, "IntegerInterval{0-35}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int8 = intervalSegment7.getShift();
        int int9 = intervalSegment7.getShift();
        int int10 = intervalSegment7.getShift();
        long long11 = intervalSegment7.getStart();
        boolean boolean12 = integerInterval2.equals((java.lang.Object) long11);
        java.lang.String str13 = integerInterval2.asString();
        java.lang.String str14 = integerInterval2.toString();
        int int15 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) 100);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        int int5 = integerInterval2.getEnd();
        int int6 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str33 = integerInterval32.toString();
        java.lang.String str34 = integerInterval32.asString();
        boolean boolean36 = integerInterval32.contains(10);
        java.lang.String str37 = integerInterval32.toString();
        boolean boolean38 = integerInterval8.intersects(integerInterval32);
        java.lang.String str39 = integerInterval8.toString();
        int int40 = integerInterval8.getEnd();
        java.lang.String str41 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList42 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{10-52}" + "'", str39, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{10-52}" + "'", str41, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList42);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        java.lang.String str18 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 1);
        int int24 = integerInterval15.compareTo(integerInterval21);
        java.lang.String str25 = integerInterval21.asString();
        int int26 = integerInterval21.getStart();
        boolean boolean27 = integerInterval2.intersects(integerInterval21);
        boolean boolean29 = integerInterval2.contains(100);
        boolean boolean31 = integerInterval2.contains((int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList32 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        int int14 = integerInterval8.getEnd();
        boolean boolean16 = integerInterval8.equals((java.lang.Object) 0);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval19.asStringList();
        boolean boolean21 = integerInterval8.intersects(integerInterval19);
        boolean boolean23 = integerInterval8.contains((int) (byte) 1);
        int int24 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        boolean boolean9 = integerInterval6.contains(52);
        java.lang.String str10 = integerInterval6.asString();
        boolean boolean12 = integerInterval6.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = integerInterval2.intersects(integerInterval6);
        int int14 = integerInterval6.getStart();
        java.lang.String str15 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        boolean boolean20 = integerInterval18.contains((int) ' ');
        java.lang.String str21 = integerInterval18.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval18.asStringList();
        boolean boolean23 = integerInterval6.intersects(integerInterval18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1--1" + "'", str21, "1--1");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10--1}" + "'", str3, "IntegerInterval{10--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{10--1}" + "'", str4, "IntegerInterval{10--1}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        java.lang.String str17 = integerInterval11.asString();
        int int18 = integerInterval11.getStart();
        java.lang.Class<?> wildcardClass19 = integerInterval11.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        java.lang.String str14 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1-0" + "'", str14, "1-0");
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        int int2 = integerInterval1.getEnd();
        java.lang.String str3 = integerInterval1.toString();
        java.lang.String str4 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int7 = integerInterval6.getStart();
        boolean boolean8 = integerInterval2.intersects(integerInterval6);
        com.greplin.interval.IntegerInterval integerInterval10 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str11 = integerInterval10.toString();
        int int12 = integerInterval10.getEnd();
        int int13 = integerInterval10.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval10.asList();
        boolean boolean15 = integerInterval6.equals((java.lang.Object) intList14);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval6.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(integerInterval6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(integerInterval10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) -1);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (byte) 10);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean19 = integerInterval11.intersects(integerInterval18);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 100);
        java.lang.String str28 = integerInterval25.toString();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean33 = integerInterval31.contains((int) (short) 1);
        int int34 = integerInterval25.compareTo(integerInterval31);
        java.lang.String str35 = integerInterval31.asString();
        boolean boolean36 = integerInterval22.intersects(integerInterval31);
        com.greplin.interval.IntegerInterval integerInterval38 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean39 = integerInterval31.intersects(integerInterval38);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList40 = integerInterval38.asList();
        int int41 = integerInterval18.compareTo(integerInterval38);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList42 = integerInterval38.asList();
        int int43 = integerInterval38.getEnd();
        com.greplin.interval.IntegerInterval integerInterval44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = integerInterval38.compareTo(integerInterval44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(integerInterval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass12 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (short) -1);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str8 = integerInterval7.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean12 = integerInterval7.intersects(integerInterval11);
        int int13 = integerInterval4.compareTo(integerInterval11);
        boolean boolean14 = integerInterval2.intersects(integerInterval4);
        boolean boolean16 = integerInterval4.contains((int) (short) 1);
        boolean boolean18 = integerInterval4.contains((int) '4');
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval5.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment11 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        long long12 = intervalSegment11.getStart();
        boolean boolean13 = integerInterval5.equals((java.lang.Object) intervalSegment11);
        java.lang.String str14 = integerInterval5.toString();
        int int15 = integerInterval5.getStart();
        java.lang.String str16 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        int int30 = integerInterval25.getEnd();
        java.lang.String str31 = integerInterval25.toString();
        boolean boolean33 = integerInterval25.contains((int) 'a');
        int int34 = integerInterval25.getEnd();
        java.lang.String str35 = integerInterval25.asString();
        int int36 = integerInterval5.compareTo(integerInterval25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str13 = integerInterval12.toString();
        int int14 = integerInterval12.getEnd();
        java.lang.String str15 = integerInterval12.asString();
        java.lang.String str16 = integerInterval12.asString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        java.lang.String str30 = integerInterval25.asString();
        java.lang.String str31 = integerInterval25.toString();
        boolean boolean32 = integerInterval12.intersects(integerInterval25);
        int int33 = integerInterval2.compareTo(integerInterval25);
        java.lang.String str34 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean40 = integerInterval38.contains((int) (short) 100);
        java.lang.String str41 = integerInterval38.toString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean46 = integerInterval44.contains((int) (short) 1);
        int int47 = integerInterval38.compareTo(integerInterval44);
        boolean boolean49 = integerInterval44.contains(0);
        java.lang.String str50 = integerInterval44.toString();
        java.lang.Object obj51 = null;
        boolean boolean52 = integerInterval44.equals(obj51);
        boolean boolean53 = integerInterval2.intersects(integerInterval44);
        java.lang.String str54 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList55 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1--1" + "'", str34, "-1--1");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{10-52}" + "'", str41, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{-1--1}" + "'", str54, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList55);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean17 = integerInterval15.contains((int) (short) -1);
        int int18 = integerInterval8.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval8.asList();
        int int20 = integerInterval8.getEnd();
        java.lang.String str21 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str22 = integerInterval21.toString();
        int int23 = integerInterval18.compareTo(integerInterval21);
        int int24 = integerInterval7.compareTo(integerInterval21);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval7.asStringList();
        java.lang.String str26 = integerInterval7.asString();
        java.lang.Class<?> wildcardClass27 = integerInterval7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1--1}" + "'", str22, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10-52" + "'", str26, "10-52");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{32-97}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{32\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str33 = integerInterval32.toString();
        java.lang.String str34 = integerInterval32.asString();
        boolean boolean36 = integerInterval32.contains(10);
        java.lang.String str37 = integerInterval32.toString();
        boolean boolean38 = integerInterval8.intersects(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean42 = integerInterval32.intersects(integerInterval41);
        java.lang.String str43 = integerInterval41.asString();
        int int44 = integerInterval41.getEnd();
        boolean boolean46 = integerInterval41.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = integerInterval41.asStringList();
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval(0, 35);
        java.lang.String str51 = integerInterval50.asString();
        boolean boolean53 = integerInterval50.contains(10);
        int int54 = integerInterval41.compareTo(integerInterval50);
        java.lang.Class<?> wildcardClass55 = integerInterval50.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "100--1" + "'", str43, "100--1");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0-35" + "'", str51, "0-35");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) 1);
        int int3 = integerInterval2.getStart();
        boolean boolean5 = integerInterval2.contains(52);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) ' ');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, 1);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10-1" + "'", str3, "10-1");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains((-1));
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        java.lang.String str12 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 1);
        int int18 = integerInterval9.compareTo(integerInterval15);
        java.lang.String str19 = integerInterval15.asString();
        boolean boolean20 = integerInterval6.intersects(integerInterval15);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 100);
        java.lang.String str26 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 1);
        int int32 = integerInterval23.compareTo(integerInterval29);
        java.lang.String str33 = integerInterval29.asString();
        int int34 = integerInterval29.getEnd();
        boolean boolean35 = integerInterval6.equals((java.lang.Object) int34);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval6.asStringList();
        int int37 = integerInterval6.getEnd();
        boolean boolean38 = integerInterval1.intersects(integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval1.asList();
        java.lang.String str40 = integerInterval1.toString();
        boolean boolean42 = integerInterval1.contains((int) (byte) 1);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10-52" + "'", str33, "10-52");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{100--1}" + "'", str40, "IntegerInterval{100--1}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        java.lang.String str16 = integerInterval11.asString();
        java.lang.String str17 = integerInterval11.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval11.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1--1" + "'", str16, "-1--1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1--1}" + "'", str17, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', 52);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        boolean boolean12 = integerInterval2.equals((java.lang.Object) integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str16 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean20 = integerInterval15.intersects(integerInterval19);
        int int21 = integerInterval15.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval15.asList();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str26 = integerInterval25.toString();
        int int27 = integerInterval25.getEnd();
        java.lang.String str28 = integerInterval25.asString();
        java.lang.String str29 = integerInterval25.asString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 100);
        java.lang.String str35 = integerInterval32.toString();
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean40 = integerInterval38.contains((int) (short) 1);
        int int41 = integerInterval32.compareTo(integerInterval38);
        java.lang.String str42 = integerInterval38.asString();
        java.lang.String str43 = integerInterval38.asString();
        java.lang.String str44 = integerInterval38.toString();
        boolean boolean45 = integerInterval25.intersects(integerInterval38);
        int int46 = integerInterval15.compareTo(integerInterval38);
        int int47 = integerInterval2.compareTo(integerInterval15);
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval(32, 1);
        java.lang.String str51 = integerInterval50.toString();
        boolean boolean52 = integerInterval2.equals((java.lang.Object) str51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10-52" + "'", str43, "10-52");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "IntegerInterval{10-52}" + "'", str44, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IntegerInterval{32-1}" + "'", str51, "IntegerInterval{32-1}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-97");
        org.junit.Assert.assertNotNull(integerInterval1);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.asString();
        java.lang.String str14 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.asString();
        int int29 = integerInterval8.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList30 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str37 = integerInterval36.toString();
        java.lang.String str38 = integerInterval36.asString();
        boolean boolean40 = integerInterval36.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = integerInterval36.asStringList();
        boolean boolean43 = integerInterval36.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList44 = integerInterval36.asList();
        int int45 = integerInterval36.getStart();
        int int46 = integerInterval33.compareTo(integerInterval36);
        boolean boolean47 = integerInterval8.intersects(integerInterval33);
        boolean boolean49 = integerInterval8.contains(0);
        boolean boolean51 = integerInterval8.contains(52);
        com.greplin.interval.IntervalSegment intervalSegment54 = new com.greplin.interval.IntervalSegment(52L, 52);
        int int55 = intervalSegment54.getShift();
        boolean boolean56 = integerInterval8.equals((java.lang.Object) intervalSegment54);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList57 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intList57);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int8 = intervalSegment7.getShift();
        int int9 = intervalSegment7.getShift();
        int int10 = intervalSegment7.getShift();
        long long11 = intervalSegment7.getStart();
        boolean boolean12 = integerInterval2.equals((java.lang.Object) long11);
        int int13 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 52);
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        boolean boolean6 = integerInterval2.contains((int) ' ');
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-52}" + "'", str3, "IntegerInterval{1-52}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1-52" + "'", str7, "1-52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{1-52}" + "'", str8, "IntegerInterval{1-52}");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean11 = integerInterval9.equals((java.lang.Object) "");
        int int12 = integerInterval9.getEnd();
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        java.lang.String str14 = integerInterval2.toString();
        boolean boolean16 = integerInterval2.contains((int) (short) 0);
        int int17 = integerInterval2.getStart();
        java.lang.String str18 = integerInterval2.toString();
        java.lang.String str19 = integerInterval2.toString();
        java.lang.String str20 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        int int14 = integerInterval8.getStart();
        int int15 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval18.asList();
        int int20 = integerInterval8.compareTo(integerInterval18);
        int int21 = integerInterval8.getStart();
        boolean boolean23 = integerInterval8.contains((int) (short) 100);
        com.greplin.interval.IntervalSegment intervalSegment26 = new com.greplin.interval.IntervalSegment(0L, 1);
        int int27 = intervalSegment26.getShift();
        boolean boolean28 = integerInterval8.equals((java.lang.Object) intervalSegment26);
        boolean boolean30 = integerInterval8.contains((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 100);
        java.lang.String str17 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 1);
        int int23 = integerInterval14.compareTo(integerInterval20);
        java.lang.String str24 = integerInterval20.asString();
        java.lang.String str25 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str29 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean33 = integerInterval28.intersects(integerInterval32);
        boolean boolean35 = integerInterval32.contains(0);
        boolean boolean36 = integerInterval20.intersects(integerInterval32);
        int int37 = integerInterval8.compareTo(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str41 = integerInterval40.asString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str45 = integerInterval44.toString();
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean49 = integerInterval44.intersects(integerInterval48);
        boolean boolean51 = integerInterval48.contains(0);
        java.lang.String str52 = integerInterval48.asString();
        boolean boolean53 = integerInterval40.equals((java.lang.Object) integerInterval48);
        boolean boolean54 = integerInterval32.intersects(integerInterval48);
        java.lang.String str55 = integerInterval48.asString();
        boolean boolean57 = integerInterval48.contains(32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList58 = integerInterval48.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{-1--1}" + "'", str29, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "100--1" + "'", str41, "100--1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-1--1" + "'", str52, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1--1" + "'", str55, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intList58);
    }
}

