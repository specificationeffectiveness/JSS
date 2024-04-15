package com.greplin.interval;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str6 = integerInterval5.asString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str10 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean14 = integerInterval9.intersects(integerInterval13);
        boolean boolean16 = integerInterval13.contains(0);
        java.lang.String str17 = integerInterval13.asString();
        boolean boolean18 = integerInterval5.equals((java.lang.Object) integerInterval13);
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 100);
        java.lang.String str27 = integerInterval24.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 1);
        int int33 = integerInterval24.compareTo(integerInterval30);
        java.lang.String str34 = integerInterval30.asString();
        boolean boolean35 = integerInterval21.intersects(integerInterval30);
        com.greplin.interval.IntegerInterval integerInterval37 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean38 = integerInterval30.intersects(integerInterval37);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval37.asList();
        boolean boolean40 = integerInterval5.equals((java.lang.Object) integerInterval37);
        java.lang.String str41 = integerInterval5.toString();
        boolean boolean42 = integerInterval2.equals((java.lang.Object) str41);
        int int43 = integerInterval2.getStart();
        int int44 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList45 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100--1" + "'", str6, "100--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1--1" + "'", str17, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(integerInterval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{100--1}" + "'", str41, "IntegerInterval{100--1}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) '#');
        boolean boolean4 = integerInterval2.contains(1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-35" + "'", str6, "-1-35");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) '#');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-35}" + "'", str3, "IntegerInterval{0-35}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52-10");
        boolean boolean3 = integerInterval1.contains((int) (byte) -1);
        int int4 = integerInterval1.getEnd();
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList45 = integerInterval43.asList();
        int int46 = integerInterval23.compareTo(integerInterval43);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList47 = integerInterval23.asList();
        boolean boolean49 = integerInterval23.contains(100);
        boolean boolean50 = integerInterval1.intersects(integerInterval23);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList51 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(integerInterval23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IntegerInterval{10-52}" + "'", str33, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10-52" + "'", str40, "10-52");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(integerInterval43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intList51);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        int int18 = integerInterval11.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1--1" + "'", str16, "-1--1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{-1--1}" + "'", str17, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass24 = intList23.getClass();
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
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, 35);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) 'a');
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getStart();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{1-100}" + "'", str5, "IntegerInterval{1-100}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (-1));
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = integerInterval32.asStringList();
        boolean boolean63 = integerInterval32.contains((int) ' ');
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
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0-35" + "'", str4, "0-35");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) ' ');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) '#');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, 32);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass5 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean18 = integerInterval16.contains((int) (short) 100);
        java.lang.String str19 = integerInterval16.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 1);
        int int25 = integerInterval16.compareTo(integerInterval22);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = integerInterval22.asStringList();
        java.lang.String str27 = integerInterval22.asString();
        boolean boolean28 = integerInterval2.intersects(integerInterval22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-52" + "'", str27, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 32);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{32-32}" + "'", str4, "IntegerInterval{32-32}");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 97);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, 1);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass8 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        java.lang.String str5 = integerInterval2.toString();
        boolean boolean7 = integerInterval2.contains((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        int int11 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        java.lang.String str4 = integerInterval1.asString();
        int int5 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52--1" + "'", str4, "52--1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (short) 100);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        int int5 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-100" + "'", str3, "-1-100");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        boolean boolean27 = integerInterval18.contains((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = integerInterval18.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), (-1));
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) -1);
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
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) (short) 100);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{32-100}" + "'", str3, "IntegerInterval{32-100}");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, 32);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        boolean boolean27 = integerInterval18.contains((int) (short) 0);
        int int28 = integerInterval18.getStart();
        int int29 = integerInterval18.getEnd();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass4 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        boolean boolean7 = integerInterval2.contains((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 52);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        boolean boolean40 = integerInterval25.contains((int) (short) 0);
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
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = integerInterval10.asStringList();
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
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
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        int int49 = integerInterval2.getEnd();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (byte) 0);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-0}" + "'", str3, "IntegerInterval{0-0}");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-0");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        int int3 = integerInterval1.getEnd();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getStart();
        boolean boolean7 = integerInterval2.contains((int) '#');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 100);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean4 = integerInterval2.contains((int) 'a');
        boolean boolean6 = integerInterval2.contains((int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1--1" + "'", str8, "1--1");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = integerInterval9.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.lang.String str23 = integerInterval15.asString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0--1" + "'", str23, "0--1");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.String str6 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        java.lang.Class<?> wildcardClass4 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) ' ', (-1));
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        int int23 = integerInterval12.getEnd();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) '#');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        java.lang.Class<?> wildcardClass41 = integerInterval8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, 1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-1}" + "'", str3, "IntegerInterval{-1-1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1-1" + "'", str4, "-1-1");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        java.lang.String str7 = integerInterval2.toString();
        int int8 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-100" + "'", str4, "35-100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{35-100}" + "'", str7, "IntegerInterval{35-100}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval13.asList();
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        boolean boolean10 = integerInterval2.contains((int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval2.asStringList();
        int int12 = integerInterval2.getEnd();
        int int13 = integerInterval2.getEnd();
        boolean boolean15 = integerInterval2.contains(97);
        boolean boolean17 = integerInterval2.contains((int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        int int8 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean13 = integerInterval11.contains((int) (short) 100);
        int int14 = integerInterval2.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval2.asStringList();
        int int16 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 1);
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
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) 'a');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        java.lang.String str15 = integerInterval2.toString();
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
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (-1));
        com.greplin.interval.IntervalSegment intervalSegment5 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 0);
        long long6 = intervalSegment5.getStart();
        long long7 = intervalSegment5.getStart();
        java.lang.Class<?> wildcardClass8 = intervalSegment5.getClass();
        boolean boolean9 = integerInterval2.equals((java.lang.Object) intervalSegment5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) '#');
        int int3 = integerInterval2.getEnd();
        boolean boolean5 = integerInterval2.contains((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 100);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{100-0}" + "'", str4, "IntegerInterval{100-0}");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        boolean boolean50 = integerInterval34.contains((int) 'a');
        java.lang.Class<?> wildcardClass51 = integerInterval34.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 32);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = integerInterval8.asStringList();
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
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        com.greplin.interval.IntegerInterval integerInterval27 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str28 = integerInterval27.toString();
        int int29 = integerInterval27.getEnd();
        int int30 = integerInterval27.getStart();
        int int31 = integerInterval21.compareTo(integerInterval27);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList32 = integerInterval21.asList();
        int int33 = integerInterval21.getStart();
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
        org.junit.Assert.assertNotNull(integerInterval27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        int int70 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass71 = integerInterval2.getClass();
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        boolean boolean6 = integerInterval2.contains((int) (byte) 1);
        int int7 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) -1);
        boolean boolean4 = integerInterval2.contains(1);
        boolean boolean6 = integerInterval2.contains(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.lang.String str21 = integerInterval18.asString();
        com.greplin.interval.IntervalSegment intervalSegment24 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int25 = intervalSegment24.getShift();
        long long26 = intervalSegment24.getStart();
        long long27 = intervalSegment24.getStart();
        int int28 = intervalSegment24.getShift();
        int int29 = intervalSegment24.getShift();
        long long30 = intervalSegment24.getStart();
        int int31 = intervalSegment24.getShift();
        int int32 = intervalSegment24.getShift();
        int int33 = intervalSegment24.getShift();
        int int34 = intervalSegment24.getShift();
        long long35 = intervalSegment24.getStart();
        boolean boolean36 = integerInterval18.equals((java.lang.Object) intervalSegment24);
        java.lang.String str37 = integerInterval18.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "35-1" + "'", str21, "35-1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IntegerInterval{35-1}" + "'", str37, "IntegerInterval{35-1}");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) ' ');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains((int) (byte) 0);
        boolean boolean7 = integerInterval2.contains(0);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean8 = integerInterval6.contains((int) (short) 100);
        java.lang.String str9 = integerInterval6.asString();
        java.lang.String str10 = integerInterval6.asString();
        boolean boolean12 = integerInterval6.contains(97);
        boolean boolean13 = integerInterval1.equals((java.lang.Object) integerInterval6);
        boolean boolean15 = integerInterval1.contains(10);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getEnd();
        int int3 = integerInterval1.getStart();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (short) -1, (int) 'a');
        boolean boolean7 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        long long8 = intervalSegment6.getStart();
        int int9 = intervalSegment6.getShift();
        long long10 = intervalSegment6.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        int int11 = integerInterval2.getEnd();
        int int12 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval2.asStringList();
        int int14 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        java.lang.String str24 = integerInterval19.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{52-10}" + "'", str24, "IntegerInterval{52-10}");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, 32);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', 97);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean7 = integerInterval5.contains((int) (short) 100);
        java.lang.String str8 = integerInterval5.asString();
        java.lang.String str9 = integerInterval5.toString();
        boolean boolean10 = integerInterval2.intersects(integerInterval5);
        java.lang.String str11 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        boolean boolean14 = integerInterval2.contains(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{35-100}" + "'", str11, "IntegerInterval{35-100}");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, 10);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{100-10}" + "'", str3, "IntegerInterval{100-10}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval5.asList();
        java.lang.String str7 = integerInterval5.asString();
        boolean boolean9 = integerInterval5.contains((int) (byte) 0);
        int int10 = integerInterval2.compareTo(integerInterval5);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList11 = integerInterval5.asList();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35-1" + "'", str7, "35-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str18 = integerInterval17.toString();
        java.lang.String str19 = integerInterval17.asString();
        int int20 = integerInterval17.getStart();
        java.lang.String str21 = integerInterval17.toString();
        int int22 = integerInterval17.getStart();
        int int23 = integerInterval17.getEnd();
        java.lang.String str24 = integerInterval17.asString();
        boolean boolean25 = integerInterval2.intersects(integerInterval17);
        int int26 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10-52" + "'", str19, "10-52");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10-52" + "'", str24, "10-52");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        boolean boolean5 = integerInterval2.contains(10);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) 'a');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 1);
        boolean boolean7 = integerInterval5.contains((int) (short) 1);
        int int8 = integerInterval2.compareTo(integerInterval5);
        int int9 = integerInterval5.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (byte) -1);
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
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        java.lang.String str19 = integerInterval9.toString();
        int int20 = integerInterval9.getEnd();
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
        int int76 = integerInterval69.getStart();
        int int77 = integerInterval69.getEnd();
        boolean boolean78 = integerInterval9.intersects(integerInterval69);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList79 = integerInterval9.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(intList79);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        java.lang.String str66 = integerInterval48.toString();
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
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (byte) -1);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList54 = integerInterval11.asStringList();
        int int55 = integerInterval11.getStart();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        int int23 = integerInterval1.getStart();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        boolean boolean4 = integerInterval2.contains((int) ' ');
        com.greplin.interval.IntegerInterval integerInterval6 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        boolean boolean7 = integerInterval2.equals((java.lang.Object) integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(integerInterval6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 97);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (byte) -1);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, (int) (short) 10);
        com.greplin.interval.IntegerInterval integerInterval4 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int5 = integerInterval4.getStart();
        java.lang.String str6 = integerInterval4.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval4.asStringList();
        boolean boolean8 = integerInterval2.intersects(integerInterval4);
        int int9 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(integerInterval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1-52" + "'", str6, "-1-52");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        boolean boolean57 = integerInterval8.contains((int) '4');
        int int58 = integerInterval8.getEnd();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        int int42 = integerInterval38.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = integerInterval38.asStringList();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval9.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval9.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = integerInterval9.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        boolean boolean9 = integerInterval2.contains((int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        int int11 = integerInterval2.getStart();
        java.lang.String str12 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = integerInterval28.asStringList();
        boolean boolean30 = integerInterval7.intersects(integerInterval28);
        com.greplin.interval.IntegerInterval integerInterval33 = new com.greplin.interval.IntegerInterval((int) '#', 32);
        boolean boolean34 = integerInterval28.intersects(integerInterval33);
        java.lang.String str35 = integerInterval28.asString();
        java.lang.Object obj36 = null;
        boolean boolean37 = integerInterval28.equals(obj36);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList38 = integerInterval28.asList();
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
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "97-0" + "'", str35, "97-0");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intList38);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        int int4 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval1.asStringList();
        int int6 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean4 = integerInterval2.contains((int) 'a');
        boolean boolean6 = integerInterval2.contains((int) (byte) 10);
        int int7 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass8 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        boolean boolean17 = integerInterval9.contains((int) (byte) 100);
        int int18 = integerInterval9.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) ' ');
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1-1}" + "'", str4, "IntegerInterval{-1-1}");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) 'a');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-97");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean6 = integerInterval4.equals((java.lang.Object) "");
        int int7 = integerInterval4.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval4.asStringList();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) 100);
        int int12 = integerInterval4.compareTo(integerInterval11);
        java.lang.String str13 = integerInterval4.asString();
        int int14 = integerInterval1.compareTo(integerInterval4);
        boolean boolean16 = integerInterval1.contains(100);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1-52" + "'", str13, "-1-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(10);
        int int6 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        int int13 = intervalSegment2.getShift();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) ' ');
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 32);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        int int39 = integerInterval11.getEnd();
        int int40 = integerInterval11.getStart();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 32);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) (byte) 0);
        boolean boolean4 = integerInterval2.contains((int) '#');
        java.lang.String str5 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0-0" + "'", str5, "0-0");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.asString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str18 = integerInterval17.toString();
        int int19 = integerInterval14.compareTo(integerInterval17);
        int int20 = integerInterval17.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval17.asStringList();
        boolean boolean22 = integerInterval8.intersects(integerInterval17);
        int int23 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = integerInterval8.asStringList();
        boolean boolean25 = integerInterval2.equals((java.lang.Object) strList24);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) 0);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        java.lang.String str40 = integerInterval8.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        int int75 = integerInterval21.getStart();
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
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int2 = integerInterval1.getStart();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(0, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval5.asStringList();
        boolean boolean7 = integerInterval1.intersects(integerInterval5);
        boolean boolean9 = integerInterval1.contains((int) (short) 100);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-1}" + "'", str3, "IntegerInterval{1-1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{1-1}" + "'", str4, "IntegerInterval{1-1}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{1-1}" + "'", str5, "IntegerInterval{1-1}");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, 0);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        int int6 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass8 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-1}" + "'", str4, "IntegerInterval{52-1}");
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (-1));
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10--1" + "'", str3, "10--1");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        int int18 = integerInterval15.getEnd();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, 0);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) 'a');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, 10);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-52");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval4.asList();
        boolean boolean6 = integerInterval1.intersects(integerInterval4);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) 100);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval2.asStringList();
        java.lang.String str17 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        int int10 = integerInterval5.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = integerInterval5.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval5.asStringList();
        boolean boolean14 = integerInterval5.contains(10);
        java.lang.String str15 = integerInterval5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{10-52}" + "'", str15, "IntegerInterval{10-52}");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) '#');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("32-100");
        java.lang.String str2 = integerInterval1.toString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{32-100}" + "'", str2, "IntegerInterval{32-100}");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        boolean boolean10 = integerInterval2.contains((int) (short) -1);
        int int11 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{-1-52}" + "'", str6, "IntegerInterval{-1-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1-52" + "'", str7, "-1-52");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int10 = integerInterval2.compareTo(integerInterval9);
        java.lang.String str11 = integerInterval2.asString();
        int int12 = integerInterval2.getEnd();
        java.lang.String str13 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-1");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        java.lang.String str26 = integerInterval2.toString();
        java.lang.String str27 = integerInterval2.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{-1--1}" + "'", str26, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{-1--1}" + "'", str27, "IntegerInterval{-1--1}");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (short) 0);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{100-0}" + "'", str3, "IntegerInterval{100-0}");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, 52);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        com.greplin.interval.IntegerInterval integerInterval40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = integerInterval8.intersects(integerInterval40);
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
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean9 = integerInterval7.contains((int) (short) 100);
        java.lang.String str10 = integerInterval7.toString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean15 = integerInterval13.contains((int) (short) 1);
        int int16 = integerInterval7.compareTo(integerInterval13);
        java.lang.String str17 = integerInterval13.asString();
        java.lang.String str18 = integerInterval13.asString();
        java.lang.String str19 = integerInterval13.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean24 = integerInterval22.contains((int) (short) 100);
        java.lang.String str25 = integerInterval22.toString();
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean30 = integerInterval28.contains((int) (short) 1);
        int int31 = integerInterval22.compareTo(integerInterval28);
        java.lang.String str32 = integerInterval28.asString();
        java.lang.String str33 = integerInterval28.asString();
        int int34 = integerInterval13.compareTo(integerInterval28);
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str38 = integerInterval37.toString();
        java.lang.String str39 = integerInterval37.asString();
        boolean boolean41 = integerInterval37.contains(10);
        java.lang.String str42 = integerInterval37.toString();
        boolean boolean43 = integerInterval13.intersects(integerInterval37);
        com.greplin.interval.IntegerInterval integerInterval46 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        boolean boolean47 = integerInterval37.intersects(integerInterval46);
        int int48 = integerInterval37.getEnd();
        int int49 = integerInterval37.getEnd();
        boolean boolean50 = integerInterval2.intersects(integerInterval37);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10-52" + "'", str17, "10-52");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{10-52}" + "'", str19, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IntegerInterval{10-52}" + "'", str25, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-52" + "'", str32, "10-52");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10-52" + "'", str33, "10-52");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10-52" + "'", str39, "10-52");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "IntegerInterval{10-52}" + "'", str42, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.lang.Class<?> wildcardClass94 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        int int57 = integerInterval14.getEnd();
        int int58 = integerInterval14.getEnd();
        java.lang.Object obj59 = null;
        boolean boolean60 = integerInterval14.equals(obj59);
        java.lang.String str61 = integerInterval14.toString();
        com.greplin.interval.IntegerInterval integerInterval64 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (short) -1);
        com.greplin.interval.IntegerInterval integerInterval66 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.greplin.interval.IntegerInterval integerInterval69 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str70 = integerInterval69.toString();
        com.greplin.interval.IntegerInterval integerInterval73 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean74 = integerInterval69.intersects(integerInterval73);
        int int75 = integerInterval66.compareTo(integerInterval73);
        boolean boolean76 = integerInterval64.intersects(integerInterval66);
        int int77 = integerInterval64.getEnd();
        boolean boolean78 = integerInterval14.intersects(integerInterval64);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "IntegerInterval{10-52}" + "'", str61, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(integerInterval66);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IntegerInterval{-1--1}" + "'", str70, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval8.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList15 = integerInterval8.asList();
        int int16 = integerInterval8.getEnd();
        java.lang.Class<?> wildcardClass17 = integerInterval8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        boolean boolean36 = integerInterval11.contains(0);
        int int37 = integerInterval11.getEnd();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        java.lang.String str18 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1--1" + "'", str13, "-1--1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{-1--1}" + "'", str18, "IntegerInterval{-1--1}");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getStart();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        boolean boolean3 = integerInterval1.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        int int5 = integerInterval1.getStart();
        java.lang.Class<?> wildcardClass6 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        boolean boolean13 = integerInterval8.contains(0);
        com.greplin.interval.IntegerInterval integerInterval14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = integerInterval8.intersects(integerInterval14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10--1" + "'", str3, "10--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10--1" + "'", str5, "10--1");
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        java.lang.String str35 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList37 = integerInterval2.asList();
        java.lang.String str38 = integerInterval2.asString();
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
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertNotNull(intList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10-52" + "'", str38, "10-52");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 1);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        java.lang.String str5 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{52-1}" + "'", str5, "IntegerInterval{52-1}");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList26 = integerInterval8.asList();
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
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) '#');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(32, (int) (byte) -1);
        java.lang.String str6 = integerInterval5.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval5.asStringList();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (-1));
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str14 = integerInterval13.asString();
        com.greplin.interval.IntegerInterval integerInterval17 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str18 = integerInterval17.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean22 = integerInterval17.intersects(integerInterval21);
        boolean boolean24 = integerInterval21.contains(0);
        java.lang.String str25 = integerInterval21.asString();
        boolean boolean26 = integerInterval13.equals((java.lang.Object) integerInterval21);
        int int27 = integerInterval10.compareTo(integerInterval13);
        int int28 = integerInterval5.compareTo(integerInterval10);
        int int29 = integerInterval2.compareTo(integerInterval10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{32--1}" + "'", str6, "IntegerInterval{32--1}");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100--1" + "'", str14, "100--1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{-1--1}" + "'", str18, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1--1" + "'", str25, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass7 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 97);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(97, (int) (short) 0);
        boolean boolean6 = integerInterval2.equals((java.lang.Object) 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        java.lang.Object obj92 = null;
        boolean boolean93 = integerInterval8.equals(obj92);
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, 32);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{1-32}" + "'", str3, "IntegerInterval{1-32}");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 10);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        int int6 = integerInterval2.getEnd();
        int int7 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        int int11 = intervalSegment2.getShift();
        int int12 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-32");
        java.lang.Class<?> wildcardClass2 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean11 = integerInterval9.contains((int) (short) 100);
        int int12 = integerInterval2.compareTo(integerInterval9);
        int int13 = integerInterval9.getStart();
        boolean boolean15 = integerInterval9.contains((int) ' ');
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str19 = integerInterval18.toString();
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean23 = integerInterval18.intersects(integerInterval22);
        java.lang.String str24 = integerInterval22.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval22.asList();
        java.lang.String str26 = integerInterval22.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList27 = integerInterval22.asList();
        boolean boolean28 = integerInterval9.intersects(integerInterval22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IntegerInterval{-1--1}" + "'", str19, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1--1" + "'", str24, "-1--1");
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{-1--1}" + "'", str26, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) ' ');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, 97);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 52);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        java.lang.String str9 = integerInterval2.asString();
        int int10 = integerInterval2.getStart();
        java.lang.Class<?> wildcardClass11 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        int int10 = integerInterval6.getEnd();
        int int11 = integerInterval6.getStart();
        boolean boolean13 = integerInterval6.contains((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{32-100}" + "'", str4, "IntegerInterval{32-100}");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.lang.String str21 = integerInterval8.toString();
        java.lang.String str22 = integerInterval8.asString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IntegerInterval{10-52}" + "'", str21, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval21.asList();
        java.lang.Class<?> wildcardClass26 = integerInterval21.getClass();
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
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) '#');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        boolean boolean6 = integerInterval2.contains((-1));
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) ' ');
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-32" + "'", str3, "100-32");
        org.junit.Assert.assertNotNull(intList4);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        java.lang.Class<?> wildcardClass29 = integerInterval21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval6.asStringList();
        int int9 = integerInterval6.getEnd();
        java.lang.Class<?> wildcardClass10 = integerInterval6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) ' ', (int) '4');
        int int3 = integerInterval2.getEnd();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) '4');
        int int7 = integerInterval2.compareTo(integerInterval6);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval6.asList();
        java.lang.String str9 = integerInterval6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{1-52}" + "'", str9, "IntegerInterval{1-52}");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        int int6 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        int int8 = integerInterval2.getStart();
        java.lang.String str9 = integerInterval2.asString();
        boolean boolean11 = integerInterval2.contains(35);
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1-52" + "'", str9, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) '#');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, 35);
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-35" + "'", str3, "100-35");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        java.lang.String str16 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str20 = integerInterval19.asString();
        boolean boolean22 = integerInterval19.contains((int) (short) 0);
        java.lang.String str23 = integerInterval19.asString();
        boolean boolean24 = integerInterval8.intersects(integerInterval19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1-52" + "'", str20, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1-52" + "'", str23, "-1-52");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        int int6 = integerInterval2.getStart();
        java.lang.String str7 = integerInterval2.asString();
        java.lang.String str8 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35-10" + "'", str4, "35-10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35-10" + "'", str7, "35-10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{35-10}" + "'", str8, "IntegerInterval{35-10}");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        java.lang.Class<?> wildcardClass16 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) '4');
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, 0);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52-0" + "'", str4, "52-0");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, 100);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval(0, (int) (short) 100);
        boolean boolean6 = integerInterval2.equals((java.lang.Object) 0);
        boolean boolean8 = integerInterval2.contains(32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.toString();
        boolean boolean7 = integerInterval2.contains(32);
        boolean boolean9 = integerInterval2.contains(35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-52" + "'", str3, "-1-52");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{-1-52}" + "'", str5, "IntegerInterval{-1-52}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (-1));
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, 52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{100-52}" + "'", str4, "IntegerInterval{100-52}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) (short) 100);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) 'a');
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (byte) -1);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        java.lang.String str26 = integerInterval8.asString();
        int int27 = integerInterval8.getEnd();
        java.lang.String str28 = integerInterval8.toString();
        java.lang.String str29 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList30 = integerInterval8.asList();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10-52" + "'", str26, "10-52");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IntegerInterval{10-52}" + "'", str28, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        boolean boolean7 = integerInterval2.contains((int) (short) 1);
        int int8 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '4');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, 10);
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 10);
        int int3 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10--1" + "'", str3, "10--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        java.lang.String str8 = integerInterval6.asString();
        java.lang.String str9 = integerInterval6.toString();
        java.lang.String str10 = integerInterval6.asString();
        java.lang.Class<?> wildcardClass11 = integerInterval6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1--1" + "'", str8, "-1--1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.contains((int) (short) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = integerInterval2.equals(obj5);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', 0);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str6 = integerInterval5.asString();
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str10 = integerInterval9.toString();
        com.greplin.interval.IntegerInterval integerInterval13 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean14 = integerInterval9.intersects(integerInterval13);
        boolean boolean16 = integerInterval13.contains(0);
        java.lang.String str17 = integerInterval13.asString();
        boolean boolean18 = integerInterval5.equals((java.lang.Object) integerInterval13);
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval24 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean26 = integerInterval24.contains((int) (short) 100);
        java.lang.String str27 = integerInterval24.toString();
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean32 = integerInterval30.contains((int) (short) 1);
        int int33 = integerInterval24.compareTo(integerInterval30);
        java.lang.String str34 = integerInterval30.asString();
        boolean boolean35 = integerInterval21.intersects(integerInterval30);
        com.greplin.interval.IntegerInterval integerInterval37 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean38 = integerInterval30.intersects(integerInterval37);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList39 = integerInterval37.asList();
        boolean boolean40 = integerInterval5.equals((java.lang.Object) integerInterval37);
        java.lang.String str41 = integerInterval5.toString();
        boolean boolean42 = integerInterval2.equals((java.lang.Object) str41);
        int int43 = integerInterval2.getStart();
        java.lang.String str44 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100--1" + "'", str6, "100--1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1--1" + "'", str17, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "IntegerInterval{10-52}" + "'", str27, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(integerInterval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "IntegerInterval{100--1}" + "'", str41, "IntegerInterval{100--1}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "IntegerInterval{35-0}" + "'", str44, "IntegerInterval{35-0}");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("35-10");
        int int2 = integerInterval1.getStart();
        java.lang.String str3 = integerInterval1.toString();
        com.greplin.interval.IntegerInterval integerInterval4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = integerInterval1.intersects(integerInterval4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{35-10}" + "'", str3, "IntegerInterval{35-10}");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32--1" + "'", str4, "32--1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1-1");
        java.lang.String str2 = integerInterval1.toString();
        java.lang.Class<?> wildcardClass3 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{-1-1}" + "'", str2, "IntegerInterval{-1-1}");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        java.lang.String str22 = integerInterval8.asString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        int int7 = integerInterval2.compareTo(integerInterval5);
        boolean boolean9 = integerInterval5.contains((int) (short) -1);
        int int10 = integerInterval5.getEnd();
        java.lang.String str11 = integerInterval5.asString();
        java.lang.String str12 = integerInterval5.asString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        int int5 = integerInterval2.getEnd();
        boolean boolean7 = integerInterval2.contains(52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        java.lang.String str24 = integerInterval2.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        java.lang.String str29 = integerInterval11.asString();
        java.lang.String str30 = integerInterval11.asString();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-52" + "'", str29, "10-52");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 52);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 0);
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval21.asList();
        int int24 = integerInterval21.getStart();
        com.greplin.interval.IntervalSegment intervalSegment27 = new com.greplin.interval.IntervalSegment((long) 0, (int) (short) 100);
        boolean boolean28 = integerInterval21.equals((java.lang.Object) intervalSegment27);
        boolean boolean30 = integerInterval21.contains((int) (short) 0);
        int int31 = integerInterval21.getStart();
        int int32 = integerInterval2.compareTo(integerInterval21);
        int int33 = integerInterval21.getEnd();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(integerInterval21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        java.lang.String str34 = integerInterval23.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        boolean boolean37 = integerInterval31.contains((int) (short) -1);
        int int38 = integerInterval31.getStart();
        int int39 = integerInterval31.getEnd();
        int int40 = integerInterval31.getEnd();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        java.lang.String str18 = integerInterval2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-52" + "'", str8, "10-52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{35-100}" + "'", str18, "IntegerInterval{35-100}");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-1");
        int int2 = integerInterval1.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval1.asList();
        int int4 = integerInterval1.getEnd();
        int int5 = integerInterval1.getStart();
        java.lang.String str6 = integerInterval1.toString();
        int int7 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-1}" + "'", str6, "IntegerInterval{10-1}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '#', (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 97);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) 'a');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        com.greplin.interval.IntegerInterval integerInterval20 = new com.greplin.interval.IntegerInterval(1, (-1));
        int int21 = integerInterval20.getStart();
        int int22 = integerInterval8.compareTo(integerInterval20);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList23 = integerInterval20.asList();
        java.lang.Class<?> wildcardClass24 = integerInterval20.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(52, (int) (short) 10);
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.toString();
        int int5 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{52-10}" + "'", str4, "IntegerInterval{52-10}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 97);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32-97" + "'", str4, "32-97");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        int int20 = integerInterval11.getStart();
        java.lang.String str21 = integerInterval11.asString();
        int int22 = integerInterval11.getStart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(integerInterval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10-52" + "'", str21, "10-52");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) ' ', 100);
        com.greplin.interval.IntegerInterval integerInterval20 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval20.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval20.asList();
        java.lang.String str23 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval26.asList();
        int int37 = integerInterval26.getEnd();
        int int38 = integerInterval20.compareTo(integerInterval26);
        int int39 = integerInterval18.compareTo(integerInterval20);
        int int40 = integerInterval2.compareTo(integerInterval18);
        int int41 = integerInterval18.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(integerInterval20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.String str6 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, (int) (short) 1);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        long long8 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        java.lang.Class<?> wildcardClass24 = integerInterval2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        boolean boolean93 = integerInterval63.contains((int) (byte) 10);
        java.lang.String str94 = integerInterval63.asString();
        int int95 = integerInterval63.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "-1--1" + "'", str94, "-1--1");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        java.lang.String str5 = integerInterval2.toString();
        java.lang.Class<?> wildcardClass6 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-100}" + "'", str5, "IntegerInterval{10-100}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, (int) (short) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(1L, (int) ' ');
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = com.greplin.interval.IntegerInterval.valueOf("-1-52");
        int int7 = integerInterval6.getStart();
        boolean boolean8 = integerInterval2.intersects(integerInterval6);
        int int9 = integerInterval2.getEnd();
        java.lang.String str10 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(integerInterval6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        java.lang.String str5 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52--1" + "'", str5, "52--1");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        int int22 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(32, 1);
        int int3 = integerInterval2.getEnd();
        java.lang.String str4 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval7 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str8 = integerInterval7.toString();
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean12 = integerInterval7.intersects(integerInterval11);
        int int13 = integerInterval7.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval7.asList();
        java.lang.String str15 = integerInterval7.toString();
        boolean boolean17 = integerInterval7.contains((int) (byte) 100);
        boolean boolean18 = integerInterval2.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{32-1}" + "'", str4, "IntegerInterval{32-1}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IntegerInterval{-1--1}" + "'", str15, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32-1" + "'", str19, "32-1");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) -1, (int) (byte) 100);
        int int3 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass15 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{-1--1}" + "'", str10, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 0);
        int int3 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) 'a');
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) ' ');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 1, (int) 'a');
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        int int49 = integerInterval34.getStart();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        java.lang.String str65 = integerInterval40.toString();
        java.lang.String str66 = integerInterval40.toString();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "IntegerInterval{-1--1}" + "'", str65, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "IntegerInterval{-1--1}" + "'", str66, "IntegerInterval{-1--1}");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, 10);
        java.lang.Class<?> wildcardClass3 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) 100);
        int int3 = integerInterval2.getEnd();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        int int4 = integerInterval2.getEnd();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) 'a', (int) '#');
        java.lang.Object obj3 = null;
        boolean boolean4 = integerInterval2.equals(obj3);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        int int6 = integerInterval2.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.lang.Class<?> wildcardClass14 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0-1" + "'", str11, "0-1");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{0-1}" + "'", str13, "IntegerInterval{0-1}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 100, (int) (byte) 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        java.lang.String str9 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean14 = integerInterval12.equals((java.lang.Object) "");
        int int15 = integerInterval12.getEnd();
        boolean boolean16 = integerInterval5.intersects(integerInterval12);
        java.lang.String str17 = integerInterval5.toString();
        boolean boolean19 = integerInterval5.contains((int) (short) 0);
        com.greplin.interval.IntegerInterval integerInterval22 = new com.greplin.interval.IntegerInterval((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass23 = integerInterval22.getClass();
        boolean boolean24 = integerInterval5.equals((java.lang.Object) wildcardClass23);
        boolean boolean25 = integerInterval2.equals((java.lang.Object) boolean24);
        java.lang.String str26 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IntegerInterval{10-52}" + "'", str17, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IntegerInterval{100-1}" + "'", str26, "IntegerInterval{100-1}");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        int int4 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10--1" + "'", str3, "10--1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10--1}" + "'", str6, "IntegerInterval{10--1}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10--1" + "'", str7, "10--1");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (int) ' ');
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, 35);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 35, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        boolean boolean5 = integerInterval2.contains(97);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, 10);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        java.lang.String str11 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str16 = integerInterval15.asString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str20 = integerInterval19.toString();
        boolean boolean22 = integerInterval19.contains(52);
        java.lang.String str23 = integerInterval19.asString();
        boolean boolean25 = integerInterval19.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = integerInterval15.intersects(integerInterval19);
        int int27 = integerInterval19.getStart();
        java.lang.String str28 = integerInterval19.asString();
        int int29 = integerInterval2.compareTo(integerInterval19);
        java.lang.String str30 = integerInterval19.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100--1" + "'", str16, "100--1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{-1--1}" + "'", str20, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1--1" + "'", str23, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1--1" + "'", str28, "-1--1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "IntegerInterval{-1--1}" + "'", str30, "IntegerInterval{-1--1}");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, (int) 'a');
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 32, 100);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        int int33 = integerInterval30.getEnd();
        java.lang.String str34 = integerInterval30.asString();
        int int35 = integerInterval30.getStart();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1-1" + "'", str34, "1-1");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) 'a');
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str9 = integerInterval8.toString();
        java.lang.String str10 = integerInterval8.asString();
        int int11 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval8.asList();
        int int13 = integerInterval5.compareTo(integerInterval8);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval8.asList();
        boolean boolean15 = integerInterval2.equals((java.lang.Object) intList14);
        int int16 = integerInterval2.getStart();
        boolean boolean18 = integerInterval2.contains(100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-52}" + "'", str9, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10-52" + "'", str10, "10-52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval11 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str12 = integerInterval11.toString();
        int int13 = integerInterval8.compareTo(integerInterval11);
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = integerInterval11.asStringList();
        boolean boolean15 = integerInterval2.intersects(integerInterval11);
        com.greplin.interval.IntegerInterval integerInterval18 = new com.greplin.interval.IntegerInterval((int) ' ', 100);
        com.greplin.interval.IntegerInterval integerInterval20 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval20.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList22 = integerInterval20.asList();
        java.lang.String str23 = integerInterval20.toString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval26.asList();
        int int37 = integerInterval26.getEnd();
        int int38 = integerInterval20.compareTo(integerInterval26);
        int int39 = integerInterval18.compareTo(integerInterval20);
        int int40 = integerInterval2.compareTo(integerInterval18);
        boolean boolean42 = integerInterval18.contains((-1));
        int int43 = integerInterval18.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(integerInterval20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IntegerInterval{-1--1}" + "'", str23, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 1, 10);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 35);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, 1);
        int int3 = integerInterval2.getStart();
        java.lang.String str4 = integerInterval2.toString();
        boolean boolean6 = integerInterval2.contains((int) (short) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{97-1}" + "'", str4, "IntegerInterval{97-1}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass4 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        boolean boolean8 = integerInterval2.contains((int) '4');
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        com.greplin.interval.IntegerInterval integerInterval31 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean33 = integerInterval31.contains((int) (short) 100);
        java.lang.String str34 = integerInterval31.toString();
        com.greplin.interval.IntegerInterval integerInterval37 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean39 = integerInterval37.contains((int) (short) 1);
        int int40 = integerInterval31.compareTo(integerInterval37);
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = integerInterval37.asStringList();
        java.lang.String str42 = integerInterval37.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = integerInterval37.asStringList();
        boolean boolean44 = integerInterval14.intersects(integerInterval37);
        int int45 = integerInterval14.getStart();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "IntegerInterval{10-52}" + "'", str34, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) -1);
        boolean boolean4 = integerInterval2.contains((int) 'a');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval2.asList();
        boolean boolean7 = integerInterval2.contains((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        int int9 = intervalSegment2.getShift();
        long long10 = intervalSegment2.getStart();
        long long11 = intervalSegment2.getStart();
        long long12 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass13 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        java.lang.String str16 = integerInterval8.toString();
        int int17 = integerInterval8.getStart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        java.lang.String str39 = integerInterval1.asString();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "100--1" + "'", str39, "100--1");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        long long8 = intervalSegment2.getStart();
        long long9 = intervalSegment2.getStart();
        long long10 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '#', (int) (short) -1);
        boolean boolean4 = integerInterval2.contains(1);
        boolean boolean6 = integerInterval2.contains((int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 1, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 1, (int) (short) 1);
        java.lang.String str3 = integerInterval2.asString();
        boolean boolean5 = integerInterval2.contains((int) (short) -1);
        boolean boolean7 = integerInterval2.contains(52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-1" + "'", str3, "1-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, 100);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 0, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (byte) 10);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, 32);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-32}" + "'", str3, "IntegerInterval{0-32}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) (short) -1);
        java.lang.String str3 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10--1" + "'", str3, "10--1");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = intervalSegment2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("1--1");
        int int2 = integerInterval1.getStart();
        java.lang.Class<?> wildcardClass3 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 35);
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-35}" + "'", str3, "IntegerInterval{-1-35}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{-1-35}" + "'", str4, "IntegerInterval{-1-35}");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval((int) (byte) 10, 52);
        int int30 = integerInterval8.compareTo(integerInterval29);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-10");
        int int2 = integerInterval1.getStart();
        boolean boolean4 = integerInterval1.contains((int) (short) 1);
        boolean boolean6 = integerInterval1.contains((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = integerInterval1.getClass();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        java.lang.String str35 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList36 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList37 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = integerInterval2.asStringList();
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
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertNotNull(intList37);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(10L, 10);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(10, (int) (byte) 100);
        boolean boolean4 = integerInterval2.contains((int) (byte) 1);
        int int5 = integerInterval2.getEnd();
        int int6 = integerInterval2.getStart();
        int int7 = integerInterval2.getEnd();
        int int8 = integerInterval2.getEnd();
        java.lang.String str9 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{10-100}" + "'", str9, "IntegerInterval{10-100}");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 1, (int) (byte) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = integerInterval8.asStringList();
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
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, 100);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval8.asList();
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList75 = integerInterval56.asList();
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
        org.junit.Assert.assertNotNull(intList75);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-10");
        java.lang.String str2 = integerInterval1.asString();
        int int3 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10-10" + "'", str2, "10-10");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str6 = integerInterval5.toString();
        java.lang.String str7 = integerInterval5.asString();
        int int8 = integerInterval5.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval5.asList();
        int int10 = integerInterval2.compareTo(integerInterval5);
        java.lang.String str11 = integerInterval5.toString();
        java.lang.String str12 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = com.greplin.interval.IntegerInterval.valueOf("52--1");
        int int15 = integerInterval14.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = integerInterval14.asStringList();
        java.lang.String str17 = integerInterval14.asString();
        boolean boolean18 = integerInterval5.intersects(integerInterval14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10-52" + "'", str7, "10-52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(integerInterval14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52--1" + "'", str17, "52--1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', (int) (short) -1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) '4', 32);
        java.lang.String str3 = integerInterval2.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52-32" + "'", str3, "52-32");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) '4', (int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = integerInterval6.asStringList();
        java.lang.String str8 = integerInterval6.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval6.asStringList();
        int int10 = integerInterval6.getEnd();
        boolean boolean11 = integerInterval2.intersects(integerInterval6);
        java.lang.String str12 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{52-1}" + "'", str8, "IntegerInterval{52-1}");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35-1" + "'", str12, "35-1");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) (short) 0);
        int int3 = integerInterval2.getEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        boolean boolean49 = integerInterval33.equals((java.lang.Object) 10.0d);
        com.google.common.collect.ImmutableList<java.lang.String> strList50 = integerInterval33.asStringList();
        int int51 = integerInterval33.getEnd();
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
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        java.lang.String str9 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList10 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10-52" + "'", str9, "10-52");
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 52, (int) (byte) 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        java.lang.String str3 = integerInterval1.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval1.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList5 = integerInterval1.asList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        int int12 = intervalSegment2.getShift();
        long long13 = intervalSegment2.getStart();
        int int14 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
        int int16 = integerInterval12.getEnd();
        int int17 = integerInterval2.compareTo(integerInterval12);
        java.lang.String str18 = integerInterval12.asString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        java.lang.String str4 = integerInterval2.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{100-97}" + "'", str4, "IntegerInterval{100-97}");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        int int12 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        int int23 = integerInterval8.getEnd();
        int int24 = integerInterval8.getStart();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{10-52}" + "'", str12, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 10, 32);
        int int3 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        int int25 = integerInterval20.getEnd();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        boolean boolean18 = integerInterval2.contains(97);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval2.asList();
        java.lang.String str20 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = integerInterval2.asStringList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10-52" + "'", str14, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10-52" + "'", str20, "10-52");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = integerInterval6.toString();
        java.lang.String str8 = integerInterval6.toString();
        java.lang.String str9 = integerInterval6.toString();
        boolean boolean10 = integerInterval2.equals((java.lang.Object) str9);
        boolean boolean12 = integerInterval2.contains((int) ' ');
        java.lang.String str13 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1--1}" + "'", str7, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{-1--1}" + "'", str8, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IntegerInterval{-1--1}" + "'", str9, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1-0" + "'", str13, "1-0");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 10, (-1));
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList4 = integerInterval2.asList();
        boolean boolean6 = integerInterval2.contains(0);
        com.greplin.interval.IntegerInterval integerInterval9 = new com.greplin.interval.IntegerInterval((int) '#', (int) (byte) 10);
        java.lang.String str10 = integerInterval9.toString();
        boolean boolean12 = integerInterval9.contains(0);
        java.lang.String str13 = integerInterval9.asString();
        int int14 = integerInterval9.getEnd();
        boolean boolean15 = integerInterval2.intersects(integerInterval9);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{35-10}" + "'", str10, "IntegerInterval{35-10}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35-10" + "'", str13, "35-10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList18 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        boolean boolean7 = integerInterval2.intersects(integerInterval6);
        boolean boolean9 = integerInterval6.contains(0);
        java.lang.String str10 = integerInterval6.asString();
        int int11 = integerInterval6.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval6.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList13 = integerInterval6.asList();
        boolean boolean15 = integerInterval6.contains((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1--1" + "'", str10, "-1--1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) (short) 10);
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-10}" + "'", str3, "IntegerInterval{0-10}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, 52);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 52);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) 10);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.asString();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0-10" + "'", str4, "0-10");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 0, (int) (short) 10);
        int int3 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass4 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        com.google.common.collect.ImmutableList<java.lang.Integer> intList17 = integerInterval8.asList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-52" + "'", str13, "10-52");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10-52" + "'", str16, "10-52");
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 0, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(97L, (int) (short) 10);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        int int27 = integerInterval2.getStart();
        com.greplin.interval.IntegerInterval integerInterval28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = integerInterval2.compareTo(integerInterval28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(52L, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass4 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("32-97");
        org.junit.Assert.assertNotNull(integerInterval1);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 35);
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
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str2 = integerInterval1.toString();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 100);
        java.lang.String str11 = integerInterval8.toString();
        com.greplin.interval.IntegerInterval integerInterval14 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean16 = integerInterval14.contains((int) (short) 1);
        int int17 = integerInterval8.compareTo(integerInterval14);
        java.lang.String str18 = integerInterval14.asString();
        boolean boolean19 = integerInterval5.intersects(integerInterval14);
        java.lang.String str20 = integerInterval5.toString();
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean25 = integerInterval23.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval28 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str29 = integerInterval28.toString();
        java.lang.String str30 = integerInterval28.asString();
        boolean boolean32 = integerInterval28.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = integerInterval28.asStringList();
        boolean boolean35 = integerInterval28.contains((int) '4');
        boolean boolean36 = integerInterval23.equals((java.lang.Object) integerInterval28);
        boolean boolean37 = integerInterval5.intersects(integerInterval28);
        boolean boolean39 = integerInterval28.contains((int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.String> strList40 = integerInterval28.asStringList();
        boolean boolean41 = integerInterval1.intersects(integerInterval28);
        java.lang.String str42 = integerInterval28.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IntegerInterval{10-52}" + "'", str2, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-52" + "'", str18, "10-52");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-52" + "'", str30, "10-52");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10-52" + "'", str42, "10-52");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        int int57 = integerInterval14.getEnd();
        int int58 = integerInterval14.getEnd();
        java.lang.Object obj59 = null;
        boolean boolean60 = integerInterval14.equals(obj59);
        java.lang.String str61 = integerInterval14.toString();
        int int62 = integerInterval14.getEnd();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "IntegerInterval{10-52}" + "'", str61, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(32L, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        java.lang.Class<?> wildcardClass8 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("100-10");
        int int2 = integerInterval1.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval1.asStringList();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean4 = integerInterval2.contains((int) (short) 100);
        java.lang.String str5 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval8 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean10 = integerInterval8.contains((int) (short) 1);
        int int11 = integerInterval2.compareTo(integerInterval8);
        java.lang.String str12 = integerInterval8.asString();
        java.lang.String str13 = integerInterval8.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList14 = integerInterval8.asList();
        boolean boolean16 = integerInterval8.contains((int) (short) 0);
        int int17 = integerInterval8.getStart();
        int int18 = integerInterval8.getEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IntegerInterval{10-52}" + "'", str13, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (-1));
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass6 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', 32);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = integerInterval1.asStringList();
        java.lang.String str3 = integerInterval1.asString();
        com.greplin.interval.IntervalSegment intervalSegment6 = new com.greplin.interval.IntervalSegment((long) (byte) 100, 10);
        long long7 = intervalSegment6.getStart();
        boolean boolean8 = integerInterval1.equals((java.lang.Object) intervalSegment6);
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = integerInterval1.asStringList();
        int int10 = integerInterval1.getStart();
        java.lang.String str11 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1--1" + "'", str3, "-1--1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1--1" + "'", str11, "-1--1");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((-1L), 1);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        com.greplin.interval.IntegerInterval integerInterval30 = new com.greplin.interval.IntegerInterval((int) '#', 52);
        boolean boolean32 = integerInterval30.contains((int) (short) 100);
        int int33 = integerInterval30.getEnd();
        boolean boolean34 = integerInterval2.equals((java.lang.Object) int33);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        java.lang.String str38 = integerInterval34.toString();
        java.lang.Class<?> wildcardClass39 = integerInterval34.getClass();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{-1--1}" + "'", str38, "IntegerInterval{-1--1}");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        com.greplin.interval.IntegerInterval integerInterval40 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval43 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean45 = integerInterval43.contains((int) (short) 100);
        java.lang.String str46 = integerInterval43.toString();
        com.greplin.interval.IntegerInterval integerInterval49 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean51 = integerInterval49.contains((int) (short) 1);
        int int52 = integerInterval43.compareTo(integerInterval49);
        java.lang.String str53 = integerInterval49.asString();
        boolean boolean54 = integerInterval40.intersects(integerInterval49);
        java.lang.String str55 = integerInterval40.toString();
        int int56 = integerInterval40.getEnd();
        int int57 = integerInterval2.compareTo(integerInterval40);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IntegerInterval{10-52}" + "'", str46, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10-52" + "'", str53, "10-52");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{10-52}" + "'", str55, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        int int43 = integerInterval32.getEnd();
        int int44 = integerInterval32.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList45 = integerInterval32.asList();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(intList45);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        com.greplin.interval.IntegerInterval integerInterval29 = new com.greplin.interval.IntegerInterval(1, (int) (short) 0);
        java.lang.String str30 = integerInterval29.asString();
        boolean boolean31 = integerInterval8.intersects(integerInterval29);
        com.greplin.interval.IntegerInterval integerInterval34 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean36 = integerInterval34.contains((int) (short) 1);
        com.greplin.interval.IntegerInterval integerInterval39 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str40 = integerInterval39.toString();
        java.lang.String str41 = integerInterval39.asString();
        boolean boolean43 = integerInterval39.contains(10);
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = integerInterval39.asStringList();
        boolean boolean46 = integerInterval39.contains((int) '4');
        boolean boolean47 = integerInterval34.equals((java.lang.Object) integerInterval39);
        com.greplin.interval.IntegerInterval integerInterval50 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        com.greplin.interval.IntegerInterval integerInterval53 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str54 = integerInterval53.toString();
        int int55 = integerInterval50.compareTo(integerInterval53);
        int int56 = integerInterval39.compareTo(integerInterval53);
        int int57 = integerInterval53.getStart();
        com.greplin.interval.IntegerInterval integerInterval59 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        java.lang.String str60 = integerInterval59.toString();
        int int61 = integerInterval59.getEnd();
        int int62 = integerInterval59.getStart();
        int int63 = integerInterval53.compareTo(integerInterval59);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList64 = integerInterval53.asList();
        boolean boolean65 = integerInterval8.intersects(integerInterval53);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1-0" + "'", str30, "1-0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "IntegerInterval{10-52}" + "'", str40, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10-52" + "'", str41, "10-52");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "IntegerInterval{-1--1}" + "'", str54, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(integerInterval59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "IntegerInterval{10-52}" + "'", str60, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(35L, (int) '4');
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str20 = integerInterval19.toString();
        int int21 = integerInterval19.getEnd();
        java.lang.String str22 = integerInterval19.asString();
        java.lang.String str23 = integerInterval19.asString();
        com.greplin.interval.IntegerInterval integerInterval26 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean28 = integerInterval26.contains((int) (short) 100);
        java.lang.String str29 = integerInterval26.toString();
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean34 = integerInterval32.contains((int) (short) 1);
        int int35 = integerInterval26.compareTo(integerInterval32);
        java.lang.String str36 = integerInterval32.asString();
        java.lang.String str37 = integerInterval32.asString();
        java.lang.String str38 = integerInterval32.toString();
        boolean boolean39 = integerInterval19.intersects(integerInterval32);
        com.greplin.interval.IntegerInterval integerInterval42 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean44 = integerInterval42.contains((int) (short) 100);
        java.lang.String str45 = integerInterval42.toString();
        com.greplin.interval.IntegerInterval integerInterval48 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean50 = integerInterval48.contains((int) (short) 1);
        int int51 = integerInterval42.compareTo(integerInterval48);
        java.lang.String str52 = integerInterval48.asString();
        java.lang.String str53 = integerInterval48.toString();
        int int54 = integerInterval48.getStart();
        java.lang.String str55 = integerInterval48.toString();
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = integerInterval48.asStringList();
        boolean boolean57 = integerInterval19.intersects(integerInterval48);
        boolean boolean58 = integerInterval2.intersects(integerInterval48);
        java.lang.String str59 = integerInterval48.asString();
        java.lang.String str60 = integerInterval48.asString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{10-52}" + "'", str20, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10-52" + "'", str22, "10-52");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10-52" + "'", str23, "10-52");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IntegerInterval{10-52}" + "'", str29, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "10-52" + "'", str36, "10-52");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10-52" + "'", str37, "10-52");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{10-52}" + "'", str45, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10-52" + "'", str52, "10-52");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "IntegerInterval{10-52}" + "'", str53, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "IntegerInterval{10-52}" + "'", str55, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "10-52" + "'", str59, "10-52");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "10-52" + "'", str60, "10-52");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 0, 10);
        int int3 = intervalSegment2.getShift();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 10);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-10}" + "'", str3, "IntegerInterval{-1-10}");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        long long15 = intervalSegment2.getStart();
        int int16 = intervalSegment2.getShift();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        java.lang.String str12 = integerInterval10.asString();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = integerInterval10.asStringList();
        int int14 = integerInterval10.getStart();
        int int15 = integerInterval10.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1-100" + "'", str12, "1-100");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(100, (int) '#');
        java.lang.String str3 = integerInterval2.asString();
        com.greplin.interval.IntegerInterval integerInterval6 = new com.greplin.interval.IntegerInterval(32, (int) (short) -1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval6.asList();
        int int8 = integerInterval6.getEnd();
        int int9 = integerInterval2.compareTo(integerInterval6);
        java.lang.String str10 = integerInterval6.asString();
        int int11 = integerInterval6.getStart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100-35" + "'", str3, "100-35");
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32--1" + "'", str10, "32--1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        boolean boolean4 = integerInterval2.equals((java.lang.Object) "");
        int int5 = integerInterval2.getEnd();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval2.asStringList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        java.lang.String str8 = integerInterval2.asString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-52" + "'", str8, "-1-52");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(0L, 0);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        boolean boolean45 = integerInterval38.contains((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intList46);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        boolean boolean33 = integerInterval8.contains((int) 'a');
        java.lang.String str34 = integerInterval8.asString();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10-52" + "'", str34, "10-52");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (-1), 0);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = integerInterval2.asStringList();
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
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-100");
        java.lang.String str2 = integerInterval1.asString();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0-100" + "'", str2, "0-100");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(1, (int) '4');
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = integerInterval2.asStringList();
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(97, (int) (short) -1);
        int int3 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = integerInterval2.asStringList();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) '4', (int) (byte) 100);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) -1, 10);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        int int54 = integerInterval8.getStart();
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
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        java.lang.String str16 = integerInterval9.toString();
        boolean boolean18 = integerInterval9.contains(10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IntegerInterval{10-52}" + "'", str10, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IntegerInterval{10-52}" + "'", str14, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment(100L, 52);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 0, 1);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{0-1}" + "'", str3, "IntegerInterval{0-1}");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 100, (int) (byte) 1);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        long long6 = intervalSegment2.getStart();
        int int7 = intervalSegment2.getShift();
        int int8 = intervalSegment2.getShift();
        long long9 = intervalSegment2.getStart();
        int int10 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (short) 100);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        long long5 = intervalSegment2.getStart();
        long long6 = intervalSegment2.getStart();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        int int34 = integerInterval8.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = integerInterval8.asStringList();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (short) 10);
        int int3 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (byte) 100, (int) (byte) -1);
        long long3 = intervalSegment2.getStart();
        long long4 = intervalSegment2.getStart();
        int int5 = intervalSegment2.getShift();
        int int6 = intervalSegment2.getShift();
        long long7 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 10, (int) '#');
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) (short) 100, (int) (byte) 0);
        long long3 = intervalSegment2.getStart();
        int int4 = intervalSegment2.getShift();
        java.lang.Class<?> wildcardClass5 = intervalSegment2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        java.lang.String str16 = integerInterval10.toString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval(100, (int) (byte) 1);
        boolean boolean21 = integerInterval19.contains(0);
        int int22 = integerInterval19.getStart();
        int int23 = integerInterval19.getStart();
        int int24 = integerInterval19.getEnd();
        int int25 = integerInterval19.getStart();
        int int26 = integerInterval10.compareTo(integerInterval19);
        boolean boolean28 = integerInterval10.contains(52);
        int int29 = integerInterval10.getStart();
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = integerInterval10.asStringList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IntegerInterval{10-52}" + "'", str11, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-52" + "'", str12, "10-52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IntegerInterval{10-52}" + "'", str16, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((-1), 35);
        java.lang.String str3 = integerInterval2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1-35}" + "'", str3, "IntegerInterval{-1-35}");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(35, (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        java.lang.String str4 = integerInterval2.toString();
        java.lang.String str5 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        int int7 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass8 = integerInterval2.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IntegerInterval{35-100}" + "'", str4, "IntegerInterval{35-100}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35-100" + "'", str5, "35-100");
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
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
        int int18 = integerInterval2.getEnd();
        java.lang.Class<?> wildcardClass19 = integerInterval2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IntegerInterval{10-52}" + "'", str5, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IntegerInterval{-1--1}" + "'", str12, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) 10, (int) '4');
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        int int4 = integerInterval2.getStart();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        boolean boolean45 = integerInterval38.contains((int) (byte) 0);
        int int46 = integerInterval38.getStart();
        java.lang.Class<?> wildcardClass47 = integerInterval38.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("10-52");
        com.google.common.collect.ImmutableList<java.lang.Integer> intList2 = integerInterval1.asList();
        com.greplin.interval.IntegerInterval integerInterval5 = new com.greplin.interval.IntegerInterval((-1), (int) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = integerInterval5.asStringList();
        java.lang.String str7 = integerInterval5.toString();
        boolean boolean8 = integerInterval1.intersects(integerInterval5);
        int int9 = integerInterval1.getStart();
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{-1-100}" + "'", str7, "IntegerInterval{-1-100}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str3 = integerInterval2.toString();
        boolean boolean5 = integerInterval2.contains(52);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList6 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        java.lang.Class<?> wildcardClass8 = integerInterval2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{-1--1}" + "'", str3, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 'a', 10);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        int int5 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        java.lang.String str7 = integerInterval2.toString();
        boolean boolean9 = integerInterval2.contains(0);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = integerInterval2.asStringList();
        java.lang.String str11 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList12 = integerInterval2.asList();
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 100, (int) (short) -1);
        java.lang.String str16 = integerInterval15.asString();
        com.greplin.interval.IntegerInterval integerInterval19 = new com.greplin.interval.IntegerInterval((int) (short) -1, (int) (byte) -1);
        java.lang.String str20 = integerInterval19.toString();
        boolean boolean22 = integerInterval19.contains(52);
        java.lang.String str23 = integerInterval19.asString();
        boolean boolean25 = integerInterval19.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = integerInterval15.intersects(integerInterval19);
        int int27 = integerInterval19.getStart();
        java.lang.String str28 = integerInterval19.asString();
        int int29 = integerInterval2.compareTo(integerInterval19);
        int int30 = integerInterval2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10-52" + "'", str11, "10-52");
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100--1" + "'", str16, "100--1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IntegerInterval{-1--1}" + "'", str20, "IntegerInterval{-1--1}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1--1" + "'", str23, "-1--1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1--1" + "'", str28, "-1--1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        boolean boolean6 = integerInterval2.contains(10);
        java.lang.String str7 = integerInterval2.toString();
        com.greplin.interval.IntegerInterval integerInterval10 = new com.greplin.interval.IntegerInterval(1, (int) (byte) 100);
        int int11 = integerInterval2.compareTo(integerInterval10);
        boolean boolean13 = integerInterval10.contains((int) (byte) 10);
        com.greplin.interval.IntegerInterval integerInterval16 = new com.greplin.interval.IntegerInterval((int) (short) -1, 52);
        java.lang.String str17 = integerInterval16.asString();
        int int18 = integerInterval16.getEnd();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList19 = integerInterval16.asList();
        boolean boolean20 = integerInterval10.intersects(integerInterval16);
        com.greplin.interval.IntegerInterval integerInterval23 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str24 = integerInterval23.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList25 = integerInterval23.asList();
        java.lang.Class<?> wildcardClass26 = integerInterval23.getClass();
        boolean boolean27 = integerInterval10.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IntegerInterval{10-52}" + "'", str7, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1-52" + "'", str17, "-1-52");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "IntegerInterval{10-52}" + "'", str24, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval(0, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        java.lang.String str4 = integerInterval2.asString();
        int int5 = integerInterval2.getStart();
        java.lang.String str6 = integerInterval2.toString();
        int int7 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList8 = integerInterval2.asList();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList9 = integerInterval2.asList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10-52" + "'", str4, "10-52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IntegerInterval{10-52}" + "'", str6, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        java.lang.String str18 = integerInterval2.toString();
        int int19 = integerInterval2.getStart();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList20 = integerInterval2.asList();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IntegerInterval{10-52}" + "'", str8, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10-52" + "'", str15, "10-52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        com.greplin.interval.IntegerInterval integerInterval1 = com.greplin.interval.IntegerInterval.valueOf("0-10");
        com.greplin.interval.IntegerInterval integerInterval4 = new com.greplin.interval.IntegerInterval(52, (int) (byte) 0);
        boolean boolean6 = integerInterval4.contains(32);
        int int7 = integerInterval1.compareTo(integerInterval4);
        int int8 = integerInterval4.getStart();
        boolean boolean10 = integerInterval4.contains((int) (byte) 0);
        org.junit.Assert.assertNotNull(integerInterval1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        java.lang.String str3 = integerInterval2.toString();
        int int4 = integerInterval2.getEnd();
        java.lang.String str5 = integerInterval2.asString();
        java.lang.String str6 = integerInterval2.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList7 = integerInterval2.asList();
        boolean boolean9 = integerInterval2.contains((int) (byte) 100);
        com.greplin.interval.IntegerInterval integerInterval12 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval15 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean17 = integerInterval15.contains((int) (short) 100);
        java.lang.String str18 = integerInterval15.toString();
        com.greplin.interval.IntegerInterval integerInterval21 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean23 = integerInterval21.contains((int) (short) 1);
        int int24 = integerInterval15.compareTo(integerInterval21);
        java.lang.String str25 = integerInterval21.asString();
        boolean boolean26 = integerInterval12.intersects(integerInterval21);
        com.greplin.interval.IntegerInterval integerInterval28 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean29 = integerInterval21.intersects(integerInterval28);
        com.greplin.interval.IntegerInterval integerInterval32 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        com.greplin.interval.IntegerInterval integerInterval35 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean37 = integerInterval35.contains((int) (short) 100);
        java.lang.String str38 = integerInterval35.toString();
        com.greplin.interval.IntegerInterval integerInterval41 = new com.greplin.interval.IntegerInterval((int) (byte) 10, (int) '4');
        boolean boolean43 = integerInterval41.contains((int) (short) 1);
        int int44 = integerInterval35.compareTo(integerInterval41);
        java.lang.String str45 = integerInterval41.asString();
        boolean boolean46 = integerInterval32.intersects(integerInterval41);
        com.greplin.interval.IntegerInterval integerInterval48 = com.greplin.interval.IntegerInterval.valueOf("-1--1");
        boolean boolean49 = integerInterval41.intersects(integerInterval48);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList50 = integerInterval48.asList();
        int int51 = integerInterval28.compareTo(integerInterval48);
        java.lang.String str52 = integerInterval48.toString();
        java.lang.String str53 = integerInterval48.asString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList54 = integerInterval48.asList();
        int int55 = integerInterval2.compareTo(integerInterval48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IntegerInterval{10-52}" + "'", str3, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10-52" + "'", str5, "10-52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10-52" + "'", str6, "10-52");
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IntegerInterval{10-52}" + "'", str18, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10-52" + "'", str25, "10-52");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(integerInterval28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "IntegerInterval{10-52}" + "'", str38, "IntegerInterval{10-52}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10-52" + "'", str45, "10-52");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(integerInterval48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "IntegerInterval{-1--1}" + "'", str52, "IntegerInterval{-1--1}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1--1" + "'", str53, "-1--1");
        org.junit.Assert.assertNotNull(intList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.greplin.interval.IntegerInterval integerInterval2 = new com.greplin.interval.IntegerInterval((int) (short) -1, 100);
        com.google.common.collect.ImmutableList<java.lang.Integer> intList3 = integerInterval2.asList();
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) (short) -1);
        int int3 = intervalSegment2.getShift();
        int int4 = intervalSegment2.getShift();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        java.lang.String str43 = integerInterval32.toString();
        com.google.common.collect.ImmutableList<java.lang.Integer> intList44 = integerInterval32.asList();
        java.lang.String str45 = integerInterval32.toString();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "IntegerInterval{10-52}" + "'", str43, "IntegerInterval{10-52}");
        org.junit.Assert.assertNotNull(intList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IntegerInterval{10-52}" + "'", str45, "IntegerInterval{10-52}");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10-52" + "'", str28, "10-52");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        com.greplin.interval.IntervalSegment intervalSegment2 = new com.greplin.interval.IntervalSegment((long) 97, (int) ' ');
        long long3 = intervalSegment2.getStart();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }
}

