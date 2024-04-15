package com.greplin.interval;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        int int22 = integerInterval8.getStart();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        int int10 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str11 = integerInterval5.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval5.asStringList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1-100");
        int int2 = integerInterval1.getStart();
        java.lang.Class<?> wildcardClass3 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getEnd();
        boolean boolean10 = integerInterval2.contains((int) (byte) 100);
        java.lang.String str11 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) -1);
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52--1" + "'", str4, "52--1");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        boolean boolean20 = integerInterval2.contains(97);
        boolean boolean22 = integerInterval2.contains((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (short) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1--1" + "'", str4, "-1--1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        com.greplin.interval.IntervalSegment intervalSegment34 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '4');
        int int35 = intervalSegment34.getShift();
        long long36 = intervalSegment34.getStart();
        boolean boolean37 = integerInterval2.equals((java.lang.Object) intervalSegment34);
        int int38 = intervalSegment34.getShift();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-100");
        int int2 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        boolean boolean26 = integerInterval11.contains((int) (byte) 0);
        java.lang.String str27 = integerInterval11.asString();
        java.lang.String str28 = integerInterval11.toString();
        int int29 = integerInterval11.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1--1" + "'", str27, "-1--1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{-1--1}" + "'", str28, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 0);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32-0" + "'", str3, "32-0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32-0" + "'", str4, "32-0");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getStart();
        int int7 = integerInterval2.getStart();
        int int8 = integerInterval2.getEnd();
        boolean boolean10 = integerInterval2.contains((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        int int3 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        java.lang.String str5 = integerInterval1.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 1);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval(0, (int) '#');
        java.lang.String str23 = integerInterval22.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval22.asList();
        boolean boolean25 = integerInterval8.intersects(integerInterval22);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval8.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{0-35}" + "'", str23, "IntegerInterval{0-35}");
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.lang.String str18 = integerInterval10.asString();
        java.lang.String str19 = integerInterval10.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        int int10 = integerInterval2.compareTo(integerInterval5);
        boolean boolean12 = integerInterval2.contains(52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        boolean boolean6 = integerInterval2.contains(1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-1}" + "'", str3, "IntegerInterval{1-1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{1-1}" + "'", str4, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        java.lang.String str7 = integerInterval2.toString();
        int int8 = integerInterval2.getStart();
        int int9 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) -1);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains(32);
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) '#');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        java.lang.String str5 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-35}" + "'", str3, "IntegerInterval{-1-35}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-35}" + "'", str5, "IntegerInterval{-1-35}");
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        java.lang.String str14 = integerInterval2.asString();
        java.lang.String str15 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval(10, (int) '4');
        int int19 = integerInterval2.compareTo(integerInterval18);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((-1), 0);
        int int23 = integerInterval2.compareTo(integerInterval22);
        int int24 = integerInterval22.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1-0" + "'", str14, "1-0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{1-0}" + "'", str15, "IntegerInterval{1-0}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        int int20 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        int int13 = integerInterval8.getStart();
        boolean boolean15 = integerInterval8.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{32-10}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{32\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        java.lang.String str29 = integerInterval28.toString();
        com.greplin.interval.IntervalSegment intervalSegment32 = new com.greplin.interval.IntervalSegment((long) 52, (int) (short) 10);
        boolean boolean33 = integerInterval28.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass34 = integerInterval28.getClass();
        boolean boolean35 = integerInterval20.equals((java.lang.Object) integerInterval28);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{1-32}" + "'", str29, "IntegerInterval{1-32}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) ' ');
        boolean boolean4 = integerInterval2.contains((int) (short) 0);
        boolean boolean6 = integerInterval2.contains((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.toString();
        boolean boolean12 = integerInterval2.contains((int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        java.lang.String str18 = integerInterval15.asString();
        java.lang.String str19 = integerInterval15.asString();
        boolean boolean20 = integerInterval2.intersects(integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) '4');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 97);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        boolean boolean4 = integerInterval2.contains((int) ' ');
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        java.lang.String str20 = integerInterval16.asString();
        boolean boolean21 = integerInterval7.intersects(integerInterval16);
        com.greplin.interval.IntegerInterval integerInterval23 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean24 = integerInterval16.intersects(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval23.asList();
        boolean boolean26 = integerInterval2.intersects(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval23.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(integerInterval23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        int int48 = integerInterval33.getStart();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        long long12 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass13 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) (short) 10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 32);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-100");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.lang.String str23 = integerInterval8.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        com.greplin.interval.IntervalSegment intervalSegment34 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '4');
        int int35 = intervalSegment34.getShift();
        long long36 = intervalSegment34.getStart();
        boolean boolean37 = integerInterval2.equals((java.lang.Object) intervalSegment34);
        long long38 = intervalSegment34.getStart();
        int int39 = intervalSegment34.getShift();
        int int40 = intervalSegment34.getShift();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        java.lang.String str9 = integerInterval5.asString();
        java.lang.String str10 = integerInterval5.asString();
        int int11 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval5.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-97");
        java.lang.Class<?> wildcardClass2 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (short) 0);
        int int3 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str7 = integerInterval6.asString();
        int int8 = integerInterval6.getEnd();
        java.lang.String str9 = integerInterval6.toString();
        int int10 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval6.asList();
        boolean boolean12 = integerInterval2.intersects(integerInterval6);
        int int13 = integerInterval6.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1-52}" + "'", str9, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, 52);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 32);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        int int4 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval1.asStringList();
        java.lang.String str6 = integerInterval1.toString();
        int int7 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-1}" + "'", str6, "IntegerInterval{10-1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 100);
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) 'a', 0);
        boolean boolean8 = integerInterval6.contains(1);
        int int9 = integerInterval2.compareTo(integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 32);
        com.greplin.interval.IntegerInterval integerInterval3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = integerInterval2.intersects(integerInterval3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        java.lang.String str18 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 1);
        int int24 = integerInterval15.compareTo(integerInterval21);
        java.lang.String str25 = integerInterval21.asString();
        boolean boolean26 = integerInterval12.intersects(integerInterval21);
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean31 = integerInterval29.contains((int) (short) 100);
        java.lang.String str32 = integerInterval29.toString();
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean37 = integerInterval35.contains((int) (short) 1);
        int int38 = integerInterval29.compareTo(integerInterval35);
        java.lang.String str39 = integerInterval35.asString();
        int int40 = integerInterval35.getEnd();
        boolean boolean41 = integerInterval12.equals((java.lang.Object) int40);
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = integerInterval12.asStringList();
        int int43 = integerInterval12.getEnd();
        boolean boolean45 = integerInterval12.contains((int) '4');
        int int46 = integerInterval5.compareTo(integerInterval12);
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = integerInterval12.asStringList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{10-52}" + "'", str32, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10-52" + "'", str39, "10-52");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 10);
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (-1));
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass10 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.asString();
        boolean boolean5 = integerInterval1.contains((int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) (byte) 1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        int int9 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass10 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, 10);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) 'a');
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        boolean boolean4 = integerInterval2.contains((-1));
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        boolean boolean8 = integerInterval2.equals((java.lang.Object) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval(0, (int) (short) -1);
        java.lang.String str12 = integerInterval11.asString();
        boolean boolean13 = integerInterval2.intersects(integerInterval11);
        boolean boolean15 = integerInterval2.contains(100);
        int int16 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0--1" + "'", str12, "0--1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 100);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{97-100}" + "'", str3, "IntegerInterval{97-100}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97-100" + "'", str4, "97-100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        java.lang.String str9 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        boolean boolean15 = integerInterval2.contains((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str8 = integerInterval7.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean12 = integerInterval7.intersects(integerInterval11);
        boolean boolean14 = integerInterval11.contains(0);
        int int15 = integerInterval11.getEnd();
        java.lang.String str16 = integerInterval11.toString();
        boolean boolean18 = integerInterval11.contains((-1));
        boolean boolean19 = integerInterval2.intersects(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval2.asStringList();
        boolean boolean22 = integerInterval2.contains((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-10}" + "'", str4, "IntegerInterval{52-10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 35);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-35" + "'", str3, "1-35");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1-35" + "'", str5, "1-35");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        int int55 = integerInterval41.getStart();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        java.lang.Class<?> wildcardClass22 = integerInterval18.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) 10);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-10" + "'", str3, "-1-10");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        java.lang.Object obj11 = null;
        boolean boolean12 = integerInterval1.equals(obj11);
        int int13 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        boolean boolean7 = integerInterval2.contains(52);
        java.lang.String str8 = integerInterval2.toString();
        int int9 = integerInterval2.getEnd();
        java.lang.String str10 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        boolean boolean6 = integerInterval2.contains((-1));
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, 97);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains(0);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval6.getEnd();
        int int9 = integerInterval6.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        java.lang.String str18 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 1);
        int int24 = integerInterval15.compareTo(integerInterval21);
        java.lang.String str25 = integerInterval21.asString();
        boolean boolean26 = integerInterval12.intersects(integerInterval21);
        boolean boolean28 = integerInterval21.contains(0);
        java.lang.String str29 = integerInterval21.toString();
        boolean boolean30 = integerInterval2.equals((java.lang.Object) integerInterval21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1--1");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        java.lang.String str3 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1--1" + "'", str3, "1--1");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 10);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, 35);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        boolean boolean9 = integerInterval6.contains(52);
        java.lang.String str10 = integerInterval6.asString();
        boolean boolean12 = integerInterval6.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = integerInterval2.intersects(integerInterval6);
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 100);
        java.lang.String str19 = integerInterval16.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 1);
        int int25 = integerInterval16.compareTo(integerInterval22);
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean30 = integerInterval28.contains((int) (short) 100);
        java.lang.String str31 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean36 = integerInterval34.contains((int) (short) 1);
        int int37 = integerInterval28.compareTo(integerInterval34);
        java.lang.String str38 = integerInterval34.asString();
        java.lang.String str39 = integerInterval34.toString();
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str43 = integerInterval42.toString();
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean47 = integerInterval42.intersects(integerInterval46);
        boolean boolean49 = integerInterval46.contains(0);
        boolean boolean50 = integerInterval34.intersects(integerInterval46);
        int int51 = integerInterval22.compareTo(integerInterval46);
        com.greplin.interval.IntegerInterval integerInterval54 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str55 = integerInterval54.asString();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str59 = integerInterval58.toString();
        com.greplin.interval.IntegerInterval integerInterval62 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean63 = integerInterval58.intersects(integerInterval62);
        boolean boolean65 = integerInterval62.contains(0);
        java.lang.String str66 = integerInterval62.asString();
        boolean boolean67 = integerInterval54.equals((java.lang.Object) integerInterval62);
        boolean boolean68 = integerInterval46.intersects(integerInterval62);
        boolean boolean69 = integerInterval2.equals((java.lang.Object) boolean68);
        int int70 = integerInterval2.getEnd();
        java.lang.String str71 = integerInterval2.toString();
        boolean boolean73 = integerInterval2.contains(1);
        java.lang.Class<?> wildcardClass74 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{10-52}" + "'", str39, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{-1--1}" + "'", str43, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "100--1" + "'", str55, "100--1");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{-1--1}" + "'", str59, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "-1--1" + "'", str66, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IntegerInterval{100--1}" + "'", str71, "IntegerInterval{100--1}");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        java.lang.Object obj15 = null;
        boolean boolean16 = integerInterval8.equals(obj15);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        java.lang.String str30 = integerInterval25.asString();
        java.lang.String str31 = integerInterval25.toString();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean36 = integerInterval34.contains((int) (short) 100);
        java.lang.String str37 = integerInterval34.toString();
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean42 = integerInterval40.contains((int) (short) 1);
        int int43 = integerInterval34.compareTo(integerInterval40);
        java.lang.String str44 = integerInterval40.asString();
        java.lang.String str45 = integerInterval40.asString();
        int int46 = integerInterval25.compareTo(integerInterval40);
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str50 = integerInterval49.toString();
        java.lang.String str51 = integerInterval49.asString();
        boolean boolean53 = integerInterval49.contains(10);
        java.lang.String str54 = integerInterval49.toString();
        boolean boolean55 = integerInterval25.intersects(integerInterval49);
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean59 = integerInterval49.intersects(integerInterval58);
        boolean boolean60 = integerInterval8.intersects(integerInterval58);
        int int61 = integerInterval8.getStart();
        boolean boolean63 = integerInterval8.contains((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10-52" + "'", str44, "10-52");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10-52" + "'", str45, "10-52");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10-52" + "'", str51, "10-52");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 100);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.lang.Class<?> wildcardClass20 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str10 = integerInterval9.toString();
        java.lang.String str11 = integerInterval9.asString();
        boolean boolean13 = integerInterval9.contains(10);
        java.lang.String str14 = integerInterval9.toString();
        boolean boolean15 = integerInterval2.intersects(integerInterval9);
        com.greplin.interval.IntegerInterval integerInterval17 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str21 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean25 = integerInterval20.intersects(integerInterval24);
        int int26 = integerInterval17.compareTo(integerInterval24);
        java.lang.Object obj27 = null;
        boolean boolean28 = integerInterval17.equals(obj27);
        int int29 = integerInterval9.compareTo(integerInterval17);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        int int33 = integerInterval32.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList34 = integerInterval32.asList();
        java.lang.String str35 = integerInterval32.asString();
        int int36 = integerInterval9.compareTo(integerInterval32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(integerInterval17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{-1--1}" + "'", str21, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10-52" + "'", str35, "10-52");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 52);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32-52}" + "'", str3, "IntegerInterval{32-52}");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.asString();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.asString();
        int int11 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-52" + "'", str9, "-1-52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-52" + "'", str10, "-1-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval10.asList();
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
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
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        int int4 = integerInterval1.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) -1);
        long long8 = intervalSegment7.getStart();
        boolean boolean9 = integerInterval1.equals((java.lang.Object) long8);
        java.lang.String str10 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.contains((int) (short) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = integerInterval2.equals(obj5);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList56 = integerInterval48.asList();
        int int57 = integerInterval48.getStart();
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
        org.junit.Assert.assertNotNull(intList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 32);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.Class<?> wildcardClass30 = strList29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{35-100}" + "'", str4, "IntegerInterval{35-100}");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        boolean boolean22 = integerInterval18.contains(100);
        java.lang.String str23 = integerInterval18.asString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1--1" + "'", str23, "-1--1");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, 35);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        int int27 = integerInterval11.getEnd();
        java.lang.String str28 = integerInterval11.asString();
        java.lang.String str29 = integerInterval11.asString();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (int) 'a');
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) '4');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval5.getEnd();
        java.lang.String str12 = integerInterval5.asString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 35);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 10);
        boolean boolean4 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval(1, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval7.asStringList();
        int int9 = integerInterval7.getEnd();
        boolean boolean11 = integerInterval7.contains((-1));
        int int12 = integerInterval2.compareTo(integerInterval7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 35);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 32);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        int int25 = integerInterval8.getEnd();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-35");
        com.greplin.interval.IntegerInterval integerInterval2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = integerInterval1.compareTo(integerInterval2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerInterval1);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 97);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) 'a');
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getEnd();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (byte) -1);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        int int3 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = integerInterval1.compareTo(integerInterval5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 1);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        boolean boolean47 = integerInterval18.contains((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        boolean boolean4 = integerInterval2.contains(97);
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{0-1}" + "'", str6, "IntegerInterval{0-1}");
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 100);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getStart();
        boolean boolean6 = integerInterval2.contains(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 100);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.lang.Class<?> wildcardClass16 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1-0" + "'", str14, "1-0");
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        int int7 = integerInterval1.compareTo(integerInterval5);
        int int8 = integerInterval5.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = integerInterval32.asStringList();
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
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean11 = integerInterval6.intersects(integerInterval10);
        boolean boolean13 = integerInterval10.contains(0);
        java.lang.String str14 = integerInterval10.asString();
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval10);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 100);
        java.lang.String str24 = integerInterval21.toString();
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean29 = integerInterval27.contains((int) (short) 1);
        int int30 = integerInterval21.compareTo(integerInterval27);
        java.lang.String str31 = integerInterval27.asString();
        boolean boolean32 = integerInterval18.intersects(integerInterval27);
        com.greplin.interval.IntegerInterval integerInterval34 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean35 = integerInterval27.intersects(integerInterval34);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval34.asList();
        boolean boolean37 = integerInterval2.equals((java.lang.Object) integerInterval34);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str41 = integerInterval40.toString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean45 = integerInterval40.intersects(integerInterval44);
        java.lang.String str46 = integerInterval44.asString();
        java.lang.String str47 = integerInterval44.toString();
        boolean boolean48 = integerInterval34.equals((java.lang.Object) str47);
        com.greplin.interval.IntegerInterval integerInterval51 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean53 = integerInterval51.contains((int) (short) 100);
        java.lang.String str54 = integerInterval51.toString();
        com.greplin.interval.IntegerInterval integerInterval57 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean59 = integerInterval57.contains((int) (short) 1);
        int int60 = integerInterval51.compareTo(integerInterval57);
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = integerInterval57.asStringList();
        java.lang.String str62 = integerInterval57.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList63 = integerInterval57.asStringList();
        java.lang.Object obj64 = null;
        boolean boolean65 = integerInterval57.equals(obj64);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList66 = integerInterval57.asList();
        boolean boolean67 = integerInterval34.equals((java.lang.Object) integerInterval57);
        java.lang.String str68 = integerInterval57.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(integerInterval34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{-1--1}" + "'", str41, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1--1" + "'", str46, "-1--1");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "IntegerInterval{-1--1}" + "'", str47, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "10-52" + "'", str62, "10-52");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "IntegerInterval{10-52}" + "'", str68, "IntegerInterval{10-52}");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        int int14 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        boolean boolean4 = integerInterval2.contains((int) (byte) -1);
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{0-35}" + "'", str5, "IntegerInterval{0-35}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{0-35}" + "'", str6, "IntegerInterval{0-35}");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        int int9 = integerInterval2.getStart();
        int int10 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1-52}" + "'", str7, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList94 = integerInterval2.asStringList();
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
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 100);
        int int14 = integerInterval2.compareTo(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) '#', 10);
        java.lang.String str18 = integerInterval17.toString();
        boolean boolean19 = integerInterval11.intersects(integerInterval17);
        int int20 = integerInterval11.getStart();
        int int21 = integerInterval11.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{35-10}" + "'", str18, "IntegerInterval{35-10}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        int int24 = integerInterval9.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval9.asList();
        int int26 = integerInterval9.getStart();
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
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) 100);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-100" + "'", str3, "100-100");
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        boolean boolean4 = integerInterval2.contains(97);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval7 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int8 = integerInterval7.getEnd();
        java.lang.String str9 = integerInterval7.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval7.asList();
        int int11 = integerInterval2.compareTo(integerInterval7);
        java.lang.String str12 = integerInterval7.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(integerInterval7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1-52}" + "'", str9, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-52" + "'", str12, "-1-52");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        java.lang.String str9 = integerInterval5.asString();
        java.lang.String str10 = integerInterval5.asString();
        int int11 = integerInterval5.getStart();
        java.lang.Class<?> wildcardClass12 = integerInterval5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        boolean boolean12 = integerInterval5.contains((int) '4');
        boolean boolean13 = integerInterval2.intersects(integerInterval5);
        java.lang.String str14 = integerInterval2.asString();
        java.lang.String str15 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1-0" + "'", str14, "1-0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{1-0}" + "'", str15, "IntegerInterval{1-0}");
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, 100);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 32);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        boolean boolean20 = integerInterval2.contains(97);
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval2.asStringList();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval18.asList();
        java.lang.String str23 = integerInterval18.toString();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) ' ');
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) '4');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (-1));
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 52);
        boolean boolean4 = integerInterval2.contains(1);
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.toString();
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52--1" + "'", str3, "52--1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52--1}" + "'", str4, "IntegerInterval{52--1}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 97);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{32-52}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{32\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 52);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        boolean boolean12 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (byte) 10);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean10 = integerInterval5.intersects(integerInterval9);
        boolean boolean11 = integerInterval2.equals((java.lang.Object) boolean10);
        int int12 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        java.lang.String str14 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{97-1}" + "'", str14, "IntegerInterval{97-1}");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) '4');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-10");
        java.lang.String str2 = integerInterval1.asString();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval5.getStart();
        com.greplin.interval.IntervalSegment intervalSegment10 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int11 = intervalSegment10.getShift();
        int int12 = intervalSegment10.getShift();
        int int13 = intervalSegment10.getShift();
        long long14 = intervalSegment10.getStart();
        boolean boolean15 = integerInterval5.equals((java.lang.Object) long14);
        int int16 = integerInterval5.getStart();
        java.lang.String str17 = integerInterval5.asString();
        int int18 = integerInterval5.getEnd();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 100);
        java.lang.String str24 = integerInterval21.toString();
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean29 = integerInterval27.contains((int) (short) 1);
        int int30 = integerInterval21.compareTo(integerInterval27);
        int int31 = integerInterval27.getEnd();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean36 = integerInterval34.contains((int) (short) -1);
        int int37 = integerInterval27.compareTo(integerInterval34);
        int int38 = integerInterval5.compareTo(integerInterval34);
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str45 = integerInterval44.toString();
        int int46 = integerInterval41.compareTo(integerInterval44);
        boolean boolean48 = integerInterval44.contains((int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval51 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval54 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean56 = integerInterval54.contains((int) (short) 100);
        java.lang.String str57 = integerInterval54.toString();
        com.greplin.interval.IntegerInterval integerInterval60 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean62 = integerInterval60.contains((int) (short) 1);
        int int63 = integerInterval54.compareTo(integerInterval60);
        java.lang.String str64 = integerInterval60.asString();
        boolean boolean65 = integerInterval51.intersects(integerInterval60);
        com.greplin.interval.IntegerInterval integerInterval68 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean70 = integerInterval68.contains((int) (short) 100);
        java.lang.String str71 = integerInterval68.toString();
        com.greplin.interval.IntegerInterval integerInterval74 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean76 = integerInterval74.contains((int) (short) 1);
        int int77 = integerInterval68.compareTo(integerInterval74);
        java.lang.String str78 = integerInterval74.asString();
        int int79 = integerInterval74.getEnd();
        boolean boolean80 = integerInterval51.equals((java.lang.Object) int79);
        com.google.common.collect.ImmutableList<java.lang.String> strList81 = integerInterval51.asStringList();
        int int82 = integerInterval51.getEnd();
        boolean boolean84 = integerInterval51.contains((int) '4');
        int int85 = integerInterval44.compareTo(integerInterval51);
        int int86 = integerInterval34.compareTo(integerInterval44);
        boolean boolean87 = integerInterval1.intersects(integerInterval34);
        int int88 = integerInterval34.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-10" + "'", str2, "100-10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1--1" + "'", str17, "-1--1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{10-52}" + "'", str45, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "IntegerInterval{10-52}" + "'", str57, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "10-52" + "'", str64, "10-52");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IntegerInterval{10-52}" + "'", str71, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "10-52" + "'", str78, "10-52");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 52 + "'", int79 == 52);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) '#', 52);
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.toString();
        java.lang.String str10 = integerInterval6.toString();
        boolean boolean11 = integerInterval2.equals((java.lang.Object) str10);
        int int12 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{35-52}" + "'", str9, "IntegerInterval{35-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{35-52}" + "'", str10, "IntegerInterval{35-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) 'a');
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getEnd();
        int int13 = integerInterval2.getEnd();
        int int14 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str32 = integerInterval31.toString();
        java.lang.String str33 = integerInterval31.asString();
        boolean boolean35 = integerInterval31.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval31.asStringList();
        boolean boolean38 = integerInterval31.contains((int) '4');
        boolean boolean39 = integerInterval26.equals((java.lang.Object) integerInterval31);
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval45 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str46 = integerInterval45.toString();
        int int47 = integerInterval42.compareTo(integerInterval45);
        int int48 = integerInterval31.compareTo(integerInterval45);
        int int49 = integerInterval31.getStart();
        java.lang.String str50 = integerInterval31.toString();
        boolean boolean51 = integerInterval19.equals((java.lang.Object) integerInterval31);
        int int52 = integerInterval31.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "IntegerInterval{10-52}" + "'", str32, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10-52" + "'", str33, "10-52");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{-1--1}" + "'", str46, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (byte) 10);
        boolean boolean4 = integerInterval2.contains(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList32 = integerInterval16.asList();
        java.lang.String str33 = integerInterval16.asString();
        int int34 = integerInterval16.getStart();
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
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10-52" + "'", str33, "10-52");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains(0);
        int int6 = integerInterval2.getEnd();
        java.lang.String str7 = integerInterval2.toString();
        int int8 = integerInterval2.getEnd();
        java.lang.String str9 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1-52}" + "'", str7, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1-52}" + "'", str9, "IntegerInterval{-1-52}");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        boolean boolean4 = integerInterval2.contains(100);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 32);
        boolean boolean4 = integerInterval2.contains((int) (byte) 0);
        boolean boolean6 = integerInterval2.contains((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{100-0}" + "'", str4, "IntegerInterval{100-0}");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-10");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 0);
        boolean boolean6 = integerInterval4.contains(32);
        int int7 = integerInterval1.compareTo(integerInterval4);
        int int8 = integerInterval4.getStart();
        int int9 = integerInterval4.getStart();
        java.lang.Class<?> wildcardClass10 = integerInterval4.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        boolean boolean6 = integerInterval1.contains((int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) '#');
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-0}" + "'", str3, "IntegerInterval{0-0}");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', 1);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.String str21 = integerInterval2.toString();
        int int22 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        java.lang.Object obj7 = null;
        boolean boolean8 = integerInterval2.equals(obj7);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) '#');
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (byte) 0);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0-0" + "'", str3, "0-0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 1);
        int int17 = integerInterval8.compareTo(integerInterval14);
        java.lang.String str18 = integerInterval14.asString();
        boolean boolean19 = integerInterval5.intersects(integerInterval14);
        com.greplin.interval.IntegerInterval integerInterval21 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean22 = integerInterval14.intersects(integerInterval21);
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean30 = integerInterval28.contains((int) (short) 100);
        java.lang.String str31 = integerInterval28.toString();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean36 = integerInterval34.contains((int) (short) 1);
        int int37 = integerInterval28.compareTo(integerInterval34);
        java.lang.String str38 = integerInterval34.asString();
        boolean boolean39 = integerInterval25.intersects(integerInterval34);
        com.greplin.interval.IntegerInterval integerInterval41 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean42 = integerInterval34.intersects(integerInterval41);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList43 = integerInterval41.asList();
        int int44 = integerInterval21.compareTo(integerInterval41);
        java.lang.String str45 = integerInterval41.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList46 = integerInterval41.asList();
        boolean boolean47 = integerInterval2.equals((java.lang.Object) intList46);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(integerInterval21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(integerInterval41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{-1--1}" + "'", str45, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        boolean boolean12 = integerInterval2.contains((int) (byte) 100);
        java.lang.String str13 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval11.asStringList();
        int int25 = integerInterval11.getEnd();
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
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        java.lang.String str13 = integerInterval2.asString();
        int int14 = integerInterval2.getStart();
        int int15 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) 10);
        boolean boolean4 = integerInterval2.contains((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-10");
        boolean boolean3 = integerInterval1.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval21.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval21.asStringList();
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
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
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getStart();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.asString();
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{1-100}" + "'", str5, "IntegerInterval{1-100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1-100" + "'", str6, "1-100");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(0);
        int int6 = integerInterval2.getStart();
        boolean boolean8 = integerInterval2.contains((int) ' ');
        java.lang.String str9 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{97-0}" + "'", str9, "IntegerInterval{97-0}");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int37 = integerInterval2.getStart();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = integerInterval2.compareTo(integerInterval14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval2.asList();
        boolean boolean18 = integerInterval2.contains(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        int int20 = integerInterval8.getEnd();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        boolean boolean14 = integerInterval8.contains((int) (short) 100);
        int int15 = integerInterval8.getEnd();
        int int16 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval8.asList();
        java.lang.Class<?> wildcardClass18 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        java.lang.String str11 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        int int13 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{35-100}" + "'", str11, "IntegerInterval{35-100}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 52);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.lang.Class<?> wildcardClass57 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        java.lang.String str8 = integerInterval2.asString();
        int int9 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        int int13 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment16 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int17 = intervalSegment16.getShift();
        boolean boolean18 = integerInterval2.equals((java.lang.Object) intervalSegment16);
        long long19 = intervalSegment16.getStart();
        long long20 = intervalSegment16.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 10);
        boolean boolean4 = integerInterval2.contains(10);
        int int5 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 100);
        java.lang.String str33 = integerInterval30.toString();
        com.greplin.interval.IntegerInterval integerInterval36 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean38 = integerInterval36.contains((int) (short) 1);
        int int39 = integerInterval30.compareTo(integerInterval36);
        com.google.common.collect.ImmutableList<java.lang.String> strList40 = integerInterval36.asStringList();
        boolean boolean41 = integerInterval2.equals((java.lang.Object) integerInterval36);
        java.lang.Class<?> wildcardClass42 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval2.asList();
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
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 52);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        java.lang.String str15 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = integerInterval8.compareTo(integerInterval16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        java.lang.String str23 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval2.asStringList();
        java.lang.String str25 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval2.asList();
        int int27 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList28 = integerInterval2.asList();
        boolean boolean30 = integerInterval2.contains((int) '4');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval1.asStringList();
        java.lang.String str10 = integerInterval1.toString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 100);
        java.lang.String str19 = integerInterval16.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 1);
        int int25 = integerInterval16.compareTo(integerInterval22);
        java.lang.String str26 = integerInterval22.asString();
        boolean boolean27 = integerInterval13.intersects(integerInterval22);
        int int28 = integerInterval13.getEnd();
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean36 = integerInterval34.contains((int) (short) 100);
        java.lang.String str37 = integerInterval34.toString();
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean42 = integerInterval40.contains((int) (short) 1);
        int int43 = integerInterval34.compareTo(integerInterval40);
        java.lang.String str44 = integerInterval40.asString();
        boolean boolean45 = integerInterval31.intersects(integerInterval40);
        com.greplin.interval.IntegerInterval integerInterval47 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean48 = integerInterval40.intersects(integerInterval47);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList49 = integerInterval47.asList();
        boolean boolean51 = integerInterval47.contains(100);
        boolean boolean52 = integerInterval13.equals((java.lang.Object) integerInterval47);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList53 = integerInterval13.asList();
        boolean boolean54 = integerInterval1.intersects(integerInterval13);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10-52" + "'", str26, "10-52");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10-52" + "'", str44, "10-52");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(integerInterval47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str42 = integerInterval41.toString();
        int int43 = integerInterval38.compareTo(integerInterval41);
        boolean boolean45 = integerInterval41.contains((int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval51 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean53 = integerInterval51.contains((int) (short) 100);
        java.lang.String str54 = integerInterval51.toString();
        com.greplin.interval.IntegerInterval integerInterval57 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean59 = integerInterval57.contains((int) (short) 1);
        int int60 = integerInterval51.compareTo(integerInterval57);
        java.lang.String str61 = integerInterval57.asString();
        boolean boolean62 = integerInterval48.intersects(integerInterval57);
        com.greplin.interval.IntegerInterval integerInterval65 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean67 = integerInterval65.contains((int) (short) 100);
        java.lang.String str68 = integerInterval65.toString();
        com.greplin.interval.IntegerInterval integerInterval71 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean73 = integerInterval71.contains((int) (short) 1);
        int int74 = integerInterval65.compareTo(integerInterval71);
        java.lang.String str75 = integerInterval71.asString();
        int int76 = integerInterval71.getEnd();
        boolean boolean77 = integerInterval48.equals((java.lang.Object) int76);
        com.google.common.collect.ImmutableList<java.lang.String> strList78 = integerInterval48.asStringList();
        int int79 = integerInterval48.getEnd();
        boolean boolean81 = integerInterval48.contains((int) '4');
        int int82 = integerInterval41.compareTo(integerInterval48);
        int int83 = integerInterval31.compareTo(integerInterval41);
        int int84 = integerInterval31.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList85 = integerInterval31.asStringList();
        int int86 = integerInterval31.getEnd();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "IntegerInterval{10-52}" + "'", str42, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "10-52" + "'", str61, "10-52");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "IntegerInterval{10-52}" + "'", str68, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "10-52" + "'", str75, "10-52");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 52 + "'", int76 == 52);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 52 + "'", int79 == 52);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = integerInterval23.asStringList();
        java.lang.Class<?> wildcardClass35 = strList34.getClass();
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
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        int int6 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment9 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long10 = intervalSegment9.getStart();
        long long11 = intervalSegment9.getStart();
        int int12 = intervalSegment9.getShift();
        long long13 = intervalSegment9.getStart();
        long long14 = intervalSegment9.getStart();
        long long15 = intervalSegment9.getStart();
        long long16 = intervalSegment9.getStart();
        long long17 = intervalSegment9.getStart();
        long long18 = intervalSegment9.getStart();
        int int19 = intervalSegment9.getShift();
        int int20 = intervalSegment9.getShift();
        long long21 = intervalSegment9.getStart();
        boolean boolean22 = integerInterval2.equals((java.lang.Object) long21);
        com.greplin.interval.IntegerInterval integerInterval23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = integerInterval2.compareTo(integerInterval23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        boolean boolean14 = integerInterval8.contains((int) (short) 100);
        int int15 = integerInterval8.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        int int11 = integerInterval8.getStart();
        boolean boolean13 = integerInterval8.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        int int15 = integerInterval8.getStart();
        int int16 = integerInterval8.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (short) 100);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.asString();
        java.lang.String str9 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-52" + "'", str9, "-1-52");
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean8 = integerInterval6.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval6.asList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str13 = integerInterval12.asString();
        int int14 = integerInterval12.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval12.asList();
        java.lang.String str16 = integerInterval12.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = integerInterval12.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment20 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        boolean boolean21 = integerInterval12.equals((java.lang.Object) intervalSegment20);
        boolean boolean23 = integerInterval12.contains(1);
        boolean boolean24 = integerInterval6.intersects(integerInterval12);
        java.lang.String str25 = integerInterval6.asString();
        int int26 = integerInterval2.compareTo(integerInterval6);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-100" + "'", str4, "10-100");
        org.junit.Assert.assertNotNull(integerInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1-52" + "'", str13, "-1-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1-52}" + "'", str16, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35-10" + "'", str25, "35-10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        boolean boolean6 = integerInterval2.contains((int) (byte) 1);
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{35-52}" + "'", str4, "IntegerInterval{35-52}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 35);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval21.asStringList();
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
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        boolean boolean11 = integerInterval5.contains((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str10 = integerInterval9.toString();
        java.lang.String str11 = integerInterval9.asString();
        boolean boolean13 = integerInterval9.contains(10);
        java.lang.String str14 = integerInterval9.toString();
        boolean boolean15 = integerInterval2.intersects(integerInterval9);
        com.greplin.interval.IntegerInterval integerInterval17 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str21 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean25 = integerInterval20.intersects(integerInterval24);
        int int26 = integerInterval17.compareTo(integerInterval24);
        java.lang.Object obj27 = null;
        boolean boolean28 = integerInterval17.equals(obj27);
        int int29 = integerInterval9.compareTo(integerInterval17);
        int int30 = integerInterval9.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = integerInterval9.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(integerInterval17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{-1--1}" + "'", str21, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) 'a');
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 35);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (short) 0);
        int int3 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str7 = integerInterval6.asString();
        int int8 = integerInterval6.getEnd();
        java.lang.String str9 = integerInterval6.toString();
        int int10 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval6.asList();
        boolean boolean12 = integerInterval2.intersects(integerInterval6);
        java.lang.String str13 = integerInterval6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1-52}" + "'", str9, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{-1-52}" + "'", str13, "IntegerInterval{-1-52}");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) 'a');
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, 35);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList40 = integerInterval9.asList();
        java.lang.Class<?> wildcardClass41 = integerInterval9.getClass();
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
        org.junit.Assert.assertNotNull(intList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        java.lang.String str40 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList41 = integerInterval8.asList();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList41);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass6 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        int int8 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.String str10 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        int int13 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment16 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int17 = intervalSegment16.getShift();
        boolean boolean18 = integerInterval2.equals((java.lang.Object) intervalSegment16);
        int int19 = intervalSegment16.getShift();
        long long20 = intervalSegment16.getStart();
        int int21 = intervalSegment16.getShift();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 100);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        int int13 = integerInterval8.getEnd();
        java.lang.String str14 = integerInterval8.toString();
        java.lang.String str15 = integerInterval8.asString();
        java.lang.String str16 = integerInterval8.asString();
        java.lang.String str17 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        int int11 = integerInterval8.getStart();
        boolean boolean13 = integerInterval8.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        java.lang.String str15 = integerInterval8.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) (short) 10);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(0);
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-10}" + "'", str3, "IntegerInterval{0-10}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{0-10}" + "'", str6, "IntegerInterval{0-10}");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (short) 10);
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 52);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        int int13 = integerInterval8.getStart();
        boolean boolean15 = integerInterval8.contains(10);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str19 = integerInterval18.toString();
        java.lang.String str20 = integerInterval18.asString();
        boolean boolean22 = integerInterval18.contains(10);
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 100);
        int int28 = integerInterval18.compareTo(integerInterval25);
        int int29 = integerInterval25.getEnd();
        java.lang.String str30 = integerInterval25.asString();
        java.lang.String str31 = integerInterval25.toString();
        int int32 = integerInterval8.compareTo(integerInterval25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        int int33 = integerInterval11.getStart();
        boolean boolean35 = integerInterval11.contains((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 1);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) 1);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean11 = integerInterval6.intersects(integerInterval10);
        boolean boolean13 = integerInterval10.contains(0);
        java.lang.String str14 = integerInterval10.asString();
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval10);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 100);
        java.lang.String str24 = integerInterval21.toString();
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean29 = integerInterval27.contains((int) (short) 1);
        int int30 = integerInterval21.compareTo(integerInterval27);
        java.lang.String str31 = integerInterval27.asString();
        boolean boolean32 = integerInterval18.intersects(integerInterval27);
        com.greplin.interval.IntegerInterval integerInterval34 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean35 = integerInterval27.intersects(integerInterval34);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval34.asList();
        boolean boolean37 = integerInterval2.equals((java.lang.Object) integerInterval34);
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str41 = integerInterval40.toString();
        com.greplin.interval.IntegerInterval integerInterval44 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean45 = integerInterval40.intersects(integerInterval44);
        java.lang.String str46 = integerInterval44.asString();
        java.lang.String str47 = integerInterval44.toString();
        boolean boolean48 = integerInterval34.equals((java.lang.Object) str47);
        boolean boolean50 = integerInterval34.contains(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10-52" + "'", str31, "10-52");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(integerInterval34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{-1--1}" + "'", str41, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1--1" + "'", str46, "-1--1");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "IntegerInterval{-1--1}" + "'", str47, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        java.lang.Object obj15 = null;
        boolean boolean16 = integerInterval8.equals(obj15);
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 100);
        java.lang.String str22 = integerInterval19.toString();
        com.greplin.interval.IntegerInterval integerInterval25 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean27 = integerInterval25.contains((int) (short) 1);
        int int28 = integerInterval19.compareTo(integerInterval25);
        java.lang.String str29 = integerInterval25.asString();
        java.lang.String str30 = integerInterval25.asString();
        java.lang.String str31 = integerInterval25.toString();
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean36 = integerInterval34.contains((int) (short) 100);
        java.lang.String str37 = integerInterval34.toString();
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean42 = integerInterval40.contains((int) (short) 1);
        int int43 = integerInterval34.compareTo(integerInterval40);
        java.lang.String str44 = integerInterval40.asString();
        java.lang.String str45 = integerInterval40.asString();
        int int46 = integerInterval25.compareTo(integerInterval40);
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str50 = integerInterval49.toString();
        java.lang.String str51 = integerInterval49.asString();
        boolean boolean53 = integerInterval49.contains(10);
        java.lang.String str54 = integerInterval49.toString();
        boolean boolean55 = integerInterval25.intersects(integerInterval49);
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean59 = integerInterval49.intersects(integerInterval58);
        boolean boolean60 = integerInterval8.intersects(integerInterval58);
        java.lang.String str61 = integerInterval8.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList62 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval65 = new com.greplin.interval.IntegerInterval((int) '4', 97);
        int int66 = integerInterval8.compareTo(integerInterval65);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{10-52}" + "'", str37, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10-52" + "'", str44, "10-52");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10-52" + "'", str45, "10-52");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "IntegerInterval{10-52}" + "'", str50, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10-52" + "'", str51, "10-52");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{10-52}" + "'", str54, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "10-52" + "'", str61, "10-52");
        org.junit.Assert.assertNotNull(intList62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        int int44 = integerInterval41.getStart();
        com.greplin.interval.IntervalSegment intervalSegment47 = new com.greplin.interval.IntervalSegment((long) 100, 10);
        boolean boolean48 = integerInterval41.equals((java.lang.Object) 10);
        java.lang.String str49 = integerInterval41.asString();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "100--1" + "'", str49, "100--1");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        int int23 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        int int10 = integerInterval2.getEnd();
        java.lang.String str11 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1-52}" + "'", str11, "IntegerInterval{-1-52}");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-0}" + "'", str4, "IntegerInterval{52-0}");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 32);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntervalSegment intervalSegment7 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int8 = intervalSegment7.getShift();
        int int9 = intervalSegment7.getShift();
        int int10 = intervalSegment7.getShift();
        long long11 = intervalSegment7.getStart();
        boolean boolean12 = integerInterval2.equals((java.lang.Object) long11);
        java.lang.Class<?> wildcardClass13 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass6 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '4');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass6 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '4');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval9.getEnd();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 100);
        boolean boolean17 = integerInterval9.intersects(integerInterval16);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval9.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval9.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("32-0");
        boolean boolean3 = integerInterval1.contains((int) (byte) 1);
        int int4 = integerInterval1.getEnd();
        int int5 = integerInterval1.getEnd();
        int int6 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) '#');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass9 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.lang.String str37 = integerInterval16.toString();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{35-10}" + "'", str37, "IntegerInterval{35-10}");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-1" + "'", str4, "35-1");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 100);
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{10-100}" + "'", str4, "IntegerInterval{10-100}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-100}" + "'", str5, "IntegerInterval{10-100}");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        int int11 = integerInterval8.getStart();
        boolean boolean13 = integerInterval8.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval8.asStringList();
        int int15 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval8.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        java.lang.String str50 = integerInterval8.asString();
        int int51 = integerInterval8.getStart();
        int int52 = integerInterval8.getEnd();
        boolean boolean54 = integerInterval8.contains((-1));
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "10-52" + "'", str50, "10-52");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 10);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = integerInterval2.asStringList();
        java.lang.String str28 = integerInterval2.asString();
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
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str5 = integerInterval4.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean9 = integerInterval4.intersects(integerInterval8);
        int int10 = integerInterval1.compareTo(integerInterval8);
        int int11 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        java.lang.String str13 = integerInterval8.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{-1--1}" + "'", str13, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        boolean boolean40 = integerInterval32.equals((java.lang.Object) 52L);
        java.lang.String str41 = integerInterval32.asString();
        java.lang.Class<?> wildcardClass42 = integerInterval32.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10-52" + "'", str41, "10-52");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList38 = integerInterval25.asList();
        boolean boolean40 = integerInterval25.contains(0);
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
        org.junit.Assert.assertNotNull(intList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (byte) 0);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0-0" + "'", str3, "0-0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{0-0}" + "'", str4, "IntegerInterval{0-0}");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        java.lang.String str72 = integerInterval56.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList73 = integerInterval56.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList74 = integerInterval56.asStringList();
        java.lang.Class<?> wildcardClass75 = strList74.getClass();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IntegerInterval{100--1}" + "'", str72, "IntegerInterval{100--1}");
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        int int25 = integerInterval8.getEnd();
        int int26 = integerInterval8.getStart();
        boolean boolean28 = integerInterval8.contains(97);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval8.asStringList();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) '4');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        int int23 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList24 = integerInterval2.asList();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) '#');
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-35" + "'", str3, "100-35");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100-35" + "'", str4, "100-35");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) '4');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0-0" + "'", str4, "0-0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        boolean boolean6 = integerInterval2.intersects(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        boolean boolean10 = integerInterval5.contains((-1));
        int int11 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval5.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (-1));
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 1);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{32-1}" + "'", str5, "IntegerInterval{32-1}");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) '#');
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-35" + "'", str3, "1-35");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (short) 100);
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        int int7 = integerInterval6.getEnd();
        int int8 = integerInterval6.getEnd();
        int int9 = integerInterval2.compareTo(integerInterval6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) '#');
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        java.lang.String str25 = integerInterval21.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{-1--1}" + "'", str25, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean4 = integerInterval2.contains((int) (short) -1);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52-1" + "'", str5, "52-1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52-1" + "'", str6, "52-1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (byte) 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(35, (int) '4');
        boolean boolean6 = integerInterval2.equals((java.lang.Object) 35);
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) -1);
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1--1" + "'", str4, "-1--1");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        boolean boolean18 = integerInterval2.contains((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        java.lang.String str35 = integerInterval25.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval25.asStringList();
        int int37 = integerInterval25.getEnd();
        java.lang.String str38 = integerInterval25.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        boolean boolean55 = integerInterval2.contains((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(0, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval5.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval5.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval5.asStringList();
        boolean boolean9 = integerInterval2.equals((java.lang.Object) strList8);
        java.lang.Class<?> wildcardClass10 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        boolean boolean5 = integerInterval1.contains((int) (byte) 1);
        boolean boolean7 = integerInterval1.contains((int) '4');
        int int8 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean4 = integerInterval2.contains((int) 'a');
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1--1" + "'", str6, "1--1");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        java.lang.String str26 = integerInterval7.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{10-52}" + "'", str26, "IntegerInterval{10-52}");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        int int19 = integerInterval10.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval10.asList();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{32-32}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{32\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval8.asStringList();
        int int17 = integerInterval8.getEnd();
        boolean boolean19 = integerInterval8.contains(0);
        java.lang.Class<?> wildcardClass20 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.lang.String str48 = integerInterval2.toString();
        boolean boolean50 = integerInterval2.contains(0);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "IntegerInterval{-1--1}" + "'", str48, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 0);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-0}" + "'", str3, "IntegerInterval{-1-0}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) -1);
        boolean boolean9 = integerInterval7.contains(1);
        java.lang.String str10 = integerInterval7.toString();
        boolean boolean11 = integerInterval2.equals((java.lang.Object) integerInterval7);
        boolean boolean13 = integerInterval7.contains((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{35--1}" + "'", str10, "IntegerInterval{35--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) 100);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) '#');
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10-100" + "'", str3, "10-100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-100}" + "'", str6, "IntegerInterval{10-100}");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        int int11 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval6.asList();
        java.lang.String str13 = integerInterval6.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        boolean boolean12 = integerInterval2.equals((java.lang.Object) integerInterval11);
        int int13 = integerInterval11.getEnd();
        java.lang.String str14 = integerInterval11.asString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1-0" + "'", str14, "1-0");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        int int40 = integerInterval8.getStart();
        java.lang.String str41 = integerInterval8.asString();
        java.lang.String str42 = integerInterval8.asString();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10-52" + "'", str41, "10-52");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList33 = integerInterval2.asList();
        int int34 = integerInterval2.getStart();
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
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList89 = integerInterval22.asList();
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
        org.junit.Assert.assertNotNull(intList89);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 35);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 100);
        int int17 = integerInterval8.compareTo(integerInterval16);
        java.lang.Class<?> wildcardClass18 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1-52}" + "'", str7, "IntegerInterval{-1-52}");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) ' ');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        com.greplin.interval.IntervalSegment intervalSegment20 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int21 = intervalSegment20.getShift();
        long long22 = intervalSegment20.getStart();
        int int23 = intervalSegment20.getShift();
        long long24 = intervalSegment20.getStart();
        long long25 = intervalSegment20.getStart();
        int int26 = intervalSegment20.getShift();
        long long27 = intervalSegment20.getStart();
        boolean boolean28 = integerInterval2.equals((java.lang.Object) intervalSegment20);
        long long29 = intervalSegment20.getStart();
        int int30 = intervalSegment20.getShift();
        int int31 = intervalSegment20.getShift();
        int int32 = intervalSegment20.getShift();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        com.greplin.interval.IntervalSegment intervalSegment8 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (byte) 0);
        boolean boolean9 = integerInterval2.equals((java.lang.Object) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean14 = integerInterval12.equals((java.lang.Object) "");
        int int15 = integerInterval12.getStart();
        boolean boolean16 = integerInterval2.equals((java.lang.Object) integerInterval12);
        java.lang.Class<?> wildcardClass17 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean19 = integerInterval17.contains((int) (short) 100);
        java.lang.String str20 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        int int26 = integerInterval17.compareTo(integerInterval23);
        java.lang.String str27 = integerInterval23.asString();
        boolean boolean28 = integerInterval14.intersects(integerInterval23);
        com.greplin.interval.IntegerInterval integerInterval30 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean31 = integerInterval23.intersects(integerInterval30);
        java.lang.String str32 = integerInterval23.asString();
        int int33 = integerInterval2.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList34 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(integerInterval30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (short) 0);
        int int3 = integerInterval2.getStart();
        boolean boolean5 = integerInterval2.contains((int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 35);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains(1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        boolean boolean35 = integerInterval2.contains((int) '4');
        boolean boolean37 = integerInterval2.contains((int) (short) 1);
        java.lang.String str38 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = integerInterval2.asStringList();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.String str17 = integerInterval2.asString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1--1" + "'", str17, "-1--1");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) 0);
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getStart();
        boolean boolean9 = integerInterval2.contains((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        java.lang.Class<?> wildcardClass40 = intList39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (byte) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        java.lang.String str5 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32-10" + "'", str4, "32-10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32-10" + "'", str5, "32-10");
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean35 = integerInterval33.contains((int) (short) 100);
        java.lang.String str36 = integerInterval33.toString();
        com.greplin.interval.IntegerInterval integerInterval39 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean41 = integerInterval39.contains((int) (short) 1);
        int int42 = integerInterval33.compareTo(integerInterval39);
        com.greplin.interval.IntegerInterval integerInterval45 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean47 = integerInterval45.contains((int) (short) 100);
        java.lang.String str48 = integerInterval45.toString();
        com.greplin.interval.IntegerInterval integerInterval51 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean53 = integerInterval51.contains((int) (short) 1);
        int int54 = integerInterval45.compareTo(integerInterval51);
        java.lang.String str55 = integerInterval51.asString();
        java.lang.String str56 = integerInterval51.toString();
        com.greplin.interval.IntegerInterval integerInterval59 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str60 = integerInterval59.toString();
        com.greplin.interval.IntegerInterval integerInterval63 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean64 = integerInterval59.intersects(integerInterval63);
        boolean boolean66 = integerInterval63.contains(0);
        boolean boolean67 = integerInterval51.intersects(integerInterval63);
        int int68 = integerInterval39.compareTo(integerInterval63);
        com.greplin.interval.IntegerInterval integerInterval71 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str72 = integerInterval71.asString();
        com.greplin.interval.IntegerInterval integerInterval75 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str76 = integerInterval75.toString();
        com.greplin.interval.IntegerInterval integerInterval79 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean80 = integerInterval75.intersects(integerInterval79);
        boolean boolean82 = integerInterval79.contains(0);
        java.lang.String str83 = integerInterval79.asString();
        boolean boolean84 = integerInterval71.equals((java.lang.Object) integerInterval79);
        boolean boolean85 = integerInterval63.intersects(integerInterval79);
        boolean boolean87 = integerInterval63.contains(0);
        boolean boolean89 = integerInterval63.contains(35);
        java.lang.String str90 = integerInterval63.toString();
        int int91 = integerInterval8.compareTo(integerInterval63);
        int int92 = integerInterval63.getStart();
        java.lang.String str93 = integerInterval63.toString();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "IntegerInterval{10-52}" + "'", str36, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "IntegerInterval{10-52}" + "'", str48, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "10-52" + "'", str55, "10-52");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "IntegerInterval{10-52}" + "'", str56, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "IntegerInterval{-1--1}" + "'", str60, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "100--1" + "'", str72, "100--1");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "IntegerInterval{-1--1}" + "'", str76, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "-1--1" + "'", str83, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "IntegerInterval{-1--1}" + "'", str90, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "IntegerInterval{-1--1}" + "'", str93, "IntegerInterval{-1--1}");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getStart();
        boolean boolean6 = integerInterval2.contains((int) 'a');
        boolean boolean8 = integerInterval2.contains(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-52" + "'", str3, "100-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval2.asStringList();
        int int21 = integerInterval2.getEnd();
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
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        boolean boolean6 = integerInterval2.intersects(integerInterval5);
        java.lang.String str7 = integerInterval5.toString();
        boolean boolean9 = integerInterval5.contains((int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval5.asList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{97-0}" + "'", str7, "IntegerInterval{97-0}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains((int) 'a');
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) ' ');
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        java.lang.String str25 = integerInterval8.toString();
        java.lang.String str26 = integerInterval8.asString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10-52" + "'", str26, "10-52");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, 35);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 35);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{97-35}" + "'", str3, "IntegerInterval{97-35}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97-35" + "'", str4, "97-35");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (-1));
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        java.lang.String str4 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval1.asStringList();
        java.lang.String str6 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{100--1}" + "'", str4, "IntegerInterval{100--1}");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100--1" + "'", str6, "100--1");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval2.asList();
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
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        java.lang.String str8 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass9 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) -1);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, 97);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        int int7 = integerInterval2.getEnd();
        java.lang.Object obj8 = null;
        boolean boolean9 = integerInterval2.equals(obj8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, 100);
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10-100" + "'", str3, "10-100");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-10");
        java.lang.String str2 = integerInterval1.asString();
        java.lang.String str3 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100-10" + "'", str2, "100-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{100-10}" + "'", str3, "IntegerInterval{100-10}");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) '4');
        boolean boolean4 = integerInterval2.contains((int) '4');
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) '#', 10);
        boolean boolean8 = integerInterval2.intersects(integerInterval7);
        int int9 = integerInterval2.getStart();
        int int10 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        java.lang.String str34 = integerInterval30.toString();
        java.lang.String str35 = integerInterval30.toString();
        java.lang.String str36 = integerInterval30.asString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{1-1}" + "'", str34, "IntegerInterval{1-1}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{1-1}" + "'", str35, "IntegerInterval{1-1}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1-1" + "'", str36, "1-1");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        int int3 = integerInterval2.getStart();
        boolean boolean5 = integerInterval2.contains((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval2.asString();
        java.lang.Class<?> wildcardClass9 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
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
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 100);
        boolean boolean4 = integerInterval2.contains((int) (short) 10);
        java.lang.String str5 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1-100" + "'", str5, "-1-100");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 100);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100-100" + "'", str5, "100-100");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str10 = integerInterval9.asString();
        int int11 = integerInterval9.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval9.asList();
        java.lang.String str13 = integerInterval9.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval9.asStringList();
        boolean boolean15 = integerInterval2.equals((java.lang.Object) integerInterval9);
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval2.asStringList();
        java.lang.String str17 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1-52" + "'", str10, "-1-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{-1-52}" + "'", str13, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-52" + "'", str17, "-1-52");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32-52}" + "'", str3, "IntegerInterval{32-52}");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 1);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 35);
        boolean boolean4 = integerInterval2.contains((-1));
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.asString();
        boolean boolean8 = integerInterval2.equals((java.lang.Object) (-1));
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0-35" + "'", str6, "0-35");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass4 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) 'a');
        com.greplin.interval.IntervalSegment intervalSegment5 = new com.greplin.interval.IntervalSegment(0L, (int) (short) 0);
        boolean boolean6 = integerInterval2.equals((java.lang.Object) 0L);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        java.lang.String str9 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1-97" + "'", str9, "1-97");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 1);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) 10);
        boolean boolean4 = integerInterval2.contains((int) (short) -1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 10);
        int int8 = integerInterval7.getEnd();
        boolean boolean9 = integerInterval2.equals((java.lang.Object) integerInterval7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        com.greplin.interval.IntegerInterval integerInterval32 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = integerInterval32.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList34 = integerInterval32.asList();
        int int35 = integerInterval1.compareTo(integerInterval32);
        int int36 = integerInterval32.getEnd();
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
        org.junit.Assert.assertNotNull(integerInterval32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getEnd();
        int int5 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) ' ', (int) '4');
        int int6 = integerInterval5.getEnd();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) '4');
        int int10 = integerInterval5.compareTo(integerInterval9);
        boolean boolean11 = integerInterval2.intersects(integerInterval9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean4 = integerInterval2.contains((int) 'a');
        int int5 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList33 = integerInterval2.asList();
        int int34 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList35 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval2.asStringList();
        boolean boolean38 = integerInterval2.contains((-1));
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
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        boolean boolean4 = integerInterval2.contains((int) (short) -1);
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getEnd();
        boolean boolean8 = integerInterval2.contains((int) (short) -1);
        com.greplin.interval.IntervalSegment intervalSegment11 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 0);
        long long12 = intervalSegment11.getStart();
        boolean boolean13 = integerInterval2.equals((java.lang.Object) intervalSegment11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52-1" + "'", str5, "52-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        com.greplin.interval.IntervalSegment intervalSegment12 = new com.greplin.interval.IntervalSegment(0L, 97);
        int int13 = intervalSegment12.getShift();
        boolean boolean14 = integerInterval6.equals((java.lang.Object) intervalSegment12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', 10);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList56 = integerInterval48.asList();
        com.greplin.interval.IntegerInterval integerInterval57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int58 = integerInterval48.compareTo(integerInterval57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intList56);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval2.asStringList();
        int int19 = integerInterval2.getStart();
        java.lang.String str20 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass21 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, 1);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval18.asList();
        int int23 = integerInterval18.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval18.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval18.asStringList();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        java.lang.String str8 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass10 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        java.lang.String str30 = integerInterval17.toString();
        int int31 = integerInterval17.getEnd();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{-1--1}" + "'", str30, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.toString();
        java.lang.String str10 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) 100);
        boolean boolean4 = integerInterval2.contains(35);
        boolean boolean6 = integerInterval2.contains(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        java.lang.Class<?> wildcardClass11 = integerInterval6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 1);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        boolean boolean44 = integerInterval38.contains((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        com.greplin.interval.IntervalSegment intervalSegment32 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long33 = intervalSegment32.getStart();
        int int34 = intervalSegment32.getShift();
        int int35 = intervalSegment32.getShift();
        int int36 = intervalSegment32.getShift();
        int int37 = intervalSegment32.getShift();
        java.lang.Class<?> wildcardClass38 = intervalSegment32.getClass();
        boolean boolean39 = integerInterval16.equals((java.lang.Object) intervalSegment32);
        java.lang.Class<?> wildcardClass40 = integerInterval16.getClass();
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, 1);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(0);
        boolean boolean16 = integerInterval8.contains((int) (short) -1);
        int int17 = integerInterval8.getEnd();
        int int18 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval8.asList();
        com.greplin.interval.IntegerInterval integerInterval20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = integerInterval8.intersects(integerInterval20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str8 = integerInterval7.toString();
        boolean boolean9 = integerInterval2.intersects(integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-52" + "'", str3, "100-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) '#');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        int int7 = integerInterval1.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval5.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (-1));
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        java.lang.String str5 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 1);
        int int17 = integerInterval8.compareTo(integerInterval14);
        java.lang.String str18 = integerInterval14.asString();
        java.lang.String str19 = integerInterval14.toString();
        int int20 = integerInterval14.getStart();
        int int21 = integerInterval14.getEnd();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval24.asList();
        int int26 = integerInterval14.compareTo(integerInterval24);
        java.lang.String str27 = integerInterval14.asString();
        int int28 = integerInterval2.compareTo(integerInterval14);
        java.lang.String str29 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList30 = integerInterval2.asList();
        java.lang.String str31 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1--1" + "'", str5, "1--1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1--1" + "'", str29, "1--1");
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1--1" + "'", str31, "1--1");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (-1));
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-35");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }
}

