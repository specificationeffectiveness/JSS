package com.greplin.interval;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) '4');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        int int12 = intervalSegment2.getShift();
        long long13 = intervalSegment2.getStart();
        int int14 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str31 = integerInterval30.toString();
        boolean boolean32 = integerInterval21.intersects(integerInterval30);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList33 = integerInterval30.asList();
        java.lang.String str34 = integerInterval30.toString();
        java.lang.String str35 = integerInterval30.asString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{1-1}" + "'", str31, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{1-1}" + "'", str34, "IntegerInterval{1-1}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1-1" + "'", str35, "1-1");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean11 = integerInterval6.intersects(integerInterval10);
        boolean boolean13 = integerInterval10.contains(0);
        java.lang.String str14 = integerInterval10.asString();
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval10.asList();
        com.greplin.interval.IntervalSegment intervalSegment19 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) 100);
        long long20 = intervalSegment19.getStart();
        int int21 = intervalSegment19.getShift();
        int int22 = intervalSegment19.getShift();
        int int23 = intervalSegment19.getShift();
        boolean boolean24 = integerInterval10.equals((java.lang.Object) intervalSegment19);
        long long25 = intervalSegment19.getStart();
        int int26 = intervalSegment19.getShift();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        int int6 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-1}" + "'", str4, "IntegerInterval{52-1}");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
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
        java.lang.String str17 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
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
        com.greplin.interval.IntegerInterval integerInterval58 = com.greplin.interval.IntegerInterval.valueOf("-1-100");
        int int59 = integerInterval8.compareTo(integerInterval58);
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
        org.junit.Assert.assertNotNull(integerInterval58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = integerInterval11.asStringList();
        java.lang.Class<?> wildcardClass32 = integerInterval11.getClass();
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
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 52);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        java.lang.String str28 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str32 = integerInterval31.toString();
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean36 = integerInterval31.intersects(integerInterval35);
        boolean boolean38 = integerInterval35.contains(0);
        boolean boolean39 = integerInterval23.intersects(integerInterval35);
        int int40 = integerInterval11.compareTo(integerInterval35);
        com.greplin.interval.IntegerInterval integerInterval43 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str44 = integerInterval43.asString();
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str48 = integerInterval47.toString();
        com.greplin.interval.IntegerInterval integerInterval51 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean52 = integerInterval47.intersects(integerInterval51);
        boolean boolean54 = integerInterval51.contains(0);
        java.lang.String str55 = integerInterval51.asString();
        boolean boolean56 = integerInterval43.equals((java.lang.Object) integerInterval51);
        boolean boolean57 = integerInterval35.intersects(integerInterval51);
        int int58 = integerInterval51.getStart();
        com.greplin.interval.IntegerInterval integerInterval61 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str62 = integerInterval61.toString();
        com.greplin.interval.IntegerInterval integerInterval65 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean66 = integerInterval61.intersects(integerInterval65);
        com.google.common.collect.ImmutableList<java.lang.String> strList67 = integerInterval65.asStringList();
        boolean boolean68 = integerInterval51.intersects(integerInterval65);
        boolean boolean69 = integerInterval2.equals((java.lang.Object) integerInterval65);
        java.lang.Class<?> wildcardClass70 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{-1--1}" + "'", str32, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "100--1" + "'", str44, "100--1");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "IntegerInterval{-1--1}" + "'", str48, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1--1" + "'", str55, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "IntegerInterval{-1--1}" + "'", str62, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
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
        int int22 = integerInterval2.getStart();
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
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, 52);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{100-52}" + "'", str3, "IntegerInterval{100-52}");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        java.lang.String str38 = integerInterval2.asString();
        int int39 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList40 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList41 = integerInterval2.asList();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "97-0" + "'", str38, "97-0");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(intList41);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 0);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.String str5 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1-0" + "'", str5, "1-0");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 52);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        int int6 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "10-52");
        int int5 = integerInterval2.getStart();
        boolean boolean7 = integerInterval2.contains(1);
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35-1" + "'", str8, "35-1");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (byte) 1);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 100);
        boolean boolean7 = integerInterval2.contains((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32-1" + "'", str3, "32-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        int int14 = integerInterval2.getEnd();
        boolean boolean16 = integerInterval2.contains((int) (byte) -1);
        int int17 = integerInterval2.getStart();
        java.lang.String str18 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{-1--1}" + "'", str18, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{52-35}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{52\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval36.asList();
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
        org.junit.Assert.assertNotNull(intList39);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (short) 0);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 0);
        boolean boolean7 = integerInterval2.contains(52);
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35-0" + "'", str3, "35-0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval8.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval8.asStringList();
        java.lang.String str22 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval8.asList();
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
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) 'a');
        int int11 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        boolean boolean14 = integerInterval2.contains(35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        boolean boolean6 = integerInterval2.contains((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = integerInterval8.asStringList();
        java.lang.String str31 = integerInterval8.asString();
        int int32 = integerInterval8.getStart();
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
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 100);
        int int14 = integerInterval2.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval2.toString();
        java.lang.String str16 = integerInterval2.asString();
        java.lang.Class<?> wildcardClass17 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1--1" + "'", str16, "-1--1");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        int int17 = integerInterval2.getStart();
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
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{-1--1}" + "'", str18, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) '4');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1-1");
        int int2 = integerInterval1.getEnd();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        boolean boolean6 = integerInterval1.contains((int) '#');
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-1}" + "'", str3, "IntegerInterval{1-1}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 35);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        int int13 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        java.lang.String str8 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        boolean boolean11 = integerInterval2.contains((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str31 = integerInterval30.asString();
        int int32 = integerInterval30.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList33 = integerInterval30.asList();
        java.lang.String str34 = integerInterval30.toString();
        java.lang.String str35 = integerInterval30.asString();
        int int36 = integerInterval30.getEnd();
        boolean boolean37 = integerInterval2.intersects(integerInterval30);
        java.lang.String str38 = integerInterval2.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1-52" + "'", str31, "-1-52");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{-1-52}" + "'", str34, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1-52" + "'", str35, "-1-52");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, 32);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        boolean boolean6 = integerInterval2.contains((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        boolean boolean12 = integerInterval2.contains((int) (byte) 100);
        int int13 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment16 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long17 = intervalSegment16.getStart();
        int int18 = intervalSegment16.getShift();
        int int19 = intervalSegment16.getShift();
        boolean boolean20 = integerInterval2.equals((java.lang.Object) int19);
        java.lang.Class<?> wildcardClass21 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        boolean boolean6 = integerInterval1.contains(10);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        long long12 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        java.lang.Class<?> wildcardClass17 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval(97, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int12 = integerInterval11.getEnd();
        int int13 = integerInterval11.getEnd();
        boolean boolean14 = integerInterval9.intersects(integerInterval11);
        int int15 = integerInterval9.getStart();
        boolean boolean16 = integerInterval2.equals((java.lang.Object) integerInterval9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(integerInterval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 35);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        java.lang.String str6 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = integerInterval2.compareTo(integerInterval7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1--1" + "'", str6, "-1--1");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) '4');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) 'a');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) ' ');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 1);
        int int17 = integerInterval8.compareTo(integerInterval14);
        java.lang.String str18 = integerInterval14.asString();
        java.lang.String str19 = integerInterval14.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval14.asList();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 100);
        java.lang.String str26 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 1);
        int int32 = integerInterval23.compareTo(integerInterval29);
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean37 = integerInterval35.contains((int) (short) 100);
        java.lang.String str38 = integerInterval35.toString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean43 = integerInterval41.contains((int) (short) 1);
        int int44 = integerInterval35.compareTo(integerInterval41);
        java.lang.String str45 = integerInterval41.asString();
        java.lang.String str46 = integerInterval41.toString();
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str50 = integerInterval49.toString();
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean54 = integerInterval49.intersects(integerInterval53);
        boolean boolean56 = integerInterval53.contains(0);
        boolean boolean57 = integerInterval41.intersects(integerInterval53);
        int int58 = integerInterval29.compareTo(integerInterval53);
        boolean boolean59 = integerInterval14.intersects(integerInterval29);
        int int60 = integerInterval5.compareTo(integerInterval14);
        int int61 = integerInterval14.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList62 = integerInterval14.asList();
        boolean boolean63 = integerInterval2.equals((java.lang.Object) integerInterval14);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10-52" + "'", str45, "10-52");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{10-52}" + "'", str46, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{-1--1}" + "'", str50, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(intList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
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
        int int18 = integerInterval9.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, 52);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, 97);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        int int18 = integerInterval15.getStart();
        int int19 = integerInterval15.getEnd();
        int int20 = integerInterval15.getStart();
        int int21 = integerInterval15.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((-1), (int) '4');
        int int24 = integerInterval8.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval8.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 10);
        boolean boolean4 = integerInterval2.contains(10);
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.asString();
        boolean boolean8 = integerInterval2.contains((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-10" + "'", str6, "-1-10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        boolean boolean8 = integerInterval2.equals((java.lang.Object) (short) 100);
        int int9 = integerInterval2.getEnd();
        int int10 = integerInterval2.getStart();
        java.lang.String str11 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{1--1}" + "'", str11, "IntegerInterval{1--1}");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
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
        int int54 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = integerInterval8.asStringList();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getEnd();
        int int3 = integerInterval1.getStart();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        boolean boolean7 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        long long8 = intervalSegment6.getStart();
        long long9 = intervalSegment6.getStart();
        long long10 = intervalSegment6.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 10);
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{52-52}" + "'", str5, "IntegerInterval{52-52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) '#');
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        java.lang.String str14 = integerInterval2.asString();
        int int15 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 100);
        java.lang.String str21 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 1);
        int int27 = integerInterval18.compareTo(integerInterval24);
        int int28 = integerInterval24.getEnd();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean33 = integerInterval31.contains((int) (short) -1);
        int int34 = integerInterval24.compareTo(integerInterval31);
        int int35 = integerInterval2.compareTo(integerInterval31);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval31.asStringList();
        int int37 = integerInterval31.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (byte) 10);
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        boolean boolean4 = integerInterval2.contains(100);
        java.lang.String str5 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{35-10}" + "'", str5, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 52);
        boolean boolean4 = integerInterval2.contains(32);
        boolean boolean6 = integerInterval2.contains((int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        int int10 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval5.asStringList();
        java.lang.String str12 = integerInterval5.asString();
        int int13 = integerInterval5.getEnd();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains((int) (byte) 0);
        int int10 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str11 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35-1" + "'", str7, "35-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10--1}" + "'", str11, "IntegerInterval{10--1}");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (byte) 100);
        int int3 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, 32);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        boolean boolean9 = integerInterval2.contains((int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-0" + "'", str3, "1-0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1-0" + "'", str4, "1-0");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 97);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        java.lang.String str19 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        int int13 = integerInterval8.getStart();
        boolean boolean15 = integerInterval8.contains((int) '4');
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str24 = integerInterval23.toString();
        java.lang.String str25 = integerInterval23.asString();
        boolean boolean27 = integerInterval23.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = integerInterval23.asStringList();
        boolean boolean30 = integerInterval23.contains((int) '4');
        boolean boolean31 = integerInterval18.equals((java.lang.Object) integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str35 = integerInterval34.toString();
        java.lang.String str36 = integerInterval34.asString();
        int int37 = integerInterval34.getStart();
        java.lang.String str38 = integerInterval34.toString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean43 = integerInterval41.equals((java.lang.Object) "");
        int int44 = integerInterval41.getEnd();
        boolean boolean45 = integerInterval34.intersects(integerInterval41);
        boolean boolean46 = integerInterval18.intersects(integerInterval41);
        int int47 = integerInterval18.getEnd();
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str51 = integerInterval50.toString();
        java.lang.String str52 = integerInterval50.asString();
        int int53 = integerInterval50.getStart();
        java.lang.String str54 = integerInterval50.toString();
        java.lang.String str55 = integerInterval50.toString();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str59 = integerInterval58.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList60 = integerInterval58.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList61 = integerInterval58.asList();
        boolean boolean62 = integerInterval50.intersects(integerInterval58);
        int int63 = integerInterval18.compareTo(integerInterval50);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList64 = integerInterval50.asList();
        boolean boolean66 = integerInterval50.contains((int) 'a');
        int int67 = integerInterval8.compareTo(integerInterval50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IntegerInterval{10-52}" + "'", str51, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10-52" + "'", str52, "10-52");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{10-52}" + "'", str55, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{10-52}" + "'", str59, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList60);
        org.junit.Assert.assertNotNull(intList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intList64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        boolean boolean17 = integerInterval8.equals((java.lang.Object) "IntegerInterval{32-0}");
        java.lang.String str18 = integerInterval8.toString();
        java.lang.Class<?> wildcardClass19 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        int int10 = integerInterval2.getEnd();
        int int11 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 97);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        boolean boolean7 = integerInterval2.contains(52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1-52}" + "'", str4, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean9 = integerInterval7.equals((java.lang.Object) "");
        int int10 = integerInterval7.getEnd();
        java.lang.String str11 = integerInterval7.toString();
        int int12 = integerInterval2.compareTo(integerInterval7);
        java.lang.Class<?> wildcardClass13 = integerInterval7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1-52" + "'", str4, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1-52}" + "'", str11, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (-1));
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval25.asStringList();
        java.lang.String str30 = integerInterval25.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = integerInterval25.asStringList();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str35 = integerInterval34.toString();
        int int36 = integerInterval34.getEnd();
        java.lang.String str37 = integerInterval34.asString();
        java.lang.String str38 = integerInterval34.asString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean43 = integerInterval41.contains((int) (short) 100);
        java.lang.String str44 = integerInterval41.toString();
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean49 = integerInterval47.contains((int) (short) 1);
        int int50 = integerInterval41.compareTo(integerInterval47);
        java.lang.String str51 = integerInterval47.asString();
        java.lang.String str52 = integerInterval47.asString();
        java.lang.String str53 = integerInterval47.toString();
        boolean boolean54 = integerInterval34.intersects(integerInterval47);
        boolean boolean55 = integerInterval25.intersects(integerInterval34);
        int int56 = integerInterval2.compareTo(integerInterval34);
        int int57 = integerInterval2.getEnd();
        int int58 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "IntegerInterval{10-52}" + "'", str44, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10-52" + "'", str51, "10-52");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10-52" + "'", str52, "10-52");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "IntegerInterval{10-52}" + "'", str53, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval5.asStringList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 100);
        java.lang.String str15 = integerInterval12.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 1);
        int int21 = integerInterval12.compareTo(integerInterval18);
        java.lang.String str22 = integerInterval18.asString();
        java.lang.String str23 = integerInterval18.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval18.asList();
        int int25 = integerInterval5.compareTo(integerInterval18);
        boolean boolean27 = integerInterval5.contains((int) (short) 100);
        java.lang.String str28 = integerInterval5.asString();
        com.greplin.interval.IntegerInterval integerInterval30 = com.greplin.interval.IntegerInterval.valueOf("100--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = integerInterval30.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList32 = integerInterval30.asList();
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean40 = integerInterval38.contains((int) (short) 100);
        java.lang.String str41 = integerInterval38.toString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean46 = integerInterval44.contains((int) (short) 1);
        int int47 = integerInterval38.compareTo(integerInterval44);
        java.lang.String str48 = integerInterval44.asString();
        boolean boolean49 = integerInterval35.intersects(integerInterval44);
        com.greplin.interval.IntegerInterval integerInterval52 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean54 = integerInterval52.contains((int) (short) 100);
        java.lang.String str55 = integerInterval52.toString();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean60 = integerInterval58.contains((int) (short) 1);
        int int61 = integerInterval52.compareTo(integerInterval58);
        java.lang.String str62 = integerInterval58.asString();
        int int63 = integerInterval58.getEnd();
        boolean boolean64 = integerInterval35.equals((java.lang.Object) int63);
        com.google.common.collect.ImmutableList<java.lang.String> strList65 = integerInterval35.asStringList();
        int int66 = integerInterval35.getEnd();
        boolean boolean67 = integerInterval30.intersects(integerInterval35);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList68 = integerInterval30.asList();
        boolean boolean69 = integerInterval5.intersects(integerInterval30);
        int int70 = integerInterval30.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertNotNull(integerInterval30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{10-52}" + "'", str41, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10-52" + "'", str48, "10-52");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{10-52}" + "'", str55, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "10-52" + "'", str62, "10-52");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        int int24 = integerInterval11.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval11.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval11.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval11.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = integerInterval11.asStringList();
        boolean boolean30 = integerInterval11.contains((int) (short) -1);
        boolean boolean32 = integerInterval11.contains((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        int int9 = intervalSegment6.getShift();
        long long10 = intervalSegment6.getStart();
        long long11 = intervalSegment6.getStart();
        long long12 = intervalSegment6.getStart();
        int int13 = intervalSegment6.getShift();
        long long14 = intervalSegment6.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, 35);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) ' ');
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-100" + "'", str4, "35-100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        boolean boolean9 = integerInterval2.contains((int) (short) 0);
        int int10 = integerInterval2.getEnd();
        int int11 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 10);
        boolean boolean4 = integerInterval2.contains((int) (byte) 100);
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{32-10}" + "'", str5, "IntegerInterval{32-10}");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-0}" + "'", str3, "IntegerInterval{1-0}");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, 32);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        int int19 = integerInterval8.getEnd();
        boolean boolean21 = integerInterval8.contains((int) (short) 1);
        java.lang.String str22 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval16.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval16.asStringList();
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) 'a');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = integerInterval2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList48 = integerInterval34.asStringList();
        boolean boolean50 = integerInterval34.contains((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(100);
        java.lang.String str15 = integerInterval8.asString();
        java.lang.String str16 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
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
        java.lang.String str38 = integerInterval2.asString();
        int int39 = integerInterval2.getStart();
        java.lang.String str40 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList41 = integerInterval2.asList();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "97-0" + "'", str38, "97-0");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{97-0}" + "'", str40, "IntegerInterval{97-0}");
        org.junit.Assert.assertNotNull(intList41);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-10");
        int int2 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
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
        java.lang.String str38 = integerInterval8.toString();
        java.lang.String str39 = integerInterval8.asString();
        int int40 = integerInterval8.getStart();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10-52" + "'", str39, "10-52");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        int int30 = integerInterval25.getEnd();
        boolean boolean31 = integerInterval2.equals((java.lang.Object) int30);
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = integerInterval2.asStringList();
        int int33 = integerInterval2.getEnd();
        boolean boolean35 = integerInterval2.contains((int) ' ');
        int int36 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
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
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval18.asStringList();
        int int20 = integerInterval8.compareTo(integerInterval18);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 100);
        java.lang.String str26 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 1);
        int int32 = integerInterval23.compareTo(integerInterval29);
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean37 = integerInterval35.contains((int) (short) 100);
        java.lang.String str38 = integerInterval35.toString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean43 = integerInterval41.contains((int) (short) 1);
        int int44 = integerInterval35.compareTo(integerInterval41);
        java.lang.String str45 = integerInterval41.asString();
        java.lang.String str46 = integerInterval41.toString();
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str50 = integerInterval49.toString();
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean54 = integerInterval49.intersects(integerInterval53);
        boolean boolean56 = integerInterval53.contains(0);
        boolean boolean57 = integerInterval41.intersects(integerInterval53);
        int int58 = integerInterval29.compareTo(integerInterval53);
        com.greplin.interval.IntegerInterval integerInterval61 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str62 = integerInterval61.asString();
        com.greplin.interval.IntegerInterval integerInterval65 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str66 = integerInterval65.toString();
        com.greplin.interval.IntegerInterval integerInterval69 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean70 = integerInterval65.intersects(integerInterval69);
        boolean boolean72 = integerInterval69.contains(0);
        java.lang.String str73 = integerInterval69.asString();
        boolean boolean74 = integerInterval61.equals((java.lang.Object) integerInterval69);
        boolean boolean75 = integerInterval53.intersects(integerInterval69);
        boolean boolean77 = integerInterval53.contains(0);
        boolean boolean79 = integerInterval53.contains(35);
        boolean boolean81 = integerInterval53.contains((int) (byte) 100);
        boolean boolean82 = integerInterval8.equals((java.lang.Object) boolean81);
        boolean boolean84 = integerInterval8.contains(52);
        java.lang.String str85 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10-52" + "'", str45, "10-52");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{10-52}" + "'", str46, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{-1--1}" + "'", str50, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "100--1" + "'", str62, "100--1");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "IntegerInterval{-1--1}" + "'", str66, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "-1--1" + "'", str73, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "IntegerInterval{10-52}" + "'", str85, "IntegerInterval{10-52}");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean9 = integerInterval7.equals((java.lang.Object) "");
        int int10 = integerInterval7.getEnd();
        java.lang.String str11 = integerInterval7.toString();
        int int12 = integerInterval2.compareTo(integerInterval7);
        boolean boolean14 = integerInterval2.contains((-1));
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1-52" + "'", str4, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1-52}" + "'", str11, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        boolean boolean36 = integerInterval25.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = integerInterval25.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = integerInterval25.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval25.asList();
        java.lang.String str40 = integerInterval25.toString();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
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
        java.lang.Class<?> wildcardClass23 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 100);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{52-100}" + "'", str3, "IntegerInterval{52-100}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        com.greplin.interval.IntegerInterval integerInterval52 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (byte) 10);
        int int53 = integerInterval8.compareTo(integerInterval52);
        com.google.common.collect.ImmutableList<java.lang.String> strList54 = integerInterval8.asStringList();
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-32");
        com.greplin.interval.IntegerInterval integerInterval2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = integerInterval1.intersects(integerInterval2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerInterval1);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
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
        boolean boolean39 = integerInterval2.contains((int) 'a');
        java.lang.Class<?> wildcardClass40 = integerInterval2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, 52);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass11 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
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
        java.lang.Class<?> wildcardClass16 = integerInterval5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 52);
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        int int6 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        long long12 = intervalSegment2.getStart();
        long long13 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        java.lang.String str5 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-100" + "'", str4, "35-100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35-100" + "'", str5, "35-100");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList42 = integerInterval18.asList();
        boolean boolean44 = integerInterval18.contains((int) 'a');
        java.lang.String str45 = integerInterval18.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList46 = integerInterval18.asList();
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval52 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean54 = integerInterval52.contains((int) (short) 100);
        java.lang.String str55 = integerInterval52.toString();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean60 = integerInterval58.contains((int) (short) 1);
        int int61 = integerInterval52.compareTo(integerInterval58);
        java.lang.String str62 = integerInterval58.asString();
        boolean boolean63 = integerInterval49.intersects(integerInterval58);
        int int64 = integerInterval49.getEnd();
        int int65 = integerInterval49.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList66 = integerInterval49.asStringList();
        com.greplin.interval.IntegerInterval integerInterval69 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean71 = integerInterval69.contains((int) (short) 100);
        java.lang.String str72 = integerInterval69.toString();
        com.greplin.interval.IntegerInterval integerInterval75 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean77 = integerInterval75.contains((int) (short) 1);
        int int78 = integerInterval69.compareTo(integerInterval75);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList79 = integerInterval75.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList80 = integerInterval75.asList();
        com.greplin.interval.IntervalSegment intervalSegment83 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int84 = intervalSegment83.getShift();
        long long85 = intervalSegment83.getStart();
        boolean boolean86 = integerInterval75.equals((java.lang.Object) long85);
        com.greplin.interval.IntegerInterval integerInterval89 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str90 = integerInterval89.toString();
        boolean boolean92 = integerInterval89.contains(52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList93 = integerInterval89.asList();
        java.lang.Class<?> wildcardClass94 = intList93.getClass();
        boolean boolean95 = integerInterval75.equals((java.lang.Object) intList93);
        java.lang.String str96 = integerInterval75.toString();
        boolean boolean97 = integerInterval49.equals((java.lang.Object) integerInterval75);
        boolean boolean98 = integerInterval18.intersects(integerInterval75);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{10-52}" + "'", str55, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "10-52" + "'", str62, "10-52");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IntegerInterval{10-52}" + "'", str72, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(intList79);
        org.junit.Assert.assertNotNull(intList80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 52 + "'", int84 == 52);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "IntegerInterval{-1--1}" + "'", str90, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "IntegerInterval{10-52}" + "'", str96, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) '#');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-35}" + "'", str3, "IntegerInterval{35-35}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) '#');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        int int9 = integerInterval5.getEnd();
        int int10 = integerInterval5.getEnd();
        boolean boolean12 = integerInterval5.contains((int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval5.asStringList();
        boolean boolean14 = integerInterval2.intersects(integerInterval5);
        int int15 = integerInterval5.getEnd();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval4.asStringList();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval8.asList();
        int int10 = integerInterval4.compareTo(integerInterval8);
        java.lang.String str11 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(10);
        boolean boolean15 = integerInterval2.intersects(integerInterval8);
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains((int) (short) -1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        int int11 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        int int15 = integerInterval14.getEnd();
        boolean boolean16 = integerInterval2.intersects(integerInterval14);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str20 = integerInterval19.asString();
        int int21 = integerInterval19.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval19.asList();
        java.lang.String str23 = integerInterval19.toString();
        java.lang.String str24 = integerInterval19.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval19.asList();
        int int26 = integerInterval19.getStart();
        boolean boolean27 = integerInterval14.intersects(integerInterval19);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList28 = integerInterval19.asList();
        java.lang.Class<?> wildcardClass29 = integerInterval19.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1-52" + "'", str20, "-1-52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1-52}" + "'", str23, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{-1-52}" + "'", str24, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 52);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0-52" + "'", str3, "0-52");
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
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
        com.greplin.interval.IntegerInterval integerInterval18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = integerInterval2.intersects(integerInterval18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        int int24 = integerInterval11.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval11.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval11.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval11.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = integerInterval11.asStringList();
        boolean boolean30 = integerInterval11.contains((int) (short) -1);
        java.lang.String str31 = integerInterval11.toString();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{-1--1}" + "'", str31, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 0);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 32);
        java.lang.String str7 = integerInterval6.toString();
        boolean boolean8 = integerInterval2.intersects(integerInterval6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{97-0}" + "'", str3, "IntegerInterval{97-0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{1-32}" + "'", str7, "IntegerInterval{1-32}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) '#');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(0);
        boolean boolean16 = integerInterval8.contains((int) (short) -1);
        int int17 = integerInterval8.getStart();
        java.lang.String str18 = integerInterval8.toString();
        int int19 = integerInterval8.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
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
        long long70 = intervalSegment60.getStart();
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
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
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
        boolean boolean56 = integerInterval32.contains(0);
        boolean boolean58 = integerInterval32.contains(35);
        boolean boolean60 = integerInterval32.contains((int) (byte) 100);
        java.lang.String str61 = integerInterval32.toString();
        boolean boolean63 = integerInterval32.contains((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "IntegerInterval{-1--1}" + "'", str61, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        long long12 = intervalSegment2.getStart();
        int int13 = intervalSegment2.getShift();
        long long14 = intervalSegment2.getStart();
        int int15 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) 100);
        boolean boolean4 = integerInterval2.contains(0);
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{97-100}" + "'", str5, "IntegerInterval{97-100}");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        int int8 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass9 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) '4');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
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
        java.lang.String str16 = integerInterval8.asString();
        java.lang.String str17 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0--1" + "'", str4, "0--1");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) 100);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) 100);
        int int8 = integerInterval7.getEnd();
        boolean boolean9 = integerInterval2.intersects(integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
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
        int int25 = integerInterval7.getStart();
        java.lang.String str26 = integerInterval7.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval7.asStringList();
        int int28 = integerInterval7.getEnd();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
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
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str31 = integerInterval30.toString();
        boolean boolean32 = integerInterval21.intersects(integerInterval30);
        int int33 = integerInterval30.getStart();
        int int34 = integerInterval30.getStart();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{1-1}" + "'", str31, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52-0");
        boolean boolean3 = integerInterval1.contains(0);
        java.lang.Class<?> wildcardClass4 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 32);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
        int int16 = integerInterval6.getEnd();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
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
        boolean boolean36 = integerInterval25.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList37 = integerInterval25.asList();
        int int38 = integerInterval25.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
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
        java.lang.String str45 = integerInterval8.asString();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10-52" + "'", str45, "10-52");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        int int13 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval(0, (int) ' ');
        boolean boolean18 = integerInterval8.intersects(integerInterval17);
        java.lang.String str19 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean9 = integerInterval7.contains((int) 'a');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval7.asList();
        boolean boolean11 = integerInterval1.equals((java.lang.Object) intList10);
        int int12 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        java.lang.String str4 = integerInterval1.asString();
        java.lang.String str5 = integerInterval1.toString();
        java.lang.String str6 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52--1" + "'", str4, "52--1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{52--1}" + "'", str5, "IntegerInterval{52--1}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{52--1}" + "'", str6, "IntegerInterval{52--1}");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        boolean boolean4 = integerInterval2.contains((int) (byte) -1);
        java.lang.String str5 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{0-35}" + "'", str5, "IntegerInterval{0-35}");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        boolean boolean8 = integerInterval2.equals((java.lang.Object) (short) 100);
        int int9 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = integerInterval2.compareTo(integerInterval10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.asString();
        java.lang.String str9 = integerInterval2.asString();
        boolean boolean11 = integerInterval2.contains((int) (byte) 1);
        int int12 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-52" + "'", str9, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval6.asStringList();
        int int9 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval6.asList();
        boolean boolean12 = integerInterval6.contains((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int10 = integerInterval2.compareTo(integerInterval9);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval9.asList();
        int int12 = integerInterval9.getStart();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        boolean boolean16 = integerInterval9.intersects(integerInterval15);
        java.lang.String str17 = integerInterval15.asString();
        int int18 = integerInterval15.getStart();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) '#');
        java.lang.String str22 = integerInterval21.toString();
        int int23 = integerInterval21.getStart();
        java.lang.String str24 = integerInterval21.toString();
        int int25 = integerInterval21.getStart();
        boolean boolean26 = integerInterval15.equals((java.lang.Object) integerInterval21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100-10" + "'", str17, "100-10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{-1-35}" + "'", str22, "IntegerInterval{-1-35}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{-1-35}" + "'", str24, "IntegerInterval{-1-35}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        java.lang.String str9 = integerInterval7.asString();
        boolean boolean11 = integerInterval7.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        boolean boolean14 = integerInterval7.contains((int) '4');
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval7.asStringList();
        boolean boolean18 = integerInterval7.contains((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, 100);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean4 = integerInterval2.contains((int) 'a');
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1--1" + "'", str5, "1--1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        java.lang.Object obj11 = null;
        boolean boolean12 = integerInterval1.equals(obj11);
        java.lang.String str13 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        java.lang.String str11 = integerInterval2.asString();
        java.lang.String str12 = integerInterval2.toString();
        int int13 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
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
        int int29 = intervalSegment26.getShift();
        int int30 = intervalSegment26.getShift();
        java.lang.Class<?> wildcardClass31 = intervalSegment26.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval9.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval9.asStringList();
        java.lang.String str15 = integerInterval9.asString();
        boolean boolean17 = integerInterval9.contains((int) (byte) 100);
        int int18 = integerInterval9.getStart();
        boolean boolean20 = integerInterval9.contains(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) 'a');
        com.greplin.interval.IntervalSegment intervalSegment5 = new com.greplin.interval.IntervalSegment(0L, (int) (short) 0);
        boolean boolean6 = integerInterval2.equals((java.lang.Object) 0L);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        java.lang.String str8 = integerInterval2.toString();
        int int9 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{1-97}" + "'", str8, "IntegerInterval{1-97}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) '4');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        java.lang.String str35 = integerInterval11.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval11.asList();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        boolean boolean4 = integerInterval2.contains((int) '#');
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval6.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval6.asList();
        java.lang.String str10 = integerInterval6.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval6.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval6.asList();
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
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
        java.lang.Class<?> wildcardClass41 = integerInterval1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 0);
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str7 = integerInterval6.toString();
        java.lang.String str8 = integerInterval6.asString();
        boolean boolean9 = integerInterval2.intersects(integerInterval6);
        boolean boolean11 = integerInterval6.contains((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        int int29 = integerInterval16.getEnd();
        int int30 = integerInterval16.getEnd();
        java.lang.String str31 = integerInterval16.asString();
        java.lang.String str32 = integerInterval16.toString();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{10-52}" + "'", str32, "IntegerInterval{10-52}");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str19 = integerInterval18.toString();
        java.lang.String str20 = integerInterval18.asString();
        int int21 = integerInterval18.getStart();
        java.lang.String str22 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int26 = integerInterval18.compareTo(integerInterval25);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval25.asList();
        boolean boolean28 = integerInterval6.equals((java.lang.Object) intList27);
        int int29 = integerInterval6.getStart();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, 35);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) 'a');
        int int6 = integerInterval2.compareTo(integerInterval5);
        int int7 = integerInterval5.getStart();
        boolean boolean9 = integerInterval5.contains(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        boolean boolean9 = integerInterval2.contains((int) (byte) 0);
        boolean boolean11 = integerInterval2.contains((int) (byte) 1);
        java.lang.String str12 = integerInterval2.asString();
        boolean boolean14 = integerInterval2.contains((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
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
        java.lang.String str24 = integerInterval8.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (-1));
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains((int) (short) 100);
        int int6 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (-1));
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35--1}" + "'", str3, "IntegerInterval{35--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 97);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) 'a');
        int int6 = integerInterval2.compareTo(integerInterval5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(100);
        java.lang.String str15 = integerInterval8.asString();
        int int16 = integerInterval8.getStart();
        int int17 = integerInterval8.getStart();
        java.lang.String str18 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str20 = integerInterval19.toString();
        boolean boolean22 = integerInterval19.contains(52);
        int int23 = integerInterval19.getEnd();
        int int24 = integerInterval19.getStart();
        boolean boolean26 = integerInterval19.contains((int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval19.asList();
        boolean boolean28 = integerInterval11.intersects(integerInterval19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{-1--1}" + "'", str20, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-97");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean6 = integerInterval4.equals((java.lang.Object) "");
        int int7 = integerInterval4.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval4.asStringList();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 100);
        int int12 = integerInterval4.compareTo(integerInterval11);
        java.lang.String str13 = integerInterval4.asString();
        int int14 = integerInterval1.compareTo(integerInterval4);
        com.greplin.interval.IntegerInterval integerInterval16 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval16.asList();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str23 = integerInterval22.asString();
        int int24 = integerInterval22.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval22.asList();
        java.lang.String str26 = integerInterval22.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval22.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment30 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        boolean boolean31 = integerInterval22.equals((java.lang.Object) intervalSegment30);
        boolean boolean33 = integerInterval22.contains(1);
        boolean boolean34 = integerInterval16.intersects(integerInterval22);
        java.lang.String str35 = integerInterval16.asString();
        int int36 = integerInterval1.compareTo(integerInterval16);
        int int37 = integerInterval16.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1-52" + "'", str13, "-1-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(integerInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1-52" + "'", str23, "-1-52");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{-1-52}" + "'", str26, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "35-10" + "'", str35, "35-10");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (short) 0);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        int int13 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval(0, (int) ' ');
        boolean boolean18 = integerInterval8.intersects(integerInterval17);
        int int19 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval8.asList();
        java.lang.String str21 = integerInterval8.toString();
        boolean boolean23 = integerInterval8.contains((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        int int13 = integerInterval8.getEnd();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval(32, (int) (short) 1);
        com.greplin.interval.IntervalSegment intervalSegment19 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) '#');
        boolean boolean20 = integerInterval16.equals((java.lang.Object) '#');
        int int21 = integerInterval16.getStart();
        boolean boolean22 = integerInterval8.intersects(integerInterval16);
        boolean boolean24 = integerInterval16.contains((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
        int int58 = integerInterval48.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList59 = integerInterval48.asList();
        java.lang.String str60 = integerInterval48.asString();
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intList59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-1--1" + "'", str60, "-1--1");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval20.asStringList();
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
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 1);
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-1" + "'", str3, "1-1");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval2.getEnd();
        int int12 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass13 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) 100);
        boolean boolean4 = integerInterval2.contains(35);
        java.lang.Object obj5 = null;
        boolean boolean6 = integerInterval2.equals(obj5);
        java.lang.String str7 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32-100" + "'", str7, "32-100");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 0);
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str16 = integerInterval15.toString();
        int int17 = integerInterval12.compareTo(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval15.asStringList();
        boolean boolean19 = integerInterval6.intersects(integerInterval15);
        boolean boolean21 = integerInterval6.contains((int) '#');
        boolean boolean22 = integerInterval2.equals((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        boolean boolean17 = integerInterval2.contains((int) '#');
        boolean boolean19 = integerInterval2.contains(100);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval2.asList();
        boolean boolean23 = integerInterval2.contains((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int10 = integerInterval2.compareTo(integerInterval9);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval9.asList();
        int int12 = integerInterval9.getStart();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        boolean boolean16 = integerInterval9.intersects(integerInterval15);
        java.lang.Class<?> wildcardClass17 = integerInterval9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        int int9 = integerInterval5.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
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
        java.lang.String str36 = integerInterval23.toString();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "IntegerInterval{10-52}" + "'", str36, "IntegerInterval{10-52}");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 35);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
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
        java.lang.String str80 = integerInterval9.asString();
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
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval5.asStringList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 100);
        java.lang.String str15 = integerInterval12.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 1);
        int int21 = integerInterval12.compareTo(integerInterval18);
        java.lang.String str22 = integerInterval18.asString();
        java.lang.String str23 = integerInterval18.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval18.asList();
        int int25 = integerInterval5.compareTo(integerInterval18);
        boolean boolean27 = integerInterval5.contains((int) (short) 100);
        java.lang.String str28 = integerInterval5.asString();
        int int29 = integerInterval5.getEnd();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (byte) 0);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{100-0}" + "'", str3, "IntegerInterval{100-0}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (byte) 1);
        boolean boolean4 = integerInterval2.contains(0);
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{100-1}" + "'", str6, "IntegerInterval{100-1}");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval6.asString();
        java.lang.String str9 = integerInterval6.toString();
        boolean boolean11 = integerInterval6.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval6.asStringList();
        java.lang.Class<?> wildcardClass13 = integerInterval6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, 52);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) '#');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-35");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        boolean boolean5 = integerInterval1.contains(1);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 35);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 52);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
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
        int int29 = integerInterval16.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList30 = integerInterval16.asList();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 10);
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 1);
        int int15 = integerInterval6.compareTo(integerInterval12);
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval12.asStringList();
        java.lang.String str17 = integerInterval12.asString();
        int int18 = integerInterval12.getEnd();
        boolean boolean20 = integerInterval12.equals((java.lang.Object) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval12.asList();
        boolean boolean22 = integerInterval2.intersects(integerInterval12);
        int int23 = integerInterval12.getStart();
        boolean boolean25 = integerInterval12.contains((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval5.getEnd();
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.asString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 100);
        java.lang.String str15 = integerInterval12.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 1);
        int int21 = integerInterval12.compareTo(integerInterval18);
        java.lang.String str22 = integerInterval18.asString();
        java.lang.String str23 = integerInterval18.asString();
        java.lang.String str24 = integerInterval18.toString();
        boolean boolean25 = integerInterval5.intersects(integerInterval18);
        int int26 = integerInterval2.compareTo(integerInterval18);
        boolean boolean28 = integerInterval18.contains((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10-52" + "'", str23, "10-52");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 1);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (-1));
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        long long11 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean9 = integerInterval7.contains((int) 'a');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval7.asList();
        boolean boolean11 = integerInterval1.equals((java.lang.Object) intList10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval1.asList();
        boolean boolean14 = integerInterval1.contains((int) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
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
        java.lang.String str23 = integerInterval18.toString();
        int int24 = integerInterval18.getStart();
        boolean boolean26 = integerInterval18.contains((int) '#');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 32);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval10.asStringList();
        java.lang.String str17 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str21 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean25 = integerInterval20.intersects(integerInterval24);
        int int26 = integerInterval20.getStart();
        java.lang.String str27 = integerInterval20.asString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str34 = integerInterval33.toString();
        java.lang.String str35 = integerInterval33.asString();
        boolean boolean37 = integerInterval33.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = integerInterval33.asStringList();
        boolean boolean40 = integerInterval33.contains((int) '4');
        boolean boolean41 = integerInterval30.intersects(integerInterval33);
        int int42 = integerInterval30.getStart();
        int int43 = integerInterval20.compareTo(integerInterval30);
        boolean boolean44 = integerInterval10.intersects(integerInterval30);
        com.google.common.collect.ImmutableList<java.lang.String> strList45 = integerInterval30.asStringList();
        java.lang.String str46 = integerInterval30.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = integerInterval30.asStringList();
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
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{-1--1}" + "'", str21, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1--1" + "'", str27, "-1--1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{1-0}" + "'", str46, "IntegerInterval{1-0}");
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        int int12 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        boolean boolean12 = integerInterval2.contains((int) (byte) 100);
        int int13 = integerInterval2.getStart();
        java.lang.String str14 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
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
        java.lang.String str32 = integerInterval8.asString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 10);
        int int3 = integerInterval2.getStart();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((-1), (int) '#');
        boolean boolean8 = integerInterval2.intersects(integerInterval7);
        int int9 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-10" + "'", str4, "10-10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 32);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("97-100");
        int int2 = integerInterval1.getEnd();
        java.lang.String str3 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{97-100}" + "'", str3, "IntegerInterval{97-100}");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) '4');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, 100);
        boolean boolean4 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        boolean boolean7 = integerInterval2.contains((int) (byte) 1);
        int int8 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = integerInterval32.asStringList();
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
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int10 = integerInterval2.compareTo(integerInterval9);
        java.lang.String str11 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval13 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval13.asStringList();
        java.lang.String str15 = integerInterval13.asString();
        com.greplin.interval.IntervalSegment intervalSegment18 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long19 = intervalSegment18.getStart();
        boolean boolean20 = integerInterval13.equals((java.lang.Object) intervalSegment18);
        int int21 = intervalSegment18.getShift();
        long long22 = intervalSegment18.getStart();
        long long23 = intervalSegment18.getStart();
        int int24 = intervalSegment18.getShift();
        boolean boolean25 = integerInterval2.equals((java.lang.Object) int24);
        java.lang.String str26 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass27 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertNotNull(integerInterval13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1--1" + "'", str15, "-1--1");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean9 = integerInterval7.contains((int) (short) 100);
        java.lang.String str10 = integerInterval7.toString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean15 = integerInterval13.contains((int) (short) 1);
        int int16 = integerInterval7.compareTo(integerInterval13);
        java.lang.String str17 = integerInterval13.asString();
        java.lang.String str18 = integerInterval13.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval13.asList();
        boolean boolean21 = integerInterval13.contains((int) (short) 0);
        boolean boolean22 = integerInterval2.intersects(integerInterval13);
        java.lang.Object obj23 = null;
        boolean boolean24 = integerInterval13.equals(obj23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval13.asStringList();
        java.lang.String str26 = integerInterval13.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        int int30 = integerInterval25.getEnd();
        boolean boolean31 = integerInterval2.equals((java.lang.Object) int30);
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = integerInterval2.asStringList();
        int int33 = integerInterval2.getEnd();
        boolean boolean35 = integerInterval2.contains((int) ' ');
        boolean boolean37 = integerInterval2.contains((int) (short) 100);
        java.lang.String str38 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval(100, 1);
        boolean boolean42 = integerInterval2.intersects(integerInterval41);
        int int43 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 100);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 10);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) '#');
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 52);
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        int int8 = integerInterval2.getEnd();
        int int9 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{35-52}" + "'", str5, "IntegerInterval{35-52}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{35-52}" + "'", str6, "IntegerInterval{35-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval8.asList();
        java.lang.String str18 = integerInterval8.asString();
        int int19 = integerInterval8.getEnd();
        java.lang.String str20 = integerInterval8.asString();
        boolean boolean22 = integerInterval8.contains((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 1);
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList33 = integerInterval11.asList();
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval39 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str40 = integerInterval39.toString();
        java.lang.String str41 = integerInterval39.asString();
        boolean boolean43 = integerInterval39.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = integerInterval39.asStringList();
        boolean boolean46 = integerInterval39.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList47 = integerInterval39.asList();
        int int48 = integerInterval39.getStart();
        int int49 = integerInterval36.compareTo(integerInterval39);
        boolean boolean50 = integerInterval11.intersects(integerInterval36);
        boolean boolean52 = integerInterval11.contains(0);
        int int53 = integerInterval2.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList54 = integerInterval2.asStringList();
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
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10-52" + "'", str41, "10-52");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        boolean boolean10 = integerInterval1.contains((int) (byte) 1);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval2.asList();
        com.greplin.interval.IntervalSegment intervalSegment16 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 10);
        long long17 = intervalSegment16.getStart();
        int int18 = intervalSegment16.getShift();
        long long19 = intervalSegment16.getStart();
        long long20 = intervalSegment16.getStart();
        int int21 = intervalSegment16.getShift();
        long long22 = intervalSegment16.getStart();
        boolean boolean23 = integerInterval2.equals((java.lang.Object) long22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval19.asList();
        int int23 = integerInterval19.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval19.asList();
        int int25 = integerInterval19.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval19.asList();
        boolean boolean28 = integerInterval19.contains((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = integerInterval19.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("97-32");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean6 = integerInterval4.contains((int) (short) 100);
        java.lang.String str7 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 1);
        int int13 = integerInterval4.compareTo(integerInterval10);
        java.lang.String str14 = integerInterval10.asString();
        java.lang.String str15 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str19 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean23 = integerInterval18.intersects(integerInterval22);
        boolean boolean25 = integerInterval22.contains(0);
        boolean boolean26 = integerInterval10.intersects(integerInterval22);
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 100);
        java.lang.String str35 = integerInterval32.toString();
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean40 = integerInterval38.contains((int) (short) 1);
        int int41 = integerInterval32.compareTo(integerInterval38);
        java.lang.String str42 = integerInterval38.asString();
        boolean boolean43 = integerInterval29.intersects(integerInterval38);
        com.greplin.interval.IntegerInterval integerInterval45 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean46 = integerInterval38.intersects(integerInterval45);
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval52 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean54 = integerInterval52.contains((int) (short) 100);
        java.lang.String str55 = integerInterval52.toString();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean60 = integerInterval58.contains((int) (short) 1);
        int int61 = integerInterval52.compareTo(integerInterval58);
        java.lang.String str62 = integerInterval58.asString();
        boolean boolean63 = integerInterval49.intersects(integerInterval58);
        com.greplin.interval.IntegerInterval integerInterval65 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean66 = integerInterval58.intersects(integerInterval65);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList67 = integerInterval65.asList();
        int int68 = integerInterval45.compareTo(integerInterval65);
        com.greplin.interval.IntegerInterval integerInterval71 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str72 = integerInterval71.toString();
        java.lang.String str73 = integerInterval71.asString();
        int int74 = integerInterval71.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList75 = integerInterval71.asList();
        com.greplin.interval.IntegerInterval integerInterval78 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str79 = integerInterval78.toString();
        java.lang.String str80 = integerInterval78.asString();
        boolean boolean82 = integerInterval78.contains(10);
        java.lang.String str83 = integerInterval78.toString();
        boolean boolean84 = integerInterval71.intersects(integerInterval78);
        boolean boolean85 = integerInterval65.equals((java.lang.Object) integerInterval78);
        com.google.common.collect.ImmutableList<java.lang.String> strList86 = integerInterval78.asStringList();
        boolean boolean87 = integerInterval22.intersects(integerInterval78);
        int int88 = integerInterval1.compareTo(integerInterval22);
        int int89 = integerInterval22.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{-1--1}" + "'", str19, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(integerInterval45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{10-52}" + "'", str55, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "10-52" + "'", str62, "10-52");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(integerInterval65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(intList67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IntegerInterval{10-52}" + "'", str72, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "10-52" + "'", str73, "10-52");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10 + "'", int74 == 10);
        org.junit.Assert.assertNotNull(intList75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "IntegerInterval{10-52}" + "'", str79, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "10-52" + "'", str80, "10-52");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "IntegerInterval{10-52}" + "'", str83, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains(35);
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        boolean boolean10 = integerInterval5.contains((-1));
        int int11 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval5.asStringList();
        java.lang.String str13 = integerInterval5.asString();
        java.lang.String str14 = integerInterval5.asString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '4');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass8 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 97);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 10);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 100);
        boolean boolean4 = integerInterval2.contains((int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        boolean boolean7 = integerInterval2.contains((int) ' ');
        java.lang.String str8 = integerInterval2.asString();
        java.lang.String str9 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-100" + "'", str8, "-1-100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-100" + "'", str9, "-1-100");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval6.asString();
        java.lang.String str9 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str13 = integerInterval12.asString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str17 = integerInterval16.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean21 = integerInterval16.intersects(integerInterval20);
        boolean boolean23 = integerInterval20.contains(0);
        java.lang.String str24 = integerInterval20.asString();
        boolean boolean25 = integerInterval12.equals((java.lang.Object) integerInterval20);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval20.asList();
        int int27 = integerInterval20.getStart();
        boolean boolean28 = integerInterval6.intersects(integerInterval20);
        java.lang.String str29 = integerInterval6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100--1" + "'", str13, "100--1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1--1}" + "'", str17, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1--1" + "'", str24, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{-1--1}" + "'", str29, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (short) 0);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        boolean boolean6 = integerInterval2.contains((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10-0" + "'", str3, "10-0");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass8 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getStart();
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
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
        boolean boolean18 = integerInterval2.contains((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        java.lang.String str13 = integerInterval2.toString();
        java.lang.String str14 = integerInterval2.toString();
        int int15 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        java.lang.String str16 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        boolean boolean11 = integerInterval6.contains(10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        int int10 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str11 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        int int13 = integerInterval2.getStart();
        boolean boolean15 = integerInterval2.contains((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0-1" + "'", str11, "0-1");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
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
        java.lang.String str23 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval2.asStringList();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
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
        java.lang.Class<?> wildcardClass48 = strList47.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 100);
        java.lang.String str25 = integerInterval22.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean30 = integerInterval28.contains((int) (short) 1);
        int int31 = integerInterval22.compareTo(integerInterval28);
        java.lang.String str32 = integerInterval28.asString();
        boolean boolean33 = integerInterval19.intersects(integerInterval28);
        java.lang.String str34 = integerInterval19.toString();
        java.lang.String str35 = integerInterval19.toString();
        boolean boolean37 = integerInterval19.equals((java.lang.Object) 100);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList41 = integerInterval40.asList();
        int int42 = integerInterval19.compareTo(integerInterval40);
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = integerInterval19.asStringList();
        boolean boolean44 = integerInterval10.intersects(integerInterval19);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList45 = integerInterval10.asList();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intList45);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval2.asStringList();
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
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        java.lang.String str11 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str15 = integerInterval14.toString();
        java.lang.String str16 = integerInterval14.asString();
        int int17 = integerInterval14.getStart();
        java.lang.String str18 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int22 = integerInterval14.compareTo(integerInterval21);
        int int23 = integerInterval2.compareTo(integerInterval21);
        int int24 = integerInterval21.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval21.asStringList();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str29 = integerInterval28.toString();
        int int30 = integerInterval28.getEnd();
        java.lang.String str31 = integerInterval28.asString();
        java.lang.String str32 = integerInterval28.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = integerInterval28.asStringList();
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 10);
        com.greplin.interval.IntegerInterval integerInterval39 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 100);
        int int40 = integerInterval39.getEnd();
        boolean boolean41 = integerInterval36.equals((java.lang.Object) integerInterval39);
        boolean boolean42 = integerInterval28.equals((java.lang.Object) integerInterval36);
        boolean boolean43 = integerInterval21.equals((java.lang.Object) integerInterval28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        int int8 = integerInterval5.getStart();
        int int9 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval5.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 52);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
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
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) -1);
        boolean boolean32 = integerInterval14.intersects(integerInterval31);
        int int33 = integerInterval31.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        int int13 = integerInterval8.getStart();
        boolean boolean15 = integerInterval8.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(100, (int) '#');
        java.lang.String str19 = integerInterval18.asString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval(32, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval22.asList();
        int int24 = integerInterval22.getEnd();
        int int25 = integerInterval18.compareTo(integerInterval22);
        java.lang.String str26 = integerInterval22.asString();
        boolean boolean27 = integerInterval8.intersects(integerInterval22);
        java.lang.String str28 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100-35" + "'", str19, "100-35");
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "32--1" + "'", str26, "32--1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
        java.lang.String str18 = integerInterval8.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        java.lang.String str14 = integerInterval8.asString();
        int int15 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval8.asStringList();
        int int17 = integerInterval8.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', 97);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(52);
        int int10 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str14 = integerInterval13.toString();
        java.lang.String str15 = integerInterval13.asString();
        boolean boolean17 = integerInterval13.contains(10);
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 100);
        int int23 = integerInterval13.compareTo(integerInterval20);
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        java.lang.String str36 = integerInterval32.asString();
        int int37 = integerInterval32.getStart();
        boolean boolean38 = integerInterval13.intersects(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str42 = integerInterval41.toString();
        boolean boolean43 = integerInterval32.intersects(integerInterval41);
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) '4');
        boolean boolean47 = integerInterval32.equals((java.lang.Object) integerInterval46);
        boolean boolean48 = integerInterval2.intersects(integerInterval46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "IntegerInterval{1-1}" + "'", str42, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
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
        boolean boolean22 = integerInterval2.contains((int) (short) 1);
        java.lang.String str23 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 32);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 0);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval5.getEnd();
        java.lang.String str8 = integerInterval5.asString();
        int int9 = integerInterval5.getStart();
        int int10 = integerInterval5.getStart();
        java.lang.String str11 = integerInterval5.toString();
        boolean boolean12 = integerInterval2.intersects(integerInterval5);
        boolean boolean14 = integerInterval2.contains((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass10 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 97);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) 10);
        boolean boolean6 = integerInterval2.intersects(integerInterval5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (byte) 1);
        boolean boolean4 = integerInterval2.contains(0);
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        java.lang.String str8 = integerInterval2.asString();
        java.lang.String str9 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100-1" + "'", str8, "100-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100-1" + "'", str9, "100-1");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        boolean boolean4 = integerInterval1.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval1.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 0);
        java.lang.String str6 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval8 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int9 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval8.asList();
        int int11 = integerInterval8.getEnd();
        int int12 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval8.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
        org.junit.Assert.assertNotNull(integerInterval8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
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
        java.lang.String str24 = integerInterval11.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval11.asStringList();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1--1" + "'", str24, "-1--1");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        int int10 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str11 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        java.lang.String str13 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0-1" + "'", str11, "0-1");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{0-1}" + "'", str13, "IntegerInterval{0-1}");
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
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
        java.lang.String str23 = integerInterval2.toString();
        boolean boolean25 = integerInterval2.contains((-1));
        int int26 = integerInterval2.getEnd();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1-100");
        int int2 = integerInterval1.getStart();
        int int3 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) 'a');
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-97}" + "'", str3, "IntegerInterval{0-97}");
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 32);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{100-32}" + "'", str3, "IntegerInterval{100-32}");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 0);
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str7 = integerInterval6.toString();
        java.lang.String str8 = integerInterval6.asString();
        boolean boolean9 = integerInterval2.intersects(integerInterval6);
        java.lang.String str10 = integerInterval2.asString();
        int int11 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1-0" + "'", str10, "1-0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        int int11 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        int int13 = integerInterval8.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 10);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval5.getEnd();
        java.lang.String str8 = integerInterval5.asString();
        int int9 = integerInterval5.getEnd();
        int int10 = integerInterval5.getEnd();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str14 = integerInterval13.toString();
        int int15 = integerInterval13.getEnd();
        java.lang.String str16 = integerInterval13.asString();
        java.lang.String str17 = integerInterval13.asString();
        int int18 = integerInterval13.getEnd();
        int int19 = integerInterval5.compareTo(integerInterval13);
        int int20 = integerInterval2.compareTo(integerInterval13);
        java.lang.String str21 = integerInterval13.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval13.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (byte) 1);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 100);
        int int6 = integerInterval2.getEnd();
        boolean boolean8 = integerInterval2.contains((-1));
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32-1" + "'", str3, "32-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        java.lang.Object obj5 = null;
        boolean boolean6 = integerInterval1.equals(obj5);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
        java.lang.String str28 = integerInterval21.toString();
        int int29 = integerInterval21.getEnd();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        int int4 = integerInterval1.getEnd();
        int int5 = integerInterval1.getStart();
        com.greplin.interval.IntegerInterval integerInterval7 = com.greplin.interval.IntegerInterval.valueOf("35-52");
        boolean boolean8 = integerInterval1.equals((java.lang.Object) integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(integerInterval7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 100);
        int int10 = integerInterval2.compareTo(integerInterval9);
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getStart();
        int int13 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (byte) 0);
        int int3 = integerInterval2.getStart();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (-1));
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        java.lang.String str9 = integerInterval5.toString();
        java.lang.String str10 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str14 = integerInterval13.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval13.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval13.asList();
        boolean boolean17 = integerInterval5.intersects(integerInterval13);
        java.lang.String str18 = integerInterval13.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval13.asStringList();
        int int20 = integerInterval13.getStart();
        int int21 = integerInterval2.compareTo(integerInterval13);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval13.asStringList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 0);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, 35);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 0);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{97-0}" + "'", str3, "IntegerInterval{97-0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97-0" + "'", str4, "97-0");
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        boolean boolean36 = integerInterval25.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList37 = integerInterval25.asList();
        java.lang.String str38 = integerInterval25.toString();
        int int39 = integerInterval25.getEnd();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (short) -1);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) '#');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
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
        int int56 = integerInterval52.getStart();
        com.greplin.interval.IntervalSegment intervalSegment59 = new com.greplin.interval.IntervalSegment((long) 35, 0);
        int int60 = intervalSegment59.getShift();
        int int61 = intervalSegment59.getShift();
        boolean boolean62 = integerInterval52.equals((java.lang.Object) intervalSegment59);
        long long63 = intervalSegment59.getStart();
        int int64 = intervalSegment59.getShift();
        long long65 = intervalSegment59.getStart();
        long long66 = intervalSegment59.getStart();
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 35L + "'", long63 == 35L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 35L + "'", long65 == 35L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 35L + "'", long66 == 35L);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 0);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 52);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (-1));
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str11 = integerInterval10.asString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str15 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean19 = integerInterval14.intersects(integerInterval18);
        boolean boolean21 = integerInterval18.contains(0);
        java.lang.String str22 = integerInterval18.asString();
        boolean boolean23 = integerInterval10.equals((java.lang.Object) integerInterval18);
        int int24 = integerInterval7.compareTo(integerInterval10);
        int int25 = integerInterval2.compareTo(integerInterval7);
        java.lang.String str26 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass28 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32--1}" + "'", str3, "IntegerInterval{32--1}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100--1" + "'", str11, "100--1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1--1" + "'", str22, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{32--1}" + "'", str26, "IntegerInterval{32--1}");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval10 = com.greplin.interval.IntegerInterval.valueOf("0-32");
        boolean boolean11 = integerInterval2.equals((java.lang.Object) integerInterval10);
        boolean boolean13 = integerInterval10.contains(0);
        int int14 = integerInterval10.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval10.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertNotNull(integerInterval10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (byte) 1);
        boolean boolean4 = integerInterval2.contains(0);
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        boolean boolean8 = integerInterval2.contains((int) (byte) 0);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str12 = integerInterval11.toString();
        java.lang.String str13 = integerInterval11.asString();
        boolean boolean15 = integerInterval11.contains(10);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 100);
        int int21 = integerInterval11.compareTo(integerInterval18);
        int int22 = integerInterval18.getEnd();
        java.lang.String str23 = integerInterval18.asString();
        int int24 = integerInterval18.getStart();
        boolean boolean25 = integerInterval2.intersects(integerInterval18);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval18.asStringList();
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 100);
        java.lang.String str32 = integerInterval29.toString();
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str39 = integerInterval38.toString();
        int int40 = integerInterval35.compareTo(integerInterval38);
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = integerInterval38.asStringList();
        boolean boolean42 = integerInterval29.intersects(integerInterval38);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList43 = integerInterval29.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList44 = integerInterval29.asList();
        int int45 = integerInterval29.getStart();
        int int46 = integerInterval18.compareTo(integerInterval29);
        java.lang.String str47 = integerInterval18.asString();
        java.lang.Class<?> wildcardClass48 = integerInterval18.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10-52" + "'", str23, "10-52");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{10-52}" + "'", str32, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{-1--1}" + "'", str39, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intList43);
        org.junit.Assert.assertNotNull(intList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10-52" + "'", str47, "10-52");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 1);
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
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        int int9 = integerInterval5.getEnd();
        int int10 = integerInterval5.getEnd();
        boolean boolean12 = integerInterval5.contains((int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval5.asStringList();
        int int14 = integerInterval2.compareTo(integerInterval5);
        int int15 = integerInterval2.getStart();
        int int16 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str6 = integerInterval5.asString();
        int int7 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval5.asList();
        java.lang.String str9 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str13 = integerInterval12.asString();
        int int14 = integerInterval12.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval12.asList();
        java.lang.String str16 = integerInterval12.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = integerInterval12.asStringList();
        boolean boolean18 = integerInterval5.equals((java.lang.Object) integerInterval12);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval5.asStringList();
        boolean boolean20 = integerInterval2.equals((java.lang.Object) integerInterval5);
        java.lang.String str21 = integerInterval5.asString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1-52}" + "'", str9, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1-52" + "'", str13, "-1-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1-52}" + "'", str16, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1-52" + "'", str21, "-1-52");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval8.asList();
        com.greplin.interval.IntervalSegment intervalSegment16 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int17 = intervalSegment16.getShift();
        long long18 = intervalSegment16.getStart();
        boolean boolean19 = integerInterval8.equals((java.lang.Object) long18);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str23 = integerInterval22.toString();
        boolean boolean25 = integerInterval22.contains(52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval22.asList();
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        boolean boolean28 = integerInterval8.equals((java.lang.Object) intList26);
        java.lang.String str29 = integerInterval8.toString();
        boolean boolean31 = integerInterval8.contains(1);
        java.lang.String str32 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{10-52}" + "'", str32, "IntegerInterval{10-52}");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
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
        int int16 = integerInterval6.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, 0);
        boolean boolean4 = integerInterval2.contains((int) '#');
        boolean boolean6 = integerInterval2.contains((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval10.asStringList();
        java.lang.String str17 = integerInterval10.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval10.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval10.asStringList();
        int int20 = integerInterval10.getEnd();
        java.lang.String str21 = integerInterval10.toString();
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
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
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
        java.lang.Class<?> wildcardClass39 = integerInterval32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass13 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        boolean boolean7 = integerInterval2.contains(32);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass10 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 1);
        int int14 = integerInterval5.compareTo(integerInterval11);
        java.lang.String str15 = integerInterval11.asString();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        int int17 = integerInterval2.getEnd();
        int int18 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        boolean boolean4 = integerInterval2.contains((int) (short) 0);
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getStart();
        boolean boolean8 = integerInterval2.contains((int) (byte) 1);
        java.lang.String str9 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1-32" + "'", str9, "1-32");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains((int) (byte) 1);
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{1-35}" + "'", str6, "IntegerInterval{1-35}");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.asString();
        boolean boolean5 = integerInterval1.contains((int) (short) 10);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str9 = integerInterval8.toString();
        java.lang.String str10 = integerInterval8.asString();
        boolean boolean12 = integerInterval8.contains(10);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        int int18 = integerInterval8.compareTo(integerInterval15);
        boolean boolean19 = integerInterval1.intersects(integerInterval8);
        com.greplin.interval.IntervalSegment intervalSegment22 = new com.greplin.interval.IntervalSegment(10L, (int) ' ');
        long long23 = intervalSegment22.getStart();
        boolean boolean24 = integerInterval8.equals((java.lang.Object) long23);
        int int25 = integerInterval8.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) '#');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
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
        boolean boolean36 = integerInterval25.contains((int) (short) -1);
        int int37 = integerInterval25.getEnd();
        java.lang.Class<?> wildcardClass38 = integerInterval25.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
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
        java.lang.String str27 = integerInterval21.toString();
        java.lang.String str28 = integerInterval21.toString();
        java.lang.String str29 = integerInterval21.asString();
        java.lang.String str30 = integerInterval21.asString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{-1--1}" + "'", str27, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{-1--1}" + "'", str28, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1--1" + "'", str29, "-1--1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1--1" + "'", str30, "-1--1");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval5.asStringList();
        int int12 = integerInterval5.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str17 = integerInterval16.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean21 = integerInterval16.intersects(integerInterval20);
        boolean boolean23 = integerInterval20.contains(0);
        boolean boolean24 = integerInterval8.intersects(integerInterval20);
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 100);
        java.lang.String str33 = integerInterval30.toString();
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean38 = integerInterval36.contains((int) (short) 1);
        int int39 = integerInterval30.compareTo(integerInterval36);
        java.lang.String str40 = integerInterval36.asString();
        boolean boolean41 = integerInterval27.intersects(integerInterval36);
        com.greplin.interval.IntegerInterval integerInterval43 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean44 = integerInterval36.intersects(integerInterval43);
        com.greplin.interval.IntegerInterval integerInterval47 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean52 = integerInterval50.contains((int) (short) 100);
        java.lang.String str53 = integerInterval50.toString();
        com.greplin.interval.IntegerInterval integerInterval56 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean58 = integerInterval56.contains((int) (short) 1);
        int int59 = integerInterval50.compareTo(integerInterval56);
        java.lang.String str60 = integerInterval56.asString();
        boolean boolean61 = integerInterval47.intersects(integerInterval56);
        com.greplin.interval.IntegerInterval integerInterval63 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean64 = integerInterval56.intersects(integerInterval63);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList65 = integerInterval63.asList();
        int int66 = integerInterval43.compareTo(integerInterval63);
        com.greplin.interval.IntegerInterval integerInterval69 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str70 = integerInterval69.toString();
        java.lang.String str71 = integerInterval69.asString();
        int int72 = integerInterval69.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList73 = integerInterval69.asList();
        com.greplin.interval.IntegerInterval integerInterval76 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str77 = integerInterval76.toString();
        java.lang.String str78 = integerInterval76.asString();
        boolean boolean80 = integerInterval76.contains(10);
        java.lang.String str81 = integerInterval76.toString();
        boolean boolean82 = integerInterval69.intersects(integerInterval76);
        boolean boolean83 = integerInterval63.equals((java.lang.Object) integerInterval76);
        com.google.common.collect.ImmutableList<java.lang.String> strList84 = integerInterval76.asStringList();
        boolean boolean85 = integerInterval20.intersects(integerInterval76);
        boolean boolean87 = integerInterval20.contains((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1--1}" + "'", str17, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10-52" + "'", str40, "10-52");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(integerInterval43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "IntegerInterval{10-52}" + "'", str53, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "10-52" + "'", str60, "10-52");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(integerInterval63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IntegerInterval{10-52}" + "'", str70, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "10-52" + "'", str71, "10-52");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(intList73);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "IntegerInterval{10-52}" + "'", str77, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "10-52" + "'", str78, "10-52");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "IntegerInterval{10-52}" + "'", str81, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 97);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval6.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval6.asList();
        java.lang.String str10 = integerInterval6.toString();
        int int11 = integerInterval6.getStart();
        java.lang.String str12 = integerInterval6.asString();
        int int13 = integerInterval6.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1--1" + "'", str12, "-1--1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
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
        java.lang.String str57 = integerInterval6.toString();
        java.lang.String str58 = integerInterval6.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList59 = integerInterval6.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList60 = integerInterval6.asStringList();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "IntegerInterval{-1--1}" + "'", str57, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "IntegerInterval{-1--1}" + "'", str58, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        int int3 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        boolean boolean6 = integerInterval1.contains((-1));
        java.lang.String str7 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 10);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        boolean boolean8 = integerInterval2.contains((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
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
        int int24 = integerInterval11.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval11.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval11.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval11.asStringList();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 100);
        java.lang.String str33 = integerInterval30.toString();
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean38 = integerInterval36.contains((int) (short) 1);
        int int39 = integerInterval30.compareTo(integerInterval36);
        com.google.common.collect.ImmutableList<java.lang.String> strList40 = integerInterval36.asStringList();
        java.lang.String str41 = integerInterval36.asString();
        int int42 = integerInterval36.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList43 = integerInterval36.asList();
        int int44 = integerInterval11.compareTo(integerInterval36);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10-52" + "'", str41, "10-52");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        java.lang.String str11 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str15 = integerInterval14.toString();
        java.lang.String str16 = integerInterval14.asString();
        int int17 = integerInterval14.getStart();
        java.lang.String str18 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int22 = integerInterval14.compareTo(integerInterval21);
        int int23 = integerInterval2.compareTo(integerInterval21);
        int int24 = integerInterval21.getEnd();
        java.lang.Class<?> wildcardClass25 = integerInterval21.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("32-1");
        java.lang.String str2 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32-1" + "'", str2, "32-1");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        int int9 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        int int14 = integerInterval2.getStart();
        java.lang.String str15 = integerInterval2.asString();
        java.lang.String str16 = integerInterval2.asString();
        java.lang.String str17 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-0" + "'", str15, "1-0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1-0" + "'", str16, "1-0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{1-0}" + "'", str17, "IntegerInterval{1-0}");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) 'a');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intList11);
    }
}

