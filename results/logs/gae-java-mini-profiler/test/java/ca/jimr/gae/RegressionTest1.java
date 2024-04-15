package ca.jimr.gae;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap8);
        java.lang.Class<?> wildcardClass10 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        java.lang.Class<?> wildcardClass7 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable14);
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
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.lang.Class<?> wildcardClass10 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        java.lang.Class<?> wildcardClass22 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet12 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet12.destroy();
        java.lang.String str14 = miniProfilerServlet12.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet12.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        java.lang.Class<?> wildcardClass3 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.FilterConfig filterConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile", strMap8);
        java.lang.Class<?> wildcardClass10 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = miniProfilerServlet0.getInitParameter("_mprid_");
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
            java.util.Enumeration enumeration12 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        java.lang.String str11 = miniProfilerServlet9.getServletInfo();
        miniProfilerServlet9.init();
        miniProfilerServlet9.init();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass5 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        java.lang.String str8 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        java.lang.String str10 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
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
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable11);
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass5 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass7 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        java.lang.Class<?> wildcardClass7 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        java.lang.Class<?> wildcardClass13 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass12 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.init();
        java.lang.String str6 = miniProfilerServlet4.getServletInfo();
        java.lang.String str7 = miniProfilerServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.destroy();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        miniProfilerServlet5.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass14 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        javax.servlet.FilterChain filterChain8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest6, servletResponse7, filterChain8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable11);
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet8.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile_includes");
        step1.close();
        java.lang.Class<?> wildcardClass3 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass3 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass3 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        miniProfilerServlet7.init();
        miniProfilerServlet7.init();
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
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        java.lang.String str10 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable8);
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.FilterConfig filterConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass11 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
            miniProfilerServlet0.log("mini_profile", throwable10);
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        java.lang.Class<?> wildcardClass14 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        java.lang.String str12 = miniProfilerServlet7.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        java.lang.String str11 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.init();
        miniProfilerServlet6.init();
        java.lang.String str14 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet3.getServletConfig();
        java.lang.String str5 = miniProfilerServlet3.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable11);
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        miniProfilerServlet5.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.lang.Class<?> wildcardClass16 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.FilterConfig filterConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        javax.servlet.FilterConfig filterConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet11.getServletConfig();
        java.lang.String str16 = miniProfilerServlet11.getServletInfo();
        miniProfilerServlet11.init();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet11.getServletConfig();
        javax.servlet.ServletConfig servletConfig20 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig19);
        org.junit.Assert.assertNull(servletConfig20);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable12);
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet14 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet14.destroy();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet14.getServletConfig();
        java.lang.String str17 = miniProfilerServlet14.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet14);
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
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable8);
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        java.lang.String str9 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        java.lang.Class<?> wildcardClass5 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.destroy();
        java.lang.String str10 = miniProfilerServlet6.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        java.lang.Class<?> wildcardClass8 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        javax.servlet.FilterChain filterChain8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest6, servletResponse7, filterChain8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
            miniProfilerServlet0.log("mini_profile_includes");
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        java.lang.String str10 = miniProfilerServlet6.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
            miniProfilerServlet0.log("", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
            miniProfilerServlet0.log("");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.destroy();
        java.lang.String str13 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        java.lang.Class<?> wildcardClass4 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet3.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        java.lang.String str9 = miniProfilerServlet3.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
            java.lang.String str10 = miniProfilerServlet0.getServletName();
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet5.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        java.lang.Class<?> wildcardClass3 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
            java.util.Enumeration enumeration11 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable12);
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass7 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.init();
        miniProfilerServlet6.init();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.init();
        java.lang.String str14 = miniProfilerServlet6.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable6);
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable8);
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.Class<?> wildcardClass13 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.Class<?> wildcardClass16 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable8);
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable10);
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = servletConfig12.getClass();
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
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        miniProfilerServlet5.init();
        miniProfilerServlet5.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable14);
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
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("");
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        java.lang.Class<?> wildcardClass6 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.destroy();
        java.lang.String str6 = miniProfilerServlet4.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet4.getServletConfig();
        java.lang.String str8 = miniProfilerServlet4.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.destroy();
        miniProfilerServlet4.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap23);
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable12);
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass9 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable7);
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.lang.Class<?> wildcardClass7 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        java.lang.String str11 = miniProfilerServlet6.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet5.getServletConfig();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable8);
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        java.lang.String str14 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("_mprid_");
        java.lang.Class<?> wildcardClass6 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable13);
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable11);
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        java.lang.Class<?> wildcardClass9 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
            javax.servlet.ServletContext servletContext11 = miniProfilerServlet0.getServletContext();
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass14 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        java.lang.String str11 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("");
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("hi!", strMap14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        javax.servlet.FilterChain filterChain6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest4, servletResponse5, filterChain6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile_request_id");
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass6 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable8);
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.destroy();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet11.getServletConfig();
        java.lang.String str14 = miniProfilerServlet11.getServletInfo();
        java.lang.String str15 = miniProfilerServlet11.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }
}

