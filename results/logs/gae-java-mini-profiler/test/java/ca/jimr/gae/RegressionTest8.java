package ca.jimr.gae;

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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass12 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration12 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest9 = null;
        javax.servlet.ServletResponse servletResponse10 = null;
        javax.servlet.FilterChain filterChain11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest9, servletResponse10, filterChain11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass11 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = servletConfig4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest10 = null;
        javax.servlet.ServletResponse servletResponse11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest10, servletResponse11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest16 = null;
        javax.servlet.ServletResponse servletResponse17 = null;
        javax.servlet.FilterChain filterChain18 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest16, servletResponse17, filterChain18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean17 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean19 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass6 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap23);
        java.lang.Class<?> wildcardClass25 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.lang.Class<?> wildcardClass19 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        boolean boolean17 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass19 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration15 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.FilterConfig filterConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration12 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        miniProfilerServlet10.destroy();
        java.lang.String str16 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.destroy();
        javax.servlet.ServletConfig servletConfig20 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig21 = miniProfilerServlet10.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig20);
        org.junit.Assert.assertNull(servletConfig21);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("hi!", strMap17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest7 = null;
        javax.servlet.ServletResponse servletResponse8 = null;
        javax.servlet.FilterChain filterChain9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest7, servletResponse8, filterChain9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean17 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig19 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        java.lang.String str14 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration15 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest8, servletResponse9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean19 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest21 = null;
        javax.servlet.ServletResponse servletResponse22 = null;
        javax.servlet.FilterChain filterChain23 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest21, servletResponse22, filterChain23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest9 = null;
        javax.servlet.ServletResponse servletResponse10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest9, servletResponse10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext16 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        javax.servlet.FilterConfig filterConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("hi!");
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass6 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest11 = null;
        javax.servlet.ServletResponse servletResponse12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest11, servletResponse12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest16 = null;
        javax.servlet.ServletResponse servletResponse17 = null;
        javax.servlet.FilterChain filterChain18 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest16, servletResponse17, filterChain18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.destroy();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet9.getServletConfig();
        java.lang.String str13 = miniProfilerServlet9.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet12 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet12.init();
        java.lang.String str14 = miniProfilerServlet12.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet12.getServletConfig();
        miniProfilerServlet12.destroy();
        miniProfilerServlet12.init();
        miniProfilerServlet12.destroy();
        miniProfilerServlet12.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest12 = null;
        javax.servlet.ServletResponse servletResponse13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest12, servletResponse13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = servletConfig9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        java.lang.Class<?> wildcardClass10 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("_mprid_", strMap8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        java.lang.String str14 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.destroy();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet5.getServletConfig();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
        miniProfilerServlet5.destroy();
        miniProfilerServlet5.destroy();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet5.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("_mprid_", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        java.lang.Class<?> wildcardClass8 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("_mprid_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        miniProfilerServlet6.destroy();
        java.lang.String str12 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        miniProfilerServlet6.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet12 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet12.getServletConfig();
        java.lang.String str15 = miniProfilerServlet12.getServletInfo();
        java.lang.String str16 = miniProfilerServlet12.getServletInfo();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet12.getServletConfig();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet12.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        miniProfilerServlet4.destroy();
        java.lang.String str10 = miniProfilerServlet4.getServletInfo();
        miniProfilerServlet4.destroy();
        java.lang.String str12 = miniProfilerServlet4.getServletInfo();
        java.lang.String str13 = miniProfilerServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("hi!", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("mini_profile");
        javax.servlet.FilterConfig filterConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest13 = null;
        javax.servlet.ServletResponse servletResponse14 = null;
        javax.servlet.FilterChain filterChain15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest13, servletResponse14, filterChain15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest17 = null;
        javax.servlet.ServletResponse servletResponse18 = null;
        javax.servlet.FilterChain filterChain19 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest17, servletResponse18, filterChain19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean20 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean22 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean24 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass9 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str16 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        javax.servlet.ServletRequest servletRequest11 = null;
        javax.servlet.ServletResponse servletResponse12 = null;
        javax.servlet.FilterChain filterChain13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest11, servletResponse12, filterChain13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        javax.servlet.FilterChain filterChain16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest14, servletResponse15, filterChain16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        javax.servlet.FilterConfig filterConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest9 = null;
        javax.servlet.ServletResponse servletResponse10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest9, servletResponse10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest13 = null;
        javax.servlet.ServletResponse servletResponse14 = null;
        javax.servlet.FilterChain filterChain15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest13, servletResponse14, filterChain15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest13 = null;
        javax.servlet.ServletResponse servletResponse14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest13, servletResponse14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("", strMap23);
        java.lang.Class<?> wildcardClass25 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str24, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest7 = null;
        javax.servlet.ServletResponse servletResponse8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest7, servletResponse8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest11 = null;
        javax.servlet.ServletResponse servletResponse12 = null;
        javax.servlet.FilterChain filterChain13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest11, servletResponse12, filterChain13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean16 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean18 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean20 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("");
        boolean boolean17 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean20 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.init();
        java.lang.String str12 = miniProfilerServlet8.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap29);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        java.lang.String str33 = miniProfilerResourceLoader0.getResource("hi!", strMap32);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("_mprid_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest8, servletResponse9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean17 = miniProfilerFilter0.shouldProfile("_mprid_");
        javax.servlet.FilterConfig filterConfig18 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest7 = null;
        javax.servlet.ServletResponse servletResponse8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest7, servletResponse8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest13 = null;
        javax.servlet.ServletResponse servletResponse14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest13, servletResponse14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig18 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("_mprid_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet9.getServletConfig();
        java.lang.String str14 = miniProfilerServlet9.getServletInfo();
        java.lang.String str15 = miniProfilerServlet9.getServletInfo();
        java.lang.String str16 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.init();
        java.lang.String str19 = miniProfilerServlet9.getServletInfo();
        miniProfilerServlet9.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass14 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean17 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.ServletRequest servletRequest18 = null;
        javax.servlet.ServletResponse servletResponse19 = null;
        javax.servlet.FilterChain filterChain20 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest18, servletResponse19, filterChain20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("_mprid_", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("hi!", strMap8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.FilterConfig filterConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration13 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass14 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.destroy();
        java.lang.String str13 = miniProfilerServlet11.getServletInfo();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet11.getServletConfig();
        java.lang.String str15 = miniProfilerServlet11.getServletInfo();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.destroy();
        java.lang.String str18 = miniProfilerServlet11.getServletInfo();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet11.getServletConfig();
        javax.servlet.ServletConfig servletConfig20 = miniProfilerServlet11.getServletConfig();
        java.lang.String str21 = miniProfilerServlet11.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(servletConfig19);
        org.junit.Assert.assertNull(servletConfig20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean17 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.FilterConfig filterConfig18 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest13 = null;
        javax.servlet.ServletResponse servletResponse14 = null;
        javax.servlet.FilterChain filterChain15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest13, servletResponse14, filterChain15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest11 = null;
        javax.servlet.ServletResponse servletResponse12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest11, servletResponse12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("");
        boolean boolean17 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.ServletRequest servletRequest10 = null;
        javax.servlet.ServletResponse servletResponse11 = null;
        javax.servlet.FilterChain filterChain12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest10, servletResponse11, filterChain12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest9 = null;
        javax.servlet.ServletResponse servletResponse10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest9, servletResponse10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("_mprid_", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("_mprid_", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap11);
        java.lang.Class<?> wildcardClass13 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str6, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration11 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        javax.servlet.ServletRequest servletRequest11 = null;
        javax.servlet.ServletResponse servletResponse12 = null;
        javax.servlet.FilterChain filterChain13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest11, servletResponse12, filterChain13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("hi!", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str24, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest9 = null;
        javax.servlet.ServletResponse servletResponse10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest9, servletResponse10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.destroy();
        miniProfilerServlet9.init();
        java.lang.String str13 = miniProfilerServlet9.getServletInfo();
        miniProfilerServlet9.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("_mprid_", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("mini_profile", strMap29);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        java.lang.String str33 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap32);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str6, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("");
        boolean boolean17 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean20 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean22 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str14 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        java.lang.String str11 = miniProfilerServlet9.getServletInfo();
        miniProfilerServlet9.init();
        miniProfilerServlet9.init();
        miniProfilerServlet9.destroy();
        miniProfilerServlet9.destroy();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet9.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("hi!", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap29);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str27, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("hi!", strMap23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        java.lang.String str17 = miniProfilerServlet8.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration16 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass3 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean16 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean19 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean21 = miniProfilerFilter0.shouldProfile("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        javax.servlet.FilterConfig filterConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass14 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("_mprid_", strMap23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        java.lang.Class<?> wildcardClass12 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.ServletRequest servletRequest15 = null;
        javax.servlet.ServletResponse servletResponse16 = null;
        javax.servlet.FilterChain filterChain17 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest15, servletResponse16, filterChain17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean16 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean18 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean20 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext17 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig16);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet12 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet12.getServletConfig();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet12.getServletConfig();
        java.lang.String str17 = miniProfilerServlet12.getServletInfo();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet12.getServletConfig();
        javax.servlet.ServletConfig servletConfig20 = miniProfilerServlet12.getServletConfig();
        java.lang.String str21 = miniProfilerServlet12.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(servletConfig19);
        org.junit.Assert.assertNull(servletConfig20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration12 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        java.lang.String str8 = miniProfilerServlet5.getServletInfo();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet5.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext11 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile_includes");
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        org.junit.Assert.assertNotNull(step1);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration16 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration14 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean17 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean21 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest8, servletResponse9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("_mprid_", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str6, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet13.getServletConfig();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.destroy();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet13.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        miniProfilerServlet5.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest12 = null;
        javax.servlet.ServletResponse servletResponse13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest12, servletResponse13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean18 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.ServletRequest servletRequest19 = null;
        javax.servlet.ServletResponse servletResponse20 = null;
        javax.servlet.FilterChain filterChain21 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest19, servletResponse20, filterChain21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("_mprid_", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration14 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.FilterConfig filterConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass12 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet13.destroy();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet13.getServletConfig();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration16 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("", strMap29);
        java.lang.Class<?> wildcardClass31 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str30, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("hi!", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean19 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean22 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext16 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str14 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet0.getServletConfig();
        java.lang.String str16 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass12 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        javax.servlet.FilterConfig filterConfig16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest10 = null;
        javax.servlet.ServletResponse servletResponse11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest10, servletResponse11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext13 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("hi!", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("hi!", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile");
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        javax.servlet.FilterChain filterChain16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest14, servletResponse15, filterChain16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("hi!", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("hi!", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("", strMap14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str14 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str14 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest13 = null;
        javax.servlet.ServletResponse servletResponse14 = null;
        javax.servlet.FilterChain filterChain15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest13, servletResponse14, filterChain15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration11 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean17 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest18 = null;
        javax.servlet.ServletResponse servletResponse19 = null;
        javax.servlet.FilterChain filterChain20 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest18, servletResponse19, filterChain20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("_mprid_", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("hi!", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("_mprid_", strMap26);
        java.lang.Class<?> wildcardClass28 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass11 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest10 = null;
        javax.servlet.ServletResponse servletResponse11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest10, servletResponse11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest8, servletResponse9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest10 = null;
        javax.servlet.ServletResponse servletResponse11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest10, servletResponse11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap29);
        java.lang.Class<?> wildcardClass31 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest8, servletResponse9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        javax.servlet.FilterChain filterChain16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest14, servletResponse15, filterChain16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass14 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest10 = null;
        javax.servlet.ServletResponse servletResponse11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest10, servletResponse11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("hi!", strMap29);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str27, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("_mprid_", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("hi!", strMap29);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        java.lang.Class<?> wildcardClass6 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean16 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.ServletRequest servletRequest17 = null;
        javax.servlet.ServletResponse servletResponse18 = null;
        javax.servlet.FilterChain filterChain19 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest17, servletResponse18, filterChain19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest12 = null;
        javax.servlet.ServletResponse servletResponse13 = null;
        javax.servlet.FilterChain filterChain14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest12, servletResponse13, filterChain14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("_mprid_", strMap23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.FilterConfig filterConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }
}

