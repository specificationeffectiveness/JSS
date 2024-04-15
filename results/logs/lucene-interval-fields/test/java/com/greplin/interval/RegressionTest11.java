package com.greplin.interval;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        java.lang.String str10 = integerInterval2.asString();
        int int11 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
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
        java.lang.String str22 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = integerInterval2.asStringList();
        java.lang.String str24 = integerInterval2.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{100--1}" + "'", str22, "IntegerInterval{100--1}");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{100--1}" + "'", str24, "IntegerInterval{100--1}");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 1);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("10--1");
        int int5 = integerInterval2.compareTo(integerInterval4);
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 0);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains((int) (short) 0);
        com.greplin.interval.IntervalSegment intervalSegment8 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 100);
        int int9 = intervalSegment8.getShift();
        long long10 = intervalSegment8.getStart();
        boolean boolean11 = integerInterval2.equals((java.lang.Object) long10);
        boolean boolean13 = integerInterval2.contains(35);
        java.lang.String str14 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-0}" + "'", str3, "IntegerInterval{-1-0}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1-0}" + "'", str14, "IntegerInterval{-1-0}");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        java.lang.String str12 = integerInterval10.asString();
        java.lang.String str13 = integerInterval10.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1-100" + "'", str12, "1-100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{1-100}" + "'", str13, "IntegerInterval{1-100}");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        int int14 = integerInterval11.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval11.asStringList();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        int int17 = integerInterval2.getStart();
        java.lang.String str18 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
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
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) -1);
        int int27 = integerInterval26.getStart();
        boolean boolean28 = integerInterval9.equals((java.lang.Object) integerInterval26);
        int int29 = integerInterval26.getEnd();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
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
        int int27 = integerInterval2.getEnd();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) -1);
        int int3 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean15 = integerInterval13.contains((int) (short) 100);
        java.lang.String str16 = integerInterval13.toString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean21 = integerInterval19.contains((int) (short) 1);
        int int22 = integerInterval13.compareTo(integerInterval19);
        java.lang.String str23 = integerInterval19.asString();
        boolean boolean24 = integerInterval10.intersects(integerInterval19);
        java.lang.String str25 = integerInterval19.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval19.asStringList();
        int int27 = integerInterval2.compareTo(integerInterval19);
        java.lang.Class<?> wildcardClass28 = integerInterval19.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10-52" + "'", str23, "10-52");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 100);
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
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval10.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval10.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval10.asList();
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
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 35);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getEnd();
        int int3 = integerInterval1.getStart();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        boolean boolean7 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        int int8 = intervalSegment6.getShift();
        long long9 = intervalSegment6.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-52");
        int int2 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval5.asStringList();
        java.lang.String str27 = integerInterval5.toString();
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
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        int int8 = integerInterval2.getEnd();
        boolean boolean10 = integerInterval2.contains((int) (byte) 10);
        java.lang.String str11 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getEnd();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52--1" + "'", str3, "52--1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52--1" + "'", str4, "52--1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-52}" + "'", str3, "IntegerInterval{1-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{1-52}" + "'", str4, "IntegerInterval{1-52}");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
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
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str59 = integerInterval58.toString();
        com.greplin.interval.IntegerInterval integerInterval62 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean63 = integerInterval58.intersects(integerInterval62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = integerInterval62.asStringList();
        boolean boolean65 = integerInterval48.intersects(integerInterval62);
        java.lang.String str66 = integerInterval62.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList67 = integerInterval62.asList();
        boolean boolean69 = integerInterval62.contains(100);
        java.lang.String str70 = integerInterval62.asString();
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{-1--1}" + "'", str59, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "IntegerInterval{-1--1}" + "'", str66, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "-1--1" + "'", str70, "-1--1");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        int int29 = integerInterval6.getStart();
        int int30 = integerInterval6.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList31 = integerInterval6.asList();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        int int7 = integerInterval1.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        int int9 = integerInterval5.getEnd();
        java.lang.String str10 = integerInterval5.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
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
        java.lang.Class<?> wildcardClass12 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, 32);
        int int3 = integerInterval2.getStart();
        boolean boolean5 = integerInterval2.contains((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
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
        int int29 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = integerInterval8.asStringList();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval2.asStringList();
        boolean boolean21 = integerInterval2.contains((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{100-32}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{100\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval20.asStringList();
        java.lang.String str26 = integerInterval20.asString();
        int int27 = integerInterval20.getEnd();
        int int28 = integerInterval20.getEnd();
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
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1--1" + "'", str26, "-1--1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (-1));
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = integerInterval11.asStringList();
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
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        boolean boolean13 = integerInterval2.contains((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        java.lang.String str11 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        int int13 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) '#');
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean3 = integerInterval1.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str8 = integerInterval7.asString();
        int int9 = integerInterval7.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval7.asList();
        java.lang.String str11 = integerInterval7.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval7.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment15 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        boolean boolean16 = integerInterval7.equals((java.lang.Object) intervalSegment15);
        boolean boolean18 = integerInterval7.contains(1);
        boolean boolean19 = integerInterval1.intersects(integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1-52}" + "'", str11, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        int int4 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval1.asStringList();
        java.lang.String str6 = integerInterval1.toString();
        java.lang.String str7 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-1}" + "'", str6, "IntegerInterval{10-1}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-1}" + "'", str7, "IntegerInterval{10-1}");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        int int3 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean11 = integerInterval6.intersects(integerInterval10);
        boolean boolean13 = integerInterval10.contains(0);
        java.lang.String str14 = integerInterval10.asString();
        int int15 = integerInterval10.getEnd();
        java.lang.Class<?> wildcardClass16 = integerInterval10.getClass();
        boolean boolean17 = integerInterval2.equals((java.lang.Object) integerInterval10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
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
        int int68 = integerInterval57.getStart();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
        int int21 = integerInterval18.getStart();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
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
        int int46 = integerInterval18.getEnd();
        int int47 = integerInterval18.getStart();
        int int48 = integerInterval18.getStart();
        int int49 = integerInterval18.getEnd();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) '4');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean11 = integerInterval9.equals((java.lang.Object) "");
        int int12 = integerInterval9.getEnd();
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        java.lang.String str14 = integerInterval2.asString();
        int int15 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
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
        int int16 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval18 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean20 = integerInterval18.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList21 = integerInterval18.asList();
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str25 = integerInterval24.asString();
        int int26 = integerInterval24.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval24.asList();
        java.lang.String str28 = integerInterval24.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval24.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment32 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        boolean boolean33 = integerInterval24.equals((java.lang.Object) intervalSegment32);
        boolean boolean35 = integerInterval24.contains(1);
        boolean boolean36 = integerInterval18.intersects(integerInterval24);
        boolean boolean37 = integerInterval2.intersects(integerInterval18);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList38 = integerInterval18.asList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1-52" + "'", str25, "-1-52");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{-1-52}" + "'", str28, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intList38);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval10.asStringList();
        boolean boolean14 = integerInterval10.contains(100);
        java.lang.Class<?> wildcardClass15 = integerInterval10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-1");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        java.lang.String str8 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str13 = integerInterval12.toString();
        java.lang.String str14 = integerInterval12.asString();
        boolean boolean16 = integerInterval12.contains(10);
        java.lang.String str17 = integerInterval12.toString();
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean22 = integerInterval20.contains((int) (short) 100);
        java.lang.String str23 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 1);
        int int29 = integerInterval20.compareTo(integerInterval26);
        java.lang.String str30 = integerInterval26.asString();
        java.lang.String str31 = integerInterval26.toString();
        int int32 = integerInterval26.getStart();
        java.lang.String str33 = integerInterval26.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = integerInterval26.asStringList();
        int int35 = integerInterval12.compareTo(integerInterval26);
        int int36 = integerInterval26.getEnd();
        boolean boolean38 = integerInterval26.contains((int) (byte) 1);
        int int39 = integerInterval26.getEnd();
        int int40 = integerInterval26.getEnd();
        boolean boolean41 = integerInterval2.intersects(integerInterval26);
        java.lang.String str42 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList43 = integerInterval2.asList();
        java.lang.String str44 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{10-52}" + "'", str23, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "IntegerInterval{10-52}" + "'", str31, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "IntegerInterval{10-52}" + "'", str42, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "IntegerInterval{10-52}" + "'", str44, "IntegerInterval{10-52}");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 97);
        boolean boolean4 = integerInterval2.contains((int) (short) 0);
        java.lang.String str5 = integerInterval2.toString();
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{35-97}" + "'", str5, "IntegerInterval{35-97}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{35-97}" + "'", str6, "IntegerInterval{35-97}");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, 32);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        java.lang.String str20 = integerInterval8.asString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str24 = integerInterval23.toString();
        java.lang.String str25 = integerInterval23.asString();
        int int26 = integerInterval23.getStart();
        java.lang.String str27 = integerInterval23.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean32 = integerInterval30.equals((java.lang.Object) "");
        int int33 = integerInterval30.getEnd();
        boolean boolean34 = integerInterval23.intersects(integerInterval30);
        java.lang.String str35 = integerInterval23.toString();
        boolean boolean37 = integerInterval23.contains((int) (short) 0);
        int int38 = integerInterval23.getStart();
        boolean boolean39 = integerInterval8.equals((java.lang.Object) integerInterval23);
        boolean boolean41 = integerInterval8.contains((int) '#');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
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
        java.lang.Class<?> wildcardClass69 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 10);
        boolean boolean4 = integerInterval2.contains(10);
        int int5 = integerInterval2.getEnd();
        boolean boolean7 = integerInterval2.contains((int) (byte) 10);
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-10" + "'", str8, "-1-10");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) 'a');
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
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains(35);
        boolean boolean7 = integerInterval2.contains(32);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (-1));
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32--1}" + "'", str3, "IntegerInterval{32--1}");
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, 32);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
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
        java.lang.Class<?> wildcardClass25 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("32-0");
        boolean boolean3 = integerInterval1.contains(32);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, 0);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-0}" + "'", str6, "IntegerInterval{10-0}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 100);
        boolean boolean4 = integerInterval2.contains((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
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
        java.lang.String str17 = integerInterval14.toString();
        int int18 = integerInterval14.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval14.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval14.asList();
        int int21 = integerInterval14.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval14.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{1--1}" + "'", str17, "IntegerInterval{1--1}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) '4');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        int int9 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1-52}" + "'", str7, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (byte) 10);
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0-52" + "'", str6, "0-52");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(100);
        boolean boolean16 = integerInterval8.contains((int) (short) 10);
        int int17 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
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
        long long26 = intervalSegment24.getStart();
        long long27 = intervalSegment24.getStart();
        int int28 = intervalSegment24.getShift();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        int int8 = integerInterval2.getEnd();
        java.lang.String str9 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1--1}" + "'", str4, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1--1}" + "'", str5, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        int int14 = integerInterval8.getEnd();
        boolean boolean16 = integerInterval8.contains((int) '4');
        int int17 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 32);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        int int13 = integerInterval8.getStart();
        boolean boolean15 = integerInterval8.contains(10);
        java.lang.String str16 = integerInterval8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
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
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str24 = integerInterval23.toString();
        int int25 = integerInterval20.compareTo(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval23.asStringList();
        int int27 = integerInterval23.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = integerInterval23.asStringList();
        int int29 = integerInterval23.getEnd();
        boolean boolean30 = integerInterval8.intersects(integerInterval23);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{-1--1}" + "'", str24, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
        boolean boolean24 = integerInterval11.contains((int) (byte) -1);
        int int25 = integerInterval11.getStart();
        int int26 = integerInterval11.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 97);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        java.lang.String str13 = integerInterval2.asString();
        int int14 = integerInterval2.getStart();
        java.lang.String str15 = integerInterval2.asString();
        java.lang.String str16 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        int int16 = integerInterval5.getEnd();
        java.lang.String str17 = integerInterval5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) '4');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 52);
        boolean boolean4 = integerInterval2.contains((int) (byte) -1);
        java.lang.String str5 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100-52" + "'", str5, "100-52");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        java.lang.Class<?> wildcardClass15 = integerInterval10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
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
        java.lang.String str20 = integerInterval2.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        int int9 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean14 = integerInterval12.contains((int) (short) 100);
        java.lang.String str15 = integerInterval12.toString();
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean20 = integerInterval18.contains((int) (short) 1);
        int int21 = integerInterval12.compareTo(integerInterval18);
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 100);
        java.lang.String str27 = integerInterval24.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 1);
        int int33 = integerInterval24.compareTo(integerInterval30);
        java.lang.String str34 = integerInterval30.asString();
        java.lang.String str35 = integerInterval30.toString();
        com.greplin.interval.IntegerInterval integerInterval38 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str39 = integerInterval38.toString();
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean43 = integerInterval38.intersects(integerInterval42);
        boolean boolean45 = integerInterval42.contains(0);
        boolean boolean46 = integerInterval30.intersects(integerInterval42);
        int int47 = integerInterval18.compareTo(integerInterval42);
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str51 = integerInterval50.asString();
        com.greplin.interval.IntegerInterval integerInterval54 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str55 = integerInterval54.toString();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean59 = integerInterval54.intersects(integerInterval58);
        boolean boolean61 = integerInterval58.contains(0);
        java.lang.String str62 = integerInterval58.asString();
        boolean boolean63 = integerInterval50.equals((java.lang.Object) integerInterval58);
        boolean boolean64 = integerInterval42.intersects(integerInterval58);
        int int65 = integerInterval2.compareTo(integerInterval58);
        java.lang.String str66 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval69 = new com.greplin.interval.IntegerInterval(52, 100);
        java.lang.String str70 = integerInterval69.toString();
        boolean boolean71 = integerInterval2.intersects(integerInterval69);
        com.google.common.collect.ImmutableList<java.lang.String> strList72 = integerInterval69.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "IntegerInterval{10-52}" + "'", str35, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{-1--1}" + "'", str39, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "100--1" + "'", str51, "100--1");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{-1--1}" + "'", str55, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-1--1" + "'", str62, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "IntegerInterval{10-52}" + "'", str66, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IntegerInterval{52-100}" + "'", str70, "IntegerInterval{52-100}");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strList72);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList52 = integerInterval19.asList();
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
        org.junit.Assert.assertNotNull(intList52);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
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
        int int22 = integerInterval8.getStart();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (short) 100);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        boolean boolean10 = integerInterval2.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval2.asList();
        int int12 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        long long26 = intervalSegment24.getStart();
        int int27 = intervalSegment24.getShift();
        long long28 = intervalSegment24.getStart();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, 97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        boolean boolean9 = integerInterval6.contains(52);
        java.lang.String str10 = integerInterval6.asString();
        boolean boolean12 = integerInterval6.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = integerInterval2.intersects(integerInterval6);
        java.lang.String str14 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{100--1}" + "'", str14, "IntegerInterval{100--1}");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) '4');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval2.getEnd();
        int int12 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
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
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) -1);
        boolean boolean39 = integerInterval37.contains(1);
        java.lang.String str40 = integerInterval37.toString();
        boolean boolean41 = integerInterval2.intersects(integerInterval37);
        boolean boolean43 = integerInterval2.contains((int) ' ');
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = integerInterval2.asStringList();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{35--1}" + "'", str40, "IntegerInterval{35--1}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
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
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str59 = integerInterval58.toString();
        com.greplin.interval.IntegerInterval integerInterval62 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean63 = integerInterval58.intersects(integerInterval62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = integerInterval62.asStringList();
        boolean boolean65 = integerInterval48.intersects(integerInterval62);
        java.lang.String str66 = integerInterval62.toString();
        int int67 = integerInterval62.getEnd();
        int int68 = integerInterval62.getStart();
        java.lang.Object obj69 = null;
        boolean boolean70 = integerInterval62.equals(obj69);
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{-1--1}" + "'", str59, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "IntegerInterval{-1--1}" + "'", str66, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) '4');
        boolean boolean4 = integerInterval2.contains((int) '4');
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) '#', 10);
        boolean boolean8 = integerInterval2.intersects(integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        int int10 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-1}" + "'", str4, "IntegerInterval{52-1}");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
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
        int int25 = integerInterval13.getStart();
        int int26 = integerInterval13.getEnd();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        int int8 = integerInterval7.getEnd();
        java.lang.String str9 = integerInterval7.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean14 = integerInterval12.equals((java.lang.Object) "");
        int int15 = integerInterval12.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval12.asStringList();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 100);
        int int20 = integerInterval12.compareTo(integerInterval19);
        java.lang.String str21 = integerInterval12.asString();
        boolean boolean22 = integerInterval7.intersects(integerInterval12);
        int int23 = integerInterval7.getStart();
        boolean boolean24 = integerInterval2.intersects(integerInterval7);
        com.greplin.interval.IntegerInterval integerInterval27 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean29 = integerInterval27.contains((int) (short) 100);
        java.lang.String str30 = integerInterval27.toString();
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean35 = integerInterval33.contains((int) (short) 1);
        int int36 = integerInterval27.compareTo(integerInterval33);
        java.lang.String str37 = integerInterval33.asString();
        java.lang.String str38 = integerInterval33.asString();
        java.lang.String str39 = integerInterval33.toString();
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean44 = integerInterval42.contains((int) (short) 100);
        java.lang.String str45 = integerInterval42.toString();
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean50 = integerInterval48.contains((int) (short) 1);
        int int51 = integerInterval42.compareTo(integerInterval48);
        java.lang.String str52 = integerInterval48.asString();
        java.lang.String str53 = integerInterval48.asString();
        int int54 = integerInterval33.compareTo(integerInterval48);
        com.greplin.interval.IntegerInterval integerInterval57 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str58 = integerInterval57.toString();
        java.lang.String str59 = integerInterval57.asString();
        boolean boolean61 = integerInterval57.contains(10);
        java.lang.String str62 = integerInterval57.toString();
        boolean boolean63 = integerInterval33.intersects(integerInterval57);
        com.greplin.interval.IntegerInterval integerInterval66 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean67 = integerInterval57.intersects(integerInterval66);
        java.lang.String str68 = integerInterval66.asString();
        int int69 = integerInterval2.compareTo(integerInterval66);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{97-0}" + "'", str9, "IntegerInterval{97-0}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1-52" + "'", str21, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{10-52}" + "'", str30, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IntegerInterval{10-52}" + "'", str39, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{10-52}" + "'", str45, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10-52" + "'", str52, "10-52");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10-52" + "'", str53, "10-52");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "IntegerInterval{10-52}" + "'", str58, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "10-52" + "'", str59, "10-52");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "IntegerInterval{10-52}" + "'", str62, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "100--1" + "'", str68, "100--1");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean3 = integerInterval1.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        int int5 = integerInterval1.getStart();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str9 = integerInterval8.asString();
        boolean boolean11 = integerInterval8.contains((int) (short) 0);
        java.lang.String str12 = integerInterval8.asString();
        com.greplin.interval.IntegerInterval integerInterval14 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int15 = integerInterval14.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList16 = integerInterval14.asList();
        int int17 = integerInterval14.getEnd();
        int int18 = integerInterval8.compareTo(integerInterval14);
        boolean boolean20 = integerInterval14.contains(35);
        int int21 = integerInterval1.compareTo(integerInterval14);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval14.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-52" + "'", str9, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1-52" + "'", str12, "-1-52");
        org.junit.Assert.assertNotNull(integerInterval14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) (short) 1);
        boolean boolean4 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-1}" + "'", str6, "IntegerInterval{-1-1}");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = integerInterval2.equals(obj3);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) 'a');
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) ' ');
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52-97" + "'", str3, "52-97");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{52-97}" + "'", str6, "IntegerInterval{52-97}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52-97" + "'", str7, "52-97");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str16 = integerInterval15.toString();
        java.lang.String str17 = integerInterval15.asString();
        boolean boolean19 = integerInterval15.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval15.asStringList();
        boolean boolean22 = integerInterval15.contains((int) '4');
        boolean boolean23 = integerInterval12.intersects(integerInterval15);
        int int24 = integerInterval12.getStart();
        int int25 = integerInterval2.compareTo(integerInterval12);
        boolean boolean27 = integerInterval12.contains(35);
        boolean boolean29 = integerInterval12.equals((java.lang.Object) "0-1");
        int int30 = integerInterval12.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = integerInterval12.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
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
        java.lang.String str20 = integerInterval11.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval11.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval11.asList();
        boolean boolean24 = integerInterval11.contains((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval6.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval(32, (int) (short) 100);
        java.lang.String str12 = integerInterval11.toString();
        boolean boolean13 = integerInterval6.intersects(integerInterval11);
        boolean boolean15 = integerInterval11.contains((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{32-100}" + "'", str12, "IntegerInterval{32-100}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        java.lang.String str33 = integerInterval30.toString();
        int int34 = integerInterval30.getEnd();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{1-1}" + "'", str33, "IntegerInterval{1-1}");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 32);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("97-32");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        java.lang.String str4 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{97-32}" + "'", str4, "IntegerInterval{97-32}");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
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
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str34 = integerInterval33.toString();
        int int35 = integerInterval33.getEnd();
        java.lang.String str36 = integerInterval33.asString();
        java.lang.String str37 = integerInterval33.asString();
        int int38 = integerInterval33.getEnd();
        java.lang.Class<?> wildcardClass39 = integerInterval33.getClass();
        boolean boolean40 = integerInterval26.equals((java.lang.Object) wildcardClass39);
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = integerInterval26.asStringList();
        int int42 = integerInterval26.getEnd();
        boolean boolean44 = integerInterval26.contains((int) (short) 1);
        boolean boolean46 = integerInterval26.contains(0);
        boolean boolean48 = integerInterval26.contains(0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList49 = integerInterval26.asList();
        java.lang.Class<?> wildcardClass50 = intList49.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intList49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        boolean boolean8 = integerInterval2.contains((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-1" + "'", str4, "35-1");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
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
        com.greplin.interval.IntervalSegment intervalSegment60 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 10);
        long long61 = intervalSegment60.getStart();
        long long62 = intervalSegment60.getStart();
        int int63 = intervalSegment60.getShift();
        boolean boolean64 = integerInterval48.equals((java.lang.Object) intervalSegment60);
        int int65 = intervalSegment60.getShift();
        long long66 = intervalSegment60.getStart();
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean11 = integerInterval9.equals((java.lang.Object) "");
        int int12 = integerInterval9.getEnd();
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        java.lang.String str14 = integerInterval9.toString();
        boolean boolean16 = integerInterval9.contains(100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1-52}" + "'", str14, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
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
        int int13 = intervalSegment2.getShift();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) -1);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
        com.greplin.interval.IntegerInterval integerInterval67 = new com.greplin.interval.IntegerInterval(0, 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList68 = integerInterval67.asStringList();
        boolean boolean69 = integerInterval40.intersects(integerInterval67);
        boolean boolean71 = integerInterval67.contains((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
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
        boolean boolean26 = integerInterval2.contains((int) ' ');
        int int27 = integerInterval2.getEnd();
        java.lang.String str28 = integerInterval2.toString();
        java.lang.String str29 = integerInterval2.asString();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) ' ');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        int int3 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval1.asStringList();
        java.lang.String str5 = integerInterval1.asString();
        int int6 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
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
        boolean boolean29 = integerInterval16.contains(52);
        com.greplin.interval.IntegerInterval integerInterval30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = integerInterval16.intersects(integerInterval30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = integerInterval2.asStringList();
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
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
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
        java.lang.String str17 = integerInterval10.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1--1" + "'", str14, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1--1}" + "'", str17, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
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
        int int20 = integerInterval2.getEnd();
        boolean boolean22 = integerInterval2.contains((int) ' ');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-10}" + "'", str4, "IntegerInterval{52-10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval7.asStringList();
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
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 100);
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-100" + "'", str3, "1-100");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
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
        java.lang.String str68 = integerInterval34.asString();
        int int69 = integerInterval34.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList70 = integerInterval34.asStringList();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1--1" + "'", str68, "-1--1");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(strList70);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 97);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass5 = intList4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32-97" + "'", str3, "32-97");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        boolean boolean9 = integerInterval2.contains(0);
        java.lang.String str10 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1-52}" + "'", str10, "IntegerInterval{-1-52}");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
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
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str18 = integerInterval17.toString();
        java.lang.String str19 = integerInterval17.asString();
        boolean boolean21 = integerInterval17.contains(10);
        java.lang.String str22 = integerInterval17.toString();
        java.lang.String str23 = integerInterval17.asString();
        int int24 = integerInterval17.getEnd();
        int int25 = integerInterval17.getStart();
        boolean boolean26 = integerInterval2.equals((java.lang.Object) integerInterval17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IntegerInterval{10-52}" + "'", str22, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10-52" + "'", str23, "10-52");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) 10, 1);
        boolean boolean14 = integerInterval2.intersects(integerInterval13);
        java.lang.String str15 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1--1" + "'", str15, "-1--1");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
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
        int int29 = integerInterval8.getStart();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        boolean boolean7 = integerInterval2.contains((int) '4');
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, 52);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) '4');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 1);
        int int17 = integerInterval8.compareTo(integerInterval14);
        java.lang.String str18 = integerInterval14.asString();
        boolean boolean19 = integerInterval5.intersects(integerInterval14);
        int int20 = integerInterval5.getEnd();
        java.lang.String str21 = integerInterval5.toString();
        boolean boolean22 = integerInterval2.intersects(integerInterval5);
        int int23 = integerInterval5.getStart();
        boolean boolean25 = integerInterval5.contains(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        boolean boolean13 = integerInterval2.contains((int) (short) 0);
        int int14 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
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
        int int17 = integerInterval5.getStart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{-1--1}" + "'", str16, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(10, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        int int7 = integerInterval1.compareTo(integerInterval5);
        java.lang.String str8 = integerInterval5.toString();
        int int9 = integerInterval5.getStart();
        int int10 = integerInterval5.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval7 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int8 = integerInterval7.getStart();
        java.lang.String str9 = integerInterval7.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval7.asStringList();
        int int11 = integerInterval2.compareTo(integerInterval7);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        java.lang.String str13 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100--1" + "'", str4, "100--1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(integerInterval7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{35-10}" + "'", str9, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{100--1}" + "'", str13, "IntegerInterval{100--1}");
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((-1), (int) '#');
        boolean boolean8 = integerInterval2.intersects(integerInterval7);
        java.lang.Class<?> wildcardClass9 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-10" + "'", str4, "10-10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (byte) 10);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains((int) 'a');
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str9 = integerInterval8.asString();
        int int10 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval8.asList();
        java.lang.String str12 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str16 = integerInterval15.asString();
        int int17 = integerInterval15.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval15.asList();
        java.lang.String str19 = integerInterval15.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval15.asStringList();
        boolean boolean21 = integerInterval8.equals((java.lang.Object) integerInterval15);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval8.asStringList();
        boolean boolean23 = integerInterval2.equals((java.lang.Object) strList22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-10}" + "'", str3, "IntegerInterval{0-10}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-52" + "'", str9, "-1-52");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1-52}" + "'", str12, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1-52" + "'", str16, "-1-52");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{-1-52}" + "'", str19, "IntegerInterval{-1-52}");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        java.lang.String str8 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass9 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 100);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-100" + "'", str4, "35-100");
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        int int12 = intervalSegment2.getShift();
        long long13 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
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
        int int45 = integerInterval41.getEnd();
        boolean boolean47 = integerInterval41.contains((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval11.asStringList();
        int int19 = integerInterval11.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) 'a');
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList57 = integerInterval52.asList();
        java.lang.String str58 = integerInterval52.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList59 = integerInterval52.asList();
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
        org.junit.Assert.assertNotNull(intList57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0-35" + "'", str58, "0-35");
        org.junit.Assert.assertNotNull(intList59);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
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
        boolean boolean46 = integerInterval10.contains((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass4 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
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
        java.lang.String str42 = integerInterval32.toString();
        java.lang.String str43 = integerInterval32.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = integerInterval32.asStringList();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "IntegerInterval{10-52}" + "'", str42, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10-52" + "'", str43, "10-52");
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) 'a');
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32-97}" + "'", str3, "IntegerInterval{32-97}");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (-1));
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval5.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment11 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        long long12 = intervalSegment11.getStart();
        boolean boolean13 = integerInterval5.equals((java.lang.Object) intervalSegment11);
        java.lang.Class<?> wildcardClass14 = integerInterval5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) '4');
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList52 = integerInterval8.asList();
        boolean boolean54 = integerInterval8.contains(35);
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
        org.junit.Assert.assertNotNull(intList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        boolean boolean13 = integerInterval10.contains((int) (byte) 10);
        int int14 = integerInterval10.getStart();
        int int15 = integerInterval10.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean11 = integerInterval9.equals((java.lang.Object) "");
        int int12 = integerInterval9.getEnd();
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        java.lang.String str14 = integerInterval9.toString();
        com.greplin.interval.IntervalSegment intervalSegment17 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int18 = intervalSegment17.getShift();
        int int19 = intervalSegment17.getShift();
        long long20 = intervalSegment17.getStart();
        long long21 = intervalSegment17.getStart();
        long long22 = intervalSegment17.getStart();
        int int23 = intervalSegment17.getShift();
        long long24 = intervalSegment17.getStart();
        boolean boolean25 = integerInterval9.equals((java.lang.Object) long24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1-52}" + "'", str14, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval18.asList();
        java.lang.String str27 = integerInterval18.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = integerInterval18.asStringList();
        int int29 = integerInterval18.getEnd();
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', 52);
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        boolean boolean6 = integerInterval2.contains(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.asString();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32--1" + "'", str4, "32--1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32--1" + "'", str5, "32--1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "32--1" + "'", str6, "32--1");
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean12 = integerInterval10.contains((int) (short) 100);
        java.lang.String str13 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 1);
        int int19 = integerInterval10.compareTo(integerInterval16);
        java.lang.String str20 = integerInterval16.asString();
        boolean boolean21 = integerInterval7.intersects(integerInterval16);
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 100);
        java.lang.String str27 = integerInterval24.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 1);
        int int33 = integerInterval24.compareTo(integerInterval30);
        java.lang.String str34 = integerInterval30.asString();
        int int35 = integerInterval30.getEnd();
        boolean boolean36 = integerInterval7.equals((java.lang.Object) int35);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = integerInterval7.asStringList();
        int int38 = integerInterval7.getEnd();
        boolean boolean40 = integerInterval7.contains((int) '4');
        java.lang.Class<?> wildcardClass41 = integerInterval7.getClass();
        boolean boolean42 = integerInterval2.equals((java.lang.Object) integerInterval7);
        java.lang.String str43 = integerInterval7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1--1" + "'", str4, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) 'a');
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 100);
        int int14 = integerInterval2.compareTo(integerInterval11);
        boolean boolean16 = integerInterval2.contains(32);
        java.lang.String str17 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1--1}" + "'", str17, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
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
        boolean boolean20 = integerInterval15.contains((int) (short) 1);
        boolean boolean22 = integerInterval15.contains((int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval15.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{0--1}" + "'", str18, "IntegerInterval{0--1}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, 97);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 1);
        boolean boolean6 = integerInterval2.intersects(integerInterval5);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        java.lang.String str10 = integerInterval9.toString();
        boolean boolean12 = integerInterval9.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval9.asStringList();
        boolean boolean15 = integerInterval9.contains(0);
        boolean boolean16 = integerInterval2.equals((java.lang.Object) integerInterval9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{35-10}" + "'", str10, "IntegerInterval{35-10}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval5.asStringList();
        com.greplin.interval.IntervalSegment intervalSegment11 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        long long12 = intervalSegment11.getStart();
        boolean boolean13 = integerInterval5.equals((java.lang.Object) intervalSegment11);
        java.lang.String str14 = integerInterval5.toString();
        java.lang.String str15 = integerInterval5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1--1}" + "'", str6, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{-1--1}" + "'", str14, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
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
        int int45 = integerInterval10.getStart();
        boolean boolean47 = integerInterval10.contains((int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList48 = integerInterval10.asStringList();
        com.greplin.interval.IntegerInterval integerInterval51 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str52 = integerInterval51.toString();
        java.lang.String str53 = integerInterval51.asString();
        int int54 = integerInterval51.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList55 = integerInterval51.asList();
        com.greplin.interval.IntegerInterval integerInterval58 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str59 = integerInterval58.toString();
        java.lang.String str60 = integerInterval58.asString();
        boolean boolean62 = integerInterval58.contains(10);
        java.lang.String str63 = integerInterval58.toString();
        boolean boolean64 = integerInterval51.intersects(integerInterval58);
        java.lang.String str65 = integerInterval51.toString();
        java.lang.String str66 = integerInterval51.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList67 = integerInterval51.asList();
        int int68 = integerInterval10.compareTo(integerInterval51);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "IntegerInterval{10-52}" + "'", str52, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10-52" + "'", str53, "10-52");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(intList55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IntegerInterval{10-52}" + "'", str59, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "10-52" + "'", str60, "10-52");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "IntegerInterval{10-52}" + "'", str63, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "IntegerInterval{10-52}" + "'", str65, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "10-52" + "'", str66, "10-52");
        org.junit.Assert.assertNotNull(intList67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
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
        boolean boolean85 = integerInterval41.contains((int) (byte) -1);
        int int86 = integerInterval41.getEnd();
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 52 + "'", int86 == 52);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = integerInterval26.asStringList();
        boolean boolean37 = integerInterval19.equals((java.lang.Object) integerInterval26);
        java.lang.String str38 = integerInterval26.toString();
        int int39 = integerInterval26.getEnd();
        boolean boolean41 = integerInterval26.contains((int) '4');
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
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
        java.lang.Object obj33 = null;
        boolean boolean34 = integerInterval23.equals(obj33);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{97-32}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{97\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
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
        boolean boolean25 = integerInterval2.contains((int) (short) -1);
        java.lang.String str26 = integerInterval2.asString();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "97-35" + "'", str26, "97-35");
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 0);
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
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        java.lang.String str8 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 32);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) '#');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) 'a');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(0);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval(32, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval8.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval8.asList();
        boolean boolean11 = integerInterval2.equals((java.lang.Object) intList10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean3 = integerInterval1.contains((int) (short) 1);
        int int4 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str9 = integerInterval8.toString();
        int int10 = integerInterval5.compareTo(integerInterval8);
        boolean boolean11 = integerInterval1.intersects(integerInterval8);
        boolean boolean13 = integerInterval8.contains((int) (byte) -1);
        int int14 = integerInterval8.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        int int14 = integerInterval11.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval11.asStringList();
        boolean boolean16 = integerInterval2.intersects(integerInterval11);
        int int17 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval21.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval21.asList();
        boolean boolean24 = integerInterval2.intersects(integerInterval21);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
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
        int int19 = integerInterval2.getEnd();
        java.lang.String str20 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval8.asStringList();
        java.lang.String str13 = integerInterval8.asString();
        int int14 = integerInterval8.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval8.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval8.asStringList();
        java.lang.String str17 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval8.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (-1));
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
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
        java.lang.String str18 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        int int12 = integerInterval8.getEnd();
        int int13 = integerInterval8.getStart();
        boolean boolean15 = integerInterval8.contains((int) (short) 1);
        boolean boolean17 = integerInterval8.contains((int) (short) -1);
        com.greplin.interval.IntegerInterval integerInterval19 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int20 = integerInterval19.getEnd();
        int int21 = integerInterval19.getStart();
        com.greplin.interval.IntervalSegment intervalSegment24 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        boolean boolean25 = integerInterval19.equals((java.lang.Object) intervalSegment24);
        long long26 = intervalSegment24.getStart();
        int int27 = intervalSegment24.getShift();
        boolean boolean28 = integerInterval8.equals((java.lang.Object) intervalSegment24);
        java.lang.Class<?> wildcardClass29 = intervalSegment24.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(integerInterval19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        // The following exception was thrown during execution in test generation
        try {
            com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("IntegerInterval{35-97}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IntegerInterval{35\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) 'a', (int) '#');
        java.lang.Object obj11 = null;
        boolean boolean12 = integerInterval10.equals(obj11);
        boolean boolean13 = integerInterval2.intersects(integerInterval10);
        java.lang.String str14 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval16 = com.greplin.interval.IntegerInterval.valueOf("35-100");
        int int17 = integerInterval16.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval16.asStringList();
        boolean boolean19 = integerInterval10.equals((java.lang.Object) integerInterval16);
        int int20 = integerInterval10.getStart();
        int int21 = integerInterval10.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{97-35}" + "'", str14, "IntegerInterval{97-35}");
        org.junit.Assert.assertNotNull(integerInterval16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean3 = integerInterval1.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        int int5 = integerInterval1.getStart();
        int int6 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (-1));
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, 52);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getEnd();
        int int3 = integerInterval1.getStart();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        boolean boolean7 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        long long8 = intervalSegment6.getStart();
        int int9 = intervalSegment6.getShift();
        int int10 = intervalSegment6.getShift();
        int int11 = intervalSegment6.getShift();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-35");
        int int2 = integerInterval1.getEnd();
        java.lang.String str3 = integerInterval1.asString();
        boolean boolean5 = integerInterval1.contains(1);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0-35" + "'", str3, "0-35");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (short) 10);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        boolean boolean11 = integerInterval5.equals((java.lang.Object) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval(0, (int) (short) -1);
        java.lang.String str15 = integerInterval14.asString();
        boolean boolean16 = integerInterval5.intersects(integerInterval14);
        int int17 = integerInterval14.getEnd();
        boolean boolean18 = integerInterval2.equals((java.lang.Object) int17);
        boolean boolean20 = integerInterval2.contains(32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0--1" + "'", str15, "0--1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
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
        java.lang.String str26 = integerInterval21.asString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52-10" + "'", str26, "52-10");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-10" + "'", str4, "10-10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int10 = integerInterval2.compareTo(integerInterval9);
        int int11 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass12 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{52--1}" + "'", str3, "IntegerInterval{52--1}");
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) '#');
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (short) -1, 35);
        boolean boolean7 = integerInterval2.equals((java.lang.Object) 35);
        int int8 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-35}" + "'", str3, "IntegerInterval{0-35}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 97);
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-97" + "'", str3, "1-97");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
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
        long long12 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (int) '4');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = integerInterval2.asStringList();
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
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, 97);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        boolean boolean14 = integerInterval8.contains(0);
        int int15 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        java.lang.String str8 = integerInterval2.asString();
        com.greplin.interval.IntervalSegment intervalSegment11 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) 'a');
        int int12 = intervalSegment11.getShift();
        int int13 = intervalSegment11.getShift();
        boolean boolean14 = integerInterval2.equals((java.lang.Object) intervalSegment11);
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 10);
        int int18 = integerInterval17.getEnd();
        boolean boolean19 = integerInterval2.equals((java.lang.Object) integerInterval17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList42 = integerInterval30.asList();
        java.lang.String str43 = integerInterval30.asString();
        int int44 = integerInterval30.getStart();
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
        org.junit.Assert.assertNotNull(intList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10-52" + "'", str43, "10-52");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval5.getEnd();
        java.lang.String str8 = integerInterval5.asString();
        int int9 = integerInterval5.getStart();
        int int10 = integerInterval5.getStart();
        java.lang.String str11 = integerInterval5.toString();
        boolean boolean12 = integerInterval2.intersects(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval2.asList();
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
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) -1);
        boolean boolean4 = integerInterval2.contains(1);
        boolean boolean6 = integerInterval2.contains((int) (short) 10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) '#');
        java.lang.String str10 = integerInterval9.asString();
        boolean boolean12 = integerInterval9.contains((int) ' ');
        boolean boolean13 = integerInterval2.intersects(integerInterval9);
        int int14 = integerInterval9.getStart();
        java.lang.String str15 = integerInterval9.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-35" + "'", str10, "10-35");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-35" + "'", str15, "10-35");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        boolean boolean4 = integerInterval2.contains(97);
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
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
        int int44 = integerInterval38.getEnd();
        boolean boolean46 = integerInterval38.contains(1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList47 = integerInterval38.asList();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(intList47);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        java.lang.String str10 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1--1" + "'", str9, "-1--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval22.asList();
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) '4');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (short) -1);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, 35);
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
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (-1));
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval(32, 10);
        int int7 = integerInterval2.compareTo(integerInterval6);
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0--1" + "'", str8, "0--1");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (short) -1);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        boolean boolean6 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35--1}" + "'", str3, "IntegerInterval{35--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = com.greplin.interval.IntegerInterval.valueOf("1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval6.asStringList();
        boolean boolean8 = integerInterval2.intersects(integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100--1" + "'", str3, "100--1");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(integerInterval6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 0);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        int int13 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
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
        java.lang.String str27 = integerInterval8.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval11.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{35-10}" + "'", str18, "IntegerInterval{35-10}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        boolean boolean4 = integerInterval2.contains(97);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(35);
        java.lang.String str10 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
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
        java.lang.String str34 = integerInterval2.toString();
        int int35 = integerInterval2.getStart();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        java.lang.String str11 = integerInterval6.toString();
        int int12 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval6.asStringList();
        boolean boolean15 = integerInterval6.contains(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{-1--1}" + "'", str11, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) '4');
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        int int9 = intervalSegment6.getShift();
        long long10 = intervalSegment6.getStart();
        int int11 = intervalSegment6.getShift();
        long long12 = intervalSegment6.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
    }
}

