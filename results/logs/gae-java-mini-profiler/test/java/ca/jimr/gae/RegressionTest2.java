package ca.jimr.gae;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable7);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable7);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        java.lang.String str9 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
            miniProfilerServlet0.log("mini_profile_includes", throwable10);
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        javax.servlet.FilterChain filterChain7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest5, servletResponse6, filterChain7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        java.lang.String str10 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration13 = miniProfilerServlet0.getInitParameterNames();
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
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("_mprid_");
        javax.servlet.FilterConfig filterConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable13);
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("hi!", strMap17);
        java.lang.Class<?> wildcardClass19 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("");
        step1.close();
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass5 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet9.getServletConfig();
        java.lang.String str14 = miniProfilerServlet9.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
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
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.lang.Class<?> wildcardClass14 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable9);
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        java.lang.String str9 = miniProfilerServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.Class<?> wildcardClass11 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = servletConfig4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        java.lang.String str13 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass12 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        java.lang.Class<?> wildcardClass9 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        javax.servlet.FilterChain filterChain10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest8, servletResponse9, filterChain10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
            java.lang.String str9 = miniProfilerServlet0.getServletName();
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap11);
        java.lang.Class<?> wildcardClass13 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        java.lang.String str8 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap23);
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass11 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        java.lang.String str13 = miniProfilerServlet7.getServletInfo();
        java.lang.String str14 = miniProfilerServlet7.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable12);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("hi!", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("", strMap29);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        java.lang.String str33 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap32);
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
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.init();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration13 = miniProfilerServlet0.getInitParameterNames();
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
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet2 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet2.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet2.getServletConfig();
        miniProfilerServlet2.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet2.getServletConfig();
        java.lang.String str7 = miniProfilerServlet2.getServletInfo();
        miniProfilerServlet2.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet2.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet2.getServletConfig();
        java.lang.String str11 = miniProfilerServlet2.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable11);
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
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
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("_mprid_");
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        javax.servlet.FilterChain filterChain7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest5, servletResponse6, filterChain7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = servletConfig5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile", strMap14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        javax.servlet.FilterConfig filterConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
            java.util.Enumeration enumeration11 = miniProfilerServlet0.getInitParameterNames();
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile");
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        javax.servlet.FilterChain filterChain10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest8, servletResponse9, filterChain10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        java.lang.String str10 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest14, servletResponse15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
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
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.lang.Class<?> wildcardClass13 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile", strMap11);
        java.lang.Class<?> wildcardClass13 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = servletConfig4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.init();
        java.lang.String str11 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet9.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        boolean boolean16 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean18 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable7);
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.destroy();
        java.lang.String str16 = miniProfilerServlet13.getServletInfo();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet13.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("_mprid_", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("_mprid_", strMap23);
        java.lang.Class<?> wildcardClass25 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext13 = miniProfilerServlet0.getServletContext();
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
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap23);
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        java.lang.Class<?> wildcardClass13 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.lang.Class<?> wildcardClass7 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        miniProfilerServlet11.destroy();
        miniProfilerServlet11.init();
        java.lang.String str19 = miniProfilerServlet11.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("", strMap11);
        java.lang.Class<?> wildcardClass13 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str12, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("");
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet13.getServletConfig();
        java.lang.String str18 = miniProfilerServlet13.getServletInfo();
        miniProfilerServlet13.init();
        miniProfilerServlet13.init();
        java.lang.String str21 = miniProfilerServlet13.getServletInfo();
        miniProfilerServlet13.destroy();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig24 = miniProfilerServlet13.getServletConfig();
        javax.servlet.ServletConfig servletConfig25 = miniProfilerServlet13.getServletConfig();
        java.lang.String str26 = miniProfilerServlet13.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(servletConfig24);
        org.junit.Assert.assertNull(servletConfig25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable7);
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        miniProfilerServlet7.destroy();
        java.lang.String str13 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        javax.servlet.FilterConfig filterConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext13 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        java.lang.String str9 = miniProfilerServlet6.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        miniProfilerServlet13.init();
        java.lang.String str15 = miniProfilerServlet13.getServletInfo();
        java.lang.String str16 = miniProfilerServlet13.getServletInfo();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet13.getServletConfig();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet13.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest14, servletResponse15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        javax.servlet.FilterConfig filterConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig13);
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet5.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable9);
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean15 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("hi!", strMap26);
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
            java.lang.String str15 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap23);
        java.lang.Class<?> wildcardClass25 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        javax.servlet.FilterChain filterChain10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest8, servletResponse9, filterChain10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap23);
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
        java.lang.String str11 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("hi!", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        java.lang.String str9 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        miniProfilerServlet6.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile");
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass4 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable14);
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
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        javax.servlet.FilterChain filterChain10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest8, servletResponse9, filterChain10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        boolean boolean16 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.destroy();
        java.lang.String str13 = miniProfilerServlet11.getServletInfo();
        miniProfilerServlet11.destroy();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet11.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet11);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable8);
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = servletConfig6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
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
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("_mprid_");
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
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
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.destroy();
        java.lang.String str11 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet9.getServletConfig();
        java.lang.String str13 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.destroy();
        miniProfilerServlet9.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet13.destroy();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet13.getServletConfig();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet13.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(servletConfig16);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        javax.servlet.FilterConfig filterConfig17 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig17);
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable10);
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
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        java.lang.String str12 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet7.getServletConfig();
        java.lang.String str17 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        java.lang.String str15 = miniProfilerServlet11.getServletInfo();
        miniProfilerServlet11.destroy();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet11.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = miniProfilerServlet0.getInitParameter("");
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
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
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getServletName();
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
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
            miniProfilerServlet0.log("mini_profile");
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        javax.servlet.FilterConfig filterConfig14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig14);
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        java.lang.String str14 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext11 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        java.lang.String str10 = miniProfilerServlet7.getServletInfo();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        java.lang.String str11 = miniProfilerServlet9.getServletInfo();
        miniProfilerServlet9.destroy();
        java.lang.String str13 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet9.getServletConfig();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet9.getServletConfig();
        java.lang.String str16 = miniProfilerServlet9.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
            miniProfilerServlet0.log("hi!");
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
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet10.getServletConfig();
        java.lang.String str15 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.init();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        miniProfilerServlet10.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable13);
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        java.lang.Class<?> wildcardClass9 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet13.getServletConfig();
        java.lang.String str18 = miniProfilerServlet13.getServletInfo();
        java.lang.String str19 = miniProfilerServlet13.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.lang.Throwable throwable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable15);
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        boolean boolean16 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean18 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean20 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("hi!");
        step1.close();
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass5 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable14);
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
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.Class<?> wildcardClass16 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.Class<?> wildcardClass11 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
            miniProfilerServlet0.log("");
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = servletConfig6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        java.lang.Class<?> wildcardClass12 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.lang.Class<?> wildcardClass13 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
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
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext13 = miniProfilerServlet0.getServletContext();
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
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext14 = miniProfilerServlet0.getServletContext();
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
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass9 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet15 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet15.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet15.getServletConfig();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet15.getServletConfig();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet15.getServletConfig();
        java.lang.String str20 = miniProfilerServlet15.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet15);
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
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertNull(servletConfig18);
        org.junit.Assert.assertNull(servletConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        javax.servlet.FilterChain filterChain7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest5, servletResponse6, filterChain7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

